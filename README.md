Se requiere escribir un programa para la administración de animales de un zoológico, inicialmente para los mamíferos, para leones, lobos, tigres, guepardos y perros salvaje africano.

Se necesita diseñar una jerarquías de clases en común a todos ellos, por ejemplo:
- para los felinos (Felino.Leon, Felino.Tigre y Felino.Guepardo) vamos a necesitar la clase abstracta Felino.Felino.
- para los caninos (Lobo y Perro) vamos a necesitar la clase abstracta Canino.Canino

y una clase que sea en comun para todos ellos, la clase abstracta MAMIFERO.Mamifero.

Para todos los mamíferos mencionados se requieren de los siguientes atributos en común (que deberan de implementar en la clase abstracta MAMIFERO.Mamifero): 
- el habitat (string)
- altura (decimal)
- largo (decimal)
- peso (decimal)
- nombre científico (string)

Con sus respectivos métodos getters, usar constructor para inicializar los datos.

También se necesitan 4 métodos abstractos que deberán implementar los tipos concretos:
- comer()
- dormir()
- correr()
- comunicarse()
todos devuelven string.

Todos los caninos deberán tener ademas de lo anterior los atributos: 
- color (string)
- tamaño colmillos (decimal)
e inicializar los datos mediante constructor con sus métodos getters.

Todos los felinos deberán tener los atributos: 
- tamaño garras (decimal)
- velocidad (int)
inicializar los datos mediante constructor y sus métodos getters.

Respecto a los tipos concretos:

- El Felino.Leon ademas tiene:
  * numero manada (int)
  * potencia rugido en decibel (decimal)

- El Felino.Tigre tiene el atributo:
  * especie tigre (string)

- El Felino.Guepardo sin atributos adicionales

- El Lobo tiene:
  * numero de camada (int)
  * especieLobo (string)

- El Perro tiene:
  * fuerza de mordida en psi (int)

Los métodos abstractos:
  comer(), dormir(), correr() y comunicarse() 
tienen que ser implementados por las clases concretas devolviendo un string con alguna frase u oración que sea de acuerdo a cada tipo y que interactúe con sus atributos. No hay una regla para implementar estos métodos, pueden aplicar la creatividad, por ejemplo.

en la clase Felino.Leon el método comer() podría ser implementado devolviendo la cadena "El León caza junto a su grupo de " + numManada + " individuos en las llanuras africanas", o para el Lobo el método dormir() devolver "El Lobo " + color + " duerme en las cavernas de " + habitat.

Al final crear la clase con el método main llamada EjemploMamiferos y crear algunas instancias de ejemplo de cada clase concreta, entre 5 a 7 objetos, asociado al tipo mas genérico posible y mostrar los datos en consola. Por ejemplo:

MAMIFERO.Mamifero[] mamiferos = new MAMIFERO.Mamifero[6];
 
MAMIFERO.Mamifero leon = new Felino.Leon(120d, 5, 7.5f, 58, "Sur Africa", 120, 220, 190);
MAMIFERO.Mamifero guepardo = new Felino.Guepardo(4.9f, 130, "Africa", 94, 140, 72);

...

mamiferos[0] = leon;

mamiferos[1] = guepardo;

...
 
for (MAMIFERO.Mamifero animal : mamiferos) {
    ....
}
...


![image](https://github.com/CCrisstian/TAREA_Zoo_Clases_ABSTRACTAS/assets/111469216/2c175ece-5bd7-45ed-8086-f0891c392f9e)
