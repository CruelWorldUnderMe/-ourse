import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;
import java.io.*; 
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

//import javax.swing.swing.*;
//import java.text.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class PTN2 {
String firstnum;
String secondnum;
String firstnum2;
int i=0 ;
int m=0;
int i2=0;
int m2=0;
int tmp;
	private JFrame frame;
	private JFrame frame2;
	private JFrame frame3;
	private JFrame frame4;
	private JFrame frame5;
	private JFrame frame6;

	/**
	 * Launch the application.
	 */
	int[] array = new int[16];
	 int[][] matrix = new int[4][4];
	 int[] buttons=new int[15];
	
	 
	 public void NEW(){
		for (int i = 0; i < array.length; i++) {
		     array[i] = ((int)(Math.random() * 16));
		    
		     for(int j=0;j<i;j++){
		  
		    	 if (array[j]==array[i]){
		    			i--; 
		    	 }
		      }
		  }
	 }
	 
	 public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PTN2 window = new PTN2();
					window.frame.setVisible(false);
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PTN2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		//---------------------Âòîðîå îêíî-------------------------//
		
		frame = new JFrame();
		frame.setBounds(100, 100, 295, 394);
		 frame.setTitle("Ïÿòíàøêè");

		 
		 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//---------------------Ïåðâîå îêíî-------------------------//

		
		
		frame2 = new JFrame();
		frame2.setBounds(200, 50, 400, 379);
		 frame2.setTitle("Âõîä");

		 frame2.getContentPane().setBackground(Color.BLACK);
		 
		 frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		         //           LOGIN         //
		
		JLabel lblNewLabel = new JLabel("Login");
		 lblNewLabel.setFont(new Font("Login",Font.BOLD,20));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(73, 46, 60, 23);
		frame2.getContentPane().add(lblNewLabel);
		
		
		JTextField txtfil = new JTextField();

		txtfil.setBounds(140, 50, 86, 20);
        frame2.getContentPane().add(txtfil);
        txtfil.setColumns(10);
	
		        
		        
                   //         NEW GAME         //		
		  JButton start2 = new JButton("START GAME");
		
		  start2.setForeground(Color.BLUE);
		  start2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					
					

