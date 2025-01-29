public class NuovoProdotto {
    public static void main(String[] args) throws Exception {

        Prodotto giacca = new Prodotto();

        //Richiamo il metodo che genra numero random
        giacca.codiceRandom(0);
        System.out.println("il codice è: " + giacca.codiceRandom(0));

        //Richiamo il metodo su cui è presente il prezzo iniziale
        giacca.getPrezzo(0);
        System.out.println("Il prezzo iniziale è: " + giacca.getPrezzo(0));

        //Richiamo il metodo che mi riporta il prezzo con aggiunta iva
        giacca.getPrezzoIva(0);
        System.out.println("Il prezzo con iva aggiunta è: " + giacca.getPrezzoIva(0));

        //Richiamo metodo relativo alla stampa del nome e codice
        giacca.nomeEsteso();


        Prodotto polo = new Prodotto();

        polo.codiceRandom(0);
        System.out.println("il codice è: " + polo.codiceRandom(0));

        polo.getPrezzo(0);
        System.out.println("Il prezzo iniziale è: " + polo.getPrezzo(0));

        polo.getPrezzoIva(0);
        System.out.println("Il prezzo con iva aggiunta è: " + polo.getPrezzoIva(0));

        polo.nomeEsteso();
    }
}
