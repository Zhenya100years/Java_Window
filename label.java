import javax.swing.*;

class Label{
	Label()
	{
		JFrame f = new JFrame();
		
		JLabel lbl = new JLabel("Hello, World!");
		lbl.setBounds(200,200,130,20);
		f.add(lbl);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	
	
	
	
	
	
	
}
public static void main(String args[])
{
	new Label();
}
}