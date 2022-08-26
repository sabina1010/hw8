package company;

import company.abstracts.Pet;
import company.pets.DomesticCat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {
    private Pet cat;

    @BeforeEach
    void init() {
        cat = new DomesticCat("Charlie", 2, 1, new String[]{"eating", "sleeping"});

    }

    @Test
    void testPetEquality() {
        Pet cat2 = new DomesticCat( "Charlie", 2, 1, new String[]{"eating", "sleeping"});
        assertEquals(cat, cat2);
    }

    @Test
    void testPetNonEquality(){
        Pet cat2 = new DomesticCat ("Charlie", 1, 1, new String[]{"eating", "sleeping"});
        assertNotEquals(cat, cat2);
    }

}