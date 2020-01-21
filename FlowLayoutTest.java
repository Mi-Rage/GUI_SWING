import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest extends JFrame {
    public FlowLayoutTest() {
        super("Flow Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        // Панель содержимого
        Container container = getContentPane();
        /**
         * Определение последовательного расположения
         * с выравниванием компонентов к центру
         */
        container.setLayout(new FlowLayout(FlowLayout.CENTER)); // Один из вавриантов выравнивания
        // добавляем компоненты
        container.add(new JButton("Школа"));
        container.add(new JButton("Институт"));
        container.add(new JButton("Академия"));
        // Открываем окно
        setVisible(true);
    }
    public static void main (String[] args){
        new FlowLayoutTest();
    }
}
