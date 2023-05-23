import javax.swing.*;

public class JTabbedPaneexample2 {
public JTabbedPaneexample2() {
JFrame cadre = new JFrame();
JTabbedPane pOnglets = new JTabbedPane();
JLabel eImage1 = new JLabel(new ImageIcon("C:/Users/Zakaria/Desktop/pfe/site web/1.jpg"));
JPanel image1 = new JPanel();
image1.add(eImage1);
pOnglets.addTab(" Photo 1 ", image1);
JLabel eImage2 = new JLabel(new ImageIcon("C:/Users/Zakaria/Desktop/pfe/site web/1.jpg"));
JPanel image2 = new JPanel();
image2.add(eImage2);
pOnglets.addTab(" Photo 2 ", image2);
JLabel eImage3 = new JLabel(new ImageIcon("C:/Users/Zakaria/Desktop/pfe/site web/1.jpg"));
JPanel image3 = new JPanel();
image3.add(eImage3);
pOnglets.addTab(" Photo 3 ", image3);
JLabel eImage4 = new JLabel(new ImageIcon("C:/Users/Zakaria/Desktop/pfe/site web/1.jpg"));
JPanel image4 = new JPanel();
image4.add(eImage4);
pOnglets.addTab(" Photo 4 ", image4);
cadre.setContentPane(pOnglets);
cadre.setTitle("Album photos");
cadre.pack();
cadre.setDefaultCloseOperation(3);
cadre.setResizable(true);
cadre.setVisible(true);
};
public static void main(String [] args) {
new JTabbedPaneexample2();
}
}