public class Book implements Printable {
    
    private String name;
    private String author;

    Book(String n, String a){
        this.name = n;
        this.author = a;
    }
    
    public void print(){
        System.out.println(author + " has wrote: " + name);
    }
}
