import java.util.Scanner;

public class J1_04 {

    public static int compareInt(int x, int y) {
        if (x>y) {
            return 1;
        }
        if (x<y) {
            return -1;
        }
        else {
            return 0;
        }
    }

    public static int verifyOrder(int vec[]) {
        int verifier = 0;
        for (int i=1; i<vec.length; i++) {
            if (vec[i]>vec[i-1]) {
                verifier++;
            }
            else if (vec[i]<vec[i-1]) {
                verifier--;
            }
            else {
                verifier = 0;
                break;
            }
        }

        if (verifier == vec.length*-1 + 1) {
            return -1;
        }
        else if (verifier == vec.length - 1) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner (System.in);

        int[] vec = new int[10];
        int x;
        int[] bigger_distance = new int[2];
        int distance = 0;
        int smaller = 0;
        int bigger = 0;
        int equal = 0;
        String order;


        for (int i=0; i<10; i++) {
            vec[i] = input.nextInt();
        }
        x = input.nextInt();

        switch (verifyOrder(vec)) {
            case 1:
                order = "Crescente";
                break;

            case -1:
                order = "Decrescente";
                break;

            default:
                order = "Nao ordenado";
                break;
        }
        

        for (int i=0; i<10; i++) {
            if (i>0) {
                int dist_aux = Math.abs(vec[i]-vec[i-1]);
                if (dist_aux > distance){
                    distance = dist_aux;
                    bigger_distance[0]=i-1;
                    bigger_distance[1]=i;
                }
            } 
            switch (compareInt(vec[i], x)) {
                case 1:
                    bigger++;
                    break;

                case -1:
                    smaller++;
                    break;

                default:
                    equal++;
                    break;
            }
                
        }

        if (distance == 0) {
            bigger_distance[0]=0;
            bigger_distance[1]=1;
        }

        System.out.println(bigger_distance[0] + " " + bigger_distance[1] + " "
                        + order + " " + bigger + " " + smaller + " " + equal);
        
        input.close();
    }

}
