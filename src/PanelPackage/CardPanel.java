package PanelPackage;
import MainPackage.CardPanelArrayList;

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

        EditButton = new JButton("Edit");
        DeleteButton = new JButton("Delete");
        EditButton.addActionListener(new EditButtonListener());
        DeleteButton.addActionListener(new DeleteButtonListener(this));

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
    private CardPanel cardPanel;
    public DeleteButtonListener(CardPanel cardPanel) {
        this.cardPanel = cardPanel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        CardPanelArrayList.removeCardPanelFromArrayList(cardPanel);
    }
}