import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
public class PTN2 extends JFrame {
String firstnum;
String secondnum;
String firstnum2;
int i=0 ;
int m=0;
int i2=0;
int m2=0;
int col=0;
int tmp;
	private JFrame frame;
	private JFrame frame2;
	private JFrame frame5;
/**
	 * Launch the application.
	 */
	int[] array = new int[16];
	int[] timearr = new int[5];
	
	 int[][] matrix = new int[4][4];
	 int[] coll=new int[1];
	
	 private boolean NEW_check(int[] array) {
	        int sum = 0;
	        for (int i = 0; i < 16; i++) {
	            if (array[i] == 0) {
	                sum =sum+ i / 4;
	                continue;
	            }

	            for (int j = i + 1; j < 16; j++) {
	            	if(array[j]!=0 && array[i] < array[j])
	               // if (array[j] < array[i])
	                    sum ++;
	            }
	        }
	        System.out.println(sum % 2 == 0);
	        return sum % 2 == 0;
	    } 
	 public void NEW(){
		 do {
			
		for (int i = 0; i < array.length; i++) {
		     array[i] = ((int)(Math.random() * 16));
		    
		     for(int j=0;j<i;j++){
		  
		    	 if (array[j]==array[i]){
		    			i--; 
		    	 }
		      }
		  }
	 } while (!NEW_check(array));
		 
	 }
public boolean See(){
	    
if (array[0]==1 && array[1]==2 && array[2]==3 && array[3]==4 && array[4]==5 && array[5]==6 && array[6]==7 && array[7]==8
&& array[8]==9 && array[9]==10 && array[10]==11 && array[11]==12 && array[12]==13 && array[13]==14 && array[14]==15
&& array[15]==0){
return true;
	

}else return false;

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
		frame.setBounds(450, 100, 300, 400);
		 frame.setTitle("Ïÿòíàøêè");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//---------------------Ïåðâîå îêíî-------------------------//

//		Formclass a = new Formclass();
	//	a.setVisible(true);
		
		frame2 = new JFrame();
		frame2.setBounds(450, 100, 400, 379);
		 frame2.setTitle("Âõîä");

		 frame2.getContentPane().setBackground(Color.BLACK);
		 
		 frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
	 //                CONTINUE ïåðåíåñåíà âûøå, ÷òî á îòîáðàæàëîñü
		JButton btnStart2 = new JButton("CONTINUE");
		
		
		btnStart2.setFont(new Font("Tahoma",Font.BOLD,20));
		btnStart2.setBounds(40,64,300,60);
		frame2.getContentPane().add(btnStart2);	
		btnStart2.setForeground(Color.RED);
      
		
		JLabel txtregð7 = new JLabel("15 PUZZLE");
		txtregð7.setFont(new Font("",Font.BOLD,30));
		txtregð7.setForeground(Color.RED);
		txtregð7.setBounds(120, 15, 300, 30);
		frame2.getContentPane().add(txtregð7);
		   //         NEW GAME         //		
		  JButton start2 = new JButton("START GAME");
		  start2.setForeground(Color.RED);
		  start2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
frame2.setVisible(false);
frame.setVisible(true);
}
				}
	);
		  start2.setFont(new Font("Tahoma",Font.BOLD,20));
		  start2.setBounds(40,152,300,60);
				frame2.getContentPane().add(start2);
			//        ABOUT          //
				 JButton about = new JButton("ABOUT");
				  about.setForeground(Color.RED);
				  about.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent arg0){
                          frame2.setVisible(false);
                          frame5.setVisible(true);
						}
						}
					
			);
				  about.setFont(new Font("Tahoma",Font.BOLD,20));
				  about.setBounds(40,240,300,60);
						frame2.getContentPane().add(about);
		//---------------------Ïÿòîå îêíî-------------------------//
														
frame5 = new JFrame();
frame5.setBounds(450, 100, 400, 379);
frame5.setTitle("About");

