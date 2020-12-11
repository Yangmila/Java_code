package Counter;
import javax.swing.*;
import java.awt.*;

public class Count extends JFrame{
	JPanel panel1;//面板1，上面有25个按钮（5行5列）
	JButton[] buttons1;
	
	JPanel panel2;//面板2，上面有20个按钮（4行5列）
	JButton[] buttons2;
	
	JPanel panel3;//面板3，上面4个按钮（1行1列）
	JButton[] buttons3;
	
	JPanel panel4;//面板4，上面2个按钮（1行2列）
	JButton[] buttons4;
	
	JPanel panel5;//面板4，上面2个按钮（1行2列）
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
		setTitle("计算器");
		setLayout(null);
		initPanel1();
		setVisible(true);
	}
}
