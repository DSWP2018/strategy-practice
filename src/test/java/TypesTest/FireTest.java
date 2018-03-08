package TypesTest;

import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Electric;
import com.iteso.nintendo.Types.Fire;
import com.iteso.nintendo.Types.Grass;
import com.iteso.nintendo.Types.Water;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FireTest {
    PokemonType pokemonType;

    @Before
    public void setUp(){
        pokemonType = new Fire();
    }

    @Test
    public void getTypeName(){
        Assert.assertEquals("Fire", pokemonType.getTypeName());
    }

    @Test
    public void getDefenseAccordingToType() {
        Assert.assertTrue(1 == pokemonType.getDefenseAccordingToType(new Electric()));
    }
}
