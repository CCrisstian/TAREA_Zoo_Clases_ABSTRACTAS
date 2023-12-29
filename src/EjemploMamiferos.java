import Canino.*;
import Felino.*;
import MAMIFERO.Mamifero;

public class EjemploMamiferos {
    public static void main(String[] args) {
        MAMIFERO.Mamifero[] mamiferos = new MAMIFERO.Mamifero[5];

        Lobo lobo = new Lobo("Bosque",0.7D,1.5D,50D,"Canis lupus","Gris",0.7D,10,"Lobo gris");
        Perro perro = new Perro("Casa",0.4D,1D,24D,"Canis familiaris","Amarillo",0.3D,230);

        Guepardo guepardo = new Guepardo("Estepas",0.5D,1.5D,40D,"Acinonyx jubatus",0.1D,115);
        Leon leon = new Leon("Sabana",1.5D,2D,200D,"Panthera leo",0.1D,80,6,114);
        Tigre tigre = new Tigre("Selva",1.7D,2D,150D,"Panthera tigris amoyensis",0.1D,60,"Tigre del Sur de China");

        mamiferos[0] = lobo;
        mamiferos[1] = perro;
        mamiferos[2] = guepardo;
        mamiferos[3] = leon;
        mamiferos[4] = tigre;

        for (Mamifero mamifero : mamiferos) {
            System.out.println(mamifero.Generar_Ficha());
            System.out.println(mamifero.Generar_Comportamiento());
            System.out.println();
        }
    }
}