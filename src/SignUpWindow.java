import java.awt.*;
import javax.tools.Tool;
import javax.swing.*;

class SignUpWindowSub extends Frame {

    private Label emaillabel = new Label("ID");
    private Label passWordLabel = new Label("Password");
    private Label passWordAgainLabel = new Label(("Password again"));

    private TextField emailField = new TextField();
    private TextField passTextField = new TextField();
    private TextField passWordAgainLabelField = new TextField();

    private Button signUpButton = new Button("Sign Up");
    private Button checkEmail = new Button("Check the Email");

    private BorderLayout borderLayout = new BorderLayout(5,5);

    public SignUpWindowSub(String str){
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

    private void init() {
        this.setLayout(borderLayout);
        Panel panel = new Panel(new GridLayout(4,1,5,5));
        panel.add(emaillabel);
        panel.add(passWordLabel);
        panel.add(passWordAgainLabel);
        //panel.add(new Label());
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

    }

    private void start() {

    }

}

public class SignUpWindow {
    public static void main(String[] args) {

        SignUpWindowSub exeSignInUpWindow = new SignUpWindowSub("Sign UP! Join us today!!");

    }
}
