
package praktikumtpbo;
import java.awt.*;
import java.awt.image.*;
import java.applet.*;
public class GambarPotong extends Applet{
    Image logoyakesAsli; Image logoyakesPotong;
    ImageFilter cropFilter;
    
    public void init() {
        logoyakesAsli = getImage(getCodeBase(),"logoyakes.png");
        cropFilter = new CropImageFilter(50,250,150,150);
        
      logoyakesPotong = createImage(new FilteredImageSource(logoyakesAsli.getSource(),cropFilter));
        
    }
    
public void paint(Graphics g){
    g.drawImage(logoyakesAsli,10,10,400,300,this);
    g.drawImage(logoyakesPotong,450,150,this);
}
}
    