frame5.getContentPane().setBackground(Color.BLACK);
frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame5.getContentPane().setLayout(null);
//           ABOUT 1           //	
JLabel txtregð2 = new JLabel("Ñreated by:  id134550105");
txtregð2.setFont(new Font("",Font.BOLD,20));
txtregð2.setForeground(Color.RED);
txtregð2.setBounds(10, 100, 300, 23);
frame5.getContentPane().add(txtregð2);
JLabel txtregð6 = new JLabel("                    "+"id52964080");
txtregð6.setFont(new Font("",Font.BOLD,20));
txtregð6.setForeground(Color.RED);
txtregð6.setBounds(10, 120, 300, 23);
frame5.getContentPane().add(txtregð6);												
								 //           ABOUT 3          //				
JLabel lblNewLabel2 = new JLabel("");
lblNewLabel2.setBounds(0, 0, 400, 350);
Image img; 
img = new ImageIcon("d://Kursov.jpg").getImage(); 
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
JLabel lblNewLabel4 = new JLabel("");
lblNewLabel4.setBounds(0, 0, 400, 340);
Image img2; 
img2 = new ImageIcon("d://Kurso.jpg").getImage(); 
lblNewLabel4.setIcon(new ImageIcon(img2));
frame2.getContentPane().add(lblNewLabel4);
//-----------------------------------------------------------//
	JButton btnNewButton2 = new JButton("START");
	btnNewButton2.setBackground(Color.WHITE);
				JButton btnNewButton = new JButton("BACK");
				btnNewButton.setBackground(Color.WHITE);
				btnNewButton.setForeground(Color.RED);
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
				//     Ïîëå ñ òàéìåðîì
				JLabel txtregð4 = new JLabel("Time:");

				txtregð4.setFont(new Font("Tahoma",Font.PLAIN,20));
				txtregð4.setForeground(Color.RED);
				txtregð4.setBounds(60, 13, 120, 23);
				frame.getContentPane().add(txtregð4);
				//     Ïîëå ñ òàéìåðîì
				JLabel txtregð3 = new JLabel("00:00");
				txtregð3.setHorizontalAlignment(SwingConstants.CENTER);
				txtregð3.setFont(new Font("Tahoma",Font.PLAIN,20));
				txtregð3.setForeground(Color.RED);
				txtregð3.setBounds(90, 15, 120, 23);
				frame.getContentPane().add(txtregð3);
	//				  Êíîïêà çàïóñêàþùàÿ òàéìåð START/STOP
												btnNewButton2.setForeground(Color.RED);
				btnNewButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					if (btnNewButton2.getText()=="START"){
						btnNewButton2.setText("STOP");	
					}	else btnNewButton2.setText("START");
				//         Timer
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
				// Ïåðâàÿ ãåíåðàöèÿ ïÿòíàøåê 
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
			//    Ãåíåðàöèÿ ïÿòíàøåê ïî êíîïêå NEW
			JButton btnStart = new JButton("NEW");
			btnStart.setBackground(Color.WHITE);
			btnStart.setForeground(Color.RED);
			btnStart.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
  btnNewButton2.setText("START");
			  i=0 ;
	            m=0;
	            i2=0 ;
	           m2=0;
	       	txtregð3.setText(""+m2+i2+":"+m+i+"");
	       	NEW();
			btn1.setText(""+array[0]);btn2.setText(""+array[1]);
			btn3.setText(""+array[2]);btn4.setText(""+array[3]);
			btn5.setText(""+array[4]);btn6.setText(""+array[5]);
			btn7.setText(""+array[6]);btn8.setText(""+array[7]);
			btn9.setText(""+array[8]);btnten.setText(""+array[9]);
			btnel.setText(""+array[10]);btntw.setText(""+array[11]);
			btnth.setText(""+array[12]);btnfr.setText(""+array[13]);
			btnft.setText(""+array[14]);btn.setText(""+array[15]);
		 for (int i = 0; i < array.length; i++) {
			    if (array[i] ==0){
			    	secondnum=(""+array[i]);
			   if (i==0){btn1.setText("");}if (i==1){btn2.setText("");}
			   if (i==2){btn3.setText("");}if (i==3){btn4.setText("");}
			   if (i==4){btn5.setText("");}if (i==5){btn6.setText("");}
			   if (i==6){btn7.setText("");}if (i==7){btn8.setText("");}
			   if (i==8){btn9.setText("");}if (i==9){btnten.setText("");}
			   if (i==10){btnel.setText("");}if (i==11){btntw.setText("");}
			   if (i==12){btnth.setText("");}if (i==13){btnfr.setText("");}
			   if (i==14){btnft.setText("");} if (i==15){btn.setText("");}
			    }
			    
			 }
					}
				});
				btnStart.setBounds(0, 298, 89, 23);
				frame.getContentPane().add(btnStart);
				
			//         Ãåíåðàöèÿ ïÿòíàøåê èç ïðîøëîé èãðû	
				btnStart2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
                     try { 
							File file = new File("file.txt");
					        Scanner s = new Scanner(System.in).useDelimiter(" "); ; 
					        FileReader fr = new FileReader(file); 
						s=new Scanner(fr);
							for(int y=0;y<16;y++){
							array[y]=s.nextInt();} 
				} catch (IOException error) { }
                     try { 
							File file2 = new File("file2.txt");
					        Scanner s2 = new Scanner(System.in).useDelimiter(" "); ; 
					        FileReader fr2 = new FileReader(file2); 
						s2=new Scanner(fr2);
							for(int y=0;y<4;y++){
							timearr[y]=s2.nextInt();}
							m2=timearr[0];
							i2=timearr[1];
							m=timearr[2];
							i=timearr[3];
						  	txtregð3.setText(""+m2+i2+":"+m+i+"");
				} catch (IOException error) { }    
                     try { 
							File file2 = new File("file5.txt");
					        Scanner s2 = new Scanner(System.in).useDelimiter(" "); ; 
					        FileReader fr2 = new FileReader(file2); 
						s2=new Scanner(fr2);
						
							coll[0]=s2.nextInt();
						col=coll[0];
				} catch (IOException error) { }    
                     try { 
							File file3 = new File("file2.txt");
					        Scanner s3 = new Scanner(System.in).useDelimiter(" "); 
					        FileReader fr3 = new FileReader(file3); 
						s3=new Scanner(fr3);
				} catch (IOException error) { }       
               btn1.setText(""+array[0]);btn2.setText(""+array[1]);
				btn3.setText(""+array[2]);btn4.setText(""+array[3]);
				btn5.setText(""+array[4]);btn6.setText(""+array[5]);
				btn7.setText(""+array[6]);btn8.setText(""+array[7]);
				btn9.setText(""+array[8]);btnten.setText(""+array[9]);
				btnel.setText(""+array[10]);btntw.setText(""+array[11]);
				btnth.setText(""+array[12]);btnfr.setText(""+array[13]);
				btnft.setText(""+array[14]);btn.setText(""+array[15]);
			 for (int i = 0; i < array.length; i++) {
				    if (array[i] ==0){
				    	secondnum=(""+array[i]);
				   if (i==0){btn1.setText("");}if (i==1){btn2.setText("");}
				   if (i==2){btn3.setText("");}if (i==3){btn4.setText("");}
				   if (i==4){btn5.setText("");}if (i==5){btn6.setText("");}
				   if (i==6){btn7.setText("");}if (i==7){btn8.setText("");}
				   if (i==8){btn9.setText("");}if (i==9){btnten.setText("");}
				   if (i==10){btnel.setText("");}if (i==11){btntw.setText("");}
				   if (i==12){btnth.setText("");}if (i==13){btnfr.setText("");}
				   if (i==14){btnft.setText("");}if (i==15){btn.setText("");}
				    }
				 }
			 frame2.setVisible(false);
			 frame.setVisible(true);
					}
					});
		 /*------------------------7-----------------------*/ 
	    btn7.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(btnNewButton2.getText()=="STOP"){    
			if (array[6]==0){
					
				} else{
					if (array[2]==0){
						array[2]=array[6];
						array[6]=0;
						
						btn3.setText(btn7.getText());
						btn7.setText("");col++;
					}
					if (array[10]==0){
						array[10]=array[6];
						array[6]=0;
						
						btnel.setText(btn7.getText());
						btn7.setText("");col++;
					}
					if (array[5]==0){
						array[5]=array[6];
						array[6]=0;
						
						btn6.setText(btn7.getText());
						btn7.setText("");col++;
					}
					if (array[7]==0){
						array[7]=array[6];
						array[6]=0;
						
						btn8.setText(btn7.getText());
						btn7.setText("");col++;
				}
				    }}
		}
       });
		 btn7.setBackground(Color.WHITE);
		btn7.setFont(new Font("Tahoma",Font.BOLD,20));
		btn7.setBounds(142,111,70,60);
		frame.getContentPane().add(btn7);
		 /*------------------------8-----------------------*/   
		btn8.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(btnNewButton2.getText()=="STOP"){
			 if (array[7]==0){
				} else{
					if (array[3]==0){
						array[3]=array[7];
						array[7]=0;
						
						btn4.setText(btn8.getText());
						btn8.setText("");
						col++;
					}if (array[6]==0){
						array[6]=array[7];
						array[7]=0;
						
						btn7.setText(btn8.getText());
						btn8.setText("");
						col++;
					}
					if (array[11]==0){
						array[11]=array[7];
						array[7]=0;
						
						btntw.setText(btn8.getText());
						btn8.setText("");
						col++;
					}
			    }}
 }
   });
		btn8.setBackground(Color.WHITE);
		btn8.setFont(new Font("Tahoma",Font.BOLD,20));
		btn8.setBounds(213,111,70,60);
		frame.getContentPane().add(btn8);
		 /*------------------------9-----------------------*/   
		btn9.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(btnNewButton2.getText()=="STOP"){
			 if (array[8]==0){
					
				} else{
					if (array[4]==0){
						array[4]=array[8];
						array[8]=0;
						
						btn5.setText(btn9.getText());
						btn9.setText("");
						col++;
					}

					if (array[9]==0){
						array[9]=array[8];
						array[8]=0;
						
						btnten.setText(btn9.getText());
						btn9.setText("");
						col++;
					}

					if (array[12]==0){
						array[12]=array[8];
						array[8]=0;
						
						btnth.setText(btn9.getText());
						btn9.setText("");
						col++;
					}
			    }}
  }
   });
		btn9.setBackground(Color.WHITE);
		btn9.setFont(new Font("Tahoma",Font.BOLD,20));
		btn9.setBounds(0,172,70,60);
		frame.getContentPane().add(btn9);
		 /*------------------------6-----------------------*/   
		btn6.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(btnNewButton2.getText()=="STOP"){
			if (array[5]==0){
		} else{
			if (array[1]==0){
				array[1]=array[5];
				array[5]=0;
				btn2.setText(btn6.getText());
				btn6.setText("");
				col++;
			}
			if (array[4]==0){
				array[4]=array[5];
				array[5]=0;
				btn5.setText(btn6.getText());
				btn6.setText("");
				col++;
			}
			if (array[6]==0){
				array[6]=array[5];
				array[5]=0;
				btn7.setText(btn6.getText());
				btn6.setText("");
				col++;
			}
			if (array[9]==0){
				array[9]=array[5];
				array[5]=0;
				btnten.setText(btn6.getText());
				btn6.setText("");
				col++;
			}
	    }}
}
});
		btn6.setBackground(Color.WHITE);
		btn6.setFont(new Font("Tahoma",Font.BOLD,20));
		btn6.setBounds(71,111,70,60);
		frame.getContentPane().add(btn6);
		 /*------------------------5-----------------------*/   
		btn5.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(btnNewButton2.getText()=="STOP"){
            if (array[4]==0){
		} else{
			if (array[5]==0){
				array[5]=array[4];
				array[4]=0;
				btn6.setText(btn5.getText());
				btn5.setText("");
				col++;
			}
			if (array[0]==0){
				array[0]=array[4];
				array[4]=0;
				btn1.setText(btn5.getText());
				btn5.setText("");
				col++;
			}
			if (array[8]==0){
				array[8]=array[4];
				array[4]=0;
				btn9.setText(btn5.getText());
				btn5.setText("");
				col++;
			}
	    }}
}
});
		btn5.setBackground(Color.WHITE);
		btn5.setFont(new Font("Tahoma",Font.BOLD,20));
		btn5.setBounds(0,111,70,60);
		frame.getContentPane().add(btn5);
		 /*------------------------4-----------------------*/   
		btn4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(btnNewButton2.getText()=="STOP"){
			if (array[3]==0){
		} else{
			if (array[2]==0){
				array[2]=array[3];
				array[3]=0;
				btn3.setText(btn4.getText());
				btn4.setText("");
				col++;
			}
			if (array[7]==0){
				array[7]=array[3];
				array[3]=0;
				btn8.setText(btn4.getText());
				btn4.setText("");
				col++;
			}
	    }}
}
});
		btn4.setBackground(Color.WHITE);
		btn4.setFont(new Font("Tahoma",Font.BOLD,20));
		btn4.setBounds(213,50,70,60);
		frame.getContentPane().add(btn4);
		 /*------------------------3-----------------------*/   
			btn3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(btnNewButton2.getText()=="STOP"){ 
			if (array[2]==0){
				
			} else{
				if (array[1]==0){
					array[1]=array[2];
					array[2]=0;
					btn2.setText(btn3.getText());
					btn3.setText("");
					col++;
				}
				if (array[6]==0){
					array[6]=array[2];
					array[2]=0;
					btn7.setText(btn3.getText());
					btn3.setText("");
					col++;
				}
				if (array[3]==0){
					array[3]=array[2];
					array[2]=0;
					btn4.setText(btn3.getText());
					btn3.setText("");
					col++;
				}
		    }}
}
});
		btn3.setBackground(Color.WHITE);
		btn3.setFont(new Font("Tahoma",Font.BOLD,20));
		btn3.setBounds(142,50,70,60);
		frame.getContentPane().add(btn3);
		 /*------------------------2-----------------------*/   
		btn2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(btnNewButton2.getText()=="STOP"){
			if (array[1]==0){
			} else{
				if (array[0]==0){
					array[0]=array[1];
					array[1]=0;
					btn1.setText(btn2.getText());
					btn2.setText("");
					col++;
				}
                if (array[5]==0){
                	array[5]=array[1];
					array[1]=0;
                	btn6.setText(btn2.getText());
					btn2.setText("");
			}			
                if (array[2]==0){
                	array[2]=array[1];
					array[1]=0;
                	btn3.setText(btn2.getText());
					btn2.setText("");
					col++;
                }
		    }}
}
});
		btn2.setBackground(Color.WHITE);
		btn2.setFont(new Font("Tahoma",Font.BOLD,20));
		btn2.setBounds(71,50,70,60);
		frame.getContentPane().add(btn2);
		 /*------------------------1-----------------------*/   
		btn1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(btnNewButton2.getText()=="STOP"){
			if (array[0]==0){
				
				} else{
					if (array[4]==0 ){
						array[4]=array[0];
						array[0]=0;
						btn5.setText(btn1.getText());
						btn1.setText("");
						col++;
					}
                    if (array[1]==0){
                    	array[1]=array[0];
						array[0]=0;
                    	btn2.setText(btn1.getText());
						btn1.setText("");
						col++;
                    }
			    }}
 }
   });
		btn1.setBackground(Color.WHITE);
		btn1.setFont(new Font("Tahoma",Font.BOLD,20));
		btn1.setBounds(0,50,70,60);
		frame.getContentPane().add(btn1);
	 /*------------------------""-----------------------*/   
			btn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(btnNewButton2.getText()=="STOP"){
			 if (array[15]==0){
				} else{
					if (array[14]==0){
						array[14]=array[15];
						array[15]=0;
						btnft.setText(btn.getText());
						btn.setText("");
						col++;
					}
					if (array[11]==0){
						array[11]=array[15];
						array[15]=0;
						btntw.setText(btn.getText());
						btn.setText("");
						col++;
					}
			    }}
