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

public class GuiClient extends JFrame{
	JTextField field;
	JButton but1,but2;
	static JLabel lbl1, lbl2, lbl3;
	public GuiClient(){
		super("Frame Client");
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
		field.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int key = e.getKeyCode();
				if(key == KeyEvent.VK_ENTER){try {
					Client.writeLine(field.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				}
				
			}
		});
		but1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		but2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					lbl2.setText(Client.getLine());
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		
		
	}
	

}
