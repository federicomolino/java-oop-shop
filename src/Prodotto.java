
import java.util.Random;
import java.util.Scanner;

public class Prodotto {
    
    //Mi creo i vari attributi
    public int codice;

    public int codiceGenerato;

    public double prezzoInInput;

    public String nome;

    public String descrizione;

    public double prezzo;

    public double iva;

    public Prodotto(){

    }
    
    //Creo un metodo che andrà a generare un numero randomico fino a 3000
    public int codiceRandom(int codiceRandom){
        Random ran = new Random();
        int max = 3000;
        int numero = ran.nextInt(max);
        codiceGenerato = codiceRandom + numero;
        return codiceRandom + numero;
    }

    //All'interno sarà salvato il codice generato in precedenza
    public int getRandomCodice(){
        return codiceGenerato;
    }

    public double getPrezzo (double prezzoIniziale){
        /*prezzo = 44.5;
        prezzoIniziale = prezzo;
        return prezzoIniziale;*/
        System.out.print("Inserisci il prezzo inizile senza IVA: ");
        Scanner scan = new Scanner(System.in);
        Double prezzoInput = scan.nextDouble();
        prezzo = prezzoInput;
        return prezzo;
    }

    public double getPrezzoInput(){
        return prezzo;
    }


    public double getPrezzoIva (double totaleIva){        
        totaleIva = 22;
        double prezzoBase = prezzo;
        double prezzoConIva = totaleIva;
        double prezzoConIvaAggiunta = (prezzoBase * prezzoConIva)/100;
        double prezzoFinale = prezzoBase + prezzoConIvaAggiunta;
        return prezzoFinale;
    }

    public void nomeEsteso(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nomeInput = scan.nextLine();
        System.out.println(" Il nome inserito è: "+ nomeInput +"\nil codice associato è: " + getRandomCodice());
    }
}