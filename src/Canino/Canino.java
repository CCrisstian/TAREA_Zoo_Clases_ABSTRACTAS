package Canino;

import MAMIFERO.Mamifero;

public class Canino extends Mamifero {

/*------------ATRIBUTOS----------------*/
    protected String color;
    protected double tamaño_colmillos;
/*------------ATRIBUTOS----------------*/

/*------------GETTER----------------*/
    public String getColor() {
        return color;
    }

    public double getTamaño_colmillos() {
        return tamaño_colmillos;
    }
/*------------GETTER----------------*/

/*------------CONSTRUCTOR----------------*/
    public Canino(String habitat, double altura,
                  double largo, double peso,
                  String nombre_científico,
                  String color,
                  double tamaño_colmillos) {
        super(habitat, altura, largo, peso, nombre_científico);
        this.color = color;
        this.tamaño_colmillos = tamaño_colmillos;
    }
/*------------CONSTRUCTOR----------------*/

/*------------MÉTODOS----------------*/
    @Override
    public String comer() {
        return null;
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comunicarse() {
        return null;
    }

    @Override
    public String Generar_Ficha() {
        StringBuilder ficha = new StringBuilder(super.Generar_Ficha());
        ficha.append("\n\tColor: ").append(color);
        ficha.append("\n\tTamaño de los colmillos: ").append(tamaño_colmillos).append(" cm");
        return ficha.toString();
    }
/*------------MÉTODOS----------------*/

}
