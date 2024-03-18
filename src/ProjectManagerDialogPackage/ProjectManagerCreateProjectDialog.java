package ProjectManagerDialogPackage;
import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectManagerCreateProjectDialog extends JDialog{
    private static final JPanel projectManagerCreateProjectDialogTopPanel = new JPanel();
    private static final JPanel projectManagerCreateProjectDialogBottomPanel = new JPanel();
    private static final JTextField projectManagerCreateProjectDialogProjectNameTextField = new JTextField(10);
    private static final JTextArea projectManagerCreateProjectDialogProjectDescriptionTextArea = new JTextArea(3,20);
    private static final JScrollPane projectManagerCreateProjectDialogProjectDescriptioTextAreaScrollPane = new JScrollPane(projectManagerCreateProjectDialogProjectDescriptionTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    private static final JButton projectManagerCreateProjectDialogCreateButton = new JButton("Create");
    public static final JButton projectManagerCreateProjectDialogCancelButton = new JButton("Cancel");
    public ProjectManagerCreateProjectDialog(JFrame frame, String dialogName) {
        super(frame, dialogName);

        //Dialog top panel
        projectManagerCreateProjectDialogTopPanel.add(projectManagerCreateProjectDialogProjectNameTextField);
        projectManagerCreateProjectDialogTopPanel.add(projectManagerCreateProjectDialogProjectDescriptioTextAreaScrollPane);

        //Dialog bottom panel
        projectManagerCreateProjectDialogCreateButton.addActionListener(new ProjectManagerCreateProjectDialogCreateButtonListener());
        projectManagerCreateProjectDialogCancelButton.addActionListener(new ProjectManagerCreateProjectDialogCancelButtonListener(this));

        projectManagerCreateProjectDialogBottomPanel.add(projectManagerCreateProjectDialogCreateButton);
        projectManagerCreateProjectDialogBottomPanel.add(projectManagerCreateProjectDialogCancelButton);

        this.add(projectManagerCreateProjectDialogTopPanel);
        this.add(projectManagerCreateProjectDialogBottomPanel);

        this.setLayout(new FlowLayout());
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