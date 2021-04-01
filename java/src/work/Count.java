package work;
import java.awt.*;
import javax.swing.*;
public class Count extends JFrame {
    private void setNumPanel() {
        JPanel numpanel1=new JPanel();
        numpanel1.setBounds(400,150,290,260);
        numpanel1.setLayout(new GridLayout(5,4,5,5));
        String [] titles= {"MC","MR","MS","M+","←","CE","C","±","7","8","9","/","4","5","6","*","1","2","3","-"};
        Button[] buttons1=new Button[20];
        for(int i=0;i<20;i++) {
            buttons1[i]=new Button(titles[i]);
            numpanel1.add(buttons1[i]);
        }
        numpanel1.setVisible(true);
        this.add(numpanel1);
        JPanel numpanel2=new JPanel();
        numpanel2.setBounds(690,150,70,208);
        numpanel2.setLayout(new GridLayout(4,1,5,5));
        String [] titles2= {"M-","√","%","1/x"};
        Button[] buttons2=new Button[4];
        for(int i=0;i<4;i++) {
            buttons2[i]=new Button(titles2[i]);
            numpanel2.add(buttons2[i]);
        }
        numpanel2.setVisible(true);
        this.add(numpanel2);
        Button num0=new Button("0");
        num0.setBounds(400, 413, 142, 52);
        this.add(num0);
        Button nump=new Button(".");
        nump.setBounds(545, 413, 70, 52);
        this.add(nump);
        Button numadd=new Button("+");
        numadd.setBounds(619, 413, 70, 52);
        this.add(numadd);
        Button numequ=new Button("=");
        numequ.setBounds(690, 360, 70, 104);
        this.add(numequ);
    }
    private void setAlgNum() {
        JPanel algpanel=new JPanel();
        algpanel.setBounds(20, 204, 360, 260);
        algpanel.setLayout(new GridLayout(5,5,5,5));
        String [] titles= {"","Inv","㏑","(",")","Int","sinh","sin","x²","n!","dms","cosh","cos","xⁿ","ⁿ√x","π","tanh","tan","x³","³√x","F-E","Exp","Mod","㏒","10ⁿ"};
        Button[] buttons1=new Button[25];
        for(int i=0;i<25;i++) {
            buttons1[i]=new Button(titles[i]);
            algpanel.add(buttons1[i]);
        }
        algpanel.setVisible(true);
        this.add(algpanel);
        JPanel radiopanel=new JPanel();
        radiopanel.setLayout(new GridLayout(1,3));
        JRadioButton angel=new JRadioButton("度");
        JRadioButton radian=new JRadioButton("弧度");
        JRadioButton grad=new JRadioButton("梯度");
        radiopanel.add(angel);
        radiopanel.add(radian);
        radiopanel.add(grad);
        radiopanel.setBounds(20, 150, 360, 52);
        radiopanel.setVisible(true);
        this.add(radiopanel);
    }
    private void setText() {
        JPanel textpanel=new JPanel();
        textpanel.setLayout(null);
        TextField text=new TextField();
        text.setLocation(20, 10);
        text.setSize(740,100);
        textpanel.setBounds(20,10,740,150);
        textpanel.add(text);
        textpanel.setVisible(true);
        this.add(textpanel);
    }
    public Count() {
        this.setTitle("计算器");
        this.setSize(800, 500);
        this.setLayout(null);
        setNumPanel();
        setAlgNum();
        setText();
        this.setVisible(true);
    }

}
