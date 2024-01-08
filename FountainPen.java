package Design_Pen;

public class FountainPen extends Pen implements Refillable {
    private Ink ink;
    private Nib nib;

    public FountainPen( String name, String brand, double price, PEN_TYPE penType, BODY_TYPE body_type) {
        this.setName(name);
        this.setBrand(brand);
        this.setPrice(price);
        this.setPentype(penType);
        this.setBody_type(body_type);

    }

    @Override
    public void getDetail() {
        System.out.println("Name of the pen is "+this.getName());
        System.out.println("Typeof the pen is "+this.getPentype());
        System.out.println("Price of the pen is "+this.getPrice());
        System.out.println("Pen is of "+this.getPentype()+" and its body type is "+this.getBody_type()+".");

    }
    @Override
    public void refill() {
        System.out.println("Fountain pen can be refilled by ink");
    }

    @Override
    public void write() {
        System.out.println("Fountain Pen is writing.");
    }

    @Override
    public void open() {
        System.out.println("Fountain pen is opening.");
    }

    @Override
    public void close() {
        System.out.println("Fountain pen is closing.");
    }
}
