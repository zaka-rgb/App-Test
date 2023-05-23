import javax.swing.*;

public class JTabbedPaneexample {
public JTabbedPaneexample() {
JFrame cadre = new JFrame();
JTabbedPane pOnglets = new JTabbedPane(JTabbedPane.TOP); // par défaut
JLabel nom = new JLabel(" Nom : ");
JTextField tNom = new JTextField(10);
JLabel prenom = new JLabel(" Prénom : ");
JTextField tPrenom = new JTextField(10);
JPanel identite = new JPanel();
identite.add(nom); identite.add(tNom);
identite.add(prenom); identite.add(tPrenom);
pOnglets.addTab(" Identité ", identite); // ajout d'un 1er panneau
JLabel niveau = new JLabel(" Niveau : ");
JTextField tNiveau = new JTextField(10);
JLabel annee = new JLabel(" Année : ");
JTextField tAnnee = new JTextField(10);
JPanel etudes = new JPanel();
etudes.add(niveau); etudes.add(tNiveau);
etudes.add(annee); etudes.add(tAnnee);
pOnglets.addTab(" Etudes ", etudes); // ajout d'un 2ème panneau
cadre.add(pOnglets);
cadre.setTitle("Saisie d'informations");
cadre.pack(); // la taille depend du plus grand onglet
cadre.setDefaultCloseOperation(3);
cadre.setResizable(false); // bloquer le changement de la taille
cadre.setVisible(true);
};
public static void main(String [] args) {
new JTabbedPaneexample();
}
}