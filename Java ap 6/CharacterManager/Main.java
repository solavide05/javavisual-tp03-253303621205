
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

        System.out.println("===== TP5 AP6: CHARACTER MANAGER =====");

        // 1. CREATE
        System.out.println("\n--- 1. ADD CHARACTER ---");

        System.out.println("Tambah Archer: "
                + manager.addCharacter(
                    new Character("Archer", 5, CharacterType.ARCHER)));

        System.out.println("Tambah Mage: "
                + manager.addCharacter(
                    new Character("Mage", 8, CharacterType.MAGE)));

        System.out.println("Tambah Warrior: "
                + manager.addCharacter(
                    new Character("Warrior", 10, CharacterType.WARRIOR)));

        System.out.println("Tambah Healer: "
                + manager.addCharacter(
                    new Character("Healer", 4, CharacterType.HEALER)));

        // 2. DUPLICATE TEST
        System.out.println("\n--- 2. DUPLICATE TEST ---");

        Character duplicate = new Character(
                "archer", 7, CharacterType.MAGE);

        System.out.println("equals Archer dan archer: "
                + new Character("Archer", 1, CharacterType.ARCHER)
                    .equals(duplicate));

        System.out.println("Tambah nama duplikat: "
                + manager.addCharacter(duplicate));

        System.out.println("Jumlah setelah uji duplikat: "
                + manager.getTotalCharacters());

        // 3. READ
        System.out.println("\n--- 3. READ ALL ---");

        for (Character c : manager.getAllCharacters()) {
            System.out.println(c);
        }

        System.out.println("\nCari Mage: "
                + manager.findByName("Mage"));

        // 4. MINI-CHALLENGE
        System.out.println("\n--- 4. MINI-CHALLENGE ---");

        System.out.println("Rata-rata level: "
                + manager.getAverageLevel());

        System.out.println("Karakter bertipe MAGE:");

        for (Character c : manager.findByType(CharacterType.MAGE)) {
            System.out.println(c);
        }

        // 5. FITUR ANALITIK
        System.out.println("\n--- 5. FITUR ANALITIK ---");

        System.out.println("Karakter terkuat: "
                + manager.findStrongest());

        // 6. SALINAN ARRAYLIST
        System.out.println("\n--- 6. ARRAYLIST COPY TEST ---");

        ArrayList<Character> copy = manager.getAllCharacters();
        copy.clear();

        System.out.println("Jumlah dalam salinan: " + copy.size());
        System.out.println("Jumlah dalam manager: "
                + manager.getTotalCharacters());

        // 7. OBJECT REFERENCE
        System.out.println("\n--- 7. OBJECT REFERENCE TEST ---");

        Character a = new Character(
                "ReferenceTest", 3, CharacterType.MAGE);
        Character b = a;

        b.setLevel(8);

        System.out.println("Level a: " + a.getLevel());
        System.out.println("a == b: " + (a == b));

        Character c = new Character(
                a.getName(), a.getLevel(), a.getType());

        System.out.println("a == c: " + (a == c));
        System.out.println("a.equals(c): " + a.equals(c));

        // 8. UPDATE
        System.out.println("\n--- 8. UPDATE TEST ---");

        Character warrior = manager.findByName("Warrior");

        if (warrior != null) {
            warrior.setLevel(12);
        }

        System.out.println("Warrior setelah update: "
                + manager.findByName("Warrior"));

        // 9. DELETE
        System.out.println("\n--- 9. DELETE TEST ---");

        System.out.println("Hapus Healer: "
                + manager.removeCharacter("Healer"));

        System.out.println("Jumlah setelah hapus: "
                + manager.getTotalCharacters());

        // 10. EMPTY LIST TEST
        System.out.println("\n--- 10. EMPTY LIST TEST ---");

        CharacterManager emptyManager = new CharacterManager();

        System.out.println("Rata-rata list kosong: "
                + emptyManager.getAverageLevel());

        System.out.println("Karakter terkuat list kosong: "
                + emptyManager.findStrongest());

        // 11. STATIC COUNTER
        System.out.println("\n--- 11. STATIC COUNTER ---");

        System.out.println("Total objek Character dibuat: "
                + Character.getTotalCharacterCreated());
    }
}
