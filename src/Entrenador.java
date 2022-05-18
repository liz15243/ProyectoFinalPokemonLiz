import java.util.ArrayList;

public class Entrenador extends Personaje{

    private String region;
    private Pokemon PokemonMascota;
    private int torneosGanados;
    private ArrayList<Pokemon> pokedex;
    private ArrayList<Objeto> Mochila;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Pokemon getPokemonMascota() {
        return PokemonMascota;
    }

    public void setPokemonMascota(Pokemon pokemonMascota) {
        PokemonMascota = pokemonMascota;
    }

    public int getTorneosGanados() {
        return torneosGanados;
    }

    public void setTorneosGanados(int torneosGanados) {
        this.torneosGanados = torneosGanados;
    }

    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
    }

    public void setPokedex(ArrayList<Pokemon> pokedex) {
        pokedex = pokedex;
    }

    public ArrayList<Objeto> getMochila() {
        return Mochila;
    }

    public void setMochila(ArrayList<Objeto> mochila) {
        Mochila = mochila;
    }

    public Entrenador(String nombre, int nivel, char genero, String region, Pokemon pokemonMascota, int torneosGanados, ArrayList<Pokemon> pokedex, ArrayList<Objeto> mochila) {
        super(nombre, nivel, genero);
        this.region = region;
        PokemonMascota = pokemonMascota;
        this.torneosGanados = torneosGanados;
        pokedex = pokedex;
        Mochila = mochila;
    }


    @Override
    public boolean pelear(Pokemon pokemonContrario) {
        //escoger pokemones para pelear
        ArrayList<Pokemon> parapelear = new ArrayList<>();
       // mostrar pokedex
        // el usuario escoge 3
        // y esos 3 se agregan a paraPelea


        return false;
    }
}
