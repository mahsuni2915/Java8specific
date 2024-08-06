import java.util.Arrays;
import java.util.List;

public class DogDataBase {

   public  static List<Dog> getAll(){
       Dog rotwailer = new Dog("black",5,"rotwailer","12,12;2022");
       Dog poodle = new Dog("label",1,"poodle","12,12;2022");
       Dog maltipo = new Dog("boss",2,"maltipo","12,12;2022");
       Dog kangal = new Dog("hector",4,"kangal","12,12;2022");
       Dog golden = new Dog("sinemon",3,"golden","12,12;2022");
       Dog doberman = new Dog("kayote",7,"doberman","12,12;2022");
       List<Dog> dogs = Arrays.asList(rotwailer,poodle,maltipo,kangal,golden,doberman);
       return  dogs;
   }
}
