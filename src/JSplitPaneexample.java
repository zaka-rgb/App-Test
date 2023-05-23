import javax.swing.*;

public class JSplitPaneexample {
public JSplitPaneexample() {
JFrame cadre = new JFrame();
JLabel eImage = new JLabel(new ImageIcon("C:/Users/Zakaria/Desktop/pfe/site web/1.jpg"));
JTextArea ta = new JTextArea(texte, 20, 10);
ta.setLineWrap(true); // passage automatique à la ligne
JSplitPane pSeparation = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,ta, eImage); // ou VERTICAL_SPLIT
cadre.setContentPane(pSeparation); // ou cadre.add(pSeparation);
cadre.setTitle("Le chemin par Google Map !");
cadre.pack();
cadre.setDefaultCloseOperation(3);
cadre.setResizable(true); // autoriser le redimensionnement
cadre.setVisible(true);
};
static String texte = "Il ne faut pas se fier aveuglément à la technologie. Un chauffeur qui a été guidé par la géolocalisationde Google !";
public static void main(String [] args) {
new JSplitPaneexample();
}
}