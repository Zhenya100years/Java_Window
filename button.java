import javax.swing.*;

class Button{
	Button()
	{
		JFrame f = new JFrame();
		
		JButton b = new JButton("");
		b.setText("Button");
		b.setBounds(200,20,100,20);
		f.add(b);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	
	
	
	
	
	
	
}
public static void main(String args[])
{
	new Button();
}
}