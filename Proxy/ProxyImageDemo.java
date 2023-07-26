package Proxy;

public class ProxyImageDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("abc.pdf");
        image.display();

        image.display();
    }
    
}
