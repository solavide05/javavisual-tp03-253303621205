
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        // Membuat tiga karakter
        Character c1 = new Character(
            "Aragorn", CharacterType.WARRIOR
        );

        Character c2 = new Character(
            "Merlin", CharacterType.MAGE, 3
        );

        Character c3 = new Character(
            "Robin", CharacterType.ARCHER
        );

        // Menampilkan karakter
        System.out.println("=== DAFTAR KARAKTER ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // Demo level up
        System.out.println("\n=== DEMO LEVEL UP ===");
        System.out.println("Sebelum: " + c1);

        c1.setLevel(c1.getLevel() + 1);

        System.out.println("Sesudah: " + c1);

        // Mini-Challenge
        System.out.println("\n=== MINI-CHALLENGE ===");

        Character c4 = new Character(
            "Luna", CharacterType.MAGE, 2
        );

        c4.setMana(80);

        System.out.println(c4);
        System.out.println("Mana Luna: " + c4.getMana());
        System.out.println(
            "Apakah Luna masih hidup? " + c4.isAlive()
        );

        // Menguji validasi mana
        System.out.println("\n=== VALIDASI MANA ===");

        try {
            c4.setMana(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(
                "Validasi berhasil: " + e.getMessage()
            );
        }
    }
}
