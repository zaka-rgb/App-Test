import java.awt.*;

import javax.swing.*;

public class JToolBarexample2 {
public JToolBarexample2() {
JToolBar tb = new JToolBar();
tb.setFloatable(true); // true par défaut
tb.add(new JButton("Ouvrir"));
tb.add(new JButton("Enregistrer"));
tb.addSeparator();
Icon ic =new ImageIcon("C:/Users/Zakaria/Desktop/pfe/site web/1.jpg");
tb.add(new JButton("Java", ic));
tb.add(new JRadioButtonMenuItem("ON/OF"));
JFrame cadre = new JFrame();
cadre.add(tb, BorderLayout.PAGE_END);
// en bas de page ou par défaut en haut : PAGE_START
cadre.setTitle("Barre d'outils (2)");
cadre.setSize(600, 200);
cadre.setDefaultCloseOperation(3);
cadre.setVisible(true);
};
public static void main(String [] args) {
new JToolBarexample2();
}
}