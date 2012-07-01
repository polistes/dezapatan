import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.text.Document;
import java.net.URL;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Main extends JFrame implements ActionListener {

    private JTextField txtField = new JTextField(15);
    private JButton btn = new JButton("display");
    private Box labelBox = new Box(BoxLayout.X_AXIS);

    public Main(String title) {
        super(title);

        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // parts
        Box box = new Box(BoxLayout.Y_AXIS);
        box.add(txtField);
        box.add(btn);
        btn.addActionListener(this);

        box.add(labelBox);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(600, 600));
        panel.add(box);
        getContentPane().add(panel);

        displayImage("123");

        // show frame
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ev) {

        Document doc = txtField.getDocument();
        String txt = "";
        try {
            txt = doc.getText(0, doc.getLength());
        } catch (Exception e) {
            System.out.println("invalid text!");
        }

        displayImage(txt);

    }

    private void displayImage(String txt) {
        labelBox.removeAll();

        try {
            for (int i = 0;i < txt.length();i++) {
                JLabel label = new JLabel(ImageIconFactory.getImageIcon(txt.charAt(i)));
                labelBox.add(label);
            }
        } catch (Exception e){
            System.out.println("invalid text!");
        }
        labelBox.revalidate();
        repaint();
    }

    public static void main(String[] args) {
        new Main("flyweight サンプル");
    }
}
