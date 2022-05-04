package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MakeSounds {
    public static void main(String[] arg) {
        List<Sound> sound = new ArrayList<>();
        sound.add(new Parrot());
        sound.add(new Radio());
        sound.add(new Firework());

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            sound.get(random.nextInt(sound.size())).playSound();
        }
    }
}
