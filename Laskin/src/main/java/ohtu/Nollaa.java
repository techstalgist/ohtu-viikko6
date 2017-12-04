
package ohtu;

import javax.swing.JTextField;


public class Nollaa implements Komento {

    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private String edellinenTuloskentanArvo;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }
    
    @Override
    public void suorita() {
        edellinenTuloskentanArvo = tuloskentta.getText(); 
        sovellus.nollaa();
        syotekentta.setText("");
        tuloskentta.setText("0");
    }

    @Override
    public void peru() {
        sovellus.asetaLuku(Integer.parseInt(edellinenTuloskentanArvo));
        tuloskentta.setText(edellinenTuloskentanArvo);
    }
}
