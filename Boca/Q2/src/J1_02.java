public class J1_02 {
    
    public static void solve () {
        for (int x=1000; x<=9999; x++) {
            if (Math.pow((x/100) + (x%100), 2) == x) {
                System.out.println(x);
            }
        }
    }
        
    
    public static void main(String[] args) throws Exception {
        solve();
    }
}