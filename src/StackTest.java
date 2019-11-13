public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("Adding to stack: ");
        for(int i = 1; i <= 20; i++) {
            stack.pushToStack(i);
        }

        System.out.println("Popping from stack: ");
        for(int i = 1; i <= 20; i++) {
            stack.popFromStack();
        }

        System.out.println("Adding to stack: ");
        for(int i = 1; i <= 20; i++) {
            stack.pushToStack("String " + i);
        }

        System.out.println("Popping from stack: ");
        for(int i = 1; i <= 20; i++) {
            stack.popFromStack();
        }
    }
}
