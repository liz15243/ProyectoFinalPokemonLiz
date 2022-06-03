import java.util.ArrayList;

public class Main implements UtilidadesInterface{
    static ArrayList<Habilidad> habilidades = new ArrayList<>();
    static Habilidad habilidad = new Habilidad("Puño mortal","Lanza llamas",30);
    static Habilidad habilidad2= new Habilidad("Baby Baby","Distrae el contrincante",50);
    static  Habilidad habilidades3 = new Habilidad("Trueno","Baja la mitad de la vida",50);
    static ArrayList<String> tiposPokemon;

    public static void main(String[] args) {
    habilidades.add(habilidad);
    habilidades.add(habilidad2);
    habilidades.add(habilidades3);

    }
    public void tiempo(){
        long tiempoInicial= System.currentTimeMillis();
    }

    @Override
    public void tiempoJugado(long tiempoInicial, long tiempoFinal) {

    }

    @Override
    public void mostrarMenu() {

    }

    @Override
    public Pokemon crearPokemonAleatorio(Habilidad habilidad) {
        return null;
    }

    @Override
    public <T> T sacarAleatorio(ArrayList<T> arrayList) {
        return null;
    }

    @Override
    public String[] debilYfuerte(String tipo) {
        return new String[0];
    }

    @Override
    public String[] nombresPokemones(String tipo) {
        return new String[0];
    }
    Main main = new Main();
    Pocion pocio1 = new Pocion(30,20,"Pocion vida","Vida","Vida",20);




}
