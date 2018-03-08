package TypesTest;

import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Electric;
import com.iteso.nintendo.Types.Ground;
import com.iteso.nintendo.Types.Water;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GroundTest {
    PokemonType pokemonType;

    @Before
    public void setUp(){
        pokemonType = new Ground();
    }

    @Test
    public void getTypeName(){
        Assert.assertEquals("Ground", pokemonType.getTypeName());
    }

    @Test
    public void getDefenseAccordingToType() {
        Assert.assertTrue(0 == pokemonType.getDefenseAccordingToType(new Electric()));
    }
}
