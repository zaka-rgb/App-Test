import java.awt.*;

import javax.swing.*;

public class JToolBarexample {
public JToolBarexample() {
JButton bOuvrir = new JButton(new ImageIcon("C:/Users/Zakaria/Desktop/pfe/site web/1.jpg"));
JButton bEnregistrer = new JButton(new ImageIcon("C:/Users/Zakaria/Desktop/pfe/site web/1.jpg"));
JButton bCouper = new JButton(new ImageIcon("C:/Users/Zakaria/Desktop/pfe/site web/1.jpg"));
JButton bCopier = new JButton(new ImageIcon("C:/Users/Zakaria/Desktop/pfe/site web/1.jpg"));
JButton bColler = new JButton(new ImageIcon("C:/Users/Zakaria/Desktop/pfe/site web/1.jpg"));
bOuvrir.setToolTipText("Ouvrir un fichier"); // ajout de bulles d'aide
bEnregistrer.setToolTipText("Enregistrer le fichier");
bCouper.setToolTipText("Couper vers le presse papier");
bCopier.setToolTipText("Copier vers le presse papier");
bColler.setToolTipText("Coller depuis le presse papier");
JToolBar tb = new JToolBar();
tb.add(bOuvrir);
tb.add(bEnregistrer);
tb.addSeparator(); // ajout d'une barre de séparation
tb.add(bCouper);
tb.add(bCopier);
tb.add(bColler);
JPanel panneau = new JPanel();
panneau.setLayout(new BorderLayout());
panneau.add(tb, BorderLayout.NORTH);
JFrame cadre = new JFrame();
cadre.add(panneau);
cadre.setTitle("Barre d'outils");
cadre.setSize(600, 400);
cadre.setDefaultCloseOperation(3);
cadre.setVisible(true);
cadre.pack();
};
public static void main(String [] args) {
new JToolBarexample();
}
}
