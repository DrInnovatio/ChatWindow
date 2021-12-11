import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.awt.*;
        import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;

public class TextFieldTest extends JFrame implements ActionListener
{
    JTextField textField;
    JButton submitButton = new JButton("Submit");


    public TextFieldTest()
    {
        JPanel myPanel = new JPanel();
        add(myPanel);
        myPanel.setLayout(new GridLayout(3, 2));
        textField = new JTextField();
        myPanel.add(textField);
        myPanel.add(submitButton);
        submitButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent actionEvent)
    {

        if (actionEvent.getSource() == submitButton) {
            String[] array = new String[20];
            String data = textField.getText();

            int i = 0;
            array[i] = data;
            System.out.println(array[i]);

            for(int j = 0; j < array.length; j++){
                if(array[i] == data){
                    System.out.println("you cannot. ");
                } else {
                    array[i] = data;
                }
                System.out.println(array[i]);
            }
            System.out.println("======");
                System.out.println(array[i]);
        }
    }

    public static void main(String args[])
    {
        TextFieldTest g = new TextFieldTest();
        g.setLocation(10, 10);
        g.setSize(300, 300);
        g.setVisible(true);
    }
}