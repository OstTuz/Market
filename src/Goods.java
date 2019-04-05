abstract class Goods {
    String code;
    String name;
    double price;
    int amount;

    Goods(){}

    Goods(String code, String name, double price, int amount)
    {
        this.code = code;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void Display()
    {
        if (this.amount < 1)
        {
            System.out.print(this.code+" "+this.name+" "+this.price+"грн. Немає на складі!!! ");
        }else
        {
            System.out.print(this.code+" "+this.name+" "+this.price+"грн. "+this.amount+"шт. ");
        }

    }
    public void find_name(String name)
    {
        if (this.name == name)
        {
            Display();
        }
    }
    public void find_code(String code)
    {
        if (this.code == code)
        {
            Display();
        }
    }

    public void find_price_less_than(double price) {
        if (this.price <= price)
        {
            Display();
        }
    }


    public void find_price_more_than(double price) {
        if (this.price >= price)
        {
            Display();
        }
    }
    public void find_material(String material){}
    public void find_type_of_wood(String type_of_wood){}
    public void find_room(String room){}
}
