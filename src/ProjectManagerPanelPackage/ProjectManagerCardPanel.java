package ProjectManagerPanelPackage;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectManagerCardPanel extends JPanel{
    private String projectManagerCardPanelName;
    private String projectManagerCardPanelDescription;
    private JLabel projectManagerCardPanelNameLabel;
    private JLabel projectManagerCardPanelDescriptionLabel;
    private JButton projectManagerCardPanelEditButton;
    private JButton projectManagerCardPanelDeleteButton;
    public ProjectManagerCardPanel(String projectManagerCardPanelName, String projectManagerCardPanelDescription) {
        this.projectManagerCardPanelName = projectManagerCardPanelName;
        this.projectManagerCardPanelDescription = projectManagerCardPanelDescription;

        projectManagerCardPanelNameLabel = new JLabel(projectManagerCardPanelName);
        projectManagerCardPanelDescriptionLabel = new JLabel(projectManagerCardPanelDescription);
        projectManagerCardPanelEditButton.addActionListener(new ProjectManagerCardPanelEditButtonListener());
        projectManagerCardPanelDeleteButton.addActionListener(new ProjectManagerCardPanelDeleteButtonListener());

        projectManagerCardPanelEditButton = new JButton("Edit");
        projectManagerCardPanelDeleteButton = new JButton("Delete");

        this.add(projectManagerCardPanelNameLabel);
        this.add(projectManagerCardPanelDescriptionLabel);
        this.add(projectManagerCardPanelEditButton);
        this.add(projectManagerCardPanelDeleteButton);
    }
}

class ProjectManagerCardPanelEditButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

class ProjectManagerCardPanelDeleteButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}