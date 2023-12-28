package Canino;

public class Perro extends Canino{

/*------------ATRIBUTOS----------------*/
    private int fuerza_mordida;
/*------------ATRIBUTOS----------------*/

/*------------GETTER-SETTER----------------*/
    public int getFuerza_mordida() {
        return fuerza_mordida;
    }

    public void setFuerza_mordida(int fuerza_mordida) {
        this.fuerza_mordida = fuerza_mordida;
    }
/*------------GETTER-SETTER----------------*/

/*------------CONSTRUCTOR----------------*/
    public Perro(String habitat, double altura, double largo, double peso,
                 String nombre_científico, String color, double tamaño_colmillos, int fuerza_mordida) {
        super(habitat, altura, largo, peso, nombre_científico, color, tamaño_colmillos);
        this.fuerza_mordida = fuerza_mordida;
    }
/*------------CONSTRUCTOR----------------*/

/*------------MÉTODOS----------------*/
    @Override
    public String comer() {
        return "- Los "+getClass().getSimpleName()+" color('"+color+"') son carnívoros con una fuerza de mordida de "
                +fuerza_mordida+" psi, necesitan una dieta equilibrada para un correcto crecimiento y mantenimiento de su metabolismo";
    }

    @Override
    public String dormir() {
        return "\n- Los "+getClass().getSimpleName()+" duermen alrededor de unas 14 horas, 8 a 9 horas por la noche y pequeñas siestas durante el día.";
    }

    @Override
    public String correr() {
        return "\n- La capacidad de un "+getClass().getSimpleName()+" nombre científico ('"+nombre_científico+"') depende de varios factores, incluyendo su raza, edad, salud y nivel de entrenamiento";
    }

    @Override
    public String comunicarse() {
        return "\n- Los "+getClass().getSimpleName()+" nombre científico ('"+nombre_científico+"') son muy buenos comunicadores y utilizan una variedad de métodos para interactuar con los humanos y otros perros";
    }

    @Override
    public String Generar_Ficha() {
        StringBuilder ficha = new StringBuilder(super.Generar_Ficha());
        ficha.append("\n\tFuerza de mordida: ").append(fuerza_mordida).append(" psi");
        ficha.append("\n---------------------------------------------------------------------------------------------------------------");
        return ficha.toString();
    }
/*------------MÉTODOS----------------*/
}
