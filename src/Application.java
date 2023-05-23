import java.awt.geom.*;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.MessageFormat;

import javax.imageio.*;
import javax.swing.*;

public class Application {
	
	static File fichier=new File("C:/Users/Zakaria/Desktop/pfe/site web/1.jpg");
	
static String	tabHtm1  = "<html><table>" +
					"<tr><td>{0}</td></tr>"+
					"<tr><td>{1} x {2}</td></tr>"+
					"<tr><td> {3} octets</td></tr>" +
					"<tr><td> {4, date, full}</td></tr>"+
					"</table></html>";


static String description =MessageFormat.format(tabHtm1,fichier.getName(),fichier.length(),fichier.lastModified());




private static Icon vignette (File fichier) throws IOException { 
	
	BufferedImage source = ImageIO . read (fichier) ; 
	int largeur = source . getWidth() ;
	int hauteur = source . getHeight() ;

BufferedImage image = new BufferedImage (200, 150 , source . getType ( ) );
double ratio = 200 /(double) largeur ;
AffineTransform retailler = AffineTransform. getScaleInstance (ratio, ratio) ;
int interpolation = AffineTransformOp.TYPE_BICUBIC;
AffineTransformOp retaillerlmage = new AffineTransformOp (retailler, interpolation) ;
retaillerlmage.filter(source, image) ; 

return new ImageIcon (image) ;
}



public static void main(String [] args) throws IOException {

JLabel et=new JLabel(description,vignette(fichier),JLabel.LEFT);

	
JFrame f=new JFrame();

f.setVisible(true);

f.add(et);
f.pack();

}

}

