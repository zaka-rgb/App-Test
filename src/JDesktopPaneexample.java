import javax.swing.*;

public class JDesktopPaneexample{
public static void main(String[] args) {
boolean resizable = true;
boolean closeable = true;
boolean maximizable = true;
boolean iconifiable = true;
String title = "Cadre interne";
JInternalFrame icadre = new JInternalFrame(title, resizable,closeable,maximizable,iconifiable);
icadre.setSize(300, 300);
icadre.setVisible(true);
icadre.add(new JTextArea());
JDesktopPane desktop = new JDesktopPane();
desktop.add(icadre);
JFrame f = new JFrame("Cadre externe");
f.add(desktop);
f.setSize(400, 400);
f.setVisible(true);
}
}