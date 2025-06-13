public abstract class livro { 
    public string titulo;
    private string autor;
    private int anopublicação;
    private boolear disponivel;
    livro (string titulo,string autor,int anopublicação){ 
this titulo = titulo;
this autor = autor; 
this anopublicação = anopublicação;
this disponivel = true 
}
public string get titulo (){ 
 return this.titulo;
}
public string get autor ( ) {
    return this.autor;
} 
public int get anopublicação( ) { 
     return this anopublicação; 
}
private boolear get disponivel(){
  return this 
} 
public void set titulo ( string titulo) {
    this. titulo = titulo;
}
 public void emprestar ( ) { 
    if ( 