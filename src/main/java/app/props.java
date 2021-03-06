package app;

import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import View.View;
//Properties Klasse
public class props {
	 /** This will end up in the current directory
    A more sensible location is a sub-directory of user.home.
    (left as an exercise for the reader) */
    public static final String fileName = "options.prop";

    /** Store location & size of UI */
    public static void storeOptions(Rectangle r) throws Exception {
        File file = new File(fileName);
        Properties p = new Properties();
        // restore the frame from 'full screen' first!
      /* r.setExtendedState(Frame.NORMAL);
        Rectangle r = r.getBounds();*/
        int x = (int)r.getX();
        int y = (int)r.getY();
        int w = (int)r.getWidth();
        int h = (int)r.getHeight();

        p.setProperty("x", "" + x);
        p.setProperty("y", "" + y);
        p.setProperty("w", "" + w);
        p.setProperty("h", "" + h);

        BufferedWriter br = new BufferedWriter(new FileWriter(file));
        p.store(br, "Properties of the user frame");
        
        
        
    }

    /** Restore location & size of UI */
	public static Rectangle restoreOptions() throws IOException {
        File file = new File(fileName);
        Properties p = new Properties();
        BufferedReader br = new BufferedReader(new FileReader(file));
        p.load(br);

        int x = Integer.parseInt(p.getProperty("x"));
        int y = Integer.parseInt(p.getProperty("y"));
        int w = Integer.parseInt(p.getProperty("w"));
        int h = Integer.parseInt(p.getProperty("h"));

        Rectangle r = new Rectangle(x,y,w,h);

        return r; 
        
    }

    
    
    @SuppressWarnings("unused")
	public static void properties() {
       

        File optionsFile = new File(fileName);
        if (optionsFile.exists()) {
            try {
                new View(restoreOptions());
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
        } else {
        	Rectangle standart = new Rectangle(100,100,400,300);
			View window = new View(standart); 
        	
        
        }
       
    }
}

