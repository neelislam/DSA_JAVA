import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // LIFO - Last in First out
        // Push()
        // Pull()
        Stack<String> stack = new Stack<String>();
        //

        stack.push("Call of duty");
        stack.push("Need for speed");
        stack.push("GTA");
        stack.push("Valorant");
        stack.push("Final Fantacy");

// check if stack is empty
        System.out.println(stack.empty()); // output: false if not empty


        // see what's inside the stack
        System.out.println(stack);

        // pop an item from the stack from top
        stack.pop();
        System.out.println("Item popped!\n");

        System.out.println(stack);


        String gamepooped = stack.pop();
        System.out.println("Game popped: " + gamepooped);
        System.out.println(stack);


        // to see top most item
        System.out.println("Top most item:\n");
        System.out.println(stack.peek());
//find, will return 1 if exits
        System.out.println(stack.search("GTA"));
// will return -1 if does not exit
        System.out.println(stack.search("PUBG"));

        for(int i = 0; i<300; i++) {
            stack.push("FIFA\n");
        }
        System.out.println(stack);
    }




}