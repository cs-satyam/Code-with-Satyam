package OOPs.Inheritance;
class aeroPlane{
    void fly(){
        System.out.println("flying if aeroplane");
    }
    void landing(){
        System.out.println("aeroplane is landing");
    }
    void takeoff(){
        System.out.println("taking off passenger from parent");
    }
}
class cargoPlane extends aeroPlane{

}
class passengerPlane extends aeroPlane{
  void takeoff(){
    System.out.println("taking off passenger");
  }
}

class commercialPlan extends aeroPlane{
    void takeoff(){
        super.takeoff();
        System.out.println("taking off passenger  of the comercial");
    }
}
public class launchInheritance2
{
    public static void main(String[] args)
    {
//
//        cargoPlane c = new cargoPlane();
//        passengerPlane p = new passengerPlane();
//
//        c.fly();
//        p.landing();
//        commercialPlan c1 = new commercialPlan();
//        c1.fly();
//        c1.landing();

        passengerPlane plane = new passengerPlane();
//        plane.fly();
//        plane.landing();
        plane.takeoff();

//        aeroPlane plane = new passengerPlane(); // upcasting
//        plane.fly();
//        plane.landing();

        ((passengerPlane)plane).takeoff(); // down casting




    }
}