frame2.setVisible(false);
frame.setVisible(true);
}
				}
	);
		  start2.setFont(new Font("Tahoma",Font.BOLD,20));
		  start2.setBounds(30,112,300,60);
				frame2.getContentPane().add(start2);
				
				
				//        ABOUT          //
				 JButton about = new JButton("ABOUT");
				  about.setForeground(Color.BLUE);
				  about.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent arg0){
                          frame2.setVisible(false);
                          frame5.setVisible(true);
						}
						}
					
			);
				  about.setFont(new Font("Tahoma",Font.BOLD,20));
				  about.setBounds(30,200,300,60);
						frame2.getContentPane().add(about);
						
            //	       REGISTR          //
						 JButton reg = new JButton("Register");
						  reg.setForeground(Color.BLUE);
						  reg.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent arg0){
									
		frame2.setVisible(false);
		frame3.setVisible(true);
								}
								}
							
					);
						  reg.setFont(new Font("Tahoma",Font.BOLD,16));
						  reg.setBounds(30,300,143,30);
								frame2.getContentPane().add(reg);
								
								
		  //	       FORGOT          //
								 JButton fr = new JButton("Forgot login");
								  fr.setForeground(Color.BLUE);
								  fr.addActionListener(new ActionListener(){
										public void actionPerformed(ActionEvent arg0){
											frame2.setVisible(false);
											frame4.setVisible(true);
				
										}
										}
									
							);
								  fr.setFont(new Font("Tahoma",Font.BOLD,16));
								  fr.setBounds(185,300,143,30);
										frame2.getContentPane().add(fr);
										
										//---------------------Òðåòüå îêíî-------------------------//

										
										
										frame3 = new JFrame();
										frame3.setBounds(200, 50, 400, 379);
										 frame3.setTitle("Ðåãèñòðàöèÿ");

										 frame3.getContentPane().setBackground(Color.BLACK);
										 
										 frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
										frame3.getContentPane().setLayout(null);
										
										 //           LOGIN 2         //
										
										JLabel txtreg = new JLabel("Write name:");
										txtreg.setFont(new Font("Write name:",Font.BOLD,15));
										txtreg.setForeground(Color.BLUE);
										txtreg.setBounds(0, 46, 90, 23);
										frame3.getContentPane().add(txtreg);
										
										
										JTextField reglogin = new JTextField();

										reglogin.setBounds(120, 50, 86, 20);
								        frame3.getContentPane().add(reglogin);
								        reglogin.setColumns(10);
								        
 //           LOGIN 3         //
										
										JLabel txtreg2 = new JLabel("Write telepone:");
										txtreg2.setFont(new Font("Write telepone:",Font.BOLD,15));
										txtreg2.setForeground(Color.BLUE);
										txtreg2.setBounds(0, 90, 120, 23);
										frame3.getContentPane().add(txtreg2);
										
										
										JTextField reglogin2= new JTextField();

										reglogin2.setBounds(120, 93, 86, 20);
								        frame3.getContentPane().add(reglogin2);
								        reglogin2.setColumns(10);
								        
		      //           LOGIN 4          //      
								        
								    	JRadioButton rdbtnNewRadioButton = new JRadioButton("I am agreement with all rules");
										rdbtnNewRadioButton.setBounds(0, 150, 200, 23);
										frame3.getContentPane().add(rdbtnNewRadioButton);
										
										
										 
									      //           LOGIN 5       //  	 
										 JButton fr2 = new JButton("REGISTER");
										  fr2.setForeground(Color.BLUE);
										  fr2.addActionListener(new ActionListener(){
												public void actionPerformed(ActionEvent arg0){
													 if ( rdbtnNewRadioButton.isSelected() ){
														  
													frame3.setVisible(false);
													frame2.setVisible(true);}	
						
												}
												}
											
									);
										  fr2.setFont(new Font("Tahoma",Font.BOLD,16));
										  fr2.setBounds(110,250,143,30);
												frame3.getContentPane().add(fr2);
												
												//---------------------×åòâåðòîå îêíî-------------------------//
												
												frame4 = new JFrame();
												frame4.setBounds(200, 50, 400, 379);
												 frame4.setTitle("Âîññòàíîâëåíèå");

												 frame4.getContentPane().setBackground(Color.BLACK);
												 
												 frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
												frame4.getContentPane().setLayout(null);
												
								 //           FORGOT 1           //
												
												JLabel txtregð = new JLabel("Write telephone:");
												txtregð.setFont(new Font("Write name:",Font.BOLD,15));
												txtregð.setForeground(Color.BLUE);
												txtregð.setBounds(0, 46, 120, 23);
												frame4.getContentPane().add(txtregð);
												
												
												JTextField regloginq = new JTextField();

												regloginq.setBounds(120, 50, 90, 20);
										        frame4.getContentPane().add(regloginq);
										        regloginq.setColumns(10);		
		   //           FORGOT 2         //      	        
										        
										        JButton fr3 = new JButton("RESTORE");
												  fr3.setForeground(Color.BLUE);
												  fr3.addActionListener(new ActionListener(){
														public void actionPerformed(ActionEvent arg0){
														frame4.setVisible(false);
														frame2.setVisible(true);
								
														}
														}
													
											);
												  fr3.setFont(new Font("Tahoma",Font.BOLD,16));
												  fr3.setBounds(110,250,143,30);
														frame4.getContentPane().add(fr3);
												
														

					//---------------------Ïÿòîå îêíî-------------------------//
														
											frame5 = new JFrame();
											frame5.setBounds(200, 50, 400, 379);
												 frame5.setTitle("Âîññòàíîâëåíèå");

											 frame5.getContentPane().setBackground(Color.BLACK);
														 
												 frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
												frame5.getContentPane().setLayout(null);
														
							 //           ABOUT 1           //	
												
												JLabel txtregð2 = new JLabel("My id in vk: 134550105");
												txtregð2.setFont(new Font("My id in vk: 134550105:",Font.BOLD,20));
												txtregð2.setForeground(Color.GREEN);
												txtregð2.setBounds(0, 46, 300, 23);
												frame5.getContentPane().add(txtregð2);
												
												
								 //           ABOUT 3          //				
												JLabel lblNewLabel2 = new JLabel("");
												lblNewLabel2.setBounds(-15, 0, 400, 350);
											
												Image img; 
												img = new ImageIcon("d://Kursova.jpg").getImage(); 
												 lblNewLabel2.setIcon(new ImageIcon(img));
												 
													frame5.getContentPane().add(lblNewLabel2);
												
								 //           ABOUT 2           //					
												 JButton fr4 = new JButton("BACK");
												  fr4.setForeground(Color.BLUE);
												  fr4.addActionListener(new ActionListener(){
														public void actionPerformed(ActionEvent arg0){
														frame5.setVisible(false);
														frame2.setVisible(true);
								
														}
														}
													
											);
												  fr4.setFont(new Font("Tahoma",Font.BOLD,16));
												  fr4.setBounds(110,250,143,30);
														frame5.getContentPane().add(fr4);			
												
		//-----------------------------------------------------------//
	JButton btnNewButton2 = new JButton("START");

				JButton btnNewButton = new JButton("BACK");
				btnNewButton.setForeground(Color.BLUE);
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						 btnNewButton2.setText("START");
						frame.setVisible(false);
						frame2.setVisible(true);
						}
				});
				btnNewButton.setBounds(190, 298, 89, 23);
				frame.getContentPane().add(btnNewButton);
				
				//-----------------------------------------------------------//
				
				
				JLabel txtregð5 = new JLabel("");

				txtregð5.setFont(new Font("Tahoma",Font.PLAIN,20));
				txtregð5.setForeground(Color.BLUE);
				txtregð5.setBounds(0, 13, 120, 23);
				frame.getContentPane().add(txtregð5);
				
				
				
				//     Ïîëå ñ òàéìåðîì
				JLabel txtregð4 = new JLabel("Time:");

				txtregð4.setFont(new Font("Tahoma",Font.PLAIN,20));
				txtregð4.setForeground(Color.BLUE);
				txtregð4.setBounds(60, 13, 120, 23);
				frame.getContentPane().add(txtregð4);
				
				
				//     Ïîëå ñ òàéìåðîì
				JLabel txtregð3 = new JLabel("00:00");
				txtregð3.setHorizontalAlignment(SwingConstants.CENTER);
				txtregð3.setFont(new Font("Tahoma",Font.PLAIN,20));
				txtregð3.setForeground(Color.BLUE);
				txtregð3.setBounds(90, 15, 120, 23);
				frame.getContentPane().add(txtregð3);
				
				
			    
			
				 
				
