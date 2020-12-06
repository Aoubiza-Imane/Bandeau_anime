package exemple;

import bandeau.Bandeau;
import java.awt.Font;


/**
 *
 * @author aoubiza_imane
 */
public class Zoom extends Effets {
    
    public Zoom(Bandeau monBandeau, String message) {
        super(message, monBandeau);
        this.monBandeau = monBandeau;
    }
    
    public void creerEffet(){
        monBandeau.setMessage(this.getMessage());
        for (int i = 1; i < 50 ; i+=6) { // on va de 6 en 6
		monBandeau.setFont(new Font("Times New Roman", Font.ITALIC, 5+i));
		monBandeau.sleep(100);
	}
    }
}
