import java.util.Random;

public class Pokebola extends Objeto {
    // Efectividad - double
    private double efectividad;

    public Pokebola(double costo, int cantidad, String nombre, String tipo, double efectividad) {
        super(costo, cantidad, nombre, tipo);
        this.efectividad = efectividad;
    }

    @Override
    public boolean usar(Pokemon pokemon) {
        if(pokemon.isEsLegendario()){
            this.efectividad -= 40;
        }
        Random random = new Random();
        int valor= random.nextInt(100);
        if(valor>=1 && valor<= this.efectividad){
            return true;
        }else{
            return false;
        }
    }

    // Atrapar - retornar true/false
    // Revisar tipo pokebola
      // Si es PokebolaLegendario - 40 efectividad

       // Hacemos un Random del 1 al 10,
          // Si se obtiene un numero entre 1 y la efectividad que lo atrape
          // y restamos la pokebola
    //sino
         // Intenta otra vez hasta que se acaben las pokebolas
        // o el usuario ya no lo quiera intentar
    // Revisar tpo de pokemon


}
