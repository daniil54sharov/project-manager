package PanelPackage;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardPanel extends JPanel{
    private JLabel NameLabel;
    private JLabel DescriptionLabel;
    private JButton EditButton;
    private JButton DeleteButton;
    public CardPanel(String Name, String Description) {

        NameLabel = new JLabel(Name);
        DescriptionLabel = new JLabel(Description);
        EditButton.addActionListener(new EditButtonListener());
        DeleteButton.addActionListener(new DeleteButtonListener());

        EditButton = new JButton("Edit");
        DeleteButton = new JButton("Delete");

        this.add(NameLabel);
        this.add(DescriptionLabel);
        this.add(EditButton);
        this.add(DeleteButton);
    }
}

class EditButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

class DeleteButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}