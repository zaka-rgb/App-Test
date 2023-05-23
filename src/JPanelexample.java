import javax.swing.*;

class Adresse extends JPanel {
public Adresse() {
super();
JLabel eNom = new JLabel("Nom : ");
JLabel ePrenom = new JLabel("Prénom : ");
JLabel eAdresse = new JLabel("Adresse : ");
JTextField tNom = new JTextField(8);
JTextField tPrenom = new JTextField(8);
JTextArea tAdresse = new JTextArea("",50,20);
add(eNom);
add(tNom);
add(ePrenom);
add(tPrenom);
add(eAdresse);
add(tAdresse);
};
}
public class JPanelexample {
public static void main(String[] args) {
JFrame cadre = new JFrame();
Adresse identite = new Adresse();
cadre.setContentPane(identite); // ou cadre1.add(identite);
cadre.pack();
cadre.setDefaultCloseOperation(3);
cadre.setTitle("Identité");
cadre.setVisible(true);
}
}