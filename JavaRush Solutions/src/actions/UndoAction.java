package actions;

import task3209.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class UndoAction extends AbstractAction {
    private View view;
    public UndoAction(View view) {
        this.view=view;
    }

    public void actionPerformed(ActionEvent e) {
        view.undo();
    }

    public boolean accept(Object sender) {
        return false;
    }
}
