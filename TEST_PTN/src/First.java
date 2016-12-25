import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class First extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First frame2 = new First();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public First() {
		
		setBounds(450, 100, 400, 379);
		 setTitle("Âõîä");

		 getContentPane().setBackground(Color.BLACK);
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	getContentPane().setLayout(null);
	setVisible(true);
		// Íàäïèñü
	JLabel txtregð7 = new JLabel("15 PUZZLE");
	txtregð7.setFont(new Font("",Font.BOLD,30));
	txtregð7.setForeground(Color.RED);
	txtregð7.setBounds(100, 15, 300, 30);
	getContentPane().add(txtregð7);
	//  CONTINUE
	JButton btnStart2 = new JButton("LAST GAME");
	btnStart2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
     
dispose();
new ContinueFrame();
	}
	});
	
	btnStart2.setFont(new Font("Tahoma",Font.BOLD,20));
	btnStart2.setBounds(40,54,300,60);
	getContentPane().add(btnStart2);	
	btnStart2.setForeground(Color.RED);
	
	
	 //         NEW GAME         //		
	  JButton start2 = new JButton("START GAME");
	  start2.setForeground(Color.RED);
	  start2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				dispose();
				new Game();
}
			}
);
	  start2.setFont(new Font("Tahoma",Font.BOLD,20));
	  start2.setBounds(40,127,300,60);
			getContentPane().add(start2);
		//        ABOUT          //
			 JButton about = new JButton("ABOUT");
			  about.setForeground(Color.RED);
			  about.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent arg0){
					dispose();
						new	AboutFrame();
					}
					}
				
		);
			  about.setFont(new Font("Tahoma",Font.BOLD,20));
			  about.setBounds(40,200,300,60);
					getContentPane().add(about);
	
					 // EXIT        
						 JButton Exit = new JButton("EXIT");
						 Exit.setForeground(Color.RED);
						 Exit.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent arg0){
								dispose();
								}
								}
							
					);
						 Exit.setFont(new Font("Tahoma",Font.BOLD,20));
						 Exit.setBounds(40,273,300,60);
								getContentPane().add(Exit);
					JLabel lblNewLabel4 = new JLabel("");
					lblNewLabel4.setBounds(0, 0, 400, 340);
					Image img2; 
					img2 = new ImageIcon("d://Kurso.jpg").getImage(); 
					lblNewLabel4.setIcon(new ImageIcon(img2));
					getContentPane().add(lblNewLabel4);
	}

}
