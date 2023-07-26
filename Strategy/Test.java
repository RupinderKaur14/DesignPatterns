package Strategy;

public class Test {
   
        public static void main(String[] args) {
            Test r1 = new Test();
            Double d = null;
            r1.hello1(d); 
        }
    
        public void hello1(String str) {
            System.out.println("I am string");
        }
    
        public void hello1(Double number) {
            System.out.println("I am double");
        }

        public void hello1(Object num){
            System.out.println("object");
        }
    
}
