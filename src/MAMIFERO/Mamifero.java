package MAMIFERO;

abstract public class Mamifero {

/*------------ATRIBUTOS----------------*/
protected String habitat;
protected double altura;
protected double largo;
protected double peso;
protected String nombre_científico;
/*------------ATRIBUTOS----------------*/

/*------------GETTER----------------*/
    public String getHabitat() {
        return habitat;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargo() {
        return largo;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombre_científico() {
        return nombre_científico;
    }
/*------------GETTER----------------*/

/*------------CONSTRUCTOR----------------*/
    public Mamifero(String habitat, double altura, double largo, double peso, String nombre_científico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombre_científico = nombre_científico;
    }
/*------------CONSTRUCTOR----------------*/

/*------------MÉTODOS----------------*/
    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();

    public String Generar_Ficha() {
        StringBuilder ficha = new StringBuilder("\n---------------------------------------------------------------------------------------------------------------");
        ficha.append("\nFicha de: "+getClass().getSimpleName());
        ficha.append("\n---------------------------------------------------------------------------------------------------------------");
        ficha.append("\n\tHabitad: ").append(habitat);
        ficha.append("\n\tAltura: ").append(altura).append(" mts");
        ficha.append("\n\tLargo: ").append(largo).append(" mts");
        ficha.append("\n\tPeso: ").append(peso).append(" kg");
        ficha.append("\n\tNombre Científico: ").append(nombre_científico);

        return ficha.toString();
    }

    public String Generar_Comportamiento(Mamifero mamifero){
        StringBuilder comportamiento = new StringBuilder();
        comportamiento.append(comer());
        comportamiento.append(dormir());
        comportamiento.append(correr());
        comportamiento.append(comunicarse());
        comportamiento.append("\n---------------------------------------------------------------------------------------------------------------");
        return comportamiento.toString();
    }
/*------------MÉTODOS----------------*/

}
