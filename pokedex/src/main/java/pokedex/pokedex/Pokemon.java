package pokedex.pokedex;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pokemon {
    private @Id @GeneratedValue Long ID;
    private String name; // e.g. ditto
    private String type; // Normal, Fighting, Flying, Poison etc.
    private float weight; // e.g. 5.2 kg
    private int height; // e.g. 54 cm
    private int strength; // e.g. 1-100

    public Pokemon() {}

    Pokemon(String name, String type, float weight, int height, int strength) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.height = height;
        this.strength = strength;
    }

    // getters

    public Long getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public float getWeight() {
        return this.weight;
    }

    public int getHeight() {
        return this.height;
    }

    public int getStrength() {
        return this.strength;
    }

    // setters

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Pokemon))
            return false;
            Pokemon pokemon = (Pokemon) o;
        return Objects.equals(this.ID, pokemon.ID) 
                && Objects.equals(this.name, pokemon.name)
                && Objects.equals(this.type, pokemon.type)
                && Objects.equals(this.weight, pokemon.weight)
                && Objects.equals(this.height, pokemon.height)
                && Objects.equals(this.strength, pokemon.strength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ID, this.name, this.type, this.weight, this.height, this.strength);
    }

    @Override
    public String toString() {
        return "Pokemon {" + "ID=" + this.ID + 
        ", name='" + this.name + '\'' + 
        ", type='" + this.type + '\'' + 
        ", weight='" + this.weight + '\'' + 
        ", height='" + this.height + '\'' + 
        ", strength='" + this.strength + '\'' + 
        '}';
    }
}
