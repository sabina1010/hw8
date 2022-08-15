package company.pets;

import company.Species;
import company.abstracts.Foul;
import company.abstracts.Pet;

public class Dog extends Pet implements Foul {
    public Dog (){
        super.setSpecies(Species.DOG);

    }
    public Dog( String nickName, int age, int trickLevel, String[] habits){
        super(nickName, age, trickLevel, habits);
        super.setSpecies(Species.DOG);
    }
    @Override
    public void respond() {

    }

    @Override
    public void foul() {

    }
}
