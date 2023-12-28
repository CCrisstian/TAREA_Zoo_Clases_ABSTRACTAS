public class Felino extends Mamifero{

/*------------ATRIBUTOS----------------*/
    protected double tamaño_garras;
    protected int velocidad;
/*------------ATRIBUTOS----------------*/

/*------------GETTER----------------*/
    public double getTamaño_garras() {
        return tamaño_garras;
    }

    public int getVelocidad() {
        return velocidad;
    }
/*------------GETTER----------------*/

/*------------CONSTRUCTOR----------------*/
    public Felino(String habitat, double altura, double largo,
                  double peso, String nombre_científico,
                  double tamaño_garras, int velocidad) {
        super(habitat, altura, largo, peso, nombre_científico);
        this.tamaño_garras = tamaño_garras;
        this.velocidad = velocidad;
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

/*------------MÉTODOS----------------*/

}
