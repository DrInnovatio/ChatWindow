import javax.swing.*;
import java.awt.*;

class MainChatWindowSub extends JFrame {

    private BorderLayout bl = new BorderLayout(5,5);
    private TextArea ta = new TextArea();
    private Label lb1 = new Label("Talking : ", Label.RIGHT);
    private TextField tf1 = new TextField();
    private Button bt1 = new Button("Send");

    private Button bt2 = new Button("LogOut");



    public MainChatWindowSub(String str){
        super(str);
        this.init();
        this.start();
        this.setSize(500, 400);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension di = tk.getScreenSize();
        Dimension di1 = this.getSize();
        this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), (int)(di.getHeight() / 2 - di1.getHeight() / 2));
        //this.pack();
        this.setVisible(true);


    }

    private void start() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void init(){
        this.setLayout(bl);
        Panel p = new Panel(new BorderLayout(2,2));

        Panel p1 = new Panel(new BorderLayout());
        p.add("North", p1);
        p.add("Center", ta);
        Panel p2 = new Panel(new BorderLayout());
        p2.add("West", lb1);
        p2.add("Center", tf1);
        p2.add("East", bt1);
        p.add("South", p2);
        this.add("Center", p);
        Panel p3 = new Panel(new BorderLayout(2,2));
        Panel p4 = new Panel(new BorderLayout());
        p3.add("North", p4 );
        Panel p6 = new Panel(new BorderLayout());
        Panel p7 = new Panel(new GridLayout(3,1 ));
        p6.add("South", p7);
        p3.add("Center", p6);

        Panel p5 = new Panel(new GridLayout(1,1));
        p5.add(bt2);
        p3.add("North", p5);
        this.add("East", p3);
    }
}

public class MainChatWindow {

    public static void main(String[] args) {
        MainChatWindowSub exe = new MainChatWindowSub("KakaoTook");
    }
}