package editor.action;

import editor.Document;
import editor.Editor;

import java.awt.event.ActionEvent;

public class RemoveAction extends EditorAction {
    Editor editor;

    public RemoveAction(String name, Editor ed) {
        super(name);
        this.editor = ed;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Document doc = editor.getDocument();
        char ch = ae.getActionCommand().charAt(0);
        doc.removeChar(ch);
    }
}
