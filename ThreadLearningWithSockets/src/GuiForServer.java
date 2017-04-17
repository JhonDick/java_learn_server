import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiForServer extends JFrame{
	JTextField field;
	JButton but1,but2;
	static JLabel lbl1;
	static JLabel lbl2;
	static JLabel lbl3;
	
	String line;
	public GuiForServer(){
		super("Frame Server");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		field = new JTextField(20);
		but1 = new JButton("Send message");
		but2 = new JButton("get message");
		
		lbl1 = new JLabel("Sending message");
		lbl2 = new JLabel("Getting message");
		lbl3 = new JLabel("Status message");
		
		JPanel panel = new JPanel(new FlowLayout());
		
		panel.add(field);
		
		panel.add(but1);
		panel.add(but2);
		
		panel.add(lbl1);
		panel.add(lbl2);
		panel.add(lbl3);
		
		
		setContentPane(panel);
		setSize(300,300);
		setVisible(true);
		but1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Server.writeLine(field.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		field.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
	
		});
		but2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					lbl2.setText(Server.getLine());
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		
		
		
		
		
	}
	

}
