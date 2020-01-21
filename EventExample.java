import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventExample {
    public static void main(String[] args) {
        // Создаем окно
        JFrame frame = new JFrame("Vertical Layout Test");
        // Определим размеры
        frame.setSize(260,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Создаем панель с менеджером вертикального расположения
        JPanel contents = new JPanel(new FlowLayout()); // Добавим кнопку
        JButton button = new JButton("Событие");
        // Добавляем кнопку на панель
        contents.add(button);
        // Создаем слушатель для кнопки
        ActionListener listener = new ActionListener() {
            // В теле создаем поведение, которое будет выполняться при нажатии на кнопку
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed...");
            }
        };
        // Устанавливаем слушатель
        button.addActionListener(listener);
        // Размещаем панель в контейнере
        frame.setContentPane(contents);
        frame.setVisible(true);
    }
}
