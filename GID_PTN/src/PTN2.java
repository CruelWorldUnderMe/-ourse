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
import java.util.Random;
import java.util.Scanner;
import java.io.*; 
import java.util.Scanner; 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class PTN2 {
String firstnum;
String secondnum;
String firstnum2;
	private JFrame frame;
	private JFrame frame2;
	private JFrame frame3;
	private JFrame frame4;
	private JFrame frame5;

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
		//	lblNewLabel.setText(txtfil.getText());
		//if(txtfil.getText()=="qwe"){	lblNewLabel.setText(txtfil.getText());	}	
					Scanner scan = new Scanner(System.in); 

					File file = new File("file.txt"); 
					System.out.println("Ââåäèòå, ïîæàëóéñòà òåêñò äëÿ çàïèñè:"); 
					String text = scan.nextLine(); 

				
					System.out.println("Òåêñò çàïèñàí â ôàéë file.txt");

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
		
				JButton btnNewButton = new JButton("BACK");
				btnNewButton.setForeground(Color.BLUE);
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						frame.setVisible(false);
						frame2.setVisible(true);
						
						// String msg;
						// msg="You Win";
			             // JOptionPane.showMessageDialog(frame, msg);
					}
				});
				btnNewButton.setBounds(180, 298, 89, 23);
				frame.getContentPane().add(btnNewButton);
				
				
				   NEW();
			       
					
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
		
				
			


        
        
    
		
	/*	
		
		frame.getContentPane().setBackground(Color.RED);
    	//btn8.setForeground(Color.GREEN);
		
		
		*/
		
			
		
	
			
			
			
			
			JButton btnStart = new JButton("NEW");
			btnStart.setForeground(Color.BLUE);
			btnStart.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
			NEW();

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
				btnStart.setBounds(10, 298, 89, 23);
				frame.getContentPane().add(btnStart);
	 /*------------------------7-----------------------*/ 
	    btn7.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){

			
			/*if (btn7.getText()==""){
			btn7.setText(firstnum);	
			} else{
				firstnum=btn7.getText();
				btn7.setText("");
			}
			}
		});*/
			
		
			 if (btn7.getText()==""){
					
				} else{
					if (btn3.getText()==""){
						
						btn3.setText(btn7.getText());
						btn7.setText("");
						//btn3.setBackground(Color.GREEN);
						//btn7.setBackground(Color.RED);
					}
					if (btnel.getText()==""){
						btnel.setText(btn7.getText());
						btn7.setText("");
						//btnel.setBackground(Color.GREEN);
						//btn7.setBackground(Color.RED);
					}
					if (btn6.getText()==""){
						btn6.setText(btn7.getText());
						btn7.setText("");
						//btn6.setBackground(Color.GREEN);
						//btn7.setBackground(Color.RED);
					}
					if (btn8.getText()==""){
						btn8.setText(btn7.getText());
						btn7.setText("");
				//	btn8.setBackground(Color.GREEN);
					//btn7.setBackground(Color.RED);
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
			
	
		btn7.setFont(new Font("Tahoma",Font.BOLD,20));
		btn7.setBounds(138,111,70,60);
		frame.getContentPane().add(btn7);
		 /*------------------------8-----------------------*/   
		   
	
		btn8.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			/*
			if (btn8.getText()==""){
				btn8.setText(firstnum);	
				} else{
					firstnum=btn8.getText();
					btn8.setText("");
				}
				}
				});*/
			
			 if (btn8.getText()==""){
					
				} else{
					if (btn4.getText()==""){
						btn4.setText(btn8.getText());
						btn8.setText("");
					//	btn4.setBackground(Color.GREEN);
					//	btn8.setBackground(Color.RED);
					}if (btn7.getText()==""){
						btn7.setText(btn8.getText());
						btn8.setText("");
					//	btn7.setBackground(Color.GREEN);
					//	btn8.setBackground(Color.RED);
					}
					if (btntw.getText()==""){
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
			/*
			
			if (btn9.getText()==""){
				btn9.setText(firstnum);	
				} else{
					firstnum=btn9.getText();
					btn9.setText("");
				}
				}
			
		});*/
			 if (btn9.getText()==""){
					
				} else{
					if (btn5.getText()==""){
						btn5.setText(btn9.getText());
						btn9.setText("");
				//		btn5.setBackground(Color.GREEN);
				//		btn9.setBackground(Color.RED);
					}

					if (btnten.getText()==""){
						btnten.setText(btn9.getText());
						btn9.setText("");
					//	btnten.setBackground(Color.GREEN);
					//	btn9.setBackground(Color.RED);
					}

					if (btnth.getText()==""){
						btnth.setText(btn9.getText());
						btn9.setText("");
					//	btnth.setBackground(Color.GREEN);
					//	btn9.setBackground(Color.RED);
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
		/*	if (btn6.getText()==""){
				btn6.setText(firstnum);	
				} else{
					firstnum=btn6.getText();
					btn6.setText("");
				}
				}
		
		});*/
            if (btn6.getText()==""){
				
		} else{
			if (btn2.getText()==""){
				btn2.setText(btn6.getText());
				btn6.setText("");
				//btn2.setBackground(Color.GREEN);
			//	btn6.setBackground(Color.RED);
			}
			if (btn5.getText()==""){
				btn5.setText(btn6.getText());
				btn6.setText("");
			//	btn5.setBackground(Color.GREEN);
			//	btn6.setBackground(Color.RED);
			}
			if (btn7.getText()==""){
				btn7.setText(btn6.getText());
				btn6.setText("");
			//	btn7.setBackground(Color.GREEN);
				//btn6.setBackground(Color.RED);
			}
			if (btnten.getText()==""){
				btnten.setText(btn6.getText());
				btn6.setText("");
				//btnten.setBackground(Color.GREEN);
				//btn6.setBackground(Color.RED);
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
			/*if (btn5.getText()==""){
				btn5.setText(firstnum);	
				} else{
					firstnum=btn5.getText();
					btn5.setText("");
				}
				}
			
		});*/
            if (btn5.getText()==""){
				
		} else{
			if (btn6.getText()==""){
				btn6.setText(btn5.getText());
				btn5.setText("");
			//	btn6.setBackground(Color.GREEN);
			//	btn5.setBackground(Color.RED);
			}
			if (btn1.getText()==""){
				btn1.setText(btn5.getText());
				btn5.setText("");
			//	btn1.setBackground(Color.GREEN);
			//	btn5.setBackground(Color.RED);
			}
			if (btn9.getText()==""){
				btn9.setText(btn5.getText());
				btn5.setText("");
			//	btn9.setBackground(Color.GREEN);
			//	btn5.setBackground(Color.RED);
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
		/*	if (btn4.getText()==""){
				btn4.setText(firstnum);	
				} else{
					firstnum=btn4.getText();
					btn4.setText("");
				}
				}
		
		});*/
            if (btn4.getText()==""){
				
		} else{
			if (btn3.getText()==""){
				btn3.setText(btn4.getText());
				btn4.setText("");
			//	btn3.setBackground(Color.GREEN);
			//	btn4.setBackground(Color.RED);
			}
			if (btn8.getText()==""){
				btn8.setText(btn4.getText());
				btn4.setText("");
			//	btn8.setBackground(Color.GREEN);
			//	btn4.setBackground(Color.RED);
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
			/*if (btn3.getText()==""){
				btn3.setText(firstnum);	
				} else{
					firstnum=btn3.getText();
					btn3.setText("");
				}
				}
			});*/
                if (btn3.getText()==""){
				
			} else{
				if (btn2.getText()==""){
					btn2.setText(btn3.getText());
					btn3.setText("");
			//		btn2.setBackground(Color.GREEN);
			//		btn3.setBackground(Color.RED);
				}
				if (btn7.getText()==""){
					btn7.setText(btn3.getText());
					btn3.setText("");
				//	btn7.setBackground(Color.GREEN);
				//	btn3.setBackground(Color.RED);
				}
				if (btn4.getText()==""){
					btn4.setText(btn3.getText());
					btn3.setText("");
				//	btn4.setBackground(Color.GREEN);
				//	btn3.setBackground(Color.RED);
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
			/*if (btn2.getText()==""){
				btn2.setText(firstnum);	
				} else{
					firstnum=btn2.getText();
					btn2.setText("");
				}
				}
		
		});*/
			
			if (btn2.getText()==""){
				
			} else{
				if (btn1.getText()==""){
					btn1.setText(btn2.getText());
					btn2.setText("");
			//		btn1.setBackground(Color.GREEN);
			//		btn2.setBackground(Color.RED);
				}
                if (btn6.getText()==""){
                	btn6.setText(btn2.getText());
					btn2.setText("");
			//		btn6.setBackground(Color.GREEN);
			//		btn2.setBackground(Color.RED);
				}			
                if (btn3.getText()==""){
                	btn3.setText(btn2.getText());
					btn2.setText("");
			//		btn3.setBackground(Color.GREEN);
			//		btn2.setBackground(Color.RED);
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
	/*		if (btn1.getText()==""){
				btn1.setText(firstnum);	
				} else{
					firstnum=btn1.getText();
					btn1.setText("");
				}
				}
		
		});*/
		
	
			if (btn1.getText()==""){
				
				} else{
					if (btn5.getText()==""){
						btn5.setText(btn1.getText());
						btn1.setText("");
			//			btn5.setBackground(Color.GREEN);
			//			btn1.setBackground(Color.RED);
					}
                    if (btn2.getText()==""){
                    	btn2.setText(btn1.getText());
						btn1.setText("");
				//		btn2.setBackground(Color.GREEN);
				//		btn1.setBackground(Color.RED);
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
			
			
	
		/*	if (btn.getText()==""){
				btn.setText(firstnum);	
				} else{
					firstnum=btn.getText();
					btn.setText("");
				}
				}
		
		});*/
			 if (btn.getText()==""){
					
				} else{
					if (btnft.getText()==""){
						btnft.setText(btn.getText());
						btn.setText("");
				//		btnft.setBackground(Color.GREEN);
				//		btn.setBackground(Color.RED);
					}
					if (btntw.getText()==""){
						btntw.setText(btn.getText());
						btn.setText("");
				//		btntw.setBackground(Color.GREEN);
				//		btn.setBackground(Color.RED);
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
			
			
	/*
			if (btnten.getText()==""){
				btnten.setText(firstnum);	
				} else{
					firstnum=btnten.getText();
					btnten.setText("");
				}
				}
		
		});
*/
			 if (btnten.getText()==""){
					
				} else{
					if (btnel.getText()==""){
						btnel.setText(btnten.getText());
						btnten.setText("");
				//		btnel.setBackground(Color.GREEN);
				//		btnten.setBackground(Color.RED);
					}
					if (btn6.getText()==""){
						btn6.setText(btnten.getText());
						btnten.setText("");
					//	btn6.setBackground(Color.GREEN);
					//	btnten.setBackground(Color.RED);
					}
					if (btn9.getText()==""){
						btn9.setText(btnten.getText());
						btnten.setText("");
					//	btn9.setBackground(Color.GREEN);
					//	btnten.setBackground(Color.RED);
					}
					if (btnfr.getText()==""){
						btnfr.setText(btnten.getText());
						btnten.setText("");
					//	btnfr.setBackground(Color.GREEN);
					//	btnten.setBackground(Color.RED);
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
			
			
	
			/*if (btnel.getText()==""){
				btnel.setText(firstnum);	
				} else{
					firstnum=btnel.getText();
					btnel.setText("");
				}
				}
		
		});*/

			 if (btnel.getText()==""){
					
				} else{
					if (btn7.getText()==""){
						btn7.setText(btnel.getText());
						btnel.setText("");
				//		btn7.setBackground(Color.GREEN);
				//		btnel.setBackground(Color.RED);
					}
					if (btnten.getText()==""){
						btnten.setText(btnel.getText());
						btnel.setText("");
					//	btnten.setBackground(Color.GREEN);
					//	btnel.setBackground(Color.RED);
					}
					if (btntw.getText()==""){
						btntw.setText(btnel.getText());
						btnel.setText("");
					//	btntw.setBackground(Color.GREEN);
					//	btnel.setBackground(Color.RED);
					}
					if (btnft.getText()==""){
						btnft.setText(btnel.getText());
						btnel.setText("");
					//	btnft.setBackground(Color.GREEN);
					//	btnel.setBackground(Color.RED);
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
			
			
	
/*			if (btntw.getText()==""){
				btntw.setText(firstnum);	
				} else{
					firstnum=btntw.getText();
					btntw.setText("");
				}
				}
		
		});
	*/
			 if (btntw.getText()==""){
					
				} else{
					if (btn8.getText()==""){
						btn8.setText(btntw.getText());
						btntw.setText("");
				//		btn8.setBackground(Color.GREEN);
					//	btntw.setBackground(Color.RED);
					}
					if (btnel.getText()==""){
						btnel.setText(btntw.getText());
						btntw.setText("");
					//	btnel.setBackground(Color.GREEN);
					//	btntw.setBackground(Color.RED);
					
					}

					if (btn.getText()==""){
						btn.setText(btntw.getText());
						btntw.setText("");
					//	btn.setBackground(Color.GREEN);
					//	btntw.setBackground(Color.RED);
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
			
			
	
/*			if (btnth.getText()==""){
				btnth.setText(firstnum);	
				} else{
					firstnum=btnth.getText();
					btnth.setText("");
				}
				}
		
		});*/
			 if (btnth.getText()==""){
					
				} else{
					if (btn9.getText()==""){
						btn9.setText(btnth.getText());
						btnth.setText("");
					//	btn9.setBackground(Color.GREEN);
					//	btnth.setBackground(Color.RED);
					}
					if (btnfr.getText()==""){
						btnfr.setText(btnth.getText());
						btnth.setText("");
					//	btnfr.setBackground(Color.GREEN);
					//	btnth.setBackground(Color.RED);
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
			
			
	
/*			if (btnfr.getText()==""){
				btnfr.setText(firstnum);	
				} else{
					firstnum=btnfr.getText();
					btnfr.setText("");
				}
				}
		
		});
	*/
			 if (btnfr.getText()==""){
					
				} else{
					if (btnth.getText()==""){
						btnth.setText(btnfr.getText());
						btnfr.setText("");
					//	btnth.setBackground(Color.GREEN);
					//	btnfr.setBackground(Color.RED);
					}
					if (btnten.getText()==""){
						btnten.setText(btnfr.getText());
						btnfr.setText("");
					//	btnten.setBackground(Color.GREEN);
					//	btnfr.setBackground(Color.RED);
					}
					if (btnft.getText()==""){
						btnft.setText(btnfr.getText());
						btnfr.setText("");
					//	btnft.setBackground(Color.GREEN);
					//	btnfr.setBackground(Color.RED);
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
			
			
	
/*			if (btnft.getText()==""){
				btnft.setText(firstnum);	
				} else{
					firstnum=btnft.getText();
					btnft.setText("");
				}
				}
		
		});
	*/
			 if (btnft.getText()==""){
					
				} else{
					if (btnfr.getText()==""){
						btnfr.setText(btnft.getText());
						btnft.setText("");
					//	btnfr.setBackground(Color.GREEN);
					//	btnft.setBackground(Color.RED);
					}
					
					if (btnel.getText()==""){
						btnel.setText(btnft.getText());
						btnft.setText("");
					//	btnel.setBackground(Color.GREEN);
					//	btnft.setBackground(Color.RED);
					}
					if (btn.getText()==""){
						btn.setText(btnft.getText());
						btnft.setText("");
					//	btn.setBackground(Color.GREEN);
					//	btnft.setBackground(Color.RED);
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
	