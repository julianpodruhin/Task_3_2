import java.awt.*;

public class Car
{
   private String model ;
   private int weight;
   private Color color;

   public Car (Color color)
   {
      this.color = color;

   }
   public Car(String model, int weight)
   {
      this.model = model;
      this.weight = weight;
   }
   public Car()
   {
      System.out.println("Машина произведена");
   }


   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public int getWeight() {
      return weight;
   }

   public void setWeight(int weight) {
      weight = 800;
      this.weight = weight;
   }

   public Color getColor() {
      return color;
   }

   public void setColor(Color color) {
      this.color = color;
   }

   @Override
   public String toString() {
      return "Car{" +
              "model='" + model + '\'' +
              ", weight=" + weight +
              ", color=" + color +
              '}';
   }

}
