package ru.yandex.danikirillov.female;

import ru.yandex.danikirillov.AbstractFactory;
import ru.yandex.danikirillov.Human;

public class FemaleFactory implements AbstractFactory {
    public Human getPerson(int age) {
        if (age <= KidGirl.MAX_AGE)
            return new KidGirl();
        else if (age <= TeenGirl.MAX_AGE)
            return new TeenGirl();
        return new Woman();
    }
}
