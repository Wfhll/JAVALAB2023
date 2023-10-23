package probleme3;

public class probleme3 {
    public static void main(String[] args) {
        problema1();
        problema2();
        problema3();
    }

    private static void problema1() {
        String cuvant = "message";
        for (int i = cuvant.length() - 1; i >= 0; i--) {
            System.out.println(cuvant.charAt(i));
        }
    }

    private static void problema2() {
        String[] cuvinte1 = {"maine", "am", "test"};
        String[] cuvinte2 = {"nu", "maine", "merg"};
        for (int i = 0; i < cuvinte1.length; i++) {
            for (int j = 0; j < cuvinte2.length; j++) {
                if (cuvinte1[i].equals(cuvinte2[j])) {
                    System.out.println(cuvinte1[i]);
                }
            }
        }
    }

    private static void problema3() {
       int[] arr = {4, 7, 9, 11};
       for(int j = 0 ; j < arr.length; j++){
           if(prim(arr[j])) {
               System.out.println(arr[j] + " este prim");
           }
       }
    }



    private static boolean prim(int x) {
        for (int i  = 2; i <= x/2; i++){
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }
}