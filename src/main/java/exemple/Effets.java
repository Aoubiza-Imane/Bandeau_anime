package exemple;

import bandeau.Bandeau;

/**
 *
 * @author aoubiza_imane
 */
public abstract class Effets {
    private String message ;
    Bandeau monBandeau ; //on amène le bandeau à travailler

    public Effets(String message, Bandeau monBandeau) {
        this.message = message;
        this.monBandeau = monBandeau;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Bandeau getMonBandeau() {
        return monBandeau;
    }

    public void setMonBandeau(Bandeau monBandeau) {
        this.monBandeau = monBandeau;
    }
    public  abstract void creerEffet() ;
     
}


