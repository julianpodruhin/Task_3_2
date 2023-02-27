import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        Car car_1 = new Car();
        car_1.setModel("Ford");
        car_1.setColor(Color.red);
        car_1.setWeight(900);
        System.out.println(car_1);
        Car сar_2 = new Car();
        сar_2.setModel("Mazda");
        сar_2.setColor(Color.yellow);
        сar_2.setWeight(1100);
        System.out.println(сar_2);
    }
}