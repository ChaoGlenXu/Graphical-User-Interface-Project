package guiProject;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	
	
	private JFrame frame;
	private JLabel label;
	private JPanel panel;
	private int count = 0;
	
	public GUI() {
		
	    frame = new JFrame();
		
		JButton button = new JButton("Click here!");
		button.addActionListener(this);
		
		label = new JLabel("Number of clicks you did: 0");
		JLabel creator = new JLabel("This small GUI project is completed by Chao Glen Xu");
		
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 10, 40));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		panel.add(creator);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Chao Glen Xu's Graphical User Interface");
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		label.setText("Number of clicks you did: " + count);
	}

}
