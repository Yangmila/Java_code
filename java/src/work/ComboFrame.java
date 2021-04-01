package work;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class ComboFrame extends JFrame{
    private JComboBox<String> comboBox;
    private JComboBox<String> comboBox2=new JComboBox();
    public ComboFrame() {
        JPanel panel=new JPanel();
        JComboBox<String> comboBox=new JComboBox<String>();
        comboBox.addItem("请选择学院");
        comboBox.addItem("轻工学院");
        comboBox.addItem("材料学院");
        comboBox.addItem("环境学院");
        comboBox.addItem("食品学院");
        comboBox.addItem("机电学院");
        comboBox.addItem("电控学院");
        comboBox.addItem("电智学院");
        comboBox.addItem("经管学院");
        comboBox.addItem("化工学院");
        comboBox.addItem("设艺学院");
        comboBox.addItem("文理学院");
        comboBox.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String item=(String) comboBox.getSelectedItem();
                if("请选择学院".contentEquals(item)) {
                    comboBox2.removeAllItems();
                }
                if("轻工学院".contentEquals(item)) {
                    comboBox2.removeAllItems();
                    comboBox2.addItem("轻化工程");
                    comboBox2.addItem("包装工程");
                    comboBox2.addItem("印刷工程");
                }
                if("材料学院".contentEquals(item)) {
                    comboBox2.removeAllItems();
                    comboBox2.addItem("非金属材料工程");
                    comboBox2.addItem("材料物理");
                    comboBox2.addItem("材料化学");
                    comboBox2.addItem("纳米材料");
                }
                if("环境学院".contentEquals(item)) {
                    comboBox2.removeAllItems();
                    comboBox2.addItem("环境工程");
                    comboBox2.addItem("环境科学");
                }
                if("食品学院".contentEquals(item)) {
                    comboBox2.removeAllItems();
                    comboBox2.addItem("食品科学与工程");
                    comboBox2.addItem("生物工程");
                    comboBox2.addItem("食品质量与安全");
                    comboBox2.addItem("药物制剂");
                }
                if("机电学院".contentEquals(item)) {
                    comboBox2.removeAllItems();
                    comboBox2.addItem("机械设计");
                    comboBox2.addItem("机械电子");
                    comboBox2.addItem("材料成型");
                    comboBox2.addItem("过控工程");
                    comboBox2.addItem("物流工程");
                }
                if("电控学院".contentEquals(item)) {
                    comboBox2.removeAllItems();
                    comboBox2.addItem("电气工程");
                    comboBox2.addItem("自动化");
                    comboBox2.addItem("光电信息");
                    comboBox2.addItem("智能制造");
                }
                if("电智学院".contentEquals(item)) {
                    comboBox2.removeAllItems();
                    comboBox2.addItem("计算机");
                    comboBox2.addItem("电子科学");
                    comboBox2.addItem("电子信息");
                    comboBox2.addItem("网络工程");
                    comboBox2.addItem("物联网工程");
                }
                if("经管学院".contentEquals(item)) {
                    comboBox2.removeAllItems();
                    comboBox2.addItem("工商管理");
                    comboBox2.addItem("会计学");
                    comboBox2.addItem("人力资源管理");
                    comboBox2.addItem("市场营销");
                    comboBox2.addItem("国际经贸");
                    comboBox2.addItem("行政管理");
                }
                if("化工学院".contentEquals(item)) {
                    comboBox2.removeAllItems();
                    comboBox2.addItem("化学工程");
                    comboBox2.addItem("应用化学");
                    comboBox2.addItem("高分子材料");
                    comboBox2.addItem("石油工程");
                    comboBox2.addItem("化学");
                }
                if("设艺学院".contentEquals(item)) {
                    comboBox2.removeAllItems();
                    comboBox2.addItem("视觉传达设计");
                    comboBox2.addItem("环境设计");
                    comboBox2.addItem("服装设计");
                    comboBox2.addItem("产品设计");
                    comboBox2.addItem("动画");
                    comboBox2.addItem("播音主持");
                    comboBox2.addItem("工业设计");
                }
                if("文理学院".contentEquals(item)) {
                    comboBox2.removeAllItems();
                    comboBox2.addItem("信息与计算科学");
                    comboBox2.addItem("数学与应用数学");
                    comboBox2.addItem("数据科学与大数据技术");
                    comboBox2.addItem("应用物理学");
                    comboBox2.addItem("英语");
                }
            }
        });
        panel.add(comboBox);
        panel.add(comboBox2);
        this.add(panel,BorderLayout.NORTH);
        this.setSize(350,100);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
