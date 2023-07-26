package Strategy;

public class StrategyImplementation {
    public static void main(String[] args) {
        Client bubbleSort = new Client(new BubbleSort());
        bubbleSort.performSorting(new int[]{3,6,4});

        Client insertionSort = new Client(new InsertionSort());
        insertionSort.performSorting(new int[]{2,5,3});
        
    }


    
}
