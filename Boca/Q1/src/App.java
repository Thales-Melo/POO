public class App {
    
    public static double calculaS1() {
        
        double result=0;

        for (double num=1, den=1; num<=99; num+=2, den++) {
            result+=(num/den);
        }
        
        return result;
    } 

    public static double calculaS2() {
        
        double result=0;

        for (double exp=1, den=50; exp<=50; exp++, den--) {
            result+=(Math.pow(2, exp)/den);
        }

        return result;
    }

    public static double calculaS3() {

        double result=0;
        int growth=3;

        for (double num=1, den=1; num<=10; num++) {
            if (num%2 == 0) {
                result-=(num/den);
            }
            else {
                result+=(num/den);
            }
            den+=growth;
            growth+=2;
        }

        return result;
    }
    
    public static void main(String[] args) throws Exception {
        
        System.out.println(calculaS1());
        System.out.println(calculaS2());
        System.out.println(calculaS3());
    }
}
