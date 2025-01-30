public class NuovoProdotto {
    public static void main(String[] args) throws Exception {

        Prodotto giacca = new Prodotto();
        //Richiamo il metodo che genra numero random
        giacca.codiceRandom();
        System.out.println("il codice è: " + giacca.codiceRandom());

        //Richiamo il metodo su cui è presente il prezzo iniziale
        giacca.getPrezzo();
        //Stampo il valore salvato dentro il metodo getPrezzoInput
        System.out.println("Il pre zzo iniziale è: " + giacca.getPrezzoInput());

        //Richiamo il metodo che mi riporta il prezzo con aggiunta iva
        giacca.getPrezzoIva(0);
        System.out.println("Il prezzo con iva aggiunta è: " + giacca.getPrezzoIva(0));

        //Richiamo metodo relativo alla stampa del nome e codice
        giacca.nomeEsteso();


        Prodotto polo = new Prodotto();

        polo.codiceRandom();
        System.out.println("il codice è: " + polo.codiceRandom());

        polo.getPrezzo();
        System.out.println("Il prezzo iniziale è: " + polo.getPrezzoInput());

        polo.getPrezzoIva(0);
        System.out.println("Il prezzo con iva aggiunta è: " + polo.getPrezzoIva(0));

        polo.nomeEsteso();
    }
}
