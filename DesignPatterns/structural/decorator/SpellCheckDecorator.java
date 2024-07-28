package structural.decorator;

public class SpellCheckDecorator extends TextDecorator {
    public SpellCheckDecorator(TextComponent decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getText() {
        return spellCheck(super.getText());
    }

    private String spellCheck(String text) {
        // Simple spell check simulation
        return text.replaceAll("teh", "the");
    }
}
