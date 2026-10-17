
import java.util.ArrayList;

public class CharacterManager {
    private final ArrayList<Character> characters = new ArrayList<>();

    // Bagian A: menambahkan karakter dan menolak nama duplikat.
    public boolean addCharacter(Character character) {
        if (character == null
                || character.getName() == null
                || character.getName().isBlank()) {
            return false;
        }

        if (findByName(character.getName()) != null) {
            return false;
        }

        characters.add(character);
        return true;
    }

    // Bagian A: mencari karakter berdasarkan nama.
    public Character findByName(String name) {
        if (name == null) {
            return null;
        }

        for (Character character : characters) {
            if (character.getName().equalsIgnoreCase(name)) {
                return character;
            }
        }

        return null;
    }

    // Bagian A: menghapus karakter berdasarkan nama.
    public boolean removeCharacter(String name) {
        Character character = findByName(name);

        if (character == null) {
            return false;
        }

        characters.remove(character);
        return true;
    }

    // Bagian A: jumlah karakter yang saat ini tersimpan.
    public int getTotalCharacters() {
        return characters.size();
    }

    // Bagian A: mengembalikan salinan list.
    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }

    // Bagian B: rata-rata level, aman ketika list kosong.
    public double getAverageLevel() {
        if (characters.isEmpty()) {
            return 0.0;
        }

        int totalLevel = 0;

        for (Character character : characters) {
            totalLevel += character.getLevel();
        }

        return (double) totalLevel / characters.size();
    }

    // Bagian B: mencari semua karakter berdasarkan tipe.
    public ArrayList<Character> findByType(CharacterType type) {
        ArrayList<Character> result = new ArrayList<>();

        if (type == null) {
            return result;
        }

        for (Character character : characters) {
            if (character.getType() == type) {
                result.add(character);
            }
        }

        return result;
    }

    /**
     * Mencari karakter dengan level tertinggi.
     *
     * @return karakter dengan level tertinggi, atau null
     * jika tidak ada karakter
     */
    public Character findStrongest() {
        if (characters.isEmpty()) {
            return null;
        }

        Character strongest = characters.get(0);

        for (Character character : characters) {
            if (character.getLevel() > strongest.getLevel()) {
                strongest = character;
            }
        }

        return strongest;
    }
}