//				  Êíîïêà çàïóñêàþùàÿ òàéìåð START/STOP
				
								btnNewButton2.setForeground(Color.BLUE);
				btnNewButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					if (btnNewButton2.getText()=="START"){
						btnNewButton2.setText("STOP");	
					}	else btnNewButton2.setText("START");
				
				
				
						final Timer time = new Timer();
			        time.schedule(new TimerTask() {
			          
			            @Override
			            public void run() {
			            	if (btnNewButton2.getText()=="START"){
			            		time.cancel();
				                 return;
			            	}
			            	 i = i + 1;
			            	
			            	if (i==10){
			            	m++;i=0;
			             	}
			            	if (m==6) {
			            	if	(i==0){
			            		i=0;
			            		m=0;
			            		i2++;
			            		}
				             	}
			            	if (i2==10){
				            	m2++;i2=0;
				             	}
			            	txtregð3.setText(""+m2+i2+":"+m+i+"");
			           } 
			        }, 1000, 1000); 
				
					}
				});
				btnNewButton2.setBounds(95, 298, 89, 23);
				frame.getContentPane().add(btnNewButton2);
				
				
				int sum=0;
				do{
					NEW();
					sum=0;
					for(int i=0;i<16;i++){
						if(array[i]==0){
					sum+=i/4;
					continue;
					}
		for (int j=i+1;j<16;j++){
			if (array[j]<array[i])
				sum++;
		}
					}
			txtregð5.setText(""+sum);
				}
				while (sum % 2==1);
				   
			        JButton btn1 = new JButton(""+array[0]);
			        JButton btn2 = new JButton(""+array[1]);
			        JButton btn3 = new JButton(""+array[2]);
			        JButton btn4 = new JButton(""+array[3]);
			        JButton btn5 = new JButton(""+array[4]);
					JButton btn6 = new JButton(""+array[5]);
					JButton btn7 = new JButton(""+array[6]);
					JButton btn8 = new JButton(""+array[7]);
				    JButton btn9 = new JButton(""+array[8]);
				    JButton btnten = new JButton(""+array[9]);
				    JButton btnel= new JButton(""+array[10]);
					JButton btntw = new JButton(""+array[11]);
					JButton btnth = new JButton(""+array[12]);
					JButton btnfr = new JButton(""+array[13]);
					JButton btnft = new JButton(""+array[14]);
					JButton btn = new JButton(""+array[15]);
					
					 for (int i = 0; i < array.length; i++) {
					    if (array[i] ==0){
					    	
					    	secondnum=(""+array[i]);
					   if (i==0){btn1.setText("");}    
					   if (i==1){btn2.setText("");}
					   if (i==2){btn3.setText("");}
					   if (i==3){btn4.setText("");}
					   if (i==4){btn5.setText("");}
					   if (i==5){btn6.setText("");}
					   if (i==6){btn7.setText("");}
					   if (i==7){btn8.setText("");}
					   if (i==8){btn9.setText("");}
					   if (i==9){btnten.setText("");}
					   if (i==10){btnel.setText("");}
					   if (i==11){btntw.setText("");}
					   if (i==12){btnth.setText("");}
					   if (i==13){btnfr.setText("");}
					   if (i==14){btnft.setText("");}
					   if (i==15){btn.setText("");}
					    }
					    
					 }
					 frame.getContentPane().setBackground(Color.BLACK);
						btn1.setForeground(Color.RED);
						btn2.setForeground(Color.RED);
						btn3.setForeground(Color.RED);
						btn4.setForeground(Color.RED);
						btn5.setForeground(Color.RED);
						btn6.setForeground(Color.RED);
						btn7.setForeground(Color.RED);
						btn8.setForeground(Color.RED);
						btn9.setForeground(Color.RED);
						btnten.setForeground(Color.RED);
						btnel.setForeground(Color.RED);
						btntw.setForeground(Color.RED);
						btnth.setForeground(Color.RED);
						btnfr.setForeground(Color.RED);
						btnft.setForeground(Color.RED);
						btn.setForeground(Color.RED);
		
				
			JButton btnStart = new JButton("NEW");
			btnStart.setForeground(Color.BLUE);
			btnStart.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {

		     btnNewButton2.setText("START");
			  i=0 ;
	            m=0;
	            i2=0 ;
	           m2=0;
	       	txtregð3.setText(""+m2+i2+":"+m+i+"");
			   
			int sum=0;
			do{
				NEW();
				sum=0;
				for(int i=0;i<16;i++){
					if(array[i]==0){
				sum+=i/4;
				continue;
				}
	for (int j=i+1;j<16;j++){
		if (array[j]<array[i])
			sum++;
	}
				}
		txtregð5.setText(""+sum);
			}
			while (sum % 2==1);
			btn1.setText(""+array[0]);
			btn2.setText(""+array[1]);
			btn3.setText(""+array[2]);
			btn4.setText(""+array[3]);
			btn5.setText(""+array[4]);
			btn6.setText(""+array[5]);
			btn7.setText(""+array[6]);
			btn8.setText(""+array[7]);
			btn9.setText(""+array[8]);
			btnten.setText(""+array[9]);
			btnel.setText(""+array[10]);
			btntw.setText(""+array[11]);
			btnth.setText(""+array[12]);
			btnfr.setText(""+array[13]);
			btnft.setText(""+array[14]);
			btn.setText(""+array[15]);
		 for (int i = 0; i < array.length; i++) {
			    if (array[i] ==0){
			    	secondnum=(""+array[i]);
			   if (i==0){btn1.setText("");}    
			   if (i==1){btn2.setText("");}
			   if (i==2){btn3.setText("");}
			   if (i==3){btn4.setText("");}
			   if (i==4){btn5.setText("");}
			   if (i==5){btn6.setText("");}
			   if (i==6){btn7.setText("");}
			   if (i==7){btn8.setText("");}
			   if (i==8){btn9.setText("");}
			   if (i==9){btnten.setText("");}
			   if (i==10){btnel.setText("");}
			   if (i==11){btntw.setText("");}
			   if (i==12){btnth.setText("");}
			   if (i==13){btnfr.setText("");}
			   if (i==14){btnft.setText("");}
			   if (i==15){btn.setText("");}
			    }
			    
			 }
				btn7.setFont(new Font("Tahoma",Font.BOLD,20));
				btn7.setBounds(138,112,70,60);
				frame.getContentPane().add(btn7);
					}
				});
				btnStart.setBounds(0, 298, 89, 23);
				frame.getContentPane().add(btnStart);
	 /*------------------------7-----------------------*/ 
	    btn7.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
                    if (btn7.getText()==""){
					
				} else{
					if (btn3.getText()==""){
						array[2]=array[7];
						array[6]=0;
						
						btn3.setText(btn7.getText());
						btn7.setText("");
					}
					if (btnel.getText()==""){
						array[10]=array[6];
						array[6]=0;
						btnel.setText(btn7.getText());
						btn7.setText("");
					}
					if (btn6.getText()==""){
						array[5]=array[6];
						array[6]=0;
						btn6.setText(btn7.getText());
						btn7.setText("");
					}
					if (btn8.getText()==""){
						array[7]=array[6];
						array[6]=0;
						btn8.setText(btn7.getText());
						btn7.setText("");
				
					}
				
					
					}
                //    for(int x=0;x<15;){
                   // 	if (array[x]==x+1){
                    	//	String msg;
						//	 msg="You Win";
				          //    JOptionPane.showMessageDialog(frame, msg);	
                    //	}
                   // }
			 if (btn1.getText()==(""+1)){
					if (btn2.getText()==(""+2)){
						if (btn3.getText()==(""+3)){
							if (btn4.getText()==(""+4)){
								if (btn5.getText()==(""+5)){
									if (btn6.getText()==(""+6)){
										if (btn7.getText()==(""+7)){
											if (btn8.getText()==(""+8)){
												if (btn9.getText()==(""+9)){
													if (btnten.getText()==(""+10)){
														if (btnel.getText()==(""+11)){
															if (btntw.getText()==(""+12)){
																if (btnth.getText()==(""+13)){
																	if (btnfr.getText()==(""+14)){
																		if (btnft.getText()==(""+15)){
																			if (btn.getText()==("")){ String msg;
																			 msg="You Win";
																              JOptionPane.showMessageDialog(frame, msg);
																				
																		}
																	}
																}
															}
															
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}}}
		
				}

		});
			
	
		btn7.setFont(new Font("Tahoma",Font.BOLD,20));
		btn7.setBounds(138,111,70,60);
		frame.getContentPane().add(btn7);
		 /*------------------------8-----------------------*/   
		   
	
		btn8.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			
			 if (btn8.getText()==""){
					
				} else{
					if (btn4.getText()==""){
						array[3]=array[7];
						array[7]=0;
						btn4.setText(btn8.getText());
						btn8.setText("");
					//	btn4.setBackground(Color.GREEN);
					//	btn8.setBackground(Color.RED);
					}if (btn7.getText()==""){
						array[6]=array[7];
						array[7]=0;
						btn7.setText(btn8.getText());
						btn8.setText("");
					//	btn7.setBackground(Color.GREEN);
					//	btn8.setBackground(Color.RED);
					}
					if (btntw.getText()==""){
						array[11]=array[7];
						array[7]=0;
						btntw.setText(btn8.getText());
						btn8.setText("");
					//	btntw.setBackground(Color.GREEN);
					//	btn8.setBackground(Color.RED);
					}
					}
			 if (btn1.getText()==(""+1)){
					if (btn2.getText()==(""+2)){
						if (btn3.getText()==(""+3)){
							if (btn4.getText()==(""+4)){
								if (btn5.getText()==(""+5)){
									if (btn6.getText()==(""+6)){
										if (btn7.getText()==(""+7)){
											if (btn8.getText()==(""+8)){
												if (btn9.getText()==(""+9)){
													if (btnten.getText()==(""+10)){
														if (btnel.getText()==(""+11)){
															if (btntw.getText()==(""+12)){
																if (btnth.getText()==(""+13)){
																	if (btnfr.getText()==(""+14)){
																		if (btnft.getText()==(""+15)){
																			if (btn.getText()==("")){ String msg;
																			 msg="You Win";
																              JOptionPane.showMessageDialog(frame, msg);
																		}
																	}
																}
															}
															
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}}}
		           
				}

		});
	
		btn8.setFont(new Font("Tahoma",Font.BOLD,20));
		btn8.setBounds(207,111,70,60);
		frame.getContentPane().add(btn8);
		 /*------------------------9-----------------------*/   
		   

		btn9.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		
			 if (btn9.getText()==""){
					
				} else{
					if (btn5.getText()==""){
						array[4]=array[8];
						array[8]=0;
						btn5.setText(btn9.getText());
						btn9.setText("");
					}

					if (btnten.getText()==""){
						array[9]=array[8];
						array[8]=0;
						btnten.setText(btn9.getText());
						btn9.setText("");
					}

					if (btnth.getText()==""){
						array[12]=array[8];
						array[8]=0;
						btnth.setText(btn9.getText());
						btn9.setText("");
					}
					}
			 if (btn1.getText()==(""+1)){
					if (btn2.getText()==(""+2)){
						if (btn3.getText()==(""+3)){
							if (btn4.getText()==(""+4)){
								if (btn5.getText()==(""+5)){
									if (btn6.getText()==(""+6)){
										if (btn7.getText()==(""+7)){
											if (btn8.getText()==(""+8)){
												if (btn9.getText()==(""+9)){
													if (btnten.getText()==(""+10)){
														if (btnel.getText()==(""+11)){
															if (btntw.getText()==(""+12)){
																if (btnth.getText()==(""+13)){
																	if (btnfr.getText()==(""+14)){
																		if (btnft.getText()==(""+15)){
																			if (btn.getText()==("")){ String msg;
																			 msg="You Win";
																              JOptionPane.showMessageDialog(frame, msg);
																		}
																	}
																}
															}
															
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}}}
		           
				}

		});
	
		btn9.setFont(new Font("Tahoma",Font.BOLD,20));
		btn9.setBounds(0,170,70,59);
		frame.getContentPane().add(btn9);
		 /*------------------------6-----------------------*/   
		   
		
		btn6.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
            if (btn6.getText()==""){
				
		} else{
			if (btn2.getText()==""){
				array[1]=array[5];
				array[5]=0;
				btn2.setText(btn6.getText());
				btn6.setText("");
			}
			if (btn5.getText()==""){
				array[4]=array[5];
				array[5]=0;
				btn5.setText(btn6.getText());
				btn6.setText("");
			}
			if (btn7.getText()==""){
				array[6]=array[5];
				array[5]=0;
				btn7.setText(btn6.getText());
				btn6.setText("");
			}
			if (btnten.getText()==""){
				array[9]=array[5];
				array[5]=0;
				btnten.setText(btn6.getText());
				btn6.setText("");
			}
		}
   		 if (btn1.getText()==(""+1)){
				if (btn2.getText()==(""+2)){
					if (btn3.getText()==(""+3)){
						if (btn4.getText()==(""+4)){
							if (btn5.getText()==(""+5)){
								if (btn6.getText()==(""+6)){
									if (btn7.getText()==(""+7)){
										if (btn8.getText()==(""+8)){
											if (btn9.getText()==(""+9)){
												if (btnten.getText()==(""+10)){
													if (btnel.getText()==(""+11)){
														if (btntw.getText()==(""+12)){
															if (btnth.getText()==(""+13)){
																if (btnfr.getText()==(""+14)){
																	if (btnft.getText()==(""+15)){
																		if (btn.getText()==("")){ String msg;
																		 msg="You Win";
															              JOptionPane.showMessageDialog(frame, msg);
																	}
																}
															}
														}
														
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}}}
           
		}

});
	
		btn6.setFont(new Font("Tahoma",Font.BOLD,20));
		btn6.setBounds(69,111,70,60);
		frame.getContentPane().add(btn6);
		 /*------------------------5-----------------------*/   
		   
		btn5.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			
            if (btn5.getText()==""){
				
		} else{
			if (btn6.getText()==""){
				array[5]=array[4];
				array[4]=0;
				btn6.setText(btn5.getText());
				btn5.setText("");
			}
			if (btn1.getText()==""){
				array[0]=array[4];
				array[4]=0;
				btn1.setText(btn5.getText());
				btn5.setText("");
			}
			if (btn9.getText()==""){
				array[8]=array[4];
				array[4]=0;
				btn9.setText(btn5.getText());
				btn5.setText("");
			}
		}
   		 if (btn1.getText()==(""+1)){
				if (btn2.getText()==(""+2)){
					if (btn3.getText()==(""+3)){
						if (btn4.getText()==(""+4)){
							if (btn5.getText()==(""+5)){
								if (btn6.getText()==(""+6)){
									if (btn7.getText()==(""+7)){
										if (btn8.getText()==(""+8)){
											if (btn9.getText()==(""+9)){
												if (btnten.getText()==(""+10)){
													if (btnel.getText()==(""+11)){
														if (btntw.getText()==(""+12)){
															if (btnth.getText()==(""+13)){
																if (btnfr.getText()==(""+14)){
																	if (btnft.getText()==(""+15)){
																		if (btn.getText()==("")){ String msg;
																		 msg="You Win";
															              JOptionPane.showMessageDialog(frame, msg);
																	}
																}
															}
														}
														
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}}}
		}

});
	
		btn5.setFont(new Font("Tahoma",Font.BOLD,20));
		btn5.setBounds(0,111,70,60);
		frame.getContentPane().add(btn5);
		 /*------------------------4-----------------------*/   
		   
		btn4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		    if (btn4.getText()==""){
				
		} else{
			if (btn3.getText()==""){
				array[2]=array[3];
				array[3]=0;
				btn3.setText(btn4.getText());
				btn4.setText("");
			}
			if (btn8.getText()==""){
				array[7]=array[3];
				array[3]=0;
				btn8.setText(btn4.getText());
				btn4.setText("");
			}
		}
   		 if (btn1.getText()==(""+1)){
				if (btn2.getText()==(""+2)){
					if (btn3.getText()==(""+3)){
						if (btn4.getText()==(""+4)){
							if (btn5.getText()==(""+5)){
								if (btn6.getText()==(""+6)){
									if (btn7.getText()==(""+7)){
										if (btn8.getText()==(""+8)){
											if (btn9.getText()==(""+9)){
												if (btnten.getText()==(""+10)){
													if (btnel.getText()==(""+11)){
														if (btntw.getText()==(""+12)){
															if (btnth.getText()==(""+13)){
																if (btnfr.getText()==(""+14)){
																	if (btnft.getText()==(""+15)){
																		if (btn.getText()==("")){ String msg;
																		 msg="You Win";
															              JOptionPane.showMessageDialog(frame, msg);
																	}
																}
															}
														}
														
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}}}
		}

});
	
		btn4.setFont(new Font("Tahoma",Font.BOLD,20));
		btn4.setBounds(207,53,70,60);
		frame.getContentPane().add(btn4);
		 /*------------------------3-----------------------*/   
		   
		btn3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			   if (btn3.getText()==""){
				
			} else{
				if (btn2.getText()==""){
					array[1]=array[2];
					array[2]=0;
					btn2.setText(btn3.getText());
					btn3.setText("");
				}
				if (btn7.getText()==""){
					array[6]=array[2];
					array[2]=0;
					btn7.setText(btn3.getText());
					btn3.setText("");
					}
				if (btn4.getText()==""){
					array[3]=array[2];
					array[2]=0;
					btn4.setText(btn3.getText());
					btn3.setText("");
				}
			}
       		 if (btn1.getText()==(""+1)){
					if (btn2.getText()==(""+2)){
						if (btn3.getText()==(""+3)){
							if (btn4.getText()==(""+4)){
								if (btn5.getText()==(""+5)){
									if (btn6.getText()==(""+6)){
										if (btn7.getText()==(""+7)){
											if (btn8.getText()==(""+8)){
												if (btn9.getText()==(""+9)){
													if (btnten.getText()==(""+10)){
														if (btnel.getText()==(""+11)){
															if (btntw.getText()==(""+12)){
																if (btnth.getText()==(""+13)){
																	if (btnfr.getText()==(""+14)){
																		if (btnft.getText()==(""+15)){
																			if (btn.getText()==("")){ String msg;
																			 msg="You Win";
																              JOptionPane.showMessageDialog(frame, msg);
																		}
																	}
																}
															}
															
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}}}
			}
	
	});
			
	
		btn3.setFont(new Font("Tahoma",Font.BOLD,20));
		btn3.setBounds(138,53,70,60);
		frame.getContentPane().add(btn3);
		 /*------------------------2-----------------------*/   
		   
		btn2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
		
			if (btn2.getText()==""){
				
			} else{
				if (btn1.getText()==""){
					array[0]=array[1];
					array[1]=0;
					btn1.setText(btn2.getText());
					btn2.setText("");
				}
                if (btn6.getText()==""){
                	array[5]=array[1];
					array[1]=0;
                	btn6.setText(btn2.getText());
					btn2.setText("");
			}			
                if (btn3.getText()==""){
                	array[2]=array[1];
					array[1]=0;
                	btn3.setText(btn2.getText());
					btn2.setText("");
				}			
		
			}
			 if (btn1.getText()==(""+1)){
					if (btn2.getText()==(""+2)){
						if (btn3.getText()==(""+3)){
							if (btn4.getText()==(""+4)){
								if (btn5.getText()==(""+5)){
									if (btn6.getText()==(""+6)){
										if (btn7.getText()==(""+7)){
											if (btn8.getText()==(""+8)){
												if (btn9.getText()==(""+9)){
													if (btnten.getText()==(""+10)){
														if (btnel.getText()==(""+11)){
															if (btntw.getText()==(""+12)){
																if (btnth.getText()==(""+13)){
																	if (btnfr.getText()==(""+14)){
																		if (btnft.getText()==(""+15)){
																			if (btn.getText()==("")){ String msg;
																			 msg="You Win";
																              JOptionPane.showMessageDialog(frame, msg);
																		}
																	}
																}
															}
															
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}}}
			}
	
	});
	
		btn2.setFont(new Font("Tahoma",Font.BOLD,20));
		btn2.setBounds(69,53,70,60);
		frame.getContentPane().add(btn2);
		 /*------------------------1-----------------------*/   
		   
		btn1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
	
			if (btn1.getText()==""){
				
				} else{
					if (btn5.getText()==""){
						array[4]=array[0];
						array[0]=0;
						btn5.setText(btn1.getText());
						btn1.setText("");
			}
                    if (btn2.getText()==""){
                    	array[1]=array[0];
						array[0]=0;
                    	btn2.setText(btn1.getText());
						btn1.setText("");
				}			
					
				}
			 if (btn1.getText()==(""+1)){
					if (btn2.getText()==(""+2)){
						if (btn3.getText()==(""+3)){
							if (btn4.getText()==(""+4)){
								if (btn5.getText()==(""+5)){
									if (btn6.getText()==(""+6)){
										if (btn7.getText()==(""+7)){
											if (btn8.getText()==(""+8)){
												if (btn9.getText()==(""+9)){
													if (btnten.getText()==(""+10)){
														if (btnel.getText()==(""+11)){
															if (btntw.getText()==(""+12)){
																if (btnth.getText()==(""+13)){
																	if (btnfr.getText()==(""+14)){
																		if (btnft.getText()==(""+15)){
																			if (btn.getText()==("")){ String msg;
																			 msg="You Win";
																              JOptionPane.showMessageDialog(frame, msg);
																		}
																	}
																}
															}
															
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}}}
				}
		
		});
		btn1.setFont(new Font("Tahoma",Font.BOLD,20));
		btn1.setBounds(0,53,70,60);
		frame.getContentPane().add(btn1);
	
		 /*------------------------""-----------------------*/   
		
		
		btn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			
			
			 if (btn.getText()==""){
					
				} else{
					if (btnft.getText()==""){
						array[14]=array[15];
						array[15]=0;
						btnft.setText(btn.getText());
						btn.setText("");
					}
					if (btntw.getText()==""){
						array[11]=array[15];
						array[15]=0;
						btntw.setText(btn.getText());
						btn.setText("");
				}
				}
			 if (btn1.getText()==(""+1)){
					if (btn2.getText()==(""+2)){
						if (btn3.getText()==(""+3)){
							if (btn4.getText()==(""+4)){
								if (btn5.getText()==(""+5)){
									if (btn6.getText()==(""+6)){
										if (btn7.getText()==(""+7)){
											if (btn8.getText()==(""+8)){
												if (btn9.getText()==(""+9)){
													if (btnten.getText()==(""+10)){
														if (btnel.getText()==(""+11)){
															if (btntw.getText()==(""+12)){
																if (btnth.getText()==(""+13)){
																	if (btnfr.getText()==(""+14)){
																		if (btnft.getText()==(""+15)){
																			if (btn.getText()==("")){ String msg;
																			 msg="You Win";
																              JOptionPane.showMessageDialog(frame, msg);
																		}
																	}
																}
															}
															
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}}}
		           }

		});
	
		btn.setFont(new Font("Tahoma",Font.BOLD,20));
		btn.setBounds(207,228,70,59);
		frame.getContentPane().add(btn);
	
		
		 /*------------------------"10"-----------------------*/   
		
		
		btnten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnten.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			
			
			 if (btnten.getText()==""){
					
				} else{
					if (btnel.getText()==""){
						array[10]=array[9];
						array[9]=0;
						btnel.setText(btnten.getText());
						btnten.setText("");
					}
					if (btn6.getText()==""){
						array[5]=array[9];
						array[9]=0;
						btn6.setText(btnten.getText());
						btnten.setText("");
					}
					if (btn9.getText()==""){
						array[8]=array[9];
						array[9]=0;
						btn9.setText(btnten.getText());
						btnten.setText("");
					}
					if (btnfr.getText()==""){
						array[13]=array[9];
						array[9]=0;
						btnfr.setText(btnten.getText());
						btnten.setText("");
						}
                     }
			 if (btn1.getText()==(""+1)){
					if (btn2.getText()==(""+2)){
						if (btn3.getText()==(""+3)){
							if (btn4.getText()==(""+4)){
								if (btn5.getText()==(""+5)){
									if (btn6.getText()==(""+6)){
										if (btn7.getText()==(""+7)){
											if (btn8.getText()==(""+8)){
												if (btn9.getText()==(""+9)){
													if (btnten.getText()==(""+10)){
														if (btnel.getText()==(""+11)){
															if (btntw.getText()==(""+12)){
																if (btnth.getText()==(""+13)){
																	if (btnfr.getText()==(""+14)){
																		if (btnft.getText()==(""+15)){
																			if (btn.getText()==("")){ String msg;
																			 msg="You Win";
																              JOptionPane.showMessageDialog(frame, msg);
																		}
																	}
																}
															}
															
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}}}
		           
				}

		});
		btnten.setFont(new Font("Tahoma",Font.BOLD,20));
		btnten.setBounds(69,169,70,60);
		frame.getContentPane().add(btnten);

		 /*------------------------"11"-----------------------*/   
		
		
		btnel.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			
						 if (btnel.getText()==""){
					
				} else{
					if (btn7.getText()==""){
						array[6]=array[10];
						array[10]=0;
						btn7.setText(btnel.getText());
						btnel.setText("");
				}
					if (btnten.getText()==""){
						array[9]=array[10];
						array[10]=0;
						btnten.setText(btnel.getText());
						btnel.setText("");
					}
					if (btntw.getText()==""){
						array[11]=array[10];
						array[10]=0;
						btntw.setText(btnel.getText());
						btnel.setText("");
					}
					if (btnft.getText()==""){
						array[14]=array[10];
						array[10]=0;
						btnft.setText(btnel.getText());
						btnel.setText("");
					}


					}
			 if (btn1.getText()==(""+1)){
					if (btn2.getText()==(""+2)){
						if (btn3.getText()==(""+3)){
							if (btn4.getText()==(""+4)){
								if (btn5.getText()==(""+5)){
									if (btn6.getText()==(""+6)){
										if (btn7.getText()==(""+7)){
											if (btn8.getText()==(""+8)){
												if (btn9.getText()==(""+9)){
													if (btnten.getText()==(""+10)){
														if (btnel.getText()==(""+11)){
															if (btntw.getText()==(""+12)){
																if (btnth.getText()==(""+13)){
																	if (btnfr.getText()==(""+14)){
																		if (btnft.getText()==(""+15)){
																			if (btn.getText()==("")){ String msg;
																			 msg="You Win";
																              JOptionPane.showMessageDialog(frame, msg);
																		}
																	}
																}
															}
															
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}}}
		           
				}

		});
	
		btnel.setFont(new Font("Tahoma",Font.BOLD,20));
		btnel.setBounds(138,169,70,60);
		frame.getContentPane().add(btnel);

		 /*------------------------"12"-----------------------*/   
		
		btntw.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			
					 if (btntw.getText()==""){
					
				} else{
					if (btn8.getText()==""){
						array[7]=array[11];
						array[11]=0;
						btn8.setText(btntw.getText());
						btntw.setText("");
				}
					if (btnel.getText()==""){
						array[10]=array[11];
						array[11]=0;
						btnel.setText(btntw.getText());
						btntw.setText("");
					
					}

					if (btn.getText()==""){
						array[15]=array[11];
						array[11]=0;
						btn.setText(btntw.getText());
						btntw.setText("");
						}

					}
			 if (btn1.getText()==(""+1)){
					if (btn2.getText()==(""+2)){
						if (btn3.getText()==(""+3)){
							if (btn4.getText()==(""+4)){
								if (btn5.getText()==(""+5)){
									if (btn6.getText()==(""+6)){
										if (btn7.getText()==(""+7)){
											if (btn8.getText()==(""+8)){
												if (btn9.getText()==(""+9)){
													if (btnten.getText()==(""+10)){
														if (btnel.getText()==(""+11)){
															if (btntw.getText()==(""+12)){
																if (btnth.getText()==(""+13)){
																	if (btnfr.getText()==(""+14)){
																		if (btnft.getText()==(""+15)){
																			if (btn.getText()==("")){ String msg;
																			 msg="You Win";
																              JOptionPane.showMessageDialog(frame, msg);
																		}
																	}
																}
															}
															
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}}}
		           
				}

		});
		btntw.setFont(new Font("Tahoma",Font.BOLD,20));
		btntw.setBounds(207,169,70,60);
		frame.getContentPane().add(btntw);

		 /*------------------------"13"-----------------------*/   
		
		btnth.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			
					 if (btnth.getText()==""){
					
				} else{
					if (btn9.getText()==""){
						array[8]=array[12];
						array[12]=0;
						btn9.setText(btnth.getText());
						btnth.setText("");
					}
					if (btnfr.getText()==""){
						array[13]=array[12];
						array[12]=0;
						btnfr.setText(btnth.getText());
						btnth.setText("");
					}
}
			 if (btn1.getText()==(""+1)){
					if (btn2.getText()==(""+2)){
						if (btn3.getText()==(""+3)){
							if (btn4.getText()==(""+4)){
								if (btn5.getText()==(""+5)){
									if (btn6.getText()==(""+6)){
										if (btn7.getText()==(""+7)){
											if (btn8.getText()==(""+8)){
												if (btn9.getText()==(""+9)){
													if (btnten.getText()==(""+10)){
														if (btnel.getText()==(""+11)){
															if (btntw.getText()==(""+12)){
																if (btnth.getText()==(""+13)){
																	if (btnfr.getText()==(""+14)){
																		if (btnft.getText()==(""+15)){
																			if (btn.getText()==("")){ String msg;
																			 msg="You Win";
																              JOptionPane.showMessageDialog(frame, msg);
																		}
																	}
																}
															}
															
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}}}
		           
				}

		});
		
		
	
		btnth.setFont(new Font("Tahoma",Font.BOLD,20));
		btnth.setBounds(0,227,70,60);
		frame.getContentPane().add(btnth);

		 /*------------------------"14"-----------------------*/   
		
		btnfr.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			 if (btnfr.getText()==""){
					
				} else{
					if (btnth.getText()==""){
						array[12]=array[13];
						array[13]=0;
						btnth.setText(btnfr.getText());
						btnfr.setText("");
					}
					if (btnten.getText()==""){
						array[9]=array[13];
						array[13]=0;
						btnten.setText(btnfr.getText());
						btnfr.setText("");
					}
					if (btnft.getText()==""){
						array[14]=array[13];
						array[13]=0;
						btnft.setText(btnfr.getText());
						btnfr.setText("");
					}
				}
			 if (btn1.getText()==(""+1)){
					if (btn2.getText()==(""+2)){
						if (btn3.getText()==(""+3)){
							if (btn4.getText()==(""+4)){
								if (btn5.getText()==(""+5)){
									if (btn6.getText()==(""+6)){
										if (btn7.getText()==(""+7)){
											if (btn8.getText()==(""+8)){
												if (btn9.getText()==(""+9)){
													if (btnten.getText()==(""+10)){
														if (btnel.getText()==(""+11)){
															if (btntw.getText()==(""+12)){
																if (btnth.getText()==(""+13)){
																	if (btnfr.getText()==(""+14)){
																		if (btnft.getText()==(""+15)){
																			if (btn.getText()==("")){ String msg;
																			 msg="You Win";
																              JOptionPane.showMessageDialog(frame, msg);
																		}
																	}
																}
															}
															
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}}}
		           }

		});
		
		btnfr.setFont(new Font("Tahoma",Font.BOLD,20));
		btnfr.setBounds(69,227,70,60);
		frame.getContentPane().add(btnfr);

		 /*------------------------"15"-----------------------*/   
		
		btnft.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
					 if (btnft.getText()==""){
					
				} else{
					if (btnfr.getText()==""){
						array[13]=array[14];
						array[14]=0;
						btnfr.setText(btnft.getText());
						btnft.setText("");
					}
					
					if (btnel.getText()==""){
						array[10]=array[14];
						array[14]=0;
						btnel.setText(btnft.getText());
						btnft.setText("");
					}
					if (btn.getText()==""){
						array[15]=array[14];
						array[14]=0;
						btn.setText(btnft.getText());
						btnft.setText("");
					}
				}
			 if (btn1.getText()==(""+1)){
					if (btn2.getText()==(""+2)){
						if (btn3.getText()==(""+3)){
							if (btn4.getText()==(""+4)){
								if (btn5.getText()==(""+5)){
									if (btn6.getText()==(""+6)){
										if (btn7.getText()==(""+7)){
											if (btn8.getText()==(""+8)){
												if (btn9.getText()==(""+9)){
													if (btnten.getText()==(""+10)){
														if (btnel.getText()==(""+11)){
															if (btntw.getText()==(""+12)){
																if (btnth.getText()==(""+13)){
																	if (btnfr.getText()==(""+14)){
																		if (btnft.getText()==(""+15)){
																			if (btn.getText()==("")){ String msg;
																			 msg="You Win";
																              JOptionPane.showMessageDialog(frame, msg);
																		}
																	}
																}
															}
															
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}}}
		           }

		});
		btnft.setFont(new Font("Tahoma",Font.BOLD,20));
		btnft.setBounds(138,227,70,60);
		frame.getContentPane().add(btnft);

	}
	}
	