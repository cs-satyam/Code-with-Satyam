package OOPs.Constructor;

import java.sql.SQLOutput;

class finisher{
    private int id;
    private  String name;
    private String city;

    finisher(){

        super();
        System.out.println("Zero parameter constructor");
    }

    finisher(int id,String name,String city){
        super();
        this.id = id;
        this.name = name;
        this.city = city;
        System.out.println(" param constructor");
    }
    void setId(int id){   this.id = id;  }
    int getId(){  return id; }


    void setName(String name){  this.name = name;  }
    String getName(){  return name; }

    void setCity(String city){  this.city = city;  }
    String getCity(){  return city;  }




}
public class launchConstru3 {
    public static void main(String[] args) {
        finisher f1=new finisher();
        f1.setId(1);
        f1.setName("Satyam");
        f1.setCity("Guntur");

        System.out.println("***************");
        System.out.println(f1.getId()+" "+f1.getName()+" "+f1.getCity());

        System.out.println("&&&&&&&&&&&&&&&");

        finisher f2=new finisher(2,"rahul","tamilnadu");
        f2.setId(3);
        f2.setName("Kunal");
        f2.setCity("tenali");

        System.out.println(f2.getId()+" "+f2.getName()+" "+f2.getCity());

    }
}
