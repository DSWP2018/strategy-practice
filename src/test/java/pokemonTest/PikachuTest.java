package pokemonTest;

import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import other.PokemonCharacter;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class PikachuTest {
	PokemonCharacter pikachu;

	@Before
	public void setUp() {
		pikachu = mock(PokemonCharacter.class);

	}

	@Test
	public void evolve() {
		Assert.assertEquals(null, pikachu.evolve());
	}

	@Test
	public void defend() {
		Assert.assertEquals("Defending attack, damage caused is 12 new HP is 88", pikachu.defend(30));
	}

	@Test
	public void secondAttack() {
		Assert.assertEquals("Attacking opponent with Dig causing damage of 4", pikachu.secondAttack());
	}

	@Test
	public void mainAttack() {
		Assert.assertEquals("Attacking opponent with ThunderPunch causing damage of 5", pikachu.mainAttack());
	}

}
