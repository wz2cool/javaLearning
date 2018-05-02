package com.frwan.desgin.structural.flyweight;

public class FlyweightTest {
    public static void main(String[] args) {
        CharacterFactory characterFactory = CharacterFactory.getInstance();
        Character character1 = characterFactory.GetCharacter("A");
        Character character2 = characterFactory.GetCharacter("A");
        System.out.println(String.format("c1: %s, c2: %s", character1.hashCode(), character2.hashCode()));

        // java 源代码
        Integer.valueOf(10);
    }
}
