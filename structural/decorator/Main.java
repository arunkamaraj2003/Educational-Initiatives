package structural.decorator;

public class Main {
    public static void main(String[] args) {
        TextComponent text = new PlainText("teh quick brown fox jumps over teh lazy dog");
        TextComponent spellCheckedText = new SpellCheckDecorator(text);
        TextComponent autoCorrectedText = new AutoCorrectDecorator(spellCheckedText);

        System.out.println("Original Text: " + text.getText());
        System.out.println("Spell Checked Text: " + spellCheckedText.getText());
        System.out.println("Auto Corrected Text: " + autoCorrectedText.getText());
    }
}
