package com.proyecto.curso;
/*
 * EJERCICIO:
 * - Crea ejemplos de funciones básicas que representen las diferentes
 *   posibilidades del lenguaje:
 *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
 * - Comprueba si puedes crear funciones dentro de funciones.
 * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
 * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 *
 * Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
 * Cada lenguaje sigue una convenciones que debes de respetar para que el código se entienda.
 */
public class ejercicio02  {
    // Variable GLOBAL
    static String globalVar = "Soy una variable global";

    public static void main(String[] args) {
        // Llamada a función sin parámetros ni retorno
        funcionSinParametrosNiRetorno();

        // Llamada a función con parámetros y sin retorno
        funcionConParametros("Hola", 3);

        // Llamada a función con parámetros y con retorno
        int resultado = funcionConParametrosYRetorno(5, 7);
        System.out.println("Resultado de la suma: " + resultado);

        // Ejemplo de función dentro de función (Java no lo permite directamente)
        // Pero podemos usar clases anidadas o lambdas para lograr algo similar.

        // Uso de una función ya existente en Java
        String texto = "   Hola Mundo   ";
        System.out.println("Texto en mayúsculas: " + texto.toUpperCase());

        // Mostrar variable GLOBAL
        System.out.println(globalVar);

        // DIFICULTAD EXTRA
        int contador = funcionDificultadExtra("Fizz", "Buzz");
        System.out.println("Números impresos: " + contador);
    }

    // Función sin parámetros ni retorno
    public static void funcionSinParametrosNiRetorno() {
        System.out.println("Función sin parámetros ni retorno ejecutada.");
    }

    // Función con parámetros y sin retorno
    public static void funcionConParametros(String mensaje, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
        }
    }

    // Función con parámetros y con retorno
    public static int funcionConParametrosYRetorno(int a, int b) {
        return a + b;
    }

    // Función DIFICULTAD EXTRA
    public static int funcionDificultadExtra(String texto1, String texto2) {
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(texto1 + texto2);
            } else if (i % 3 == 0) {
                System.out.println(texto1);
            } else if (i % 5 == 0) {
                System.out.println(texto2);
            } else {
                System.out.println(i);
            }

        }   return contador;
    }
}