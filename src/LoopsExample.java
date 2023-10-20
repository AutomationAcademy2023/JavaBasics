public class LoopsExample {
    public static void show() {

        System.out.println("While loop:");
        int i = 1;
        while(i <= 5){
            System.out.println("Iteration " + i);
            i ++;
        }

        System.out.println("\nDo-While loop:");
        i = 1;
        do {
            System.out.println("Iteration " + i);
            i ++;
        } while(i <= 5);


        System.out.println("\nFor loop:");
        for(i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

    }
}
