import java.util.Scanner;
public class TestSmartphone{

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Smartphone smartphone1= new Smartphone(null, null, 0, 0, 0, false);
	       // input valori da tastiera per smartphone1
        System.out.println("Inserisci la marca per smartphone1:");
        String marca1 = input.nextLine();
        smartphone1.setMarca(marca1);

        System.out.println("Inserisci il modello per smartphone1:");
        String modello1 = input.nextLine();
        smartphone1.setModello(modello1);

        System.out.println("Inserisci il prezzo di lancio per smartphone1:");
        double prezzo1 = input.nextDouble();
        smartphone1.setPrzLancio(prezzo1);

        System.out.println("Inserisci il numero di pollici per smartphone1:");
        double pollici1 = input.nextDouble();
        smartphone1.setPollici(pollici1);

        System.out.println("Inserisci la RAM per smartphone1:");
        int ram1 = input.nextInt();
        smartphone1.setRam(ram1);

        System.out.println("Inserisci 1 se smartphone1 ha touchscreen, altrimenti inserisci 0:");
        boolean touchScreen1 = input.nextInt() == 1;
        smartphone1.setTouchScreen(touchScreen1);

        input.nextLine(); // pulizia buffer

        // output valori e tipologia smartphone1
        System.out.println(smartphone1.toString());
        System.out.println("Tipologia: " + smartphone1.ottieniTipologiaSmartphone());
        System.out.println("Fascia di prezzo: " + smartphone1.ottieniFasciaPrz());
        System.out.println();

        // creazione oggetto smartphone2 con costruttore personalizzato
        System.out.println("Inserisci la marca per smartphone2:");
        String marca2 = input.nextLine();

        System.out.println("Inserisci il modello per smartphone2:");
        String modello2 = input.nextLine();

        System.out.println("Inserisci il prezzo di lancio per smartphone2:");
        double prezzo2 = input.nextDouble();

        System.out.println("Inserisci il numero di pollici per smartphone2:");
        double pollici2 = input.nextDouble();

        System.out.println("Inserisci la RAM per smartphone2:");
        int ram2 = input.nextInt();

        System.out.println("Inserisci 1 se smartphone2 ha touchscreen, altrimenti inserisci 0:");
        boolean touchScreen2 = input.nextInt() == 1;

        Smartphone smartphone2 = new Smartphone(marca2, modello2, prezzo2, pollici2, ram2, touchScreen2);

        input.nextLine(); // pulizia buffer

        // output valori e tipologia smartphone2
        System.out.println(smartphone2.toString());
        System.out.println("Tipologia: " + smartphone2.ottieniTipologiaSmartphone());
        System.out.println("Fascia di prezzo: " + smartphone2.ottieniFasciaPrz());

        input.close();
    }


		
		

	}
