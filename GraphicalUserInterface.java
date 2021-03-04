import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GraphicalUserInterface {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("To-Do List");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(800, 600);
        jFrame.setMinimumSize(new Dimension(800, 600));

        JPanel textPanel = new JPanel();
        JTextField jTextField = new JTextField("Please enter a task here to add or remove.");
        textPanel.add(jTextField);

        JPanel toDoPanel = new JPanel();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> jList = new JList<>(listModel);
        toDoPanel.add(jList);

        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add Task");
        JButton removeButton = new JButton("Remove Task");
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        AddListener addListener = new AddListener(listModel, jTextField);
        addButton.addActionListener(addListener);
        RemoveListener removeListener = new RemoveListener(listModel, jTextField);
        removeButton.addActionListener(removeListener);

        jFrame.setLayout(new BoxLayout(jFrame.getContentPane(), BoxLayout.Y_AXIS));
        jFrame.add(toDoPanel);
        jFrame.add(textPanel);
        jFrame.add(buttonPanel);

        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
