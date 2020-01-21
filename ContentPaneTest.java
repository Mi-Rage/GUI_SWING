import javax.swing.*;
import java.awt.*;

public class ContentPaneTest extends JFrame{
    public ContentPaneTest(){
        super("Test ContentPane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contents = new JPanel();
        // Создание панели с двумя кнопками
        contents.add(new JButton("Java12313132132"));
        contents.add(new JButton("PHP"));
        // Замена панели содержимого
        setContentPane(contents);
        // Определение размера окна
        setSize(300,100);
        // Открытие окна
        setVisible(true);

    }
    public static void main (String [] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ContentPaneTest();
    }
}
