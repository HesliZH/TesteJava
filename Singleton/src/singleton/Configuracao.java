package singleton;

import java.awt.Color;

public class Configuracao {
    private static Configuracao instancia;
    
    private Color corJanela1;
    private Color corJanela2;

    public Color getCorJanela1() {
        return corJanela1;
    }

    public void setCorJanela1(Color corJanela1) {
        this.corJanela1 = corJanela1;
    }

    public Color getCorJanela2() {
        return corJanela2;
    }

    public void setCorJanela2(Color corJanela2) {
        this.corJanela2 = corJanela2;
    }
    
    //Métodos
    
    private Configuracao(){
        corJanela1 = Color.RED;
        corJanela2 = Color.BLUE;
    }
    
    public static Configuracao getInstancia(){
        if(instancia == null){
            instancia = new Configuracao();
        }
        return instancia;
    }
}
