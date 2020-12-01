import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Key;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class GUI implements ActionListener {

    private static JPanel panel;
    private static JFrame frame;
    private static JLabel vLabel;
    private static JLabel pLabel;
    private static JTextField pField;
    private static JLabel aLabel;
    private static JTextField aField;
    private static JLabel bLabel;
    private static JTextField bField;
    private static JLabel qLabel;
    private static JTextField qField;
    private static JLabel rLabel;
    private static JTextField rField;

    private static JLabel ptLabel;
    private static JLabel P1Label;
    private static JTextField P1Field;
    private static JLabel P2Label;
    private static JTextField P2Field;
    private static JLabel fpLabel;
    private static JLabel xLabel;
    private static JTextField xField;
    private static JLabel yLabel;
    private static JTextField yField;
    private static JButton gen;
    private static JButton res;

    private static JTextArea output;

    public String p, a, b, q, r;
    public double pdo, ado, bdo, qdo, rdo;

    public GUI() {
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(500, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("Elliptic Curse");

        panel.setLayout(null);

        vLabel = new JLabel("Masukkan Variabel");
        vLabel.setBounds(10, 20, 165, 25);
        panel.add(vLabel);

        pLabel = new JLabel("p");
        pLabel.setBounds(10, 50, 80, 25);
        panel.add(pLabel);

        pField = new JTextField(10);
        pField.setBounds(30, 50, 165, 25);
        pField.setSize(35, 25);
        panel.add(pField);

        aLabel = new JLabel("a");
        aLabel.setBounds(10, 80, 80, 25);
        panel.add(aLabel);

        aField = new JTextField(10);
        aField.setBounds(30, 80, 165, 25);
        aField.setSize(35, 25);
        panel.add(aField);

        bLabel = new JLabel("b");
        bLabel.setBounds(10, 110, 80, 25);
        panel.add(bLabel);

        bField = new JTextField(10);
        bField.setBounds(30, 110, 165, 25);
        bField.setSize(35, 25);
        panel.add(bField);

        qLabel = new JLabel("q");
        qLabel.setBounds(10, 140, 80, 25);
        panel.add(qLabel);

        qField = new JTextField(10);
        qField.setBounds(30, 140, 165, 25);
        qField.setSize(35, 25);
        panel.add(qField);

        rLabel = new JLabel("r");
        rLabel.setBounds(10, 170, 80, 25);
        panel.add(rLabel);

        rField = new JTextField(10);
        rField.setBounds(30, 170, 165, 25);
        rField.setSize(35, 25);
        panel.add(rField);

        ptLabel = new JLabel("Masukkan Plaintext");
        ptLabel.setBounds(165, 20, 165, 25);
        panel.add(ptLabel);

        P1Label = new JLabel("P1");
        P1Label.setBounds(165, 50, 80, 25);
        panel.add(P1Label);

        P1Field = new JTextField(10);
        P1Field.setBounds(185, 50, 165, 25);
        P1Field.setSize(35, 25);
        panel.add(P1Field);

        P2Label = new JLabel("P1");
        P2Label.setBounds(165, 80, 80, 25);
        panel.add(P2Label);

        P2Field = new JTextField(10);
        P2Field.setBounds(185, 80, 165, 25);
        P2Field.setSize(35, 25);
        panel.add(P2Field);

        fpLabel = new JLabel("Masukkan Fungsi Pembangkit");
        fpLabel.setBounds(165, 110, 200, 25);
        panel.add(fpLabel);

        xLabel = new JLabel("x");
        xLabel.setBounds(165, 140, 80, 25);
        panel.add(xLabel);

        xField = new JTextField(10);
        xField.setBounds(185, 140, 165, 25);
        xField.setSize(35, 25);
        panel.add(xField);

        yLabel = new JLabel("y");
        yLabel.setBounds(165, 170, 80, 25);
        panel.add(yLabel);

        yField = new JTextField(10);
        yField.setBounds(185, 170, 165, 25);
        yField.setSize(35, 25);
        panel.add(yField);

        gen = new JButton("GENERATE KEY");
        gen.setBounds(10, 220, 250, 25);
        gen.addActionListener(this);
        panel.add(gen);

        res = new JButton("RESULT");
        res.setBounds(10, 255, 250, 25);
        panel.add(res);

        output = new JTextArea(" ", 10, 10);
        output.setBounds(10, 290, 250, 500);
        panel.add(output);
        

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        p = pField.getText();
        a = aField.getText();
        b = bField.getText();
        q = qField.getText();
        r = rField.getText();
        pdo = Double.parseDouble(p);
        ado = Double.parseDouble(a);
        bdo = Double.parseDouble(b);
        qdo = Double.parseDouble(q);
        rdo = Double.parseDouble(r);
        System.out.println("ya");
        key Key = new key(29);
        Key.run();

        for (int i = 0; i < 29; i++) {
            output.append(Key.inihasilAnjing[i] + "\n");
        }
    }
}
