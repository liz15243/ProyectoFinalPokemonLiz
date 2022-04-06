import java.util.ArrayList;

public class Tienda {
    //Atributos
    //Nombre - String
    //Objetos disponibles - ArrayList<Objetos>

    private String nombre;
    private ArrayList<Objeto> objetosDisponibles;


    //Metodo

    public boolean usuarioComprar(double dinero, int cantidad, int indiceObjeto){
       //Validad que hay suficientes objetos del tipo requerido (?)
        //Si hay Cantidad y existe en el arreglo
           //Si si tengo, validar que el dinero sea suficiente
            //Si dinero disponible vender
              //Mostrar que no le alcanza
         //Sino
           //Hacemos excepcion de que no hay la cantidad que pide
             //Repetimos pregunta
        return false;
    }

    //Comprar
    //Vender

    public boolean usuarioVender(Objeto objeto,int cantidad){
        //Logica inversa de comprar
        //Dinero infinito en la tienda
        //Recibir los objetos y darle el dinero
        return false;
    }


}
