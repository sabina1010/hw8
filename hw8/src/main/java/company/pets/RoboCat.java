package company.pets;

import company.Species;
import company.abstracts.Foul;
import company.abstracts.Pet;

public class RoboCat extends Pet implements Foul {
    public RoboCat(){
        super.setSpecies(Species.ROBOCAT);

    }
    public RoboCat( String nickName, int age, int trickLevel, String[] habits){
        super(nickName, age, trickLevel, habits);
        super.setSpecies(Species.ROBOCAT);
    }
    @Override
    public void respond() {

    }

    @Override
    public void foul() {

    }
}
