package OOPs.Inheritance;

class plane{

}
class fighterPlane extends plane{

}
class Animal {
     void petEat(){
        System.out.println("Animal is eating");
    }
    public void nonPetEat(){
         System.out.println("Animal is eating");
    }

    public plane running(){
        System.out.println("Animal is running");
        plane p=new plane();
        return p;
    }
}
class Tiger extends Animal {
    public void eat(){ // specialized method of child class
        System.out.println("cat can eat fish");
    }
    public void eat(String fishName){
        System.out.println("fish can eat fish");
    }
//    void nonPetEat()
//        {
//        System.out.println("Tiger is eating grass");
//        }

    // coverient return type where is a relationship in child class
    public fighterPlane running(){
        System.out.println("Tiger is running to hunt");
        fighterPlane fp=new fighterPlane();
        return fp;
    }
}


// parent class method visibility can be upgrade but it can't be reduce.
//  return type can't be change 

public class launchInheritance10
{
    public static void main(String[] args)
    {
        Tiger t=new Tiger();
        t.eat();
    }
}
