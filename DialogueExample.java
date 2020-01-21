import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogueExample {
    public static void main(String[] args) {
        // Создаем окно
        JFrame frame = new JFrame("Диалоговое окно");
        // Определяем размеры
        frame.setSize(260,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Создаем панель с менеджером вертикального расположения компонентов
        JPanel contents = new JPanel(new FlowLayout());
        // Добавим кнопки и текстовое поле
        JButton button = new JButton("Событие");
        JTextField field = new JTextField(20);

        // Добавляем кнопку на панель
        contents.add(button);


        ActionListener listenner = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = JOptionPane.showInputDialog(
                        contents,
                        "<html><h2>Добро пожаловать</h2><p>Ваше имя?</p>"
                );

                JOptionPane.showInputDialog(contents, "Вы ввели ", result);

            }
        };

        button.addActionListener(listenner);

        frame.setContentPane(contents);
        frame.setVisible(true);
    }
}
