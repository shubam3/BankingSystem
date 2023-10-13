package banking.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUP3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;

    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formNo;
    SignUP3(String formNo){
        this.formNo = formNo;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel j1 = new JLabel("Pgae 3");
        j1.setFont(new Font("Raleway",Font.BOLD,22));
        j1.setBounds(280,40,400,40);
        add(j1);

        JLabel j2 = new JLabel("Account Details");
        j2.setFont(new Font("Raleway",Font.BOLD,22));
        j2.setBounds(280,70,400,40);
        add(j2);

        JLabel j3 = new JLabel("Account Type");
        j3.setFont(new Font("Raleway",Font.BOLD,22));
        j3.setBounds(100,140,200,30);
        add(j3);


        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(100,180,150,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(350,180,300,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(100,220,250,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(350,220,250,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel j4 = new JLabel("Card Number");
        j4.setFont(new Font("Raleway",Font.BOLD,18));
        j4.setBounds(100,300,200,30);
        add(j4);

        JLabel j5 = new JLabel("Your 16-digit Card no.");
        j5.setFont(new Font("Raleway",Font.BOLD,18));
        j5.setBounds(100,330,250,30);
        add(j5);

        JLabel j6 = new JLabel("XXXX-XXXX-XXXX-4646");
        j6.setFont(new Font("Raleway",Font.BOLD,18));
        j6.setBounds(330,300,250,30);
        add(j6);

        JLabel j7 = new JLabel("It would appear on atm card/cheque book");
        j7.setFont(new Font("Raleway",Font.BOLD,18));
        j7.setBounds(330,330,500,20);
        add(j7);

        JLabel j8 = new JLabel("PIN:");
        j8.setFont(new Font("Raleway",Font.BOLD,18));
        j8.setBounds(100,370,200,30);
        add(j8);

        JLabel j9 = new JLabel("XXXX");
        j9.setFont(new Font("Raleway",Font.BOLD,18));
        j9.setBounds(330,370,200,30);
        add(j9);

        JLabel j10 = new JLabel("4 digit password");
        j10.setFont(new Font("Raleway",Font.BOLD,18));
        j10.setBounds(100,400,200,30);
        add(j10);

        JLabel j11 = new JLabel("Services Required");
        j11.setFont(new Font("Raleway",Font.BOLD,22));
        j11.setBounds(100,450,200,30);
        add(j11);


        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBackground(new Color(215,252,252));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBackground(new Color(215,252,252));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBackground(new Color(215,252,252));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 = new JCheckBox("Email Alert");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBackground(new Color(215,252,252));
        c4.setBounds(350,550,200,30);
        add(c4);


        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBackground(new Color(215,252,252));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E-statement");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBackground(new Color(215,252,252));
        c6.setBounds(350,600,200,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I hereby declare that the above entered details correcr to the best of knowledge",true);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBackground(new Color(215,252,252));
        c7.setBounds(100,680,600,20);
        add(c7);

        JLabel j12 = new JLabel("Form No");
        j12.setFont(new Font("Raleway",Font.BOLD,14));
        j12.setBounds(700,10,100,30);
        add(j12);

        JLabel j13 = new JLabel(formNo);
        j13.setFont(new Font("Raleway",Font.BOLD,14));
        j13.setBounds(760,10,60,30);
        add(j13);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBounds(250,720,100,30);
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBounds(420,720,100,30);
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.addActionListener(this);
        add(c);


        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String atype = null;
         if(r1.isSelected()){
             atype = "Saving Account";}
         else if (r2.isSelected()) {
             atype = "Fixed Deposit Account";
         } else if (r3.isSelected()) {
             atype = "Current Account";
         } else if (r4.isSelected()) {
             atype = "Recurring Deposit Account";
         }

        Random ran = new Random();
         long first7 = (ran.nextLong() % 90000000L) + 14099630000000L;

         String cardno = "" + Math.abs(first7) ;
         long first3 = (ran.nextLong() % 9000L) + 1000L;
         String pin = ""+ Math.abs(first3);

         String fac =   "";
         if(c1.isSelected()){
             fac = fac + "ATM Card";
         } else if (c2.isSelected()) {
             fac = fac + "Internet Banking";

         } else if (c3.isSelected()) {
             fac =fac+"Mobile Banking";
         } else if (c4.isSelected()) {
             fac = fac + "Email Alert";
         } else if (c5.isSelected()) {
            fac = fac + "Cheque Book";
         } else if (c6.isSelected()) {
             fac = fac + "E-statement";

         }

         try{
             if(e.getSource()==s){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill in the fields");
                }
                else {
                    Con c1 = new Con();
                    String q1 = "insert into signupthree values('"+formNo+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formNo+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin :"+pin );
                    new Deposit(pin);
                    setVisible(false);

                }
             } else if (e.getSource()==c) {
                 System.exit(0);
             }
         }catch (Exception E){
                E.printStackTrace();
         }
    }

    public static void main(String[] args) {
        new SignUP3("")
;    }
}
