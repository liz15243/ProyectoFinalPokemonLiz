public class Pocion extends Objeto{
    // Efecto
    // Duracion
    private String efecto;
    private int duracion;

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Pocion(double costo, int cantidad, String nombre, String tipo, String efecto, int duracion) {
        super(costo, cantidad, nombre, tipo);
        this.efecto = efecto;
        this.duracion = duracion;
    }

    @Override
    public boolean usar(Pokemon pokemon) {
        if(this.efecto.equals("curacion")){
            pokemon.setHp(pokemon.getHp()+20);
            return true;
        }else if(this.efecto.equals("fuerza")){
            pokemon.getHabilidad().setAtaqueBase(pokemon.getHabilidad().getAtaqueBase());
            return true;
        }else if(this.efecto.equals("velocidad")){
            pokemon.setVelocidad(pokemon.getVelocidad()+20);
            return true;
        }else{
            return false;
        }
    }
    // Usar
       // Si es curacion
         // Aumentar 20 hp
      // Si es de fuerza
         // Aumentar ataque 20
         // Aumentar velocidad 20

}
