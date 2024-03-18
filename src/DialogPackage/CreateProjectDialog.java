package DialogPackage;
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

public class CreateProjectDialog extends JDialog{
    private static final JPanel TopPanel = new JPanel();
    private static final JPanel BottomPanel = new JPanel();
    private static final JTextField NameTextField = new JTextField(10);
    private static final JTextArea DescriptionTextArea = new JTextArea(3,20);
    private static final JScrollPane TextAreaScrollPane = new JScrollPane(DescriptionTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    private static final JButton CreateButton = new JButton("Create");
    public static final JButton CancelButton = new JButton("Cancel");
    public CreateProjectDialog(JFrame frame, String dialogName) {
        super(frame, dialogName);

        //Dialog top panel
        TopPanel.add(NameTextField);
        TopPanel.add(TextAreaScrollPane);

        //Dialog bottom panel
        CreateButton.addActionListener(new CreateButtonListener());
        CancelButton.addActionListener(new CancelButtonListener(this));

        BottomPanel.add(CreateButton);
        BottomPanel.add(CancelButton);

        this.add(TopPanel);
        this.add(BottomPanel);

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setSize(400, 200);
        this.setResizable(false);
        this.setModal(true);
    }
}

class CreateButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

class CancelButtonListener implements ActionListener {
    CreateProjectDialog CreateProjectDialog;
    public CancelButtonListener(CreateProjectDialog projectManagerCreateProjectDialog) {
        this.CreateProjectDialog = projectManagerCreateProjectDialog;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        CreateProjectDialog.dispose();
    }
}