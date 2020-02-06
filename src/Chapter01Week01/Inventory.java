package Chapter01Week01;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static  List guitarList = new ArrayList<Guitar>();

    public void addNewGuitar(String model, String brand){
        Guitar guitar= new Guitar(model,brand);
        guitarList.add(guitar);
    }

    public String getGutiar(Guitar guitar) {
    return null;
    }

    public  Guitar searchGuitar(Guitar guitar){
        return null;
    }

}
