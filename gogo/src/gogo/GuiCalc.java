package gogo;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiCalc extends JFrame{
	ArrayList<String> Counts = new ArrayList<>();
	ArrayList<String> Operators = new ArrayList<>();
	//int Counter;
	
	
	JButton butPlus, butMinus, butMultiplay, butDeletel, butClear, butEquals;
	 String str = "";
	JButton mas[] = new JButton[10];
	public GuiCalc(){
		LogicCalc lisener = new LogicCalc();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		butClear = new JButton("C");
		butDeletel = new JButton("/");
		butEquals = new JButton("=");
		butMinus = new JButton("-");
		butMultiplay = new JButton("*");
		butPlus = new JButton("+");
		JPanel panel = new JPanel(new GridLayout(3, 4)); 
		for(int i=0;i<mas.length;i++){
			mas[i]=new JButton(String.valueOf(i));
			mas[i].addActionListener(lisener);
			panel.add(mas[i]);
			
		}
		panel.add(butClear);
		panel.add(butDeletel);
		panel.add(butEquals);
		panel.add(butMinus);
		panel.add(butMultiplay);
		panel.add(butPlus);
		
		butClear.addActionListener(lisener);
		butDeletel.addActionListener(lisener);
		butEquals.addActionListener(lisener);
		butMinus.addActionListener(lisener);
		butMultiplay.addActionListener(lisener);
		butPlus.addActionListener(lisener);
		
		
		
		setContentPane(panel);
		setSize(450,400);
		setVisible(true);
		
		
		
		
		
		
	}
	public static void main(String[] args)
	{ GuiCalc calcul9tor = new GuiCalc();
		
	}
	public class LogicCalc implements ActionListener{
		

		@Override
		public void actionPerformed(ActionEvent e) {
			if(mas[0].equals(e.getSource())){
				str +="0";}
			if(mas[1].equals(e.getSource())){
				str +="1";}
			if(mas[2].equals(e.getSource())){
				str +="2";}
			if(mas[3].equals(e.getSource())){
				str +="3";}
			if(mas[4].equals(e.getSource())){
				str +="4";}
			if(mas[5].equals(e.getSource())){
				str +="5";}
			if(mas[6].equals(e.getSource())){
				str +="6";}
			if(mas[7].equals(e.getSource())){
				str +="7";}
			if(mas[8].equals(e.getSource())){
				str +="8";}
			if(mas[9].equals(e.getSource())){
				str +="9";}
		
			
			if(butClear.equals(e.getSource())){
				str = "";
				Counts.clear();
				Operators.clear();
				}
			if(butDeletel.equals(e.getSource())){
				PutInMass("/");}
			if(butPlus.equals(e.getSource())){
				PutInMass("+");}
			
			if(butMinus.equals(e.getSource())){
				PutInMass("-");}
			if(butMultiplay.equals(e.getSource())){
				PutInMass("*");}
			if(butEquals.equals(e.getSource())){
				Equals();
		
		}
		
	}
	public void Equals(){
		int a = Integer.parseInt(Counts.get(0));
				for(int i = 1;i<Counts.size();i++){
					if(Operators.get(i-1).equals("+")){
						a += Integer.parseInt(Counts.get(i));
						 
					}
					if(Operators.get(i-1).equals("-")){
						a -= Integer.parseInt(Counts.get(0));
						
					}
					if(Operators.get(i-1).equals("*")){
						a *= Integer.parseInt(Counts.get(0));
						
					}
					if(Operators.get(i-1).equals("/")){
						a /= Integer.parseInt(Counts.get(0));
						
					}
				
					
				}
				str = "";
				Counts.clear();
				Operators.clear();
				System.out.println(a);
				a = 0;
				}
	}
	public  void PutInMass(String signs){
		Counts.add(str);
		Operators.add(signs); 
		str = "";}
		
	
	


}
