
package praktikumtpbo;
import java.awt.*;
import java.applet.*;
public class Nomor2 extends Applet {
    private Image Buffer ;
    private Graphics gBuffer ;
    
    public void init() {
        Buffer = createImage (size(). width,size ().height);
        gBuffer = Buffer.getGraphics();
        
    }
    
    public boolean mouseDown (Event e, int x,int y){
        gambar(x,y);
        repaint();
        return true;
        
    }
    public void gambar(int x, int y){
        int rl = (int) (Math.random()*256);
        int gl = (int) (Math.random()*256);
        int bl = (int) (Math.random()*256);
        Color c = new Color (rl,gl,bl);
        int d = (int) (Math.random()* 50 + 10);
        gBuffer.setColor(c);
        gBuffer.fillOval(x-25,y-25, d, d);
    }
    public void update(Graphics g){
        paint(g);
    }
    public void paint (Graphics g){
        g.drawImage(Buffer,0,0,this);
    }
}


