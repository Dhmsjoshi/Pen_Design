package Design_Pen;

public class GellPen extends Pen implements Refillable {
    private Refill refill;

    public GellPen( String name, String brand, double price, PEN_TYPE penType, BODY_TYPE body_type) {
        this.setName(name);
        this.setBrand(brand);
        this.setPrice(price);
        this.setPentype(penType);
        this.setBody_type(body_type);

    }

    public void getDetail() {
        System.out.println("Name of the pen is "+this.getName());
        System.out.println("Typeof the pen is "+this.getPentype());
        System.out.println("Price of the pen is "+this.getPrice());
        System.out.println("Pen is of "+this.getPentype()+" and its body type is "+this.getBody_type()+".");

    }

    @Override
    public void refill() {
        System.out.println("Gell pen can be refilled by a refill");
    }

    @Override
    public void write() {
        System.out.println("Gell Pen is writing.");
    }

    @Override
    public void open() {
        System.out.println("Gell pen is opening.");
    }

    @Override
    public void close() {
        System.out.println("Gell pen is closing.");
    }
}
