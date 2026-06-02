package OOPs.Encaplation;


class learner{
   private int id ;
   private String name;
   private String city;


   // setter
  void  setId(int i){
       id=i;
   }
   void  setName(String name){
       this.name=name;
   }
   void  setCity(String c){
      city=c;
   }

   // getter
    int getId(){
        return id;
    }
    String getName(){
      return name;
    }
    String getCity(){
      return city;
    }


}

public class LacunhEncap3 {
    public static void main(String[] args) {
        learner learner = new learner();
        learner.setId(1);
        learner.setName("Satyam");
        learner.setCity("San Francisco");

        int id = learner.getId();
        String name = learner.getName();
        String city = learner.getCity();
        System.out.println("id is "+id+", name is "+name+", city is "+city);


    }
}
