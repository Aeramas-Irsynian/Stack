public class Stack<T> {
    private T[] elements;
    private Integer stackPeak;

    public Stack() {
        elements = (T[]) new Object[10];
        stackPeak = -1;
    }

    public void pushToStack(T element) {
        if (isArrayFull()) {
            elements = increaseArraySize(elements);
        }
        stackPeak++;
        elements[stackPeak] = element;
        System.out.println("Element " + element + " has been pushed to stack");
    }

    private boolean isArrayFull() {
        return elements.length-1 <= stackPeak;
    }

    private T[] increaseArraySize(T[] elements) {
        int arraySize = elements.length * 2;
        return copyElementsToNewArray(elements, arraySize);
    }

    private T[] copyElementsToNewArray(T[] elements, Integer arraySize) {
        T[] newElements = (T[]) new Object[arraySize];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        return newElements;
    }

    public T popFromStack() {
        if (isStackEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        T element = elements[stackPeak];
        elements[stackPeak] = null;
        System.out.println("Element " + element + " has been returned from stack");
        stackPeak--;
        return element;
    }

    public boolean isStackEmpty() {
        return stackPeak == -1;
    }
}
