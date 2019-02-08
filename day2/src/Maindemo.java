import java.sql.SQLOutput;

public class Maindemo {

    public static void main(String[] args) {
        Coach cricket=new Coach();
        cricket.setName("dhoni");
        cricket.setExperience(15.4);
        cricket.setNom(350);
        cricket.setActive(false);

        System.out.println(cricket.getName());
        System.out.println(cricket.getExperience());
        System.out.println(cricket.getNom());


        Coach foodball=new Coach();
        foodball.setName("Maradona");
        foodball.setExperience(14);
        foodball.setNom(50);


    }
}
