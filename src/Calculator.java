import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.text.DecimalFormat;

public class Calculator {
    private JPanel Calculator;
    private JTextPane texDisblay;
    private JButton a2Button;
    private JButton a0Button;
    private JButton a00Button;
    private JButton a1Button;
    private JButton a5Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton button10;
    private JButton a8Button;
    private JButton a7Button;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton a4Button;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton logButton;
    private JButton x3Button;
    private JButton x2Button;
    private JButton nButton;
    private JButton tanhButton;
    private JButton sinhButton;
    private JButton coshButton;
    private JRadioButton ONRadioButton;
    private JRadioButton OFRadioButton;


    double a, b, result;
    String op;
    boolean checkEqual = false;

    DecimalFormat format = new DecimalFormat("0.###############");


    public Calculator() {

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texDisblay.setText(texDisblay.getText() + a7Button.getText());
                if (checkEqual == true) {
                    texDisblay.setText("7");
                    checkEqual = false;
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texDisblay.setText(texDisblay.getText() + a8Button.getText());
                if (checkEqual == true) {
                    texDisblay.setText("8");
                    checkEqual = false;
                }
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texDisblay.setText(texDisblay.getText() + a9Button.getText());
                if (checkEqual == true) {
                    texDisblay.setText("9");
                    checkEqual = false;
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texDisblay.setText(texDisblay.getText() + a4Button.getText());
                if (checkEqual == true) {
                    texDisblay.setText("4");
                    checkEqual = false;
                }
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texDisblay.setText(texDisblay.getText() + a5Button.getText());
                if (checkEqual == true) {
                    texDisblay.setText("5");
                    checkEqual = false;
                }
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texDisblay.setText(texDisblay.getText() + a6Button.getText());
                if (checkEqual == true) {
                    texDisblay.setText("6");
                    checkEqual = false;
                }
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texDisblay.setText(texDisblay.getText() + a1Button.getText());
                if (checkEqual == true) {
                    texDisblay.setText("1");
                    checkEqual = false;
                }
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texDisblay.setText(texDisblay.getText() + a2Button.getText());
                if (checkEqual == true) {
                    texDisblay.setText("2");
                    checkEqual = false;
                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texDisblay.setText(texDisblay.getText() + a3Button.getText());
                if (checkEqual == true) {
                    texDisblay.setText("3");
                    checkEqual = false;
                }
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texDisblay.setText(texDisblay.getText() + a00Button.getText());
                if (checkEqual == true) {
                    texDisblay.setText("00");
                    checkEqual = false;
                }

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texDisblay.setText(texDisblay.getText() + a0Button.getText());
                if (checkEqual == true) {
                    texDisblay.setText("0");
                    checkEqual = false;
                }
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texDisblay.setText(texDisblay.getText() + button10.getText());
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texDisblay.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backSpace = null;
                if (texDisblay.getText().length() > 0) {
                    StringBuilder stringBuilder = new StringBuilder(texDisblay.getText());
                    stringBuilder.deleteCharAt(texDisblay.getText().length() - 1);
                    backSpace = String.valueOf(stringBuilder);
                    texDisblay.setText(backSpace);
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texDisblay.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Error!!", "MESSAGE", JOptionPane.ERROR_MESSAGE);
                    texDisblay.setText("");
                } else a = Double.parseDouble(texDisblay.getText());
                op = "+";
                texDisblay.setText("");
            }

        });


        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texDisblay.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Error!!", "MESSAGE", JOptionPane.ERROR_MESSAGE);
                    texDisblay.setText("");
                } else
                    a = Double.parseDouble(texDisblay.getText());
                op = "-";
                texDisblay.setText("");
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texDisblay.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Error!!", "MESSAGE", JOptionPane.ERROR_MESSAGE);
                    texDisblay.setText("");
                } else
                    a = Double.parseDouble(texDisblay.getText());
                op = "*";
                texDisblay.setText("");
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texDisblay.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Error!!", "MESSAGE", JOptionPane.ERROR_MESSAGE);
                } else
                    a = Double.parseDouble(texDisblay.getText());
                op = "/";
                texDisblay.setText("");
            }
        });

        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(texDisblay.getText());

                if (op == "+") {
                    result = a + b;
                    texDisblay.setText(format.format(result));
                } else if (op == "-") {
                    result = a - b;
                    texDisblay.setText(format.format(result));
                } else if (op == "*") {
                    result = a * b;
                    texDisblay.setText(format.format(result));
                } else if (op == "/") {
                    result = a / b;
                    texDisblay.setText(format.format(result));

                }

                checkEqual = true;
            }
        });
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texDisblay.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Error!!", "MESSAGE", JOptionPane.ERROR_MESSAGE);
                } else {
                    double a = Math.sin(Math.toRadians(Double.parseDouble(texDisblay.getText())));
                    texDisblay.setText("");
                    texDisblay.setText(String.valueOf(a));
                    checkEqual = true;
                }
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texDisblay.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Error!!", "MESSAGE", JOptionPane.ERROR_MESSAGE);
                } else {
                    double a = Math.cos(Math.toRadians(Double.parseDouble(texDisblay.getText())));
                    texDisblay.setText("");
                    texDisblay.setText(String.valueOf(a));
                    checkEqual = true;
                }
            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texDisblay.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Error!!", "MESSAGE", JOptionPane.ERROR_MESSAGE);
                } else {
                    double a = Math.tan(Math.toRadians(Double.parseDouble(texDisblay.getText())));
                    texDisblay.setText("");
                    texDisblay.setText(String.valueOf(a));
                    texDisblay.setText(format.format(a));
                    checkEqual = true;
                }
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texDisblay.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Error!!", "MESSAGE", JOptionPane.ERROR_MESSAGE);
                } else {
                    double a = Math.log(Double.parseDouble(texDisblay.getText()));
                    texDisblay.setText("");
                    texDisblay.setText(String.valueOf(a));
                    texDisblay.setText(format.format(a));
                    checkEqual = true;

                }
            }
        });
        coshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texDisblay.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Error!!", "MESSAGE", JOptionPane.ERROR_MESSAGE);
                } else {
                    double a = Math.cosh(Math.toRadians(Double.parseDouble(texDisblay.getText())));
                    texDisblay.setText("");
                    texDisblay.setText(String.valueOf(a));
                    texDisblay.setText(format.format(a));
                    checkEqual = true;

                }
            }
        });
        sinhButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texDisblay.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Error!!", "MESSAGE", JOptionPane.ERROR_MESSAGE);
                } else {
                    double a = Math.sinh(Math.toRadians(Double.parseDouble(texDisblay.getText())));
                    texDisblay.setText("");
                    texDisblay.setText(String.valueOf(a));
                    texDisblay.setText(format.format(a));
                    checkEqual = true;

                }
            }
        });
        tanhButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texDisblay.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Error!!", "MESSAGE", JOptionPane.ERROR_MESSAGE);
                } else {
                    double a = Math.tanh(Math.toRadians(Double.parseDouble(texDisblay.getText())));
                    texDisblay.setText("");
                    texDisblay.setText(String.valueOf(a));
                    texDisblay.setText(format.format(a));
                    checkEqual = true;

                }
            }
        });
        x3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texDisblay.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Error!!", "MESSAGE", JOptionPane.ERROR_MESSAGE);
                } else {
                    double a = (Double.parseDouble(texDisblay.getText()));
                    a = a * a * a;
                    texDisblay.setText("");
                    texDisblay.setText(String.valueOf(a));
                    texDisblay.setText(format.format(a));
                    checkEqual = true;
                }
            }
        });
        x2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texDisblay.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Error!!", "MESSAGE", JOptionPane.ERROR_MESSAGE);
                } else {
                    double a = (int) (Double.parseDouble(texDisblay.getText()));
                    a = a * a;
                    texDisblay.setText("");
                    texDisblay.setText(String.valueOf(a));
                    texDisblay.setText(format.format(a));
                    checkEqual = true;
                }
            }
        });
        nButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texDisblay.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Error!!", "MESSAGE", JOptionPane.ERROR_MESSAGE);
                } else {
                    double a = (int) (Double.parseDouble(texDisblay.getText()));
                    a = Math.sqrt(a);
                    texDisblay.setText(String.valueOf(a));
                    texDisblay.setText(format.format(a));
                    checkEqual = true;

                }
            }
        });
        OFRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button16.setEnabled(false);
                button15.setEnabled(false);
                button17.setEnabled(false);
                button10.setEnabled(false);
                button18.setEnabled(false);
                cosButton.setEnabled(false);
                sinButton.setEnabled(false);
                sinhButton.setEnabled(false);
                coshButton.setEnabled(false);
                tanButton.setEnabled(false);
                tanhButton.setEnabled(false);
                a7Button.setEnabled(false);
                a00Button.setEnabled(false);
                a1Button.setEnabled(false);
                a2Button.setEnabled(false);
                a3Button.setEnabled(false);
                a4Button.setEnabled(false);
                a5Button.setEnabled(false);
                a6Button.setEnabled(false);
                a7Button.setEnabled(false);
                a8Button.setEnabled(false);
                a9Button.setEnabled(false);
                a0Button.setEnabled(false);
                logButton.setEnabled(false);
                x2Button.setEnabled(false);
                x3Button.setEnabled(false);
                nButton.setEnabled(false);
            }
        });
        ONRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button16.setEnabled(true);
                button15.setEnabled(true);
                button17.setEnabled(true);
                button10.setEnabled(true);
                button18.setEnabled(true);
                cosButton.setEnabled(true);
                sinButton.setEnabled(true);
                sinhButton.setEnabled(true);
                coshButton.setEnabled(true);
                tanButton.setEnabled(true);
                tanhButton.setEnabled(true);
                a7Button.setEnabled(true);
                a00Button.setEnabled(true);
                a1Button.setEnabled(true);
                a2Button.setEnabled(true);
                a3Button.setEnabled(true);
                a4Button.setEnabled(true);
                a5Button.setEnabled(true);
                a6Button.setEnabled(true);
                a7Button.setEnabled(true);
                a8Button.setEnabled(true);
                a9Button.setEnabled(true);
                a0Button.setEnabled(true);
                logButton.setEnabled(true);
                x2Button.setEnabled(true);
                x3Button.setEnabled(true);
                nButton.setEnabled(true);

            }
        });

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();


        frame.setVisible(true);


        frame.setLocationRelativeTo(null);

    }

}
