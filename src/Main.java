import Canino.Lobo;
import Canino.Perro;
import Felino.Leon;

public class Main {
    public static void main(String[] args) {
        Perro prueba = new Perro("Casa",0.4D,0.60D,20D,"Canis Familiaris","Amarillo",0.10D,30);
        System.out.println(prueba.Generar_Ficha());
        System.out.println(prueba.Generar_Comportamiento(prueba));
    }
}