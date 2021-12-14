import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Objects;

class SignUpWindowSub extends JFrame {

    private Label emaillabel = new Label("ID");
    private Label passWordLabel = new Label("Password");
    private Label passWordAgainLabel = new Label(("Password again"));
    private Label warning = new Label();

    private JTextField emailField = new JTextField();
    private TextField passTextField = new TextField();
    private TextField passWordAgainLabelField = new TextField();


    private Button signUpButton = new Button("Sign Up");
    private Button checkEmail = new Button("Check the Email");

    private BorderLayout borderLayout = new BorderLayout(5,5);

    private BufferedReader br = new BufferedReader(new FileReader("ids.txt"));
    private BufferedReader passwordsReaded = new BufferedReader(new FileReader("passwords.txt"));
    private BufferedReader br2 = new BufferedReader(new FileReader("ids.txt"));

    private BufferedWriter bw = new BufferedWriter(new FileWriter("bbb.txt"));
    private String toBeWrite = emailField.getText() + " , " + passWordAgainLabelField.getText();






    public SignUpWindowSub(String str) throws IOException {

        super(str);
        this.init();
        //this.start();
        this.setSize(500, 400);
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // 화면 정중앙에.
        Dimension dimension = toolkit.getScreenSize();
        Dimension dimension1 = this.getSize();
        this.setLocation((int)(dimension.getWidth() / 2 - dimension1.getWidth() / 2),
                (int)(dimension.getHeight() / 2 - dimension1.getHeight() / 2));
        this.setVisible(true);
    }

    private void ApproveMembership(){

        checkEmail.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String contentLine = null;

                try {
                    contentLine = br.readLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                System.out.println(contentLine);

                String emailA = emailField.getText();

                if(Objects.equals(emailA, contentLine)){
                    System.out.println("Sorry, the ID already exists.");
                    String c = "the ID already exists.";
                    warning.setText(c);

                } else {
                    System.out.println("You can join.");
                    String c = "You can join.";
                    warning.setText(c);
                }
            }
        });

        signUpButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String k = String.valueOf(passTextField.getText());
                String q = String.valueOf(passWordAgainLabelField.getText());

                System.out.println("Sign up clicked");

                if(Objects.equals(k, q)){
                    System.out.println("Join and enjoy now.");

                } else {
                    System.out.println("The passwords do not match.");
                }

                PrintWriter fw = null;
                try {
                    fw = new PrintWriter("ids.txt", "UTF-8");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(passWordAgainLabel.getText());
                    bw.newLine();

                } catch (IOException e1) {
                    e1.printStackTrace();
                } finally {
                    fw.close();
                }
                new MainChatWindowSub(null);
            }

        });

    }

    private void init() {
        this.setLayout(borderLayout);
        Panel panel = new Panel(new GridLayout(4,1,5,5));
        panel.add(emaillabel);
        panel.add(passWordLabel);
        panel.add(passWordAgainLabel);
        panel.add(warning);
        this.add("West", panel);

        Panel panel1 = new Panel(new GridLayout(5,1,5,5));
        panel1.add(emailField);
        panel1.add(checkEmail);
        passTextField.setEchoChar('*');
        panel1.add(passTextField);
        passWordAgainLabelField.setEchoChar('*');
        panel1.add(passWordAgainLabelField);
        this.add("East", panel1);

        Panel panel2 = new Panel(new GridLayout(1,1,3,3));
        panel2.add(signUpButton);
        panel1.add(panel2);
        this.add("Center", panel1);

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        ApproveMembership();
    }

    private void start() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class SignUpWindow {
    public static void main(String[] args) throws IOException {

        SignUpWindowSub exeSignInUpWindow = new SignUpWindowSub("Sign UP! Join us today!!");

    }
}