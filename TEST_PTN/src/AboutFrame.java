import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AboutFrame extends JFrame{
	private JFrame frame4;
	 

	  
	  public static void main(String[] args) {
	    EventQueue.invokeLater(new Runnable() {
	      public void run() {
	        try {
	        	AboutFrame window = new AboutFrame();
	          window.frame4.setVisible(true);
	        } catch (Exception e) {
	          e.printStackTrace();
	        }
	        
	      }
	    });
	  }
	  
	  public AboutFrame()  {  
	    initialize();
	  }
	  private void initialize() {
	
	frame4 = new JFrame();
	frame4.setBounds(450, 100, 400, 379);
	frame4.setTitle("About");

	frame4.getContentPane().setBackground(Color.BLACK);
	frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame4.getContentPane().setLayout(null);
	frame4.setVisible(true);
//	           ABOUT 1           //	
	JLabel txtregð2 = new JLabel("Ñreated by:  id134550105");
	txtregð2.setFont(new Font("",Font.BOLD,20));
	txtregð2.setForeground(Color.RED);
	txtregð2.setBounds(10, 100, 300, 23);
	frame4.getContentPane().add(txtregð2);
	JLabel txtregð3 = new JLabel("KB-22");
	txtregð3.setFont(new Font("",Font.BOLD,20));
	txtregð3.setForeground(Color.RED);
	txtregð3.setBounds(300, 300, 300, 23);
	frame4.getContentPane().add(txtregð3);
	JLabel txtregð6 = new JLabel("                    "+"id52964080");
	txtregð6.setFont(new Font("",Font.BOLD,20));
	txtregð6.setForeground(Color.RED);
	txtregð6.setBounds(10, 120, 300, 23);
	frame4.getContentPane().add(txtregð6);												
									 //           ABOUT 3          //				
	JLabel lblNewLabel2 = new JLabel("");
	lblNewLabel2.setBounds(0, 0, 400, 350);
	Image img; 
	img = new ImageIcon("d://Kurso.jpg").getImage(); 
	lblNewLabel2.setIcon(new ImageIcon(img));
	frame4.getContentPane().add(lblNewLabel2);
									 //           ABOUT 2           //					
	JButton fr4 = new JButton("BACK");
	fr4.setForeground(Color.RED);
	fr4.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0){
	frame4.dispose();
	new First();
														}
															}
														
												);
	  fr4.setFont(new Font("Tahoma",Font.BOLD,16));
	  fr4.setBounds(110,250,143,30);
	  frame4.getContentPane().add(fr4);			
	  
}
 }
