
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JLabel Label2;
    private JCheckBox Checkbox1;
    private JLabel Label3;
    private JRadioButton Radio;
    private JRadioButton Radio2;
    private JTextArea Descriere;

    public Test(){
        prepareGUI();
    }
    public static void main(String[] args){
        Test  Test = new Test();
        Test.showTextFieldDemo();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Java Swing Examples");
        mainFrame.setSize(600,600);
        mainFrame.setLayout(new GridLayout(6, 2));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.LEFT);
        Label2 = new JLabel("Label2", JLabel.LEFT);
        statusLabel.setSize(350,100);
        Checkbox1 = new JCheckBox("check");
        Label3 = new JLabel("Label3:", JLabel.LEFT);
        Radio = new JRadioButton("Radio");
        Radio2 = new JRadioButton("Radio2");
        Descriere = new JTextArea("TEXT AREA", 4, 20);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.add(Label2);
        mainFrame.add(Checkbox1);
        mainFrame.add(Label3);
        mainFrame.add(Radio);
        mainFrame.add(Radio2);
        mainFrame.add(Descriere);
        mainFrame.setVisible(true);
    }
    private void showTextFieldDemo(){
        headerLabel.setText("JAVA 2023");

        JLabel  namelabel= new JLabel("Nume: ", JLabel.RIGHT);
        final JTextField userText = new JTextField(6);

        JButton loginButton = new JButton("Inregistrare");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Nume:" + userText.getText();

                statusLabel.setText(data);


                Radio.setMnemonic(KeyEvent.VK_C);
                Radio2.setMnemonic(KeyEvent.VK_M);
                Radio.addItemListener(new ItemListener() {
                    public void itemStateChanged(ItemEvent e) {
                        statusLabel.setText("Radio1: "
                                + (e.getStateChange()==1?"checked":"unchecked"));
                    }
                });
                Radio2.addItemListener(new ItemListener() {
                    public void itemStateChanged(ItemEvent e) {
                        statusLabel.setText("Radio2: "
                                + (e.getStateChange()==1?"checked":"unchecked"));
                    }
                });
            }
        });

        ButtonGroup group = new ButtonGroup();

        group.add(Radio);
        group.add(Radio2);

        controlPanel.add(namelabel);
        controlPanel.add(userText);
        controlPanel.add(Label2);
        controlPanel.add(Checkbox1);
        controlPanel.add(Label3);
        controlPanel.add(Radio);
        controlPanel.add(Radio2);
        controlPanel.add(Descriere);
        controlPanel.add(loginButton);

        mainFrame.setVisible(true);
    }
}