package Design_Pen;

public class BallPen extends Pen implements Refillable {

    private Refill refill;

    public BallPen( String name, String brand, double price, PEN_TYPE penType, BODY_TYPE body_type) {
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
        System.out.println("Ball pen can be refilled by a refill");
    }

    @Override
    public void write() {
        System.out.println(this.getName()+" is writing.");
    }

    @Override
    public void open() {
        System.out.println(this.getName()+" is opening.");
    }

    @Override
    public void close() {
        System.out.println(this.getName()+" is closing.");
    }
}
