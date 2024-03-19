package PanelPackage;

import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.GridLayout;
import java.awt.Color;

public class ProjectsListPanel extends JPanel {
    public ProjectsListPanel() {
        this.setLayout(new GridLayout(0, 3));
    }

    public void addToListPanel(CardPanel cardPanel) {
        this.add(cardPanel);
    }

    public void removeFromListPanel(CardPanel cardPanel) {

    }
}

