package AttackTest;

import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.types.Plants;
import com.iteso.nintendo.types.Psychic;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PsychicTest {
    PokemonType pokemonType;

    @Before
    public void setUp(){
       pokemonType = new Psychic();
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Psychic", pokemonType.getType());
    }

    @Test
    public void getDefenseMultiplierTest(){
        Assert.assertEquals(0.9, pokemonType.getDefenseMultiplier(), 0.0);
    }

    @Test
    public void getDamageMultiplierTest(){
        Assert.assertEquals(0.9, pokemonType.getDamageMultiplier(), 0.0);
    }
}