if(See()==true){
	btnNewButton2.setText("START");
	String msg;
	String msg2;
	msg2=Integer.toString(col/2);
	msg="You Win";                                                        //   m2+" "+i2+" "+m+" "+i  
	JOptionPane.showMessageDialog(frame,msg+"\n"+"Making moves:"+ msg2+"\n"+"Time: "+m2+i2+":"+m+i);
};
   }
   });
		btn.setBackground(Color.WHITE);
		btn.setFont(new Font("Tahoma",Font.BOLD,20));
		btn.setBounds(213,233,70,60);
		frame.getContentPane().add(btn);
	 /*------------------------"10"-----------------------*/   
		btnten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnten.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			
			if(btnNewButton2.getText()=="STOP"){
			 if (array[9]==0){
				} else{
					if (array[10]==0){
						array[10]=array[9];
						array[9]=0;
						btnel.setText(btnten.getText());
						btnten.setText("");
						col++;
					}
					if (array[5]==0){
						array[5]=array[9];
						array[9]=0;
						btn6.setText(btnten.getText());
						btnten.setText("");
						col++;
					}
					if (array[8]==0){
						array[8]=array[9];
						array[9]=0;
						btn9.setText(btnten.getText());
						btnten.setText("");
						col++;
					}
					if (array[13]==0){
						array[13]=array[9];
						array[9]=0;
						btnfr.setText(btnten.getText());
						btnten.setText("");
						col++;
					}
			    }}
	
   }
   });
		btnten.setBackground(Color.WHITE);
		btnten.setFont(new Font("Tahoma",Font.BOLD,20));
		btnten.setBounds(71,172,70,60);
		frame.getContentPane().add(btnten);
 /*------------------------"11"-----------------------*/   
		btnel.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(btnNewButton2.getText()=="STOP"){
						 if (array[10]==0){
				} else{
					if (array[6]==0){
						array[6]=array[10];
						array[10]=0;
						btn7.setText(btnel.getText());
						btnel.setText("");
						col++;
					}
					if (array[9]==0){
						array[9]=array[10];
						array[10]=0;
						btnten.setText(btnel.getText());
						btnel.setText("");
						col++;
					}
					if (array[11]==0){
						array[11]=array[10];
						array[10]=0;
						btntw.setText(btnel.getText());
						btnel.setText("");
						col++;
					}
					if (array[14]==0){
						array[14]=array[10];
						array[10]=0;
						btnft.setText(btnel.getText());
						btnel.setText("");
						col++;
					}
			    }}
  }
   });
		btnel.setBackground(Color.WHITE);
		btnel.setFont(new Font("Tahoma",Font.BOLD,20));
		btnel.setBounds(142,172,70,60);
		frame.getContentPane().add(btnel);
 /*------------------------"12"-----------------------*/   
		btntw.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(btnNewButton2.getText()=="STOP"){
					 if (array[11]==0){
				} else{
					if (array[7]==0){
						array[7]=array[11];
						array[11]=0;
						btn8.setText(btntw.getText());
						btntw.setText("");
						col++;
					}
					if (array[10]==0){
						array[10]=array[11];
						array[11]=0;
						btnel.setText(btntw.getText());
						btntw.setText("");
						col++;
					}
                   if (array[15]==0){
						array[15]=array[11];
						array[11]=0;
						btn.setText(btntw.getText());
						btntw.setText("");
						col++;
					}
			    }}
 }
   });
		btntw.setBackground(Color.WHITE);
		btntw.setFont(new Font("Tahoma",Font.BOLD,20));
		btntw.setBounds(213,172,70,60);
		frame.getContentPane().add(btntw);
 /*------------------------"13"-----------------------*/   
			btnth.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(btnNewButton2.getText()=="STOP"){
					 if (array[12]==0){
				} else{
					if (array[8]==0){
						array[8]=array[12];
						array[12]=0;
						btn9.setText(btnth.getText());
						btnth.setText("");
						col++;
					}
					if (array[13]==0){
						array[13]=array[12];
						array[12]=0;
						btnfr.setText(btnth.getText());
						btnth.setText("");
						col++;
					}
			    }}

   }
   });
		btnth.setBackground(Color.WHITE);
		btnth.setFont(new Font("Tahoma",Font.BOLD,20));
		btnth.setBounds(0,233,70,60);
		frame.getContentPane().add(btnth);
 /*------------------------"14"-----------------------*/   
		btnfr.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(btnNewButton2.getText()=="STOP"){
			if (array[13]==0){
				} else{
					if (array[12]==0){
						array[12]=array[13];
						array[13]=0;
						btnth.setText(btnfr.getText());
						btnfr.setText("");
						col++;
					}
					if (array[9]==0){
						array[9]=array[13];
						array[13]=0;
						btnten.setText(btnfr.getText());
						btnfr.setText("");
						col++;
					}
					if (array[14]==0){
						array[14]=array[13];
						array[13]=0;
						btnft.setText(btnfr.getText());
						btnfr.setText("");
						col++;
					}
			    }}
 }
   });
		btnfr.setBackground(Color.WHITE);
		btnfr.setFont(new Font("Tahoma",Font.BOLD,20));
		btnfr.setBounds(71,233,70,60);
		frame.getContentPane().add(btnfr);
 /*------------------------"15"-----------------------*/   
		btnft.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			if(btnNewButton2.getText()=="STOP"){		
			if (array[14]==0){
				} else{
					if (array[13]==0){
						array[13]=array[14];
						array[14]=0;
						btnfr.setText(btnft.getText());
						btnft.setText("");
						col++;
					}
					
					if (array[10]==0){
						array[10]=array[14];
						array[14]=0;
						btnel.setText(btnft.getText());
						btnft.setText("");
						col++;
					}
					if (array[15]==0){
						array[15]=array[14];
						array[14]=0;
						btn.setText(btnft.getText());
						btnft.setText("");
						col++;
					}
			    }}
			if(See()==true){
				btnNewButton2.setText("START");
				String msg;
				msg="You Win";
				String msg2;
				msg2=Integer.toString(col/2);
				JOptionPane.showMessageDialog(frame,msg+"\n"+"Making moves:"+ msg2+"\n"+"Time: "+m2+i2+":"+m+i);
			};
   }
   });
		btnft.setBackground(Color.WHITE);
		btnft.setFont(new Font("Tahoma",Font.BOLD,20));
		btnft.setBounds(142,233,70,60);
		frame.getContentPane().add(btnft);
