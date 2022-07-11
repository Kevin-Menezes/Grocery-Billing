import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class GroceryBilling extends Applet implements ActionListener 
{
	
	float quant,sum,rate1=150,rate2=40,rate3=140,rate4=60,stock1=30,stock2=20,stock3=20,stock4=30,bill1=0,bill2=0,bill3=0,bill4=0,d1=0,d2=0,d3=0,d4=0;
	float dbill1=0,dbill2=0,dbill3=0,dbill4=0,dsum,c1=0,c2=0,c3=0,c4=0,csum;
	float cp1=100,cp2=25,cp3=100,cp4=30,profit1=0,profit2=0,profit3=0,profit4=0,psum,dayprofit=0,daycommission=0;
	float q1=0,q2=0,q3=0,q4=0,gst=0,finalsum=0;
	
//---------------------------------------------------------------------LABELS----------------------------------------------------------------------------------------------------------
	
	Label gb = new Label("-----------------------------------GROCERY BILL-----------------------------------");
	Label pass = new Label("  Password : ");
	
	Label title1 = new Label("        ITEMS");
	Label l1 = new Label(" BASMATI RICE");
	Label l2 = new Label("       SUGAR");
	Label l3 = new Label("     TOOR DAL");
	Label l4 = new Label("         ATTA");
	
	Label title2 = new Label(" COST/KG");	
	Label title3 = new Label(" AVAILABILITY");	
	Label title4 = new Label(" QUANTITY");	
	Label title6 = new Label(" DISCOUNT");
	Label title5 = new Label("   TOTAL");
	
	Label title8 = new Label("COST PRICE");
	Label title9 = new Label("PROFIT");
	
	Label title7 = new Label("COMMISSION");
	
	Label msg = new Label("WELCOME!");
	Label msg1 = new Label();
	Label msg2 = new Label();
	Label msg3 = new Label();
	Label msg4 = new Label();
	
	
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------TEXTFIELD----------------------------------------------------------------------------------------------------------
	
		
	TextField p = new TextField();
	
	TextField rt1 = new TextField("150",5);
	TextField rt2 = new TextField("40",5);
	TextField rt3 = new TextField("140",5);
	TextField rt4 = new TextField("60",5);
	
	TextField avat1 = new TextField("30",5);
	TextField avat2 = new TextField("20",5);
	TextField avat3 = new TextField("20",5);
	TextField avat4 = new TextField("30",5);
	
	TextField t1 = new TextField(5);
	TextField t3 = new TextField(5);
	TextField t5 = new TextField(5);
	TextField t7 = new TextField(5);
	
	TextField dis1 = new TextField(5);
	TextField dis2 = new TextField(5);
	TextField dis3 = new TextField(5);
	TextField dis4 = new TextField(5);
	
	TextField t2 = new TextField(8);
	TextField t4 = new TextField(8);
	TextField t6 = new TextField(8);
	TextField t8 = new TextField(8);
	
	TextField com1 = new TextField(8);
	TextField com2 = new TextField(8);
	TextField com3 = new TextField(8);
	TextField com4 = new TextField(8);
	
	TextField cop1 = new TextField("100",5);
	TextField cop2 = new TextField("25",5);
	TextField cop3 = new TextField("100",5);
	TextField cop4 = new TextField("30",5);
	
	
	TextField prof1 = new TextField(8);
	TextField prof2 = new TextField(8);
	TextField prof3 = new TextField(8);
	TextField prof4 = new TextField(8);
	
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	
//---------------------------------------------------------------------BUTTONS----------------------------------------------------------------------------------------------------------	
	
	
	Button b1 = new Button("+CART");
	Button b2 = new Button("+CART");
	Button b3 = new Button("+CART");
	Button b4 = new Button("+CART");
	
	
	Button upda = new Button("UPDATE");
	Button total = new Button("GRAND TOTAL");
	Button proc = new Button("PROCEED");
	Button next = new Button("NEXT CUSTOMER");
	
	
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	

//---------------------------------------------------------------------COLORS----------------------------------------------------------------------------------------------------------		
	
	
	Color steelblue = new Color(70,130,180);
	Color darkcyan = new Color(0,139,139);
	Color powderblue = new Color(176,224,230);
	Color dsg = new Color(65,105,225);
	Color lavender = new Color(230,230,250);
		
	
	
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	

	
//---------------------------------------------------------------------FONTS----------------------------------------------------------------------------------------------------------	

	Font font1 = new Font("Times New Roman",Font.BOLD,50);
	Font font2 = new Font("Arial",Font.BOLD,20);
	Font font3 = new Font("Times New Roman",Font.BOLD,25);
	Font font4 = new Font("Times New Roman",Font.ITALIC,25);
	Font font5 = new Font("Times New Roman",Font.BOLD,40);
	Font font6 = new Font("Arial",Font.BOLD,16);
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
	
//---------------------------------------------------------------------FUNCTIONS----------------------------------------------------------------------------------------------------------		
	
	
	
	
	public void init()
	{
		setLayout(null);
		
		// ---GROCERY BILL----
		add(gb);
		gb.setBounds(9,29,1583,90);
		gb.setBackground(steelblue);
		gb.setFont(font1);
		
		// PASSWORD
		add(pass);
		pass.setBounds(520,170,140,40);
		pass.setBackground(darkcyan);
		pass.setFont(font2);
		
		add(p);
		p.setBounds(680,170,400,40);
		p.setBackground(darkcyan);
		p.setFont(font2);
		p.setEchoChar('*');
		
		
		
		// FIRST ROW--------------------------------------------------------------------------------------------------------
		add(title1);
		title1.setBounds(30,250,200,50);
		title1.setBackground(steelblue);
		title1.setFont(font3);
		
		add(title2);
		title2.setBounds(250,250,130,50);
		title2.setBackground(steelblue);
		title2.setFont(font3);
		
		add(title3);
		title3.setBounds(400,250,190,50);
		title3.setBackground(steelblue);
		title3.setFont(font3);
		
		add(title4);
		title4.setBounds(610,250,150,50);
		title4.setBackground(steelblue);
		title4.setFont(font3);
		
		add(title6);
		title6.setBounds(780,250,150,50);
		title6.setBackground(steelblue);
		title6.setFont(font3);
		
		add(title5);
		title5.setBounds(950,250,130,50);
		title5.setBackground(steelblue);
		title5.setFont(font3);
		
		add(title8);
		title8.setBounds(1220,250,110,50);
		title8.setBackground(Color.black);
		title8.setForeground(Color.white);
		title8.setFont(font6);
		
		
		
		add(title9);
		title9.setBounds(1350,250,80,50);
		title9.setBackground(Color.black);
		title9.setForeground(Color.white);
		title9.setFont(font2);
		
		
		
		add(title7);
		title7.setBounds(1450,250,135,50);
		title7.setBackground(Color.black);
		title7.setForeground(Color.white);
		title7.setFont(font2);
		
		
		
		
		// SECOND ROW--------------------------------------------------------------------------------------------------------
		add(l1);
		l1.setBounds(30,320,200,30);
		l1.setBackground(steelblue);
		l1.setFont(font4);
		
		add(rt1);
		rt1.setBounds(250,320,130,30);
		rt1.setBackground(powderblue);
		rt1.setFont(font2);
		rt1.setEditable(false);
		
		add(avat1);
		avat1.setBounds(400,320,190,30);
		avat1.setBackground(powderblue);
		avat1.setFont(font2);
		avat1.setEditable(false);
		
		add(t1);
		t1.setBounds(610,320,150,30);
		t1.setBackground(powderblue);
		t1.setFont(font2);
		
		add(dis1);
		dis1.setBounds(780,320,150,30);
		dis1.setBackground(powderblue);
		dis1.setFont(font2);
		dis1.setEditable(false);
		
		add(t2);
		t2.setBounds(950,320,130,30);
		t2.setBackground(powderblue);
		t2.setFont(font2);
		
		add(b1);
		b1.setBounds(1100,320,80,30);
		b1.setBackground(steelblue);
		b1.setFont(font2);
		
		add(cop1);
		cop1.setBounds(1235,320,80,30);
		cop1.setBackground(darkcyan);
		cop1.setFont(font2);
		cop1.setEditable(false);
		cop1.setVisible(false);
		
		add(prof1);
		prof1.setBounds(1350,320,80,30);
		prof1.setBackground(darkcyan);
		prof1.setFont(font2);
		prof1.setEditable(false);
		prof1.setVisible(false);
		
		add(com1);
		com1.setBounds(1450,320,135,30);
		com1.setBackground(darkcyan);
		com1.setFont(font2);
		com1.setEditable(false);
		com1.setVisible(false);
		
	
	
		// THIRD ROW--------------------------------------------------------------------------------------------------------	
			
		add(l2);
		l2.setBounds(30,370,200,30);
		l2.setBackground(steelblue);
		l2.setFont(font4);
		
		add(rt2);
		rt2.setBounds(250,370,130,30);
		rt2.setBackground(powderblue);
		rt2.setFont(font2);
		rt2.setEditable(false);
		
		add(avat2);
		avat2.setBounds(400,370,190,30);
		avat2.setBackground(powderblue);
		avat2.setFont(font2);
		avat2.setEditable(false);
		
		add(t3);
		t3.setBounds(610,370,150,30);
		t3.setBackground(powderblue);
		t3.setFont(font2);
		
		add(dis2);
		dis2.setBounds(780,370,150,30);
		dis2.setBackground(powderblue);
		dis2.setFont(font2);
		dis2.setEditable(false);
		
		
		add(t4);
		t4.setBounds(950,370,130,30);
		t4.setBackground(powderblue);
		t4.setFont(font2);
		
		add(b2);
		b2.setBounds(1100,370,80,30);
		b2.setBackground(steelblue);
		b2.setFont(font2);	
		
		add(cop2);
		cop2.setBounds(1235,370,80,30);
		cop2.setBackground(darkcyan);
		cop2.setFont(font2);	
		cop2.setEditable(false);
		cop2.setVisible(false);
		
		add(prof2);
		prof2.setBounds(1350,370,80,30);
		prof2.setBackground(darkcyan);
		prof2.setFont(font2);	
		prof2.setEditable(false);
		prof2.setVisible(false);
		
		add(com2);
		com2.setBounds(1450,370,135,30);
		com2.setBackground(darkcyan);
		com2.setFont(font2);	
		com2.setEditable(false);
		com2.setVisible(false);
		
		
			
			
		// FOURTH ROW--------------------------------------------------------------------------------------------------------	
			
		add(l3);
		l3.setBounds(30,420,200,30);
		l3.setBackground(steelblue);
		l3.setFont(font4);
		
		add(rt3);
		rt3.setBounds(250,420,130,30);
		rt3.setBackground(powderblue);
		rt3.setFont(font2);
		rt3.setEditable(false);
		
		add(avat3);
		avat3.setBounds(400,420,190,30);
		avat3.setBackground(powderblue);
		avat3.setFont(font2);
		avat3.setEditable(false);
		
		add(t5);
		t5.setBounds(610,420,150,30);
		t5.setBackground(powderblue);
		t5.setFont(font2);
		
		add(dis3);
		dis3.setBounds(780,420,150,30);
		dis3.setBackground(powderblue);
		dis3.setFont(font2);
		dis3.setEditable(false);
		
		add(t6);
		t6.setBounds(950,420,130,30);
		t6.setBackground(powderblue);
		t6.setFont(font2);
		
		add(b3);
		b3.setBounds(1100,420,80,30);
		b3.setBackground(steelblue);
		b3.setFont(font2);	

		add(cop3);
		cop3.setBounds(1235,420,80,30);
		cop3.setBackground(darkcyan);
		cop3.setFont(font2);	
		cop3.setEditable(false);
		cop3.setVisible(false);
		
		add(prof3);
		prof3.setBounds(1350,420,80,30);
		prof3.setBackground(darkcyan);
		prof3.setFont(font2);	
		prof3.setEditable(false);
		prof3.setVisible(false);
		
		
		add(com3);
		com3.setBounds(1450,420,135,30);
		com3.setBackground(darkcyan);
		com3.setFont(font2);	
		com3.setEditable(false);
		com3.setVisible(false);
			
			
		// FIFTH ROW--------------------------------------------------------------------------------------------------------

		add(l4);
		l4.setBounds(30,470,200,30);
		l4.setBackground(steelblue);
		l4.setFont(font4);
		
		add(rt4);
		rt4.setBounds(250,470,130,30);
		rt4.setBackground(powderblue);
		rt4.setFont(font2);
		rt4.setEditable(false);
		
		add(avat4);
		avat4.setBounds(400,470,190,30);
		avat4.setBackground(powderblue);
		avat4.setFont(font2);
		avat4.setEditable(false);
		
		add(t7);
		t7.setBounds(610,470,150,30);
		t7.setBackground(powderblue);
		t7.setFont(font2);
		
		add(dis4);
		dis4.setBounds(780,470,150,30);
		dis4.setBackground(powderblue);
		dis4.setFont(font2);
		dis4.setEditable(false);
		
		add(t8);
		t8.setBounds(950,470,130,30);
		t8.setBackground(powderblue);
		t8.setFont(font2);
		
		add(b4);
		b4.setBounds(1100,470,80,30);
		b4.setBackground(steelblue);
		b4.setFont(font2);	
		
		
		add(cop4);
		cop4.setBounds(1235,470,80,30);
		cop4.setBackground(darkcyan);
		cop4.setFont(font2);
		cop4.setEditable(false);
		cop4.setVisible(false);
		
		add(prof4);
		prof4.setBounds(1350,470,80,30);
		prof4.setBackground(darkcyan);
		prof4.setFont(font2);
		prof4.setEditable(false);
		prof4.setVisible(false);
			
		

		add(com4);
		com4.setBounds(1450,470,135,30);
		com4.setBackground(darkcyan);
		com4.setFont(font2);
		com4.setEditable(false);
		com4.setVisible(false);
			
			
		// DOWN BUTTONS----------------------------------------------------------------------------------------------------------
		
			
		add(upda);
		upda.setBounds(60,530,200,60);	
		upda.setBackground(Color.black);
		upda.setForeground(Color.white);
		upda.setFont(font5);
	
		add(total);
		total.setBounds(280,530,330,60);	
		total.setBackground(Color.black);
		total.setForeground(Color.white);		
		total.setFont(font5);	
			
		add(proc);
		proc.setBounds(630,530,230,60);	
		proc.setBackground(Color.black);	
		proc.setForeground(Color.white);
		proc.setFont(font5);		
			
		add(next);
		next.setBounds(880,530,370,60);	
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(font5);	
		
		
		// MESSAGE LABELS------------------------------------------------------------------------------------------------------------
		
		add(msg);
		msg.setBounds(30,630,1553,30);
		msg.setBackground(lavender);
		msg.setFont(font4);
		
		add(msg1);
		msg1.setBounds(30,670,1553,30);
		msg1.setBackground(lavender);
		msg1.setFont(font4);
		
		add(msg2);
		msg2.setBounds(1360,520,220,30);
		msg2.setBackground(lavender);
		msg2.setFont(font2);
		msg2.setVisible(false);
		
		
		add(msg3);
		msg3.setBounds(1360,570,200,30);
		msg3.setBackground(lavender);
		msg3.setFont(font2);
		msg3.setVisible(false);
		
		add(msg4);
		msg4.setBounds(30,720,1553,30);
		msg4.setBackground(lavender);
		msg4.setFont(font2);
		msg4.setVisible(false);
		
		
		
				
		// ADDING ACTION LISTENER----------------------------------------------------------------------------------------------------------
		
		b1.addActionListener(this);	
		b2.addActionListener(this);		
		b3.addActionListener(this);		
		b4.addActionListener(this);		
			
		upda.addActionListener(this);		
		total.addActionListener(this);		
		proc.addActionListener(this);		
		next.addActionListener(this);	
		
		
	}
	
	
	
	


//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	public void actionPerformed(ActionEvent ae)
	{	
		String password = p.getText();
		
		
		
		
		// ADMIN MODE-------------------------------------------------------------------------------------------
		if(ae.getSource() == upda)
		{
			msg1.setText("");
			msg2.setText("");
			msg3.setText("");
			msg4.setText("");
			
			if((password).equals("nivek"))
			{
				cop1.setVisible(true);prof1.setVisible(true);com1.setVisible(true);
				cop2.setVisible(true);prof2.setVisible(true);com2.setVisible(true);
				cop3.setVisible(true);prof3.setVisible(true);com3.setVisible(true);
				cop4.setVisible(true);prof4.setVisible(true);com4.setVisible(true);
				
				
				msg2.setVisible(true);msg3.setVisible(true);msg4.setVisible(true);
				
				
				msg.setText("ADMIN MODE!!  RATES, AVAILABILITY, DISCOUNT AND COST PRICE CAN BE UPDATED!!");	
				
				float x1,x2,x3,x4;
				String y1,y2,y3,y4;
				
				float j1,j2,j3,j4;
				String k1,k2,k3,k4;
				
				float m1,m2,m3,m4;
				String n1,n2,n3,n4;
				
				float a1,a2,a3,a4;
				String b1,b2,b3,b4;
				
				cop1.setEditable(true);cop2.setEditable(true);cop2.setEditable(true);cop2.setEditable(true); //CHANGING COST PRICE
				
				// CHANGING RATES-------------------------------------------------------------------------------
				rt1.setEditable(true);
				y1 = rt1.getText();
				x1 = Float.parseFloat(y1);
				rate1=x1;
	
	
				rt2.setEditable(true);
				y2 = rt2.getText();
				x2 = Float.parseFloat(y2);
				rate2=x2;
	
	
				rt3.setEditable(true);
				y3 = rt3.getText();
				x3 = Float.parseFloat(y3);
				rate3=x3;
	
	
				rt4.setEditable(true);
				y4 = rt4.getText();
				x4 = Float.parseFloat(y4);
				rate4=x4;
	
	
				// CHANGING AVAILABILITY-------------------------------------------------------------------------------
				avat1.setEditable(true);
				k1 = avat1.getText();
				j1 = Float.parseFloat(k1);
				stock1=j1;
				
				avat2.setEditable(true);
				k2 = avat2.getText();
				j2 = Float.parseFloat(k2);
				stock2=j2;
				
				avat3.setEditable(true);
				k3 = avat3.getText();
				j3 = Float.parseFloat(k3);
				stock3=j3;
				
				avat4.setEditable(true);
				k4 = avat4.getText();
				j4 = Float.parseFloat(k4);
				stock4=j4;
	
				
				
				
				// CHANGING DISCOUNT-----------------------------------------------------------------------------------------
				
				dis1.setEditable(true);dis2.setEditable(true);dis3.setEditable(true);dis4.setEditable(true);
				n1= dis1.getText();
				m1=Float.parseFloat(n1);
				d1=m1;
				
				
				n2= dis2.getText();
				m2=Float.parseFloat(n2);
				d2=m2;
				
				
				n3= dis3.getText();
				m3=Float.parseFloat(n3);
				d3=m3;
				
				
				n4= dis4.getText();
				m4=Float.parseFloat(n4);
				d4=m4;
				
				
				// CHANGING COST PRICE-----------------------------------------------------------------------------------------
				
				
				b1=cop1.getText();
				a1=Float.parseFloat(b1);
				cp1=a1;
				
				b2=cop2.getText();
				a2=Float.parseFloat(b2);
				cp2=a2;
				
				b3=cop3.getText();
				a3=Float.parseFloat(b3);
				cp3=a3;
				
				b4=cop4.getText();
				a4=Float.parseFloat(b4);
				cp4=a4;
				
				
				
				
			}
			else
			{
				
				msg.setText("USER CANNOT UPDATE!!  ENTER CORRECT PASSWORD OR CONTACT ADMIN!!");
				msg2.setText("");
				msg3.setText("");
				msg4.setText("");
				
			}
			
			rt1.setText(Float.toString(rate1));
			rt2.setText(Float.toString(rate2));
			rt3.setText(Float.toString(rate3));
			rt4.setText(Float.toString(rate4));
			
			avat1.setText(Float.toString(stock1));
			avat2.setText(Float.toString(stock2));
			avat3.setText(Float.toString(stock3));
			avat4.setText(Float.toString(stock4));
			
			dis1.setText(Float.toString(d1));
			dis2.setText(Float.toString(d2));
			dis3.setText(Float.toString(d3));
			dis4.setText(Float.toString(d4));
			
			cop1.setText(Float.toString(cp1));
			cop2.setText(Float.toString(cp2));
			cop3.setText(Float.toString(cp3));
			cop4.setText(Float.toString(cp4));
			
		}
		
		
		// GRAND TOTAL-----------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		if(ae.getSource()==total)
		{
			sum = bill1+bill2+bill3+bill4;
			dsum = dbill1+dbill2+dbill3+dbill4;
			csum = c1+c2+c3+c4;
			psum = profit1+profit2+profit3+profit4;
			
			dayprofit=dayprofit+psum;
			daycommission=daycommission+csum;
			
			msg.setText("MRP AMOUNT = "+sum+" rupees");
			
			msg1.setText("GRAND TOTAL AFTER DISCOUNT = "+dsum+" rupees");
			
			msg2.setText("TOTAL COMMISSION");		
			
			msg3.setText("         "+csum+" rupees");
			
			msg4.setText("PROFIT = "+psum+" rupees      TOTAL PROFIT EARNED IN THE DAY = "+dayprofit+" rupees      TOTAL COMMISSION GIVEN IN THE DAY = "+daycommission+" rupees");
		}	



		// PROCEED----------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		if(ae.getSource() == proc)
		{
			t1.setText("");t2.setText("");t3.setText("");t4.setText("");
			t5.setText("");t6.setText("");t7.setText("");t8.setText("");
			com1.setText("");com2.setText("");com3.setText("");com4.setText("");
			prof1.setText("");prof2.setText("");prof3.setText("");prof4.setText("");
			
			sum = bill1+bill2+bill3+bill4;
			dsum = dbill1+dbill2+dbill3+dbill4;
			gst= (dsum*5)/100;
			finalsum=gst+dsum;

			msg.setText("PAYMENT OF "+finalsum+" rupees SUCCESSFUL! THANKS FOR SHOPPING!");
			msg1.setText("");
			msg2.setText("");
			msg3.setText("");
			msg4.setText("");
			
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("                                KM STORES");
			System.out.println("------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("   ITEMS                QTY     RATE       DISCOUNT%     AMOUNT ");         
			System.out.println(" ");
			System.out.println(" BASMATI RICE           "+q1+"     "+rate1+"        "+d1+"          "+dbill1);
			System.out.println(" ");
			System.out.println("   SUGAR                "+q2+"     "+rate2+"         "+d2+"          "+dbill2);
			System.out.println(" ");
			System.out.println("  TOOR DAL              "+q3+"     "+rate3+"        "+d3+"          "+dbill3);
			System.out.println(" ");
			System.out.println("    AATA                "+q4+"     "+rate4+"         "+d4+"          "+dbill4);
			System.out.println(" ");
			System.out.println("               ---------------------------------------------------------");
			System.out.println(" ");
			System.out.println("                                    SUB TOTAL :     "+dsum);
			System.out.println("                                    G.S.T @5% :     "+gst);
			
			System.out.println("               ---------------------------------------------------------");
			System.out.println(" ");
			System.out.println("                                  FINAL TOTAL :     "+finalsum);
			System.out.println(" ");
			System.out.println("------------------------------------------------------------------------");
			System.out.println("                       THANK YOU!  VISIT AGAIN!");
		}

		
		// NEXT CUSTOMER----------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		if(ae.getSource() == next)
		{
			t1.setText("");t2.setText("");t3.setText("");t4.setText("");
			t5.setText("");t6.setText("");t7.setText("");t8.setText("");p.setText("");
			prof1.setText("");prof2.setText("");prof3.setText("");prof4.setText("");
			com1.setText("");com2.setText("");com3.setText("");com4.setText("");
			
			
			rt1.setEditable(false); // REMOVING EDITABILITY
			rt2.setEditable(false);
			rt3.setEditable(false);
			rt4.setEditable(false);
			
			avat1.setEditable(false);
			avat2.setEditable(false);
			avat3.setEditable(false);
			avat4.setEditable(false);
			
			dis1.setEditable(false);
			dis2.setEditable(false);
			dis3.setEditable(false);
			dis4.setEditable(false);
			
			cop1.setEditable(false);
			cop2.setEditable(false);
			cop3.setEditable(false);
			cop4.setEditable(false);
			
			
				cop1.setVisible(false);prof1.setVisible(false);com1.setVisible(false);  //REMOVING VISIBILITY
				cop2.setVisible(false);prof2.setVisible(false);com2.setVisible(false);
				cop3.setVisible(false);prof3.setVisible(false);com3.setVisible(false);
				cop4.setVisible(false);prof4.setVisible(false);com4.setVisible(false);
				
				
				msg2.setVisible(false);msg3.setVisible(false);msg4.setVisible(false);
			
			
			
		
			msg.setText("WELCOME! WHAT WOULD U LIKE TO PURCHASE!");
			msg1.setText("");
			msg2.setText("");
			msg3.setText("");
			msg4.setText("");

		}
		
		
			
		
		// ADD TO CART----------------------------------------------------------------------------------------------------------------------------------------------------------------		
	
		if(ae.getSource()==b1)				//when b1 buttonn is pressed
		{	
		
			msg1.setText("");
			msg2.setText("");
			msg3.setText("");
			msg4.setText("");
			
			String s1 = t1.getText();      //taking the quantity of product from user
			quant = Float.parseFloat(s1);       //converting the string to Float
			q1=quant;
			
			if(quant<1)  //not allowing negative no.
			{
				msg.setText("QUANTITY CANNOT BE NULL OR A NEGATIVE NUMBER");
				
				t1.setText("");
				t2.setText("");
				
			}
			
			else
			{

			
				if((stock1-quant)<0)  //checking if the stock is greater than the quantity
				{
					msg.setText("THIS MUCH STOCK OF RICE NOT AVAILABLE. RE-ENTER QUANTITY ACCORDING TO THE AVAILABILITY!");
					quant = 0;
					t1.setText(Float.toString(quant));   //converting Float to string
				}
				else
				{
					msg.setText(" ");
					stock1=stock1-quant;
					avat1.setText(Float.toString(stock1));
					msg.setText("STOCK OF BASMATI RICE IS AVAILABLE!");
					
				}
				bill1 = quant*rate1;                   //quantity of product multiply its rate
				
			
			//------------------------------------------------------------------------------------------------------------------
				dbill1 = bill1-((bill1*d1)/100);      //discount
				t2.setText(Float.toString(dbill1));
				
			//-------------------------------------------------------------------------------------------------------------------
			
				
			
				if(quant>0 && quant<=20)   //commission
				{
					
					c1 = (dbill1*5)/100;
					com1.setText(Float.toString(c1));
				}
				else if(quant>20 && quant<=40)
				{
					c1 = (dbill1*10)/100;
					com1.setText(Float.toString(c1));
				}
				else if(quant>40 && quant<=60)
				{
					c1 = (dbill1*15)/100;
					com1.setText(Float.toString(c1));
				}
				else
				{
					c1 = (dbill1*30)/100;
					com1.setText(Float.toString(c1));
				}
				
			//-----------------------------------------------------------------------------------------	
				
				profit1= dbill1-cp1*quant-c1;  //profit
				prof1.setText(Float.toString(profit1));
				
				
				
			}
		}
		
		
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		if(ae.getSource()==b2)
		{
			msg1.setText("");
			msg2.setText("");
			msg3.setText("");
			msg4.setText("");
			
			String s2 = t3.getText();      //taking the quantity of product from user
			quant = Float.parseFloat(s2);       //converting the string to Float
			q2=quant;
			
			if(quant<1)
			{
				msg.setText("QUANTITY CANNOT BE NULL OR A NEGATIVE NUMBER");
				
				t3.setText("");
				t4.setText("");
				
			}
			
			else
			{

			
				if((stock2-quant)<0)  
				{
					msg.setText("THIS MUCH STOCK OF SUGAR NOT AVAILABLE. RE-ENTER QUANTITY ACCORDING TO THE AVAILABILITY!");
					quant = 0;
					t3.setText(Float.toString(quant));   //converting Float to string
				}
				else
				{
					msg.setText(" ");
					stock2=stock2-quant;
					avat2.setText(Float.toString(stock2));
					msg.setText("STOCK OF SUGAR IS AVAILABLE!");
					
				}
				bill2 = quant*rate2;                   //quantity of product multiply its rate
				
				//-------------------------------------------------------------------------------------------
				
				dbill2 = bill2-((bill2*d2)/100);  //discount
				t4.setText(Float.toString(dbill2));
			
				//------------------------------------------------------------------------------------------
			
				//-------------------------------------------------------------------------------------------------------------------
			
				if(quant>0 && quant<=20)   //commission
				{
					
					c2 = (dbill2*5)/100;
					com2.setText(Float.toString(c2));
				}
				else if(quant>20 && quant<=40)
				{
					c2 = (dbill2*10)/100;
					com2.setText(Float.toString(c2));
				}
				else if(quant>40 && quant<=60)
				{
					c2 = (dbill2*15)/100;
					com2.setText(Float.toString(c2));
				}
				else
				{
					c2 = (dbill2*30)/100;
					com2.setText(Float.toString(c2));
				}
				
			//-----------------------------------------------------------------------------------------------------------

				profit2= dbill2-cp2*quant-c2;  //profit
				prof2.setText(Float.toString(profit2));
			
			}
		}	
			
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
					
		if(ae.getSource()==b3)
		{
			msg1.setText("");
			msg2.setText("");
			msg3.setText("");
			msg4.setText("");
			
			String s3 = t5.getText();      //taking the quantity of product from user
			quant = Float.parseFloat(s3);       //converting the string to Float
			q3=quant;
			
			if(quant<1)
			{
				msg.setText("QUANTITY CANNOT BE NULL OR A NEGATIVE NUMBER");
				
				t5.setText("");
				t6.setText("");
				
			}
			
			else
			{

			
				if((stock3-quant)<0)
				{
					msg.setText("THIS MUCH STOCK OF DAL NOT AVAILABLE. RE-ENTER QUANTITY ACCORDING TO THE AVAILABILITY!");
					quant = 0;
					t5.setText(Float.toString(quant));   //converting Float to string
				}
				else
				{
					msg.setText(" ");
					stock3=stock3-quant;
					avat3.setText(Float.toString(stock3));
					msg.setText("STOCK OF TOOR DAL IS AVAILABLE!");
					
				}
				bill3 = quant*rate3;                   //quantity of product multiply its rate
				
				//-----------------------------------------------------------------------------------------------------------------
				dbill3 = bill3-((bill3*d3)/100); //discount
				t6.setText(Float.toString(dbill3));
			
				//-------------------------------------------------------------------------------------------------------------------
			
				if(quant>0 && quant<=20)   //commission
				{
					
					c3 = (dbill3*5)/100;
					com3.setText(Float.toString(c3));
				}
				else if(quant>20 && quant<=40)
				{
					c3 = (dbill3*10)/100;
					com3.setText(Float.toString(c3));
				}
				else if(quant>40 && quant<=60)
				{
					c3 = (dbill3*15)/100;
					com3.setText(Float.toString(c3));
				}
				else
				{
					c3 = (dbill3*30)/100;
					com3.setText(Float.toString(c3));
				}
				
			//---------------------------------------------------------------------------------------------------------------------	
				profit3= dbill3-cp3*quant-c3;  //profit
				prof3.setText(Float.toString(profit3));
			
			}
			
			
			
		}		
			
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
								
		if(ae.getSource()==b4)
		{
			msg1.setText("");
			msg2.setText("");
			msg3.setText("");
			msg4.setText("");
			
			String s4 = t7.getText();      //taking the quantity of product from user
			quant = Float.parseFloat(s4);       //converting the string to Float
			q4=quant;
			
			if(quant<1)
			{
				msg.setText("QUANTITY CANNOT BE NULL OR A NEGATIVE NUMBER");
				
				t7.setText("");
				t8.setText("");
				
			}
			
			else
			{
				
				if((stock4-quant)<0)
				{
					msg.setText("THIS MUCH STOCK OF ATTA NOT AVAILABLE. RE-ENTER QUANTITY ACCORDING TO THE AVAILABILITY!");
					quant = 0;
					t7.setText(Float.toString(quant));   //converting Float to string
				}
				else
				{
					msg.setText(" ");
					stock4=stock4-quant;
					avat4.setText(Float.toString(stock4));
					msg.setText("STOCK OF ATTA IS AVAILABLE!");
					
				}
				bill4 = quant*rate4;                   //quantity of product multiply its rate
				
				
				//--------------------------------------------------------------------------
				dbill4 = bill4-((bill4*d4)/100);  //discount
				t8.setText(Float.toString(dbill4));
				
				//-------------------------------------------------------------------------------------------------------------------
			
				if(quant>0 && quant<=20)   //commission
				{
					
					c4 = (dbill4*5)/100;
					com4.setText(Float.toString(c4));
				}
				else if(quant>20 && quant<=40)
				{
					c4 = (dbill4*10)/100;
					com4.setText(Float.toString(c4));
				}
				else if(quant>40 && quant<=60)
				{
					c4 = (dbill4*15)/100;
					com4.setText(Float.toString(c4));
				}
				else
				{
					c4 = (dbill4*30)/100;
					com4.setText(Float.toString(c4));
				}
				
				
			//------------------------------------------------------------------------------------------------------------------------	
				profit4= dbill4-cp4*quant-c4;  //profit
				prof4.setText(Float.toString(profit4));
				
			}	
				
			
		}	

	}
	
	
	
	// OUTER RECTANGLE
	public void paint(Graphics g)
	{
		
		setForeground(lavender);
		g.fillRect(8,28,1583,750);
		
		
		
		
	}
	
	
	
	

}

// <APPLET code="GroceryBilling.class" width="1600" height="800"></APPLET>

		
		



		












