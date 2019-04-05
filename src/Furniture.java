public class Furniture extends Goods {

    String meterial;
    String type_of_wood;
    String brand;
    String room;
    double height;
    double width;
    double deep;

    Furniture(String code, String name, double price, int amount, String type_of_wood, String brand, String room, double height, double width, double deep)
    {
        super(code, name, price, amount);
        this.type_of_wood = type_of_wood;
        this.brand = brand;
        this.room = room;
        this.height = height;
        this.width = width;
        this.deep = deep;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println( this.type_of_wood+" "+this.brand+" "+this.room+" "+this.height+"см. "+this.width+"см. "+this.deep+"см. ");
    }


    @Override
    public void find_type_of_wood(String type_of_wood) {
        if (this.type_of_wood == type_of_wood)
        {
            Display();
        }
    }

    @Override
    public void find_room(String room) {
        if (this.room == room)
        {
            Display();
        }
    }
}