JButton btnNewButton3 = new JButton("SAVE");
		btnNewButton3.setBackground(Color.WHITE);
		btnNewButton3.setForeground(Color.RED);
btnNewButton3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
 try { 
		File file = new File("file.txt"); 
			FileWriter fw = new FileWriter(file); 
			for(int y = 0; y < 16; y++){
		fw.write(array[y]+" ");
			fw.flush();
			} 
	fw.close(); 
		} catch (IOException error) { }
	 try { 
		 timearr[0]=m2;
			timearr[1]=i2;
			timearr[2]=m;
			timearr[3]=i;
			File file2 = new File("file2.txt"); 
			
			FileWriter fw = new FileWriter(file2); 
			for(int y=0;y<4;y++){
				fw.write(timearr[y]+" ");
				fw.flush();}   
			fw.close(); 
		} catch (IOException error) { }
	 try { 
		 coll[0]=col;
			File file5 = new File("file5.txt"); 
			FileWriter fw5= new FileWriter(file5); 
			fw5.write(coll[0]+" ");
				fw5.flush();  
			fw5.close(); 
		} catch (IOException error) { }

/*RandomAccessFile wr2 = new RandomAccessFile("file3.txt","rw");
		wr2.seek(wr2.length());
	wr2.write(("\n"+txtregð.getText()).getBytes());
	wr2.close();*/
 }
});
btnNewButton3.setBounds(95 , 325, 89, 23);
frame.getContentPane().add(btnNewButton3);
	}
	}
	