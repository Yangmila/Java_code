package Counter;
import javax.swing.*;
import java.awt.*;

public class Count extends JFrame{
	JPanel panel1;//���1��������25����ť��5��5�У�
	JButton[] buttons1;
	
	JPanel panel2;//���2��������20����ť��4��5�У�
	JButton[] buttons2;
	
	JPanel panel3;//���3������4����ť��1��1�У�
	JButton[] buttons3;
	
	JPanel panel4;//���4������2����ť��1��2�У�
	JButton[] buttons4;
	
	JPanel panel5;//���4������2����ť��1��2�У�
	JButton[] buttons5;
	
	private void initPanel1()
	{
		panel1=new JPanel();
		panel1.setSize(250,270);
		panel1.setLocation(5,70);
		panel1.setLayout(new GridLayout(5,4,2,2));
		panel1.setBackground(Color.BLUE);
		String[] titles={"MC","MR","MS","M+","<-","CE","C","+-","7","8","9","/","4","5","6","*","1","2","3","-"};
		buttons1=new JButton[20];
		for(int i=0;i<titles.length;i++)
		{
			buttons1[i]=new JButton(titles[i]);
			panel1.add(buttons1[i]);
		}
		this.add(panel1);
	}
	
	public Count()
	{
		setSize(360,440);
		setTitle("������");
		setLayout(null);
		initPanel1();
		setVisible(true);
	}
}
