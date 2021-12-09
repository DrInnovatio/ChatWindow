// The Second commit
import javax.tools.Tool;
import java.awt.*;

class SignInUpWindowSub extends Frame {

    private Label iDlabel = new Label("ID");
    private Label passWordLabel = new Label("Password");

    private TextField iDtextFiled = new TextField();
    private TextField passTextField = new TextField();

    private Button loginButton = new Button("Log in");
    private Button signUpButton = new Button("Sign Up");

    private BorderLayout borderLayout = new BorderLayout(5,5);

    public SignInUpWindowSub(String str){
        super(str);
        this.init();
        //this.start();
        this.setSize(300, 200);
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // 화면 정중앙에.
        Dimension dimension = toolkit.getScreenSize();
        Dimension dimension1 = this.getSize();
        this.setLocation((int)(dimension.getWidth() / 2 - dimension1.getWidth() / 2),
                (int)(dimension.getHeight() / 2 - dimension1.getHeight() / 2));
        this.setVisible(true);
    }

    private void init() {
        this.setLayout(borderLayout);
        Panel panel = new Panel(new GridLayout(3,1,5,5));
        panel.add(iDlabel);
        panel.add(passWordLabel);
        panel.add(new Label());
        this.add("West", panel);

        Panel panel1 = new Panel(new GridLayout(3,1,5,5));
        panel1.add(iDtextFiled);
        passTextField.setEchoChar('*');
        panel1.add(passTextField);

        Panel panel2 = new Panel(new GridLayout(1,2,3,3));
        panel2.add(loginButton);
        panel2.add(signUpButton);
        panel1.add(panel2);
        this.add("Center", panel1);
    }

//    private void start() {
//    }

}

public class SignInUpWindow {
    public static void main(String[] args) {

        SignInUpWindowSub exeSignInUpWindow = new SignInUpWindowSub("LogIn");

    }
}