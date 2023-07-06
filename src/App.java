public class App{
      
    public static void main(String[] args) {
             
        Printable p = new Book("Java. Complete Referense.", "H. Shildt");
        p.print();
        p = new Journal("Hello World", "Dio");
        p.print();
    }
}
interface Printable{
 
    void print();
}