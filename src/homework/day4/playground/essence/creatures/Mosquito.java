package homework.day4.playground.essence.creatures;

import homework.day4.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {

    public Mosquito(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {
        String str = String.format("I am %s, my name is %s and I amd flying to %s", this.getClass().getSimpleName(), this.getName(), direction);
        System.out.println(str);
    }
}
