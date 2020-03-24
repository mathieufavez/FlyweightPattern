package MyExample;

public class BigCar implements Car {


    private String size = "BIG";            //Etat intrinsèque (Qui peut être partagé)

    private String color = null;            //Etat extrinsèque (Que le client doit fournir)

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void build() {
        System.out.println("Building a "+ size + color + " car !");
    }
}
