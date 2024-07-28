package structural.decorator;

public abstract class TextDecorator implements TextComponent {
    protected TextComponent decoratedText;

    public TextDecorator(TextComponent decoratedText) {
        this.decoratedText = decoratedText;
    }

    public String getText() {
        return decoratedText.getText();
    }
}
