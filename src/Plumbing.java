public class Plumbing extends Goods {

    String material;
    String brand;
    double height;
    double width;
    double deep;

    Plumbing(String code, String name, double price, int amount, String material, String brand, double height, double width, double deep)
    {
        super(code, name, price, amount);
        this.material = material;
        this.brand = brand;
        this.height = height;
        this.width = width;
        this.deep = deep;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println( this.material+" "+this.brand+" "+this.height+"см. "+this.width+"см. "+this.deep+"см. ");
    }




    @Override
    public void find_material(String material) {
        if (this.material == material)
        {
            Display();
        }
    }
}
