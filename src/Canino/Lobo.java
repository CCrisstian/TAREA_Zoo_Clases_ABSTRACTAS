package Canino;

public class Lobo extends Canino{

/*------------ATRIBUTOS----------------*/
    private int numero_camada;
    private String especie_lobo;
/*------------ATRIBUTOS----------------*/

/*------------GETTER-SETTER----------------*/
    public int getNumero_camada() {
        return numero_camada;
    }

    public void setNumero_camada(int numero_camada) {
        this.numero_camada = numero_camada;
    }

    public String getEspecie_lobo() {
        return especie_lobo;
    }

    public void setEspecie_lobo(String especie_lobo) {
        this.especie_lobo = especie_lobo;
    }
/*------------GETTER-SETTER----------------*/

/*------------CONSTRUCTOR----------------*/
    public Lobo(String habitat, double altura, double largo, double peso,
                String nombre_científico, String color, double tamaño_colmillos,
                int numero_camada, String especie_lobo) {
        super(habitat, altura, largo, peso, nombre_científico, color, tamaño_colmillos);
        this.numero_camada = numero_camada;
        this.especie_lobo = especie_lobo;
    }
/*------------CONSTRUCTOR----------------*/

/*------------MÉTODOS----------------*/
    @Override
    public String comer() {
        return "- Un "+getClass().getSimpleName()+" de color('"+color+"') de la especie ('"+especie_lobo+"') son carnívoros con colmillos de "
                +tamaño_colmillos+" cm, su alimentación se basa principalmente en animales de tamaño medio como cerdos, cabras, ciervos.";
    }

    @Override
    public String dormir() {
        return "\n- El "+getClass().getSimpleName()+" de la especie ('"+especie_lobo+"') son conocidos por mantenerse despiertos hasta " +
                "altas horas de la noche y dormir más durante el día.";
    }

    @Override
    public String correr() {
        return "\n- El "+getClass().getSimpleName()+" nombre científico ('"+nombre_científico+"') están adaptados para carreras de larga distancia. " +
                "Son capaces de cubrir varios kilómetros a una velocidad de 10 km/h";
    }

    @Override
    public String comunicarse() {
        return "\n- El "+getClass().getSimpleName()+" nombre científico ('"+nombre_científico+"') son animales muy comunicativos que utilizan una " +
                "gran variedad de maneras para comunicarse con los "+numero_camada+" miembros de su camada";
    }

    @Override
    public String Generar_Ficha() {
        StringBuilder ficha = new StringBuilder(super.Generar_Ficha());
        ficha.append("\n\tNumero de camada: ").append(numero_camada);
        ficha.append("\n\tEspecie de Lobo: ").append(especie_lobo);
        ficha.append("\n---------------------------------------------------------------------------------------------------------------");
        return ficha.toString();
    }
/*------------MÉTODOS----------------*/

}
