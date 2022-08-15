package company;

import company.abstracts.Pet;
import company.pets.Dog;

public class Main {

    public static void main(String[] args) {
        Human mother = new Human("Lily", "Potter", 1995);
        Human father = new Human("James", "Potter", 1990);
        Pet pet = new Dog( "Hedwig", 2, 7,
                new String[]{"eating", "sleeping"});

        Family potterFamily = new Family(mother, father);

        Human child1 = new Human("Harry", "Potter", 2000,
                100, new String[][]{{DayOfWeeks.MONDAY.name(), "do magic"}}, potterFamily);
        Human child2 = new Human("Madelyn", "Potter", 2003,
                100, new String[][]{{DayOfWeeks.MONDAY.name(), "do something"}}, potterFamily);

        potterFamily.setPet(pet);

        potterFamily.addChild(child1);
        potterFamily.addChild(child2);
        System.out.println(potterFamily + " -- " + potterFamily.countFamily());


    }

}
