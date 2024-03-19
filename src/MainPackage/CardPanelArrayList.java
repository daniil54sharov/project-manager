package MainPackage;

import PanelPackage.CardPanel;
import java.util.ArrayList;

import static MainPackage.ProjectManager.projectsListPanel;

public class CardPanelArrayList {
    private static final ArrayList<CardPanel> cardPanelArrayList = new ArrayList<>();

    public static boolean addCardPanelToArrayList(CardPanel cardPanel) {
        projectsListPanel.addToListPanel(cardPanel);
        return cardPanelArrayList.add(cardPanel);
    }

    public static boolean removeCardPanelFromArrayList(CardPanel cardPanel) {
        return cardPanelArrayList.remove(cardPanel);
    }

    public static String getCardPanelArrayList() {
        return cardPanelArrayList.toString();
    }
}
