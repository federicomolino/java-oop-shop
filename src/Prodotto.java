
import java.util.Random;
import java.util.Scanner;

public class Prodotto {
    
    //Mi creo i vari attributi
    private int codice;

    private double prezzo;

    public String descrizione;

    public int iva;

    public Prodotto(String descrizione){
        codiceRandom();
        this.descrizione = descrizione;
    }
    
    //Creo un metodo che andrà a generare un numero randomico fino a 3000
    public int codiceRandom(){
        Random ran = new Random();
        int max = 3000;
        int numero = ran.nextInt(max);
        codice = numero;
        return codice;
    }

    public double prezzoIniziale (){
        System.out.print("Inserisci il prezzo inizile senza IVA: ");
        Scanner scan = new Scanner(System.in);
        Double prezzoInput = scan.nextDouble();
        prezzo = prezzoInput;
        return prezzo;
    }

    public double getPrezzoInput(){
        return prezzo;
    }

    public int setDefaultIva(){
        System.out.print("Inserisci l'Iva del prodotto: ");
        Scanner scan = new Scanner(System.in);
        iva = scan.nextInt();
        return iva;
    }

    public double prezzoIva (){
        double prezzoConIvaAggiunta = (prezzo * iva)/100;
        double prezzoFinale = prezzo + prezzoConIvaAggiunta;
        return prezzoFinale;
    }

    public void nomeEsteso(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il prodotto: ");
        String nomeInput = scan.nextLine();
        System.out.println(" Il prodotto inserito è: "+ nomeInput +"\n\til codice associato è: " + codice);
    }
}