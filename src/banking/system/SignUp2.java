package banking.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener {

    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAadhar;

    JButton next;
    JRadioButton r1,r2,e1,e2;
   String formNo;

    SignUp2(String formNo) {
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        this.add(image);

        this.formNo = formNo;

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway", 1, 22));
        l1.setBounds(300, 30, 600, 40);
        this.add(l1);

        JLabel l2 = new JLabel("Additonal Details");
        l2.setFont(new Font("Raleway", 1, 22));
        l2.setBounds(300, 60, 600, 40);
        this.add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", 1, 18));
        l3.setBounds(100, 120, 100, 30);
        this.add(l3);

        String[] religion = new String[]{"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        this.comboBox = new JComboBox(religion);
        this.comboBox.setBackground(new Color(252, 208, 76));
        this.comboBox.setFont(new Font("Raleway", 1, 14));
        this.comboBox.setBounds(350, 120, 320, 30);
        this.add(this.comboBox);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", 1, 18));
        l4.setBounds(100, 170, 100, 30);
        this.add(l4);

        String[] Category = new String[]{"General", "OBC", "SC", "ST", "Other"};
        this.comboBox2 = new JComboBox(Category);
        this.comboBox2.setBackground(new Color(252, 208, 76));
        this.comboBox2.setFont(new Font("Raleway", 1, 14));
        this.comboBox2.setBounds(350, 170, 320, 30);
        this.add(this.comboBox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", 1, 18));
        l5.setBounds(100, 220, 100, 30);
        this.add(l5);

        String[] income = new String[]{"Null", "<1,50,000", "<2,50,000", "5,00,000", "Uptp 10,00,000", "Above 10,00,000"};
        this.comboBox3 = new JComboBox(income);
        this.comboBox3.setBackground(new Color(252, 208, 76));
        this.comboBox3.setFont(new Font("Raleway", 1, 14));
        this.comboBox3.setBounds(350, 220, 320, 30);
        this.add(this.comboBox3);

        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway", 1, 18));
        l6.setBounds(100, 270, 150, 30);
        this.add(l6);

        String[] educational = new String[]{"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        this.comboBox4 = new JComboBox(educational);
        this.comboBox4.setBackground(new Color(252, 208, 76));
        this.comboBox4.setFont(new Font("Raleway", 1, 14));
        this.comboBox4.setBounds(350, 270, 320, 30);
        this.add(this.comboBox4);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", 1, 18));
        l7.setBounds(100, 340, 150, 30);
        this.add(l7);

        String[] Occupation = new String[]{"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        this.comboBox5 = new JComboBox(Occupation);
        this.comboBox5.setBackground(new Color(252, 208, 76));
        this.comboBox5.setFont(new Font("Raleway", 1, 14));
        this.comboBox5.setBounds(350, 340, 320, 30);
        this.add(this.comboBox5);

        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway", 1, 18));
        l8.setBounds(100, 390, 150, 30);
        this.add(l8);

        this.textPan = new JTextField();
        this.textPan.setFont(new Font("Raleway", 1, 18));
        this.textPan.setBounds(350, 390, 320, 30);
        this.add(this.textPan);

        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway", 1, 18));
        l9.setBounds(100, 440, 180, 30);
        this.add(l9);

        this.textAadhar = new JTextField();
        this.textAadhar.setFont(new Font("Raleway", 1, 18));
        this.textAadhar.setBounds(350, 440, 320, 30);
        this.add(this.textAadhar);

        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", 1, 18));
        l10.setBounds(100, 490, 180, 30);
        this.add(l10);

        this.r1 = new JRadioButton("Yes");
        this.r1.setFont(new Font("Raleway", 1, 14));
        this.r1.setBackground(new Color(252, 208, 76));
        this.r1.setBounds(350, 490, 100, 30);
        this.add(this.r1);

        this.r2 = new JRadioButton("No");
        this.r2.setFont(new Font("Raleway", 1, 14));
        this.r2.setBackground(new Color(252, 208, 76));
        this.r2.setBounds(460, 490, 100, 30);
        this.add(this.r2);

        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", 1, 18));
        l11.setBounds(100, 540, 180, 30);
        this.add(l11);

        this.e1 = new JRadioButton("Yes");
        this.e1.setFont(new Font("Raleway", 1, 14));
        this.e1.setBackground(new Color(252, 208, 76));
        this.e1.setBounds(350, 540, 100, 30);
        this.add(this.e1);

        this.e2 = new JRadioButton("No");
        this.e2.setFont(new Font("Raleway", 1, 14));
        this.e2.setBackground(new Color(252, 208, 76));
        this.e2.setBounds(460, 540, 100, 30);
        this.add(this.e2);

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", 1, 14));
        l12.setBounds(700, 10, 100, 30);
        this.add(l12);

        JLabel l13 = new JLabel(formNo);
        l13.setFont(new Font("Raleway", 1, 14));
        l13.setBounds(760, 10, 60, 30);
        this.add(l13);

        this.next = new JButton("Next");
        this.next.setFont(new Font("Raleway", 1, 14));
        this.next.setBackground(Color.WHITE);
        this.next.setForeground(Color.BLACK);
        this.next.setBounds(570, 640, 100, 30);
        this.next.addActionListener(this);
        this.add(this.next);

        this.setLayout((LayoutManager)null);
        this.setSize(850, 750);
        this.setLocation(450, 80);
        this.getContentPane().setBackground(new Color(252, 208, 76));
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String)this.comboBox.getSelectedItem();
        String cate = (String)this.comboBox2.getSelectedItem();
        String inc = (String)this.comboBox3.getSelectedItem();
        String edu = (String)this.comboBox4.getSelectedItem();
        String occ = (String)this.comboBox5.getSelectedItem();
        String pan = this.textPan.getText();
        String addhar = this.textAadhar.getText();
        String scitizen = " ";
        if (this.r1.isSelected()) {
            scitizen = "Yes";
        } else if (this.r2.isSelected()) {
            scitizen = "No";
        }

        String eAccount = " ";
        if (this.r1.isSelected()) {
            eAccount = "Yes";
        } else if (this.r2.isSelected()) {
            eAccount = "No";
        }

        try {
            if (!this.textPan.getText().equals("") && !this.textAadhar.getText().equals("")) {
                Con c = new Con();
                String q = "insert into signuptwo values('" + this.formNo + "', '" + rel + "', '" + cate + "','" + inc + "','" + edu + "','" + occ + "','" + pan + "','" + addhar + "','" + scitizen + "','" + eAccount + "')";
                c.statement.executeUpdate(q);
                new SignUP3(formNo);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog((Component)null, "Fill all the fields");
            }
        } catch (Exception var13) {
            var13.printStackTrace();
        }

    }

    public static void main(String[] args) {
      new SignUp2("");
    }
}
