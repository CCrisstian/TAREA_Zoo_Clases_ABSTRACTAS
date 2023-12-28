public class Tigre extends Felino{

/*------------ATRIBUTOS----------------*/
    private String especie_de_Tigre;
/*------------ATRIBUTOS----------------*/

/*------------GETTER-SETTER----------------*/
    public String getEspecie_de_Tigre() {
        return especie_de_Tigre;
    }

    public void setEspecie_de_Tigre(String especie_de_Tigre) {
        this.especie_de_Tigre = especie_de_Tigre;
    }
/*------------GETTER-SETTER----------------*/

/*------------CONSTRUCTOR----------------*/
    public Tigre(String habitat, double altura, double largo, double peso,
                 String nombre_científico, double tamaño_garras, int velocidad,
                 String especie_de_Tigre) {
        super(habitat, altura, largo, peso, nombre_científico, tamaño_garras, velocidad);
        this.especie_de_Tigre = especie_de_Tigre;
    }
/*------------CONSTRUCTOR----------------*/

/*------------MÉTODOS----------------*/

    @Override
    public String comer() {
        return "- Un "+getClass().getName()+" de la especie: "+especie_de_Tigre+
                "es un hábil cazador, con garras de "+tamaño_garras+"cm puede cazar " +
                "y consumir hasta 50 kg de carne en un solo día.";
    }

    @Override
    public String dormir() {
        return "\n- Los "+getClass().getName()+" de la especie: "+especie_de_Tigre+" son animales nocturnos y pasan gran parte del día durmiendo o " +
                "descansando. Pueden dormir hasta 18-20 horas al día.";
    }

    @Override
    public String correr() {
        return "\n- Un "+getClass().getName()+" de la especie: "+especie_de_Tigre+" puede alcanzar velocidades de hasta "+velocidad+"km/h en distancias cortas.";
    }

    @Override
    public String comunicarse() {
        return "\n- Aunque son animales solitarios, los "+getClass().getName()+" de la especie: "+especie_de_Tigre+" establecen un sistema de relaciones " +
                "sistemáticas que conforman una organización social propia de la especie animal.";
    }

    @Override
    public String Generar_Ficha() {
        StringBuilder ficha = new StringBuilder(super.Generar_Ficha());
        ficha.append("\n\tEspecia de Tigre: ").append(especie_de_Tigre);
        ficha.append("\n---------------------------------------------------------------------------------------------------------------");
        return ficha.toString();
    }

/*------------MÉTODOS----------------*/

}
