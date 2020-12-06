package exemple;

import bandeau.Bandeau;

/**
 *
 * @author aoubiza_imane
 */
public class Rotate extends Effets {
    
    public Rotate(Bandeau monBandeau, String message) {
        super(message, monBandeau);
        this.monBandeau = monBandeau;
    }
    public void creerEffet() {
        monBandeau.setMessage(this.getMessage());
        for (int i = 0; i <= 100; i++) {
		monBandeau.setRotation(2*Math.PI*i / 100);
		monBandeau.sleep(100);
	}
    }
} 