
package test123;
 
 
/**
 *
 * @author Administrator
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CalculatorDemo {
    String lastOption;//�����������
    double a,result, b,c;//���������
    boolean start;//�Ƿ�ʼ��������
    int fh;
    JTextField text1;//��ʾ�ı���
    //���ɼ������İ�ť�ð�ť������ʵ��
   JButton[] btn;
   JButton[] btn1;
       public void go(){
    start=true;
    lastOption="=";
    JFrame myWindow=new JFrame("������");
    JPanel p1=new JPanel();
     JPanel p2=new JPanel();
    text1=new JTextField(26);
    btn=new JButton[12];
      btn1=new JButton[7];
    Container cp=myWindow.getContentPane();
    //�������Ĳ��ַ�ʽGridLayout
    p1.setLayout(new GridLayout(4,3,12,13));
     p2.setLayout(new GridLayout(4,2,12,13));
    cp.add(text1,BorderLayout.NORTH);
    //�������
    for(int i=0;i<7;i++){
     btn1[i]=new JButton(i+"");
    }
    //�������Ų����뵽��ť��
      btn1[6]=new JButton("/");
       btn1[5]=new JButton("C");
        btn1[4]=new JButton("*");
         btn1[3]=new JButton("�˸�");
            btn1[2]=new JButton("-");
            btn1[1]=new JButton("+/-");
             btn1[0]=new JButton("+");
              
              
             //����forѭ��������
               cp.add(p1,"West"); //�����м�����p1
        cp.add(p2,"East"); ////�����м�����p2
           for(int i=0;i<7;i++){
            p2.add(btn1[i]);
        }
        for(int i=0;i<10;i++){
            btn[i]=new JButton(i+"");
            p1.add(btn[i]);
        }
         
        btn[11]=new JButton(".");
        p1.add(btn[11]);
        btn[10]=new JButton("=");
        p1.add(btn[10]);
       
                    
//����for ѭ��Ϊ���ע���¼�������
                    for(int i=0;i<10;i++){
                        btn[i].addActionListener(new NumHandle());
                    }
                 btn[10].addActionListener(new OPtionHandle());
                     
                  btn[11].addActionListener(new OPtionHandle());
              
       for(int j=0;j<7;j++){
             btn1[j].addActionListener(new OPtionHandle());
             }
             
             myWindow.pack();
             myWindow.setVisible(start);
             myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              
    }
    //�����ڲ���NumHandle�������ּ�����
      class NumHandle implements ActionListener{
       
      public void actionPerformed(ActionEvent e){
         String num=e.getActionCommand();//�õ����ּ��ϵ�����
         if(num.equals("0")){  //���0
                text1.setText(text1.getText()+"0");
            }
            if(num.equals("1")){  //���1
                if(text1.getText().equals("0")) //�ж��ı�������ʾ�������Ƿ�Ϊ0
                    text1.setText("1");
                else
                    text1.setText(text1.getText()+"1");
            }
            if(num.equals("2")){  //���2
                if(text1.getText().equals("0"))
                    text1.setText("2");
                else
                    text1.setText(text1.getText()+"2");
            }
            if(num.equals("3")){ //���3
                if(text1.getText().equals("0"))
                    text1.setText("3");
                else
                    text1.setText(text1.getText()+"3");
            }
            if(num.equals("4")){  //���4
                if(text1.getText().equals("0"))
                    text1.setText("4");
                else
                    text1.setText(text1.getText()+"4");
            }
            if(num.equals("5")){  //���5
                if(text1.getText().equals("0"))
                    text1.setText("5");
                else
                    text1.setText(text1.getText()+"5");
            }
            if(num.equals("6")){ //���6
                if(text1.getText().equals("0"))
                    text1.setText("6");
                else
                    text1.setText(text1.getText()+"6");
            }
            if(num.equals("7")){  //���7
                if(text1.getText().equals("0"))
                    text1.setText("7");
                else
                    text1.setText(text1.getText()+"7");
            }
            if(num.equals("8")){  //���8
                if(text1.getText().equals("0"))
                    text1.setText("8");
                else
                    text1.setText(text1.getText()+"8");
            }
            if(num.equals("9")){  //���9
                if(text1.getText().equals("0"))
                    text1.setText("9");
                else
                    text1.setText(text1.getText()+"9");
            }
      }
      }
      //�ڲ���OPtionHandle�������ż��Ķ���
      class OPtionHandle implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
        String option=e.getActionCommand();
         if(option.equals(".")){
                        text1.setText(text1.getText()+".");
                }
                /*if(option.equals("sin")){
                    a=Double.parseDouble(text1.getText());//���ı����ϵ��ַ���ת��Ϊdouble��
                    double b=Math.sin(a/180*Math.PI); //�ֽ�aת��Ϊ�����ƣ��ٽ�������
                    text1.setText(String.valueOf(b));  //���������
                }
                if(option.equals("cos")){
                    a=Double.parseDouble(text1.getText());
                    double b=Math.cos(a/180*Math.PI);
                    text1.setText(String.valueOf(b));
                }
                if(option.equals("tan")){
                    a=Double.parseDouble(text1.getText());
                    double b=Math.tan(a/180*Math.PI);
                    text1.setText(String.valueOf(b)); 
                }
                if(option.equals("log")){
                    a=Double.parseDouble(text1.getText());
                    double b=Math.log(a)/Math.log(10.0);
                    text1.setText(String.valueOf(b)); 
                }
                if(option.equals("sqrt")){
                    a=Double.parseDouble(text1.getText());
                    double b=Math.sqrt(a);
                    text1.setText(String.valueOf(b));
                }
                if(option.equals("pow")){  //�����㺬������������
                    a=Double.parseDouble(text1.getText());
                    fh=4;  //
                    text1.setText("");  //���ı�����������
                }
                if(option.equals("exp")){
                    a=Double.parseDouble(text1.getText());
                    b=a;
                    double b=Math.exp(a);
                    text1.setText(String.valueOf(b));
                }
                if(option.equals("��")){
                    a=Double.parseDouble(text1.getText());
                    text1.setText(String.valueOf(1/a));
                }*/
                if(option.equals("+/-")){
                    if(!"0".equals(text1.getText())){  //�ж��ı���������Ƿ�Ϊ0
                       a=Double.parseDouble(text1.getText());
                       a=-a;  //���෴������
                       text1.setText(String.valueOf(a));
                    }
                }
                if(option.equals("�˸�")){
                   int i=text1.getText().length();
                   text1.setText(text1.getText().substring(0,i-1));
                }
                if(option.equals("C")){
                   text1.setText("");  //����ı����е�����
                }
               if(option.equals("+")){
                   a=Double.parseDouble(text1.getText());
                   fh=0;
                    
                   text1.setText("");
               
                } 
               if(option.equals("-")){
                   a=Double.parseDouble(text1.getText());
                    fh=1;
                    
                   text1.setText("");
                } 
               if(option.equals("*")){
                   a=Double.parseDouble(text1.getText());
                   fh=2;
                   text1.setText("");
                } 
               if(option.equals("/")){
                   a=Double.parseDouble(text1.getText());
                   fh=3;
                   text1.setText("");
                }
               //����������������
                if(option.equals("=")){
                   double c=Double.parseDouble(text1.getText());
                   switch(fh){
                       case 0:  //ִ�мӷ�����
                           result=a+c;
                           break;
                       case 1:  //ִ�м�������
                           result=a-c;
                           break;
                       case 2:  //ִ�г˷�����
                           result=a*c;
                           break;
                       case 3:  //ִ�г�������
                           result=a/c;
                           break;
                       case 4:  //ִ��a��b��������
                           result=Math.pow(a, c);
                           break;
                   }
                   text1.setText(String.valueOf(result));//��������ת��Ϊ�ַ�����ʽ���
                }
        }
    }
         
       
     
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculatorDemo window=new CalculatorDemo();
        window.go();
        // TODO code application logic here
     
    } 
}