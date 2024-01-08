package Design_Pen;

public class Client {
    public static void main(String[] args) {
        Pen ballPen = new BallPen("Cello","Master", 25.5, PEN_TYPE.BALL,BODY_TYPE.CAP);
//        ballPen.setBrand("Cello");
//        ballPen.setName("Master");
//        ballPen.setPrice(25.5);
//        ballPen.setPentype(PEN_TYPE.BALL);
//        ballPen.setBody_type(BODY_TYPE.CAP);
        ballPen.open();
        ballPen.write();
        ballPen.close();
        ballPen.getDetail();

        System.out.println("__________________________________________________");

        Pen fountainPen = new FountainPen("Parker","Appollo",500.50, PEN_TYPE.FOUNTAIN, BODY_TYPE.ROLL);
        fountainPen.open();
        fountainPen.write();
        fountainPen.close();
        fountainPen.getDetail();
    }
}
