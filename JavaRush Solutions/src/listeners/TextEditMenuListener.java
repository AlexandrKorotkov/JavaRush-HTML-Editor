package listeners;

import task3209.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;

public class TextEditMenuListener implements MenuListener {
    private View view;

    public TextEditMenuListener(View view) {
        this.view = view;
    }

    @Override
    public void menuSelected(MenuEvent menuEvent) {
        JMenu jm = null;
        if (menuEvent.getSource() instanceof JMenu) {
            jm = (JMenu) menuEvent.getSource();
        }
        for (Component c : jm.getMenuComponents()) {
            c.setEnabled(view.isHtmlTabSelected());
        }

    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}
