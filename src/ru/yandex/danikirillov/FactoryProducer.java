package ru.yandex.danikirillov;

import ru.yandex.danikirillov.female.FemaleFactory;
import ru.yandex.danikirillov.male.MaleFactory;

public class FactoryProducer {
    public static enum HumanFactoryType {
        MALE,
        FEMALE
    }

    public static AbstractFactory getFactory(HumanFactoryType type) {
        return type == HumanFactoryType.MALE ? new MaleFactory() : new FemaleFactory();
    }
}
