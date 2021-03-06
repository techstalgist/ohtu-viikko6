
package ohtu;

import javax.swing.JTextField;


public class Summa implements Komento {
    
    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private String edellinenTuloskentanArvo;
    
    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }
        
    @Override
    public void suorita() {
        int arvo = 0;
        try {
            arvo = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
        }
        
        edellinenTuloskentanArvo = tuloskentta.getText();
        
        sovellus.plus(arvo);
        int laskunTulos = sovellus.tulos();
        syotekentta.setText("");
        
        tuloskentta.setText("" + laskunTulos);   
    }

    @Override
    public void peru() {
        sovellus.asetaLuku(Integer.parseInt(edellinenTuloskentanArvo));
        tuloskentta.setText(edellinenTuloskentanArvo);
    }

}
