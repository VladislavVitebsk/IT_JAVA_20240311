package IT_JAVA_20240311;

import java.util.ArrayList;
import java.util.List;

public class DoctorCroaky {
    public static void main(String[] args) {
        Story.tellStory();
    }
}
class Frog{
    public Frog went(){
        System.out.println("went");
        return this;
    }

    public Frog sayHello(){
        System.out.println("say hello");
        return this;
    }

    public Frog advertise(){
        System.out.println("advertise");
        return this;
    }

    public Frog listen(){
        System.out.println("listen");
        return this;
    }
}
interface Animal{
    void come();
}

class Fox implements Animal{

    @Override
    public void come() {
        System.out.println("The fox came");
    }

    public void ask(){
        System.out.println("The fox asked");
    }
}

class Dear implements Animal{
    @Override
    public void come() {
        System.out.println("The dear came");
    }
}

class Tortoise implements Animal{
    @Override
    public void come() {
        System.out.println("The tortoise came");
    }
}
class Story{
    private static List<Animal> animalList = new ArrayList<>();
    public static void tellStory(){
        Frog frog = new Frog();
        animalList.add(new Dear());
        animalList.add(new Tortoise());
        Animal fox = new Fox();
        animalList.add(fox);

        frog.went().sayHello();
        animalList.forEach(Animal::come);

        ((Fox)fox).ask();
        frog.listen();
    }
}