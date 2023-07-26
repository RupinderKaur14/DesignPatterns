package Strategy;

public class Client {
   private SortStrategy sortStrategy;

   Client(SortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
   }

   void performSorting(int[] numbers){
        sortStrategy.sort(numbers);
   }
}
