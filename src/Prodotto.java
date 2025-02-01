
import java.util.Random;

public class Prodotto {
    
    //Mi creo i vari attributi
    private int codice;

    private double prezzo;

    public String descrizione;

    public int iva;

    private String nomeProdotto;

    public Prodotto(String descrizione){
        codiceRandom();
        this.descrizione = descrizione;
    }
    
    //Creo un metodo che andrà a generare un numero randomico fino a 3000
    public int codiceRandom(){
        Random ran = new Random();
        int max = 3000;
        codice = ran.nextInt(max);
        return codice;
    }

    public double prezzoIniziale (double prezzo){
        this.prezzo = prezzo;
        System.out.println("Il prezzo iniziale è: " + this.prezzo);
        return this.prezzo;
    }

    public int setDefaultIva(int iva){
        if (iva != 4 && iva != 5 && iva != 10 && iva != 22) {
            System.out.println("L'iva deve avere uno dei seguenti valori: 4, 5, 10, 22");
        }else{
            this.iva = iva;
        }
        return this.iva;
    }

    public void prezzoIva (){
        double prezzoConIvaAggiunta = (prezzo * iva)/100;
        double prezzoFinale = prezzo + prezzoConIvaAggiunta;
        System.out.println("Il prezzo con iva aggiunta è: " + prezzoFinale);
    }

    public String nomeEsteso( String nomeProdotto){
        this.nomeProdotto = nomeProdotto;
        System.out.println(" Il prodotto inserito è: "+ nomeProdotto +"\n\til codice associato è: " + codice);
        return this.nomeProdotto;
    }
}