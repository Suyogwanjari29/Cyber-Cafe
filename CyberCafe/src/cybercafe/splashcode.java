
package cybercafe;



//import com.sun.speech.freetts.Voice;
//import com.sun.speech.freetts.VoiceManager;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class splashcode {
    public static void main(String[] args){
       splash s2=new splash();
    s2.setVisible(true);
       
    
     try{
            for(int x=0; x<=70; x++)
            {
                 Thread.sleep(10);
                 splash.percent.setText(Integer.toString(x)+"%");
                 splash.p1.setValue(x);
                 splash.p1.setBackground(Color.WHITE);
                 splash.p1.setForeground(Color.darkGray);
                 splash.red.setValue(x);    
                 
           }
             for(int x=0; x<=40; x++)
            {
                 Thread.sleep(10);
                 splash.percent.setText(Integer.toString(x)+"%");
                 splash.p1.setValue(x);
                 splash.p1.setBackground(Color.WHITE);
                 splash.p1.setForeground(Color.darkGray);
                 splash.red.setValue(x);    
            }
                for(int x=0; x<=20; x++)
            {
                 Thread.sleep(10);
                 splash.percent.setText(Integer.toString(x)+"%");
                 splash.p1.setValue(x);
                 splash.p1.setBackground(Color.WHITE);
                 splash.p1.setForeground(Color.darkGray);
                 splash.red.setValue(x);    
            }
                  for(int x=0; x<=10; x++)
            {
                 Thread.sleep(20);
                 splash.percent.setText(Integer.toString(x)+"%");
                 splash.p1.setValue(x);
                 splash.p1.setBackground(Color.WHITE);
                 splash.p1.setForeground(Color.darkGray);
                 splash.red.setValue(x);    
            }
           
                  for(int x=70; x<=90; x++)
            {
                 Thread.sleep(20);
                 splash.percent.setText(Integer.toString(x)+"%");
                 splash.p1.setValue(x);
                 splash.p1.setBackground(Color.WHITE);
                 splash.p1.setForeground(Color.darkGray);
                 splash.red.setValue(x);    
                 
            }
        
                    for(int x=99; x<=101; x++)
            {
                 Thread.sleep(1500);
                 splash.percent.setText(Integer.toString(x)+"%");
                 splash.p1.setValue(x);
                 splash.p1.setBackground(Color.WHITE);
                 splash.p1.setForeground(Color.darkGray);
                 splash.red.setValue(x);    
                 
         }
        }catch(Exception e)
         {
         
         }
     
     s2.setVisible(false);
    
       new UIdesign().setVisible(true);
    }
}
