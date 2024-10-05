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

    }




}