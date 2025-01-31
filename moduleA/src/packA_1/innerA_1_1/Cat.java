package packA_1.innerA_1_1;

import packA_1.Pet;

public class Cat implements Pet {

    private String name;

    @Override
    public String getName() {
        return "kitty " + name;
    }
}
