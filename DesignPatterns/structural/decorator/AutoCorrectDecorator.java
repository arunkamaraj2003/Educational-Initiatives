package structural.decorator;

public class AutoCorrectDecorator extends TextDecorator {
    public AutoCorrectDecorator(TextComponent decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getText() {
        return autoCorrect(super.getText());
    }

    private String autoCorrect(String text) {
        // Simple auto-correct simulation
        return text.replaceAll("u", "you");
    }
}
