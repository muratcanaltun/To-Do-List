import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddListener implements ActionListener {
    private DefaultListModel<String> defaultListModel;
    private JTextField jTextField;

    public AddListener(DefaultListModel<String> defaultListModel, JTextField jTextField) {
        this.jTextField = jTextField;
        this.defaultListModel = defaultListModel;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        defaultListModel.add(defaultListModel.getSize(), jTextField.getText());
    }
}
