package Felino;

import Felino.Felino;

public class Guepardo extends Felino {

/*------------CONSTRUCTOR----------------*/
    public Guepardo(String habitat, double altura, double largo, double peso,
                    String nombre_científico, double tamaño_garras, int velocidad) {
        super(habitat, altura, largo, peso, nombre_científico, tamaño_garras, velocidad);
    }
/*------------CONSTRUCTOR----------------*/

/*------------MÉTODOS----------------*/
    @Override
    public String comer() {
        return"- El "+getClass().getSimpleName()+" se alimenta principalmente de gacelas Thompson, ñus y otros pequeños roedores.";
    }

    @Override
    public String dormir() {
        return "\n- El "+getClass().getSimpleName()+" es un animal que no duerme en cuevas ni realiza ningún tipo de hogar para protegerse día tras día.";
    }

    @Override
    public String correr() {
        return "\n- El "+getClass().getSimpleName()+" es conocido por ser el animal terrestre más rápido del mundo, capaz de alcanzar velocidades de hasta "+velocidad+" kilómetros.";
    }

    @Override
    public String comunicarse() {
        return"\n- El "+getClass().getSimpleName()+" se comunican a través del olor y el sonido.";
    }

    @Override
    public String Generar_Ficha() {
        StringBuilder ficha = new StringBuilder(super.Generar_Ficha());
        ficha.append("\n---------------------------------------------------------------------------------------------------------------");
        return ficha.toString();
    }
/*------------MÉTODOS----------------*/

}
