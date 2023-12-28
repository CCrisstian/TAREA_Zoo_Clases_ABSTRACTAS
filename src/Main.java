public class Main {
    public static void main(String[] args) {
       Leon prueba = new Leon("Sabana",1.5D,2D,150D,"Liom",20D,30,6,60D);
        System.out.println(prueba.Generar_Ficha());
        System.out.println(prueba.Generar_Comportamiento(prueba));
    }
}