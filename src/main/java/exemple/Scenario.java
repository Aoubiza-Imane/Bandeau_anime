package exemple;


import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author aoubiza_imane
 */
public class Scenario {
    
    private final List<Effets> effets = new LinkedList<>();
      
    public void repeteEffetNfois (Effets effet, int n) {
        for (int i = 0; i<n; i++){
            this.effets.add(effet);
        }    
    }  
    public void marcheEffet() {
        for(Effets e : effets) {
            e.creerEffet();   
        }
    }
}
