import java.awt.*;
import javax.swing.*;

public class Calc extends JFrame {
	JButton [] num = new JButton[10];
	JTextField result;
	JButton plus,sub,mul,div,equal;
	public Calc() {
		setTitle("JHCalculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(null);
		
		result = new JTextField("",18);
		result.setLocation(10,10);
		result.setSize(280,20);
		c.add(result);
		
		num[0] = new JButton("0");
		num[1] = new JButton("1");
		num[2] = new JButton("2");
		num[3] = new JButton("3");
		num[4] = new JButton("4");
		num[5] = new JButton("5");
		num[6] = new JButton("6");
		num[7] = new JButton("7");
		num[8] = new JButton("8");
		num[9] = new JButton("9");
		
		for(int i=0;i<num.length;i++)
			num[i].setSize(50,50);
		
		num[1].setLocation(10,40);
		c.add(num[1]);
		
		num[2].setLocation(70,40);
		c.add(num[2]);
		
		num[3].setLocation(130,40);
		c.add(num[3]);
		
		num[4].setLocation(10,100);
		c.add(num[4]);
		
		num[5].setLocation(70,100);
		c.add(num[5]);
		
		num[6].setLocation(130,100);
		c.add(num[6]);
		
		num[7].setLocation(10,160);
		c.add(num[7]);
		
		num[8].setLocation(70,160);
		c.add(num[8]);
		
		num[9].setLocation(130,160);
		c.add(num[9]);
		
		num[0].setLocation(70,220);
		c.add(num[0]);
		
		plus = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("X");
		div = new JButton("/");
		equal = new JButton("=");
		
		plus.setLocation(190,40);
		plus.setSize(50,100);
		c.add(plus);
		
		sub.setLocation(250,40);
		sub.setSize(50,100);
		c.add(sub);
		
		mul.setLocation(190,150);
		mul.setSize(50,100);
		c.add(mul);
		
		div.setLocation(250,150);
		div.setSize(50,100);
		c.add(div);
		
		equal.setLocation(190, 260);
		equal.setSize(110,50);
		c.add(equal);
		setSize(320,360);
		setVisible(true);
	}
	
	public static void main(String[] argc) {
		new Calc();
	}
}
