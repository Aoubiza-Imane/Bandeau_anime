package exemple;

import bandeau.Bandeau;

/**
 *
 * @author aoubiza_imane
 */
public class ExempleScenario {
    
    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();
        Scenario demo = new Scenario();
        Zoom zoomer = new Zoom(monBandeau,  "Je suis un Zoomer #2000");
        Rotate tour = new Rotate(monBandeau, "ça donne le tournis");
        ChangeCouleur colore = new ChangeCouleur(monBandeau,"Je suis un caméléon");
        demo.repeteEffetNfois(zoomer, 1);
        demo.repeteEffetNfois(tour, 2);
        demo.repeteEffetNfois(colore, 3);
        demo.marcheEffet();
        monBandeau.close();
    }
}
