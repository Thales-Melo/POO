import java.io.IOException;

public class J3_02 extends Exception {

    public static void metodo01() throws ClassNotFoundException {
        Class.forName("ClasseQueNaoExiste");
    }
    public static void metodo02() throws IOException{
        java.io.File.createTempFile("pre", "suf");
    }
    public static void metodo03() throws Exception {
        Integer.class.newInstance();
    }
    public static void main(String[] args) {

        try {
            metodo01();
        } 
        catch (ClassNotFoundException e) {
            System.out.println(e.getMessage() + " nao existe!");
        }
        
        try {
            metodo02();
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        
        try {
            metodo03();
        } 
        catch (Exception e) {
            System.out.println(e);
        }    
        
        
    }
}