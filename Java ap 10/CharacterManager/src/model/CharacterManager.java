package model;

import java.util.ArrayList;

public class CharacterManager {
    private final ArrayList<Character> characters = new ArrayList<>();

    public boolean addCharacter(Character character) {
        if (character == null || characters.contains(character)) {
            return false;
        }
        characters.add(character);
        return true;
    }

    public Character findByName(String name) {
        if (name == null) return null;

        for (Character c : characters) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public boolean removeCharacter(String name) {
        Character c = findByName(name);
        if (c == null) return false;

        characters.remove(c);
        return true;
    }

    public int getTotalCharacters() {
        return characters.size();
    }

    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }

    public double getAverageLevel() {
        if (characters.isEmpty()) return 0;

        int total = 0;
        for (Character c : characters) {
            total += c.getLevel();
        }
        return (double) total / characters.size();
    }
}