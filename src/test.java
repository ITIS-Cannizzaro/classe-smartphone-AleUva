import java.util.Scanner;
public class test{
public static void main(String []args){
    Scanner nomestudente=new Scanner(System.in);
    Studente s1=new Studente();
    System.out.println("Inserisci il nome dello studente: ");
    String n1=nomestudente.nextLine();
    s1.setNome(n1);
    System.out.println("Inserisci l'anno di nascita del primo studente");
    int AdN1=nomestudente.nextInt();
    s1.setAnnodiNascita(AdN1);
    nomestudente.nextLine();

    System.out.println("Inserisci il nome del secondo studente: ");
    String n2=nomestudente.nextLine();
    System.out.println("Inserisci l'anno di nascita del secondo studente: ");
    int AdN2=nomestudente.nextInt();
    Studente s2=new Studente(n2, AdN2);
    System.out.println("Il primo studente:" + s1);
    System.out.println("Il secondo studente:" + s2);
    if (s1.getAnnodiNascita()==s2.getAnnodiNascita()){
        System.out.println(s1.getNome()+ "ha la stessa età di" +s2.getNome());
    }
        else if (s1.getAnnodiNascita()<s2.getAnnodiNascita()){
            System.out.println(s1.getNome()+ " è più grande di " +s2.getNome());
        }
        else{
            System.out.println(s1.getNome()+ " è più piccolo di " +s2.getNome());
        }
        nomestudente.close();
    

    }




    



}