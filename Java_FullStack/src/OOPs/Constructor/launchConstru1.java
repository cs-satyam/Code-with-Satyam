package OOPs.Constructor;


import java.sql.SQLOutput;

class Dog{
    int cost;
    String name;
    String color;

   public Dog(int cost,String name,String color){
        this.cost=cost;
        this.name=name;
        this.color=color;
    }
    Dog(){
       System.out.println("o parameteries constructor");
        cost = 4846;
       name="Lobo";
       color="black";
    }

    public void setCost(int cost){
        this.cost=cost;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setColor(String color){
        this.color=color;
    }
    public int getCost(){
        return cost;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }

}
public class launchConstructor {
    public static void main(String[] args) {

        Dog d1=new Dog(10000,"Sheru","White");
        System.out.println("d1.getCost() "+d1.getCost());
        System.out.println("d1.getName() "+d1.getName());
        System.out.println("d1.getColor() "+d1.getColor());

        Dog d2=new Dog();
        System.out.println("d2.getCost() "+d2.getCost());
        System.out.println("d2.getName() "+d2.getName());
        System.out.println("d2.getColor() "+d2.getColor());




    }
}
