import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Goods> storage = new ArrayList<>();

        Goods pl1 = new Plumbing("0000", "Washing Machine", 2234.54, 5, "Ceramics","Ceramsit", 23.32, 45.34, 33);
        Goods pl2 = new Plumbing("0001", "Toilet", 3489, 12, "Gold", "Delta", 46, 234,  100);
        Goods pl3 = new Plumbing("0002", "Sink", 534.44, 0, "Ceramics", "Grohe", 123.32, 111.34, 53);
        Goods pl4 = new Plumbing("0003", "Sink", 39.98, 21, "Stone", "Kohler", 234.12, 100,  67);
        Goods pl5 = new Plumbing("0004", "Toilet", 5234.87, 4, "Stone", "Ceramsit", 56.32, 45.34, 36);
        Goods pl6 = new Plumbing("0005", "Stove", 3212, 9, "Gold", "Delta", 54, 59.98,  2.14);
        Goods pl7 = new Plumbing("0006", "Shower", 800, 1, "Ceramics", "Kohler", 267.32, 355.34, 123.5);
        Goods pl8 = new Plumbing("0007", "Washing Machine", 59.34, 34, "Stone","Grohe", 86, 64,  45.87);

        Goods pl9 = new Furniture("0008", "Chair", 375.6, 6, "Oak","Wayfair", "Kitchen",23.32, 45.34, 33);
        Goods pl10 = new Furniture("0009", "Sofa", 5489, 18, "Birch", "Basset","Living room",46, 234,  100);
        Goods pl11 = new Furniture("0010", "Chair", 6534.64, 30, "Pine", "Bush", "Hall", 111.34, 53, 56.9);
        Goods pl12 = new Furniture("0011", "Wardrobe", 3429.38, 1, "Oak", "Basset", "Children room",234.12, 100,  67);
        Goods pl13 = new Furniture("0012", "Armchair", 5234.87, 24, "Birch", "Bush", "Kitchen", 56.32, 45.34, 36);
        Goods pl14 = new Furniture("0013", "Wardrobe", 3264.54, 19, "Pine", "Wayfair", "Living room",54, 59.98,  2.14);
        Goods pl15 = new Furniture("0014", "Sofa", 875.87, 17, "Pine", "IKEA", "Children room", 267.32, 355.34, 123.5);
        Goods pl16 = new Furniture("0015", "Chair", 134.76, 24, "Oak","IKEA", "Hall",86, 64,  45.87);


        storage.add(pl1);
        storage.add(pl2);
        storage.add(pl3);
        storage.add(pl4);
        storage.add(pl5);
        storage.add(pl6);
        storage.add(pl7);
        storage.add(pl8);
        storage.add(pl9);
        storage.add(pl10);
        storage.add(pl11);
        storage.add(pl12);
        storage.add(pl13);
        storage.add(pl14);
        storage.add(pl15);
        storage.add(pl16);

        System.out.println("----------------------All goods--------------------------");
        for (Goods e : storage)
        {
            e.Display();
        }

        System.out.println();
        System.out.println("---------------Less than 500 grn---------------");
        for (Goods e : storage)
        {
            e.find_price_less_than(500);
        }

        System.out.println();
        System.out.println("---------------More than 500 grn----------------");
        for (Goods e : storage)
        {
            e.find_price_more_than(500);
        }

        System.out.println();
        System.out.println("---------------Material - Gold----------------");
        for (Goods e : storage)
        {
            e.find_material("Gold");
        }

        System.out.println();
        System.out.println("---------------Find using name----------------");
        for (Goods e : storage)
        {
            e.find_name("Sink");
        }

        System.out.println();
        System.out.println("---------------Find using code----------------");
        for (Goods e : storage)
        {
            e.find_code("0004");
        }

        System.out.println();
        System.out.println("---------------Find using wood----------------");
        for (Goods e : storage)
        {
            e.find_type_of_wood("Oak");
        }

        System.out.println();
        System.out.println("---------------Find using place(room)----------------");
        for (Goods e : storage)
        {
            e.find_room("Living room");
        }

    }
}
