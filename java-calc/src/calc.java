import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calc extends JFrame {
	private JButton [] num = new JButton[10];
	private JTextField result;
	private JButton plus,sub,mul,div,equal;
	private double resN = 0, nowN = 0;
	private String lastOp = "=";
	public Calc() {
		setTitle("JHCalculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CreateMenu();
		
		setSize(320,360);
		setVisible(true);
	}
	
	public static void main(String[] argc) {
		new Calc();
	}
	
	class MyMouseAdapter extends MouseAdapter {
		JButton b = null;
		public void mousePressed(MouseEvent e) {
			Object o = e.getSource();
			b = (JButton)o;
			
			String tmp = b.getText();
			try {
				int tmpN = Integer.parseInt(tmp);
				nowN = 10 * nowN + tmpN;
				if (isInt(nowN))
					result.setText(String.valueOf((int)nowN));
				else
					result.setText(String.valueOf(nowN));
				
			} catch (NumberFormatException ex) {
				if(tmp=="+")
				{
					resN += nowN;
					nowN = 0;
					lastOp = "+";
				}
				else if(tmp=="-")
				{
					resN -= nowN;
					nowN = 0;
					lastOp = "-";
				}
				else if(tmp=="X")
				{
					resN *= nowN;
					nowN = 0;
					lastOp = "X";
				}
				else if(tmp=="/")
				{
					resN = nowN;
					nowN = 0;
					lastOp = "/";
				}
				else if(tmp=="=")
				{
					switch(lastOp) {
					case "+":
						resN += nowN;
						break;
					case "-":
						resN -= nowN;
						break;
					case "X":
						resN *= nowN;
						break;
					case "/":
						resN /= nowN;
						break;
					}
					nowN = 0;
				}
				System.out.println(resN + "/" + nowN);
				if(isInt(resN))
					result.setText(String.valueOf((int)resN));
				else
					result.setText(String.valueOf(resN));	
			}
		}
	}
	
	public void CreateMenu() {

		Container c = getContentPane();
		c.setLayout(null);
		
		result = new JTextField("",18);
		result.setHorizontalAlignment(JTextField.RIGHT);
		result.setLocation(10,10);
		result.setSize(280,20);
		result.addMouseListener(new MyMouseAdapter());
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
			num[i].addMouseListener(new MyMouseAdapter());
		
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
		plus.addMouseListener(new MyMouseAdapter());
		c.add(plus);
		
		sub.setLocation(250,40);
		sub.setSize(50,100);
		sub.addMouseListener(new MyMouseAdapter());
		c.add(sub);
		
		mul.setLocation(190,150);
		mul.setSize(50,100);
		mul.addMouseListener(new MyMouseAdapter());
		c.add(mul);
		
		div.setLocation(250,150);
		div.setSize(50,100);
		div.addMouseListener(new MyMouseAdapter());
		c.add(div);
		
		equal.setLocation(190, 260);
		equal.setSize(110,50);
		equal.addMouseListener(new MyMouseAdapter());
		c.add(equal);
	}
	
	public boolean isInt(Double n) {
		if ((n==Math.floor(n)) && !Double.isInfinite(n))
			return true;
		else
			return false;
	}
}
