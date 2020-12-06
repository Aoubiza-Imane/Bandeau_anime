package exemple;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author aoubiza_imane
 */
public class ChangeCouleur extends Effets {

    public ChangeCouleur( Bandeau monBandeau, String message) {
        super(message, monBandeau);
        this.monBandeau = monBandeau;
    }
    public void creerEffet() {
        monBandeau.setMessage(this.getMessage());
        monBandeau.setForeground(Color.BLUE);
        monBandeau.setBackground(Color.MAGENTA);
        monBandeau.sleep(500);
        monBandeau.setForeground(Color.GREEN);
        monBandeau.setBackground(Color.RED);
        monBandeau.sleep(500);
        monBandeau.setForeground(Color.PINK);
        monBandeau.setBackground(Color.BLACK);
        monBandeau.sleep(1000);
    }  
    
}
