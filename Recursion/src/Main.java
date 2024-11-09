import static java.nio.file.Files.walk;

public class Main {
    public static void main(String[] args) {
        walk(5); //normal stuff

        recursiveWalk(2);
        
       System.out.println(factorial(7));
    }

    private static int factorial(int num) {
        if(num<1)
            return 1;
            if(num > 1){
            System.out.print(num+ " * ");
            }

            if(num == 1){
            System.out.print(num+ " = ");}
        return num * factorial(num -1);



    }

    private static void recursiveWalk(int steps) {

        if(steps < 1)
            return;
        System.out.println( steps + " steps remaining");
        recursiveWalk(steps-1);
    }


    //normal stuff
    private static void walk(int steps) {
        for(int i = 0; i < steps ; i++) {
            System.out.println("You take a step in normal style");
        }
    }
}