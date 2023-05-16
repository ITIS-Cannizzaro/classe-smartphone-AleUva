public class Studente{


private String nome;
private int AnnodiNascita;

public Studente(){
}
public Studente(String nome, int AnnodiNascita){
this.nome=nome;
this.AnnodiNascita=AnnodiNascita;
}
public String getNome(){
return nome;
}

public void setNome(String nome){
    this.nome=nome;
}
public int getAnnodiNascita(){
    return AnnodiNascita;
    }
    
    public void setAnnodiNascita(int AnnodiNascita){
        this.AnnodiNascita=AnnodiNascita;
    }
    public String toString(){
        return "Studente[nome="+nome+",AnnodiNascita="+AnnodiNascita+"]";
    }
    }
