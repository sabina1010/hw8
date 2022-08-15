package company.humans;

import company.Family;
import company.Human;

public final class Man extends Human {
    public void car(){
        System.out.println("Mercedes");
    }
    public void greetPet() {
        System.out.println("Hello from Mr." + super.getName());
    }

    public Man (){

    }
    public Man(String name, String surname, int year, int iq, String[][] schedule, Family family){
        super(name,surname,year,iq,schedule,family);
    }
    public Man(String name, String surname, int year){
        super(name,surname,year);
    }

}
