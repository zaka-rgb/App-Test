import javax.swing.*;

public class Jscrollexample {
public Jscrollexample() {
	
	
JFrame cadre = new JFrame();
JLabel eImage = new JLabel(new ImageIcon("C:/Users/Zakaria/Desktop/pfe/site web/1.jpg"));
JScrollPane pDefilement = new JScrollPane(eImage);
cadre.setContentPane(pDefilement); // ou cadre.add(pDefilement);
cadre.setTitle("Le chemin par Google Map !");
cadre.pack();
cadre.setDefaultCloseOperation(3);
cadre.setResizable(true); // true laisse la possibilité de redimensionnement
cadre.setVisible(true);
};
public static void main(String [] args) {
new Jscrollexample() ;
}
}


