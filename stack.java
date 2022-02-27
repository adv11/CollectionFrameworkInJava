package Collection_Framework;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        // push() func for putting elements into the stack
        animals.push("Lion");
        animals.push("Giraffe");
        animals.push("Cat");
        animals.push("Tiger");
        animals.push("Hippopotamus");

        System.out.println(animals);    // output : [Lion, Giraffe, Cat, Tiger, Hippopotamus]

        // peek() function for getting the top-most element into the stack
        System.out.println(animals.peek()); // output : Hippopotamus

        // pop() function is used to remove pop/remove the top-most element
        System.out.println(animals.pop());  // output : Hippopotamus
        System.out.println(animals);    // output : [Lion, Giraffe, Cat, Tiger]


        // search() function returns the position of the element as 1-based indexing in the stack
        System.out.println(animals.search("Lion")); // output : 4, Lion is present at the forth position in the stack

        // isEmpty() function checks if the stack is empty or not
        System.out.println(animals.isEmpty());
    }
}
