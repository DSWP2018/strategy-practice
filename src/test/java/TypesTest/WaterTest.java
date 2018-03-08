package TypesTest;

import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Water;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WaterTest {
    PokemonType pokemonType;

    @Before
    public void setUp(){
        pokemonType = new Water();
    }

    @Test
    public void getTypeName(){
        Assert.assertEquals("Water", pokemonType.getTypeName());
    }

    @Test
    public void getDefenseAccordingToType() {
        Assert.assertTrue(0.5 == pokemonType.getDefenseAccordingToType(new Water()));
    }
}
