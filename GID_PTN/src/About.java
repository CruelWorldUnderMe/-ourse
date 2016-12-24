import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class About extends JFrame {
	private JFrame frame5;
	
	public void run() {
		try {
			About window = new About();
			window.frame5.setVisible(true);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



/**
* Create the application.
*/
public About() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
	frame5 = new JFrame();
	frame5.setBounds(450, 100, 400, 379);
	frame5.setTitle("About");

	frame5.getContentPane().setBackground(Color.BLACK);
	frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame5.getContentPane().setLayout(null);
	
	}
}
