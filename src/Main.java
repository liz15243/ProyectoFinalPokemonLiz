import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Objeto> paraTienda = new ArrayList<>();
        Pocion pocion1 = new Pocion(30.5,2,"vida","vida","dar vida",10);
        Pokebola pokeUltra = new Pokebola(50.5,15,"PokeUltra","Ultra", 99.5);
        paraTienda.add(pocion1);
        paraTienda.add(pokeUltra);
        Tienda miTiendita = new Tienda("Mi tienda", paraTienda);
        miTiendita.mostrarDisponibles();
        System.out.println(miTiendita.usuarioComprar(30.3,1,0));
        miTiendita.usuarioVender(pocion1,4);
    }

}
