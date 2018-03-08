package com.iteso.nintendo;
/**Interface.**/
public interface PokemonType {
/**
 * Pokemon type.
 * @return water, fire, normal, electric, plant, bug, etc.
 */
String getType();
/**
 * Get defense multiplier.
 * @return defense multiplier.
 */
double getDefenseMultiplier();
/**@param attacker PokemonType. **/
void setDefenseMultiplier(PokemonType attacker);
}
