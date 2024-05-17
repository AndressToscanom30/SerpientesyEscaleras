package serpientesEscaleras;

import java.util.Random;

public class Dado {
    
    private int cara;
    private Random random;

    public Dado() {
        random = new Random();
    }

    public int getCara() {
        return cara;
    }

    public void setCara(int cara) {
        this.cara = cara;
    }
    
    public int tirarDado(){
        
        cara = random.nextInt(6) + 1;
        return cara;
        
    }
    
}