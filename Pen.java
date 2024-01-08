package Design_Pen;

public abstract class Pen {
    private String name;
  private String brand;
  private double price;
   private PEN_TYPE pentype;
   private BODY_TYPE body_type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PEN_TYPE getPentype() {
        return pentype;
    }

    public void setPentype(PEN_TYPE pentype) {
        this.pentype = pentype;
    }

    public BODY_TYPE getBody_type() {
        return body_type;
    }

    public void setBody_type(BODY_TYPE body_type) {
        this.body_type = body_type;
    }

    public abstract void write();
    public abstract void open();
    public abstract void close();
    public abstract void getDetail();



}
