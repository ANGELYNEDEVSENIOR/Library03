package Com;

public class Book {

   private String id;
   private String tittle;
   private String autor;
   private boolean isBorrowed;
public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public String getTittle() {
    return tittle;
}
public void setTittle(String tittle) {
    this.tittle = tittle;
}
public String getAutor() {
    return autor;
}
public void setAutor(String autor) {
    this.autor = autor;
}
public boolean isBorrowed() {
    return isBorrowed;
}
public void setBorrowed(boolean isBorrowed) {
    this.isBorrowed = isBorrowed;
}
public Book(String id, String tittle, String autor) {
    this.id = id;
    this.tittle = tittle;
    this.autor = autor;
}
    
}




