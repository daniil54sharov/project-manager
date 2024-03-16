package ProjectManagerPackage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class ProjectManager {
    private static final String appName = "Project manager";
    private static final JFrame projectManagerMainFrame = new JFrame(appName);
    private static final JPanel projectManagerMainPanel = new JPanel();
    private static final JLabel projectManagerMainPanelProjectsLabel = new JLabel("Projects: ");
    public static JMenuBar projectManagerMenuBar = new JMenuBar();

    //JMenuBar items
    private static final JMenu projectManagerMenuFile = new JMenu("File");
    private static final JMenu projectManagerMenuEdit = new JMenu("Edit");
    private static final JMenu projectManagerMenuSearch = new JMenu("Search");
    private static final JMenu projectManagerMenuHelp = new JMenu("Help");

    //JMenu File items
    private static final JMenuItem projectManagerMenuFileItemNew = new JMenuItem("New project");
    private static final JMenuItem projectManagerMenuFileItemOpen = new JMenuItem("Open File");
    private static final JMenuItem projectManagerMenuFileItemExport = new JMenuItem("Export");

    //JMenu Edit items
    private static final JMenuItem projectManagerMenuEditItemUndo = new JMenuItem("Undo");
    private static final JMenuItem projectManagerMenuEditItemCut = new JMenuItem("Cut");
    private static final JMenuItem projectManagerMenuEditItemCopy = new JMenuItem("Copy");
    private static final JMenuItem projectManagerMenuEditItemPaste = new JMenuItem("Paste");

    //JMenu Search items
    private static final JMenuItem projectManagerMenuSearchItemSearchProject = new JMenuItem("Search project");
    private static final JMenuItem projectManagerMenuSearchItemSearchEpic = new JMenuItem("Search Epic");
    private static final JMenuItem projectManagerMenuSearchItemSearchUserStory = new JMenuItem("Search user story");

    //JMenu Help items
    private static final JMenuItem projectManagerMenuHelpItemSourceCode = new JMenuItem("Source code");

    public static void main(String[] args) {

        //JMenuBar
        projectManagerMainFrame.setJMenuBar(projectManagerMenuBar);
        setMenuBar();

        //Mid screen
        projectManagerMainPanelProjectsLabel.setFont(new Font("Projects", Font.LAYOUT_LEFT_TO_RIGHT, 14));
        projectManagerMainPanel.add(projectManagerMainPanelProjectsLabel, FlowLayout.LEFT);
        projectManagerMainFrame.add(projectManagerMainPanel);

        //JFrame setting
        projectManagerMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        projectManagerMainFrame.setMinimumSize(new Dimension(700, 500));
        projectManagerMainFrame.setVisible(true);
    }

    private static void setMenuBar() {
        //JMenuBar setting
        projectManagerMenuBar.add(projectManagerMenuFile);
        projectManagerMenuBar.add(projectManagerMenuEdit);
        projectManagerMenuBar.add(projectManagerMenuSearch);
        projectManagerMenuBar.add(projectManagerMenuHelp);

        //JMenu File items
        projectManagerMenuFile.add(projectManagerMenuFileItemNew);
        projectManagerMenuFile.add(projectManagerMenuFileItemOpen);
        projectManagerMenuFile.addSeparator();
        projectManagerMenuFile.add(projectManagerMenuFileItemExport);

        //JMenu Edit items
        projectManagerMenuEdit.add(projectManagerMenuEditItemUndo);
        projectManagerMenuEdit.addSeparator();
        projectManagerMenuEdit.add(projectManagerMenuEditItemCut);
        projectManagerMenuEdit.add(projectManagerMenuEditItemCopy);
        projectManagerMenuEdit.add(projectManagerMenuEditItemPaste);

        //JMenu Search items
        projectManagerMenuSearch.add(projectManagerMenuSearchItemSearchProject);
        projectManagerMenuSearch.add(projectManagerMenuSearchItemSearchEpic);
        projectManagerMenuSearch.add(projectManagerMenuSearchItemSearchUserStory);

        //JMenu Help items
        projectManagerMenuHelp.add(projectManagerMenuHelpItemSourceCode);


        //JMenu File items listener
        projectManagerMenuFileItemNew.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
