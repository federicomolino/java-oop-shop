
public class NuovoProdotto {
    public static void main(String[] args) throws Exception {

        Prodotto giacca = new Prodotto("freddo?");
        System.out.println("il codice è: " + giacca.codiceRandom() +"\n" + giacca.descrizione);

        //Richiamo il metodo su cui è presente il prezzo iniziale
        giacca.prezzoIniziale();
        
        //Stampo il valore salvato dentro il metodo getPrezzoInput
        System.out.println("Il prezzo iniziale è: " + giacca.getPrezzoInput());

        //Richiamo per settare l'iva
        giacca.setDefaultIva();

        //Richiamo il metodo che mi riporta il prezzo con aggiunta iva
        giacca.prezzoIva();
        System.out.println("Il prezzo con iva aggiunta è: " + giacca.prezzoIva());

        //Richiamo metodo relativo alla stampa del nome e codice
        giacca.nomeEsteso();
    }
}
