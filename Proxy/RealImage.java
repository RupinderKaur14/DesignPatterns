package Proxy;

public class RealImage implements Image{

    String filename;

    RealImage(String filename){
        this.filename = filename;
        loadFile(filename);
    }

    @Override
    public void display() {
        System.out.println(filename+" display");
    }

    void loadFile(String filename){
        System.out.println(filename+" Loading");
    }
    
}
