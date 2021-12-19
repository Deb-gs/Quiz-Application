package simple.mind;
/**
 *
 * @author Debkanta Ghosh
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleMind extends JFrame implements ActionListener{
        
        JButton b1,b2;
        JTextField t1;
        
	SimpleMind(){
		setBounds(350,200,1000,460); //d-left //d-up //length //hieght
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("simple/mind/icons/login.jpg"));
		JLabel l1 = new JLabel(il);
		l1.setBounds(0,0,500,460);
		add(l1); 
		
                JLabel l2 = new JLabel("Simple Minds");
                l2.setFont(new Font("Viner Hand ITC",Font.BOLD,35));
                l2.setForeground(new Color(30,144,254));
                l2.setBounds(660, 60, 350, 45);
                add(l2);
                
                JLabel l3 = new JLabel("Enter Your Name");
                l3.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
                l3.setForeground(new Color(30,144,254));
                l3.setBounds(710, 130, 350, 20);
                add(l3);
                
                t1 = new JTextField();
                t1.setBounds(620, 170, 330, 25);
                t1.setFont(new Font("Tomes New Roman",Font.BOLD,14));
                add(t1);
                
                b1 = new JButton("Submit");
                b1.setBounds(620, 230, 120, 25);
                b1.setBackground(new Color(30,144,254));
                b1.setForeground(Color.WHITE);
                b1.addActionListener(this);
                add(b1);
                
                b2 = new JButton("Exit");
                b2.setBounds(830, 230, 120, 25);
                b2.setBackground(new Color(30,144,254));
                b2.setForeground(Color.WHITE);
                b2.addActionListener(this);
                add(b2);
                
                
                
		setVisible(true);
		
	}
        
        public void actionPerformed(ActionEvent ae){
                if(ae.getSource() == b1){
                    String name = t1.getText();
                    this.setVisible(false);
                    new Submit(name);
                    
                }else{
                    System.exit(0);
                }
                }
	public static void main(String[] args) {
		new SimpleMind();
	}

}
