package net.adrianlehmann.swt_revision.patterns.other.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adrianlehmann on 23.07.17.
 */
public class TextStorer {
    private final HistoricalText historicalText;
    private List<HistoricalText.TextMemento> mementos;

    public TextStorer() {
        this.historicalText = new HistoricalText();
        this.mementos = new ArrayList<>();
    }

    public void add(String s) {
        this.historicalText.append(s);
        saveState();
    }

    public void clear() {
        this.historicalText.setText("");
        saveState();
    }

    public void restoreTo(int i) {
        /* Data Validation */
        historicalText.setToState(mementos.get(i));
    }

    public String getText() {
        return historicalText.getText();
    }

    /* And more similar methods */

    private void saveState() {
        mementos.add(this.historicalText.saveState());
    }
}
