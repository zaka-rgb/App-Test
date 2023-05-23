import javax.swing.*;

class CadreMDI extends JInternalFrame {
public CadreMDI() {
super("", true, true, true, true);
}
public void setImage(String nomImage) {
JPanel p = new JPanel();
JLabel uneImage = new JLabel(new ImageIcon(nomImage));
p.add(uneImage);
this.add(p);
this.setTitle(nomImage);
}
}
public class JDesktopPane2 extends JDesktopPane {
	CadreMDI[] images;
	String[] nomsFichier = {"C:/Users/Zakaria/Desktop/pfe/site web/1.jpg", "C:/Users/Zakaria/Desktop/pfe/site web/1.jpg","C:/Users/Zakaria/Desktop/pfe/site web/1.jpg"};
	public JDesktopPane2() {
	super();
	images = new CadreMDI[3];
	for(int i=0; i<3; i++) {
	images[i] = new CadreMDI();
	images[i].setSize(200, 200);
	images[i].setLocation(100*i, 50*i); // effet à 3 D !
	images[i].setImage(nomsFichier[i]);
	images[i].setVisible(true);
	this.add(images[i]);
	}
	}
	public static void main(String[] args) {
	JFrame f = new JFrame();
	f.add(new JDesktopPane2());
	f.setDefaultCloseOperation(3);
	f.setVisible(true);
	f.setSize(500, 500);
	f.setTitle("Afficheur d'images");
	}
	}
