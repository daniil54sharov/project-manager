package MainPackage;

import PanelPackage.ProjectsListPanel;
import DialogPackage.CreateProjectDialog;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectManager {
    private static final String appName = "Project manager";
    private static final JFrame MainFrame = new JFrame(appName);
    private static final JPanel MainPanel = new JPanel();
    private static final JLabel MainPanelProjectsLabel = new JLabel("Projects: ");
    public static final ProjectsListPanel projectsListPanel = new ProjectsListPanel();

    public static JMenuBar MenuBar = new JMenuBar();

    //JMenuBar items
    private static final JMenu MenuFile = new JMenu("File");
    private static final JMenu MenuEdit = new JMenu("Edit");
    private static final JMenu MenuSearch = new JMenu("Search");
    private static final JMenu MenuHelp = new JMenu("Help");

    //JMenu File items
    private static final JMenuItem MenuFileItemNew = new JMenuItem("New project");
    private static final JMenuItem MenuFileItemOpen = new JMenuItem("Open File");
    private static final JMenuItem MenuFileItemExport = new JMenuItem("Export");

    //JMenu Edit items
    private static final JMenuItem MenuEditItemUndo = new JMenuItem("Undo");
    private static final JMenuItem MenuEditItemCut = new JMenuItem("Cut");
    private static final JMenuItem MenuEditItemCopy = new JMenuItem("Copy");
    private static final JMenuItem MenuEditItemPaste = new JMenuItem("Paste");

    //JMenu Search items
    private static final JMenuItem MenuSearchItemSearchProject = new JMenuItem("Search project");
    private static final JMenuItem MenuSearchItemSearchEpic = new JMenuItem("Search Epic");
    private static final JMenuItem MenuSearchItemSearchUserStory = new JMenuItem("Search user story");

    //JMenu Help items
    private static final JMenuItem MenuHelpItemSourceCode = new JMenuItem("Source code");

    public static void main(String[] args) {

        //JMenuBar
        MainFrame.setJMenuBar(MenuBar);
        setMenuBar();

        //Mid screen
        MainPanelProjectsLabel.setFont(new Font("Projects", Font.LAYOUT_LEFT_TO_RIGHT, 14));
        MainPanel.add(MainPanelProjectsLabel);
        MainPanel.add(projectsListPanel);

        MainFrame.add(MainPanel);

        //JFrame setting
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setMinimumSize(new Dimension(700, 500));
        MainFrame.setVisible(true);
    }

    private static void setMenuBar() {
        //JMenuBar setting
        MenuBar.add(MenuFile);
        MenuBar.add(MenuEdit);
        MenuBar.add(MenuSearch);
        MenuBar.add(MenuHelp);

        //JMenu File items
        MenuFile.add(MenuFileItemNew);
        MenuFile.add(MenuFileItemOpen);
        MenuFile.addSeparator();
        MenuFile.add(MenuFileItemExport);

        //JMenu Edit items
        MenuEdit.add(MenuEditItemUndo);
        MenuEdit.addSeparator();
        MenuEdit.add(MenuEditItemCut);
        MenuEdit.add(MenuEditItemCopy);
        MenuEdit.add(MenuEditItemPaste);

        //JMenu Search items
        MenuSearch.add(MenuSearchItemSearchProject);
        MenuSearch.add(MenuSearchItemSearchEpic);
        MenuSearch.add(MenuSearchItemSearchUserStory);

        //JMenu Help items
        MenuHelp.add(MenuHelpItemSourceCode);


        //JMenu File items listener
        MenuFileItemNew.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CreateProjectDialog projectManagerCreateProjectDialog = new CreateProjectDialog(MainFrame, "Create new project");
                projectManagerCreateProjectDialog.setVisible(true);
            }
        });
    }
}
