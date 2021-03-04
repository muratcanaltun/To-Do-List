import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveListener implements ActionListener {
    JTextField jTextField;
    DefaultListModel<String> defaultListModel;

    public RemoveListener(DefaultListModel defaultListModel, JTextField jTextField) {
        this.defaultListModel = defaultListModel;
        this.jTextField = jTextField;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        for (int i = 0; i < defaultListModel.size(); i++) {
            if (jTextField.getText().equals(defaultListModel.get(i))) {
                defaultListModel.remove(i);
            }
        }

        jTextField.setText("Please enter a task here to add or remove.");
    }
}
