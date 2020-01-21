import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventExampleTextEnter {
    public static void main(String[] args) {
        // Создаем окно
        JFrame frame = new JFrame("Vertical Layout Test");
        // Определим размеры
        frame.setSize(260,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Создаем панель с менеджером вертикального расположения
        JPanel contents = new JPanel(new FlowLayout()); // Добавим кнопки и текстовое поле
        JButton button = new JButton("Событие");
        JTextField field = new JTextField(20);
        // Добавляем кнопку на панель
        contents.add(button);
        contents.add(field);
        // Создаем слушатель для кнопки
        ActionListener listener = new ActionListener() {
            // В теле создаем поведение, которое будет выполняться при нажатии на кнопку
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("Button pressed... ");
                System.out.println("Your message: " + field.getText());
                System.out.println(e.getClass() + " " + e.getWhen() + " " + e.getActionCommand());

            }
        };
        // Создаем слушатель для текстовоно поля
        ActionListener fieldListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Your message: " + field.getText());
            }
        };
        // Устанавливаем слушатель
        button.addActionListener(listener);
        field.addActionListener(fieldListener);

        // Размещаем панель в контейнере
        frame.setContentPane(contents);
        frame.setVisible(true);
    }
}
