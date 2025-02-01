
public class NuovoProdotto {
    public static void main(String[] args) throws Exception {

        Prodotto giacca = new Prodotto("freddo?");
        System.out.println("il codice è: " + giacca.codiceRandom() +"\n" + giacca.descrizione);

        //Richiamo il metodo per il prezzo iniziale
        giacca.prezzoIniziale(22.5);

        //Richiamo per settare l'iva
        giacca.setDefaultIva(2);

        //Richiamo il metodo che mi riporta il prezzo con aggiunta iva
        giacca.prezzoIva();
    
        //Richiamo metodo relativo alla stampa del nome e codice
        giacca.nomeEsteso("giacca");
    }
}
