package actions;

import task3209.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RedoAction extends AbstractAction {
    private View view;

    public RedoAction(View view) {
        this.view = view;
    }

    public void actionPerformed(ActionEvent e) {
        view.redo();
    }

    public boolean accept(Object sender) {
        return false;
    }
}
