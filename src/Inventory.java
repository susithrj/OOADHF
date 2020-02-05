import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static  List guitarList = new ArrayList<Guitar>();

    public void addNewGuitar(String model, String brand){
        Guitar guitar= new Guitar("","");
        guitarList.add(guitar);
    }

    public String getGutiar(Guitar guitar) {
    return null;
    }

    public  Guitar searchGuitar(Guitar guitar){
        return null;
    }
/* public static void main(String[] args) {
        System.out.println("this is inventory printed:");
        for(int i =0;i<=guitarList.size();i++){
            System.out.println(i);
        }*//*
    }*/
}
