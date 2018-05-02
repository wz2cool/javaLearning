package com.frwan.desgin.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    private Map<String, Character> charactors = new HashMap<String, Character>();

    private static CharacterFactory instance = new CharacterFactory();

    public static CharacterFactory getInstance() {
        return instance;
    }

    private CharacterFactory() {
        this.charactors.put("A", new CharactorA());
        this.charactors.put("B", new CharactorB());
        this.charactors.put("C", new CharactorC());
    }

    public Character GetCharacter(String key) {
        Character character = this.charactors.getOrDefault(key, null);

        if (character == null) {
            switch (key) {
                case "A":
                    character = new CharactorA();
                    break;
                case "B":
                    character = new CharactorB();
                    break;
                case "C":
                    character = new CharactorC();
                    break;
            }
            this.charactors.put(key, character);
        }
        return character;
    }
}
