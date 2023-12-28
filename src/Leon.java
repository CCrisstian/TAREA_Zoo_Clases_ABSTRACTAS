public class Leon extends Felino{

/*------------ATRIBUTOS----------------*/
    private int numero_manada;
    private double potencia_rugido;
/*------------ATRIBUTOS----------------*/

/*------------GETTER-SETTER----------------*/
    public int getNumero_manada() {
        return numero_manada;
    }

    public void setNumero_manada(int numero_manada) {
        this.numero_manada = numero_manada;
    }

    public double getPotencia_rugido() {
        return potencia_rugido;
    }

    public void setPotencia_rugido(double potencia_rugido) {
        this.potencia_rugido = potencia_rugido;
    }
/*------------GETTER-SETTER----------------*/

/*------------CONSTRUCTOR----------------*/
    public Leon(String habitat, double altura, double largo,
                double peso, String nombre_científico,
                double tamaño_garras, int velocidad,
                int numero_manada, double potencia_rugido) {
        super(habitat, altura, largo, peso, nombre_científico,
                tamaño_garras, velocidad);
        this.numero_manada = numero_manada;
        this.potencia_rugido = potencia_rugido;
    }
/*------------CONSTRUCTOR----------------*/

/*------------MÉTODOS----------------*/
    @Override
    public String comer() {
        return "- El "+getClass().getName()+" nombre científico('"+
                nombre_científico+"') come principalmente de presas " +
                "herbívoras haciendo uso de sus garras de "+tamaño_garras+"cm.";
    }

    @Override
    public String dormir() {
        return "\n- Los leones son conocidos por sus hábitos de sueño. " +
                "Suelen dormir entre 16 y 20 horas al día.";
    }

    @Override
    public String correr() {
        return "\n- Un "+getClass().getName()+" puede alcanzar velocidades de hasta "+velocidad+" km/h.";
    }

    @Override
    public String comunicarse() {
        return "\n- Un "+getClass().getName()+" puede comunicarse con su manada de "+numero_manada+
                " miembros mediante su potente rugido de "+potencia_rugido+" decibeles.";
    }

    @Override
    public String Generar_Ficha() {
         StringBuilder ficha = new StringBuilder(super.Generar_Ficha());
         ficha.append("\n\tNumero manada: ").append(numero_manada);
         ficha.append("\n\tPotencia de rugido: ").append(potencia_rugido).append(" decibeles");
         ficha.append("\n---------------------------------------------------------------------------------------------------------------");
        return ficha.toString();
    }
/*------------MÉTODOS----------------*/

}
