package TypesTest;

import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Electric;
import com.iteso.nintendo.Types.Fire;
import com.iteso.nintendo.Types.Ground;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElectricTest {
    PokemonType pokemonType;

    @Before
    public void setUp(){
        pokemonType = new Electric();
    }

    @Test
    public void getTypeName(){
        Assert.assertEquals("Electric", pokemonType.getTypeName());
    }

    @Test
    public void getDefenseAccordingToType() {
        Assert.assertTrue(2 == pokemonType.getDefenseAccordingToType(new Ground()));
    }
}
