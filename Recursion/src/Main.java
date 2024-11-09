import static java.nio.file.Files.walk;

public class Main {
    public static void main(String[] args) {
        walk(5); //normal stuff

        recursiveWalk(5);
    }

    private static void recursiveWalk(int steps) {

        if(steps < 1)
            return;
        System.out.println("You take a step in recursion");
        recursiveWalk(steps-1);
    }


    //normal stuff
    private static void walk(int steps) {
        for(int i = 0; i < steps ; i++) {
            System.out.println("You take a step in normal style");
        }
    }
}