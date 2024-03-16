package ProjectManagerDialogPackage;
import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectManagerCreateProjectDialog extends JDialog{
    private static final JPanel projectManagerCreateProjectDialogTopPanel = new JPanel(new FlowLayout());
    private static final JPanel projectManagerCreateProjectDialogBottomPanel = new JPanel(new FlowLayout());
    private static final JTextField projectManagerCreateProjectDialogProjectNameTextField = new JTextField(20);
    private static final JTextArea projectManagerCreateProjectDialogProjectDescriptionTextArea = new JTextArea(3,20);
    private static final JButton projectManagerCreateProjectDialogCreateButton = new JButton("Create");
    public static final JButton projectManagerCreateProjectDialogCancelButton = new JButton("Cancel");
    public ProjectManagerCreateProjectDialog(JFrame frame, String dialogName) {
        super(frame, dialogName);

        //Dialog top panel
        projectManagerCreateProjectDialogCreateButton.addActionListener(new ProjectManagerCreateProjectDialogCreateButtonListener());
        projectManagerCreateProjectDialogCancelButton.addActionListener(new ProjectManagerCreateProjectDialogCancelButtonListener(this));

        projectManagerCreateProjectDialogTopPanel.add(projectManagerCreateProjectDialogProjectNameTextField);
        projectManagerCreateProjectDialogTopPanel.add(projectManagerCreateProjectDialogProjectDescriptionTextArea);

        //Dialog bottom panel
        projectManagerCreateProjectDialogBottomPanel.add(projectManagerCreateProjectDialogCreateButton);
        projectManagerCreateProjectDialogBottomPanel.add(projectManagerCreateProjectDialogCancelButton);

        this.add(projectManagerCreateProjectDialogTopPanel);
        this.add(projectManagerCreateProjectDialogBottomPanel);

        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setSize(400, 200);
        this.setResizable(false);
        this.setModal(true);
    }
}

class ProjectManagerCreateProjectDialogCreateButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

class ProjectManagerCreateProjectDialogCancelButtonListener implements ActionListener {
    ProjectManagerCreateProjectDialog projectManagerCreateProjectDialog;
    public ProjectManagerCreateProjectDialogCancelButtonListener(ProjectManagerCreateProjectDialog projectManagerCreateProjectDialog) {
        this.projectManagerCreateProjectDialog = projectManagerCreateProjectDialog;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        projectManagerCreateProjectDialog.dispose();
    }
}