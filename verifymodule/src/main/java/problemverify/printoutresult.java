package problemverify;


public class printoutresult {
    public static void main(String[] args) {
        int[] arr = {100,101,102};
        OUTER:
        while(true){
            for (int i = 0; i < arr.length; i++){
                System.out.println(i);
                if (i == 1){
                    System.out.println("out");
                    break OUTER;
                }else{
                    System.out.println("A");
                }
                System.out.println(i);
            }
            System.out.println("B");
        }
        System.out.println("C");
    }
}
