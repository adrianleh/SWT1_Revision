package net.adrianlehmann.swt_revision.patterns.other.memento;

/**
 * Created by adrianlehmann on 23.07.17.
 */
public class HistoricalText {
    private String text;


    public HistoricalText() {
        text = new String();
    }

    public void append(String s) {
        text += s;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextMemento saveState() {
        return new TextMemento(text);
    }

    public void setToState(TextMemento textMemento) {
        this.text = textMemento.getText();
    }

    public String getText() {
        return text;
    }

    public class TextMemento {
        private final String curr;

        private TextMemento(String curr) {
            this.curr = curr;
        }

        public String getText() {
            return curr;
        }
    }
}
