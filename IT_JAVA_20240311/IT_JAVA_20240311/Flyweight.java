package IT_JAVA_20240311;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {
    public static void main(String[] args) {
        /*Flyweight, легковес, приспособленец
        Плодовые тела грибов соединены друг с другом грибницей.
        Грибы являются самыми большими организмами*/
        Micelium micelium = new Micelium();
        System.out.println(micelium.getMushroom(MushroomType.Russula,1,1).toDetailString());
        System.out.println(micelium.getMushroom(MushroomType.Russula,2,2).toDetailString());
    }
}
//Белый, сыроежка, лисичка, опенок
enum MushroomType {PennyBun, Russula, Chanterella, Honey};

class Mushroom {
    private MushroomType type;
    private int x;
    private int y;

    public Mushroom(MushroomType type) {
        this.type = type;
    }

    public MushroomType getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toDetailString() {
        return this+" "+this.type.toString()+" "+x+" "+y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Micelium{
    Map<MushroomType, Mushroom> mushroomMap = new HashMap<>();

    public Mushroom getMushroom(MushroomType mushroomType, int x, int y){
        Mushroom mushroom = mushroomMap.get(mushroomType);
        if (mushroom==null){
            mushroom = new Mushroom(mushroomType);
            mushroomMap.put(mushroomType,mushroom);
        }
        mushroom.setPosition(x,y); //Отрисовать
        return mushroom;
    }
}