package experiment41;

import javax.swing.*;
import java.awt.*;

import java.util.List;

public class AddStudentFrame extends JFrame {
	    private JPanel panel;
	    private JPanel pnlCenter;
	    private JPanel pnlRow1;
	    private JPanel pnlRow2;
	    private JPanel pnlRow3;
	    private JPanel pnlSouth;

	    private JLabel lblId;
	    private JLabel lblName;
	    private JLabel lblSex;
	    
	    private JTextField txtId;
	    private JTextField txtName;
	    private JTextField txtSex;
	    
	    private JButton btnAdd;
	    private JButton btnClear;

	    public AddStudentFrame(String title) {
	        super(title);
	        initGUI();
	    }
    private void initGUI() {
        // 创建组件
        panel = (JPanel) getContentPane();
        pnlCenter = new JPanel();
        pnlSouth = new JPanel();

        pnlRow1 = new JPanel();
        pnlRow2 = new JPanel();
        pnlRow3 = new JPanel();


        pnlRow1.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnlRow2.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnlRow3.setLayout(new FlowLayout(FlowLayout.LEFT));


        lblId = new JLabel("学号：");
        lblName = new JLabel("姓名：");
        lblSex = new JLabel("性别：");

        txtId = new JTextField(20);
        txtName = new JTextField(20);
        txtSex = new JTextField(20);
       
        btnAdd = new JButton("添加");
        btnClear= new JButton("清空");
        
        // 添加组件
        panel.setLayout(new BorderLayout());
        panel.add(pnlCenter, BorderLayout.CENTER);
        panel.add(pnlSouth, BorderLayout.SOUTH);
        pnlCenter.setLayout(new GridLayout(4, 1));
        pnlCenter.add(pnlRow1);
        pnlCenter.add(pnlRow2);
        pnlCenter.add(pnlRow3);


        pnlRow1.add(lblId);
        pnlRow1.add(txtId);
        pnlRow2.add(lblName);
        pnlRow2.add(txtName);
        pnlRow3.add(lblSex);
        pnlRow3.add(txtSex);


        pnlSouth.add(btnAdd);
        pnlSouth.add(btnClear);

        // 设置窗口属性
        setSize(400, 300);
        // 设置窗口屏幕居中
        setLocationRelativeTo(null);
        // 设置窗口标题
        setTitle("添加学生记录");
        // 设置窗口可见
        setVisible(true);
        // 设置窗口默认关闭操作（卸载当前窗口）
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        new AddStudentFrame("");
    }
}

