import javax.swing.SwingUtilities;
import model.Character;
import model.CharacterManager;
import model.CharacterType;
import view.MainWindow;

public class Main {

    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

        manager.addCharacter(
            new Character("Archer", CharacterType.ARCHER, 5)
        );
        manager.addCharacter(
            new Character("Mage", CharacterType.MAGE, 8)
        );
        manager.addCharacter(
            new Character("Warrior", CharacterType.WARRIOR, 10)
        );
        manager.addCharacter(
            new Character("Healer", CharacterType.HEALER, 4)
        );
        manager.addCharacter(
            new Character("Paladin", CharacterType.WARRIOR, 7)
        );

        SwingUtilities.invokeLater(() -> {
            MainWindow window =
                new MainWindow(manager.getAllCharacters());
            window.setVisible(true);
        });
    }
}