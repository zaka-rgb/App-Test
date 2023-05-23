import java.awt.*;

import javax.swing.*;

public class JLayeredPaneExemp1e extends JFrame 
{ public JLayeredPaneExemp1e ( ) { 
	super ( "Test JLayeredPane ") ; 
	setSize(300, 200) ; 
	setVisible(true);
	setDefaultCloseOperation (3) ; 
	JLayeredPane Ip = getLayeredPane ( ) ; 
	JButton b3 = new JButton ( "3" ) ; 
			b3. setBackground (Color.white) ;
			b3.setBounds (60, 100, 60, 60) ;
			JButton b2 = new JButton ("2"); 
			b2 . setBackground (Color.YELLOW) ;
			b2 . setBounds (10, 60, 60, 60) ;
			JButton bl = new JButton ("1") ; 
			bl . setBackground (Color . cyan) ; 
			bl . setBounds (20, 20, 60, 60) ;

//Place les boutons dans les différentes couches
			Ip.add(bl,new Integer(1)) ;
			Ip.add(b2, new Integer(2)) ;
			Ip.add(b3, new Integer(3)) ;
}

public static void main(String[] args) {
	JLayeredPaneExemp1e  cadre = new JLayeredPaneExemp1e ( ) ;

}
}
