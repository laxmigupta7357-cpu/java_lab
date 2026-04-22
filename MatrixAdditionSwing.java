import javax.swing.*;
import java.awt.event.*;

public class MatrixAdditionSwing {

    public static void main(String[] args) {

        JFrame f = new JFrame("Matrix Addition");

        // Matrix A fields
        JTextField a11 = new JTextField();
        JTextField a12 = new JTextField();
        JTextField a21 = new JTextField();
        JTextField a22 = new JTextField();

        // Matrix B fields
        JTextField b11 = new JTextField();
        JTextField b12 = new JTextField();
        JTextField b21 = new JTextField();
        JTextField b22 = new JTextField();

        // Result fields
        JTextField r11 = new JTextField();
        JTextField r12 = new JTextField();
        JTextField r21 = new JTextField();
        JTextField r22 = new JTextField();

        JButton addBtn = new JButton("Add");

        // Set bounds (Matrix A)
        a11.setBounds(50,50,40,30);
        a12.setBounds(100,50,40,30);
        a21.setBounds(50,90,40,30);
        a22.setBounds(100,90,40,30);

        // Matrix B
        b11.setBounds(200,50,40,30);
        b12.setBounds(250,50,40,30);
        b21.setBounds(200,90,40,30);
        b22.setBounds(250,90,40,30);

        // Result Matrix
        r11.setBounds(350,50,40,30);
        r12.setBounds(400,50,40,30);
        r21.setBounds(350,90,40,30);
        r22.setBounds(400,90,40,30);

        // Button
        addBtn.setBounds(200,150,80,30);

        // Add components
        f.add(a11); f.add(a12); f.add(a21); f.add(a22);
        f.add(b11); f.add(b12); f.add(b21); f.add(b22);
        f.add(r11); f.add(r12); f.add(r21); f.add(r22);
        f.add(addBtn);

        // Button action
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int A11 = Integer.parseInt(a11.getText());
                int A12 = Integer.parseInt(a12.getText());
                int A21 = Integer.parseInt(a21.getText());
                int A22 = Integer.parseInt(a22.getText());

                int B11 = Integer.parseInt(b11.getText());
                int B12 = Integer.parseInt(b12.getText());
                int B21 = Integer.parseInt(b21.getText());
                int B22 = Integer.parseInt(b22.getText());

                r11.setText(""+(A11+B11));
                r12.setText(""+(A12+B12));
                r21.setText(""+(A21+B21));
                r22.setText(""+(A22+B22));
            }
        });

        f.setSize(500,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}