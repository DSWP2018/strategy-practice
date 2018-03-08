package TypesTest;

import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Fire;
import com.iteso.nintendo.Types.Grass;
import com.iteso.nintendo.Types.Water;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GrassTest {
    PokemonType pokemonType;

    @Before
    public void setUp(){
        pokemonType = new Grass();
    }

    @Test
    public void getTypeName(){
        Assert.assertEquals("Grass", pokemonType.getTypeName());
    }

    @Test
    public void getDefenseAccordingToType() {
        Assert.assertTrue(2 == pokemonType.getDefenseAccordingToType(new Fire()));
    }
}
