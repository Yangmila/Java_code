package experiment42;
import javax.swing.*;
import java.awt.*;

public class AddStudent extends JFrame{
	JLabel stuNumLa,stuNameLa,sexLa;
	JTextField stuNumText;
	JTextField stuNameText;
	JTextField sexText;
	JButton loginBt,quitBt;
	
	private void initControler(){
		this.setLayout(null);
		stuNumLa = new JLabel("学号");
		stuNumLa.setLocation(100,45);
		stuNumLa.setSize(100,50);
		this.add(stuNumLa);
		
		stuNumText=new JTextField();
		stuNumText.setLocation(160,55);
		stuNumText.setSize(170,30);
		this.add(stuNumText);

		stuNameLa = new JLabel("姓名");
		stuNameLa.setLocation(100,120);
		stuNameLa.setSize(100,50);
		this.add(stuNameLa);
		
		stuNameText=new JTextField();
		stuNameText.setLocation(160,130);
		stuNameText.setSize(170,30);
		this.add(stuNameText);
		
		sexLa = new JLabel("性别");
		sexLa.setLocation(100,195);
		sexLa.setSize(100,50);
		this.add(sexLa);
		
		sexText=new JTextField();
		sexText.setLocation(160,205);
		sexText.setSize(170,30);
		this.add(sexText);
		
		loginBt=new JButton("添加");
		loginBt.setLocation(110,270);
		loginBt.setSize(70,30);
		this.add(loginBt);
		
		quitBt=new JButton("清空");
		quitBt.setLocation(270,270);
		quitBt.setSize(70,30);
		this.add(quitBt);
	}
	
	public AddStudent(){
		this.setSize(500,400);
		this.setTitle("添加学生记录");
		initControler();
		this.setVisible(true);
		
	}
}
