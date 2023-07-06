public class Journal implements Printable {
    
    private String name;
    private String author;

    Journal(String n, String a){
        this.name = n;
        this.author = a;
    }
    
    public void print(){
        System.out.println(author + " has published: " + name);
    }
}
