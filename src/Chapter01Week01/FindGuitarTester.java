package Chapter01Week01;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        //init
        Guitar customerLikes = new Guitar("", "");
       Guitar guitar = inventory.searchGuitar(customerLikes);
        if (guitar!=null){
            System.out.println("Hi,We found you a Chapter01Week01.Guitar" +guitar.getBrand()+"\n" +guitar.getModel());
        } else{
            System.out.println("nothing found related your search");
        }
    }


}
