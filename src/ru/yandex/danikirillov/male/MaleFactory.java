package ru.yandex.danikirillov.male;

import ru.yandex.danikirillov.AbstractFactory;
import ru.yandex.danikirillov.Human;

public class MaleFactory implements AbstractFactory {
    public Human getPerson(int age) {
        if (age <= KidBoy.MAX_AGE)
            return new KidBoy();
        else if (age <= TeenBoy.MAX_AGE)
            return new TeenBoy();
        return new Man();
    }
}
