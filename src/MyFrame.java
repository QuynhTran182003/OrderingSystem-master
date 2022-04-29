import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JLabel welcome;
    JButton buttStart;

    public MyFrame (){
        this.setTitle("Welcome to");
        this.setSize(800,600);
        this.getContentPane().setBackground(new Color(117, 104, 87));
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        welcome = new JLabel("Welcome to THE CLAUS RESTAURANT!", SwingConstants.CENTER);
        welcome.setBounds(0,200, this.getWidth(), 50);
        welcome.setFont(new Font("Times New Roman", Font.BOLD, 30));
        welcome.setForeground(new Color(245, 241, 237));

        buttStart = new JButton("Start Ordering");
        buttStart.setLocation(300,450);
        buttStart.setSize(200,50);
        buttStart.setBackground(new Color(245, 241, 237));

        this.add(welcome);
        this.add(buttStart);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttStart){
            this.dispose();
            Menu menuFr = new Menu();
        }
    }
}
