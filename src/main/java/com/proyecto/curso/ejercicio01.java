package com.proyecto.curso;
/*
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
 */
public class ejercicio01 {
    public static void main(String[] args) {
        // Operadores Aritméticos
        int miVariable = 10;
        int b = 5;

        System.out.println("Suma: " + (miVariable + 7)); //
        System.out.println("Resta: " + (miVariable - 5)); // 5
        System.out.println("Multiplicación: " + (miVariable * 8)); // 80
        System.out.println("División: " + (miVariable / 5)); // 2
        System.out.println("Módulo: " + (miVariable % 3)); // 1

        // Operadores con bits
        int c = 6; // 110 en binario
        int d = 3; // 011 en binario
        System.out.println("AND: " + (c & d)); // 2 (010 en binario)
        System.out.println("OR: " + (c | d)); // 7 (111 en binario)
        System.out.println("XOR: " + (c ^ d)); // 5 (101 en binario)
        System.out.println("NOT c: " + (~c)); // -7 (complemento a dos)


        // Operadores de Comparación
        System.out.println("miVariable es mayor que b: " + (miVariable > b)); // true
        System.out.println("miVariable es menor que b: " + (miVariable < b)); // false
        System.out.println("miVariable es igual a b: " + (miVariable == b)); // false
        System.out.println("miVariable es diferente de b: " + (miVariable!= b)); // true

        // Operadores Lógicos
        boolean x = true;
        boolean y = false;
        System.out.println("x AND y: " + (x && y)); // false
        System.out.println("x OR y: " + (x || y)); // true
        System.out.println("NOT x: " + (!x)); // false

        // Estructuras de Control - Condicionales
        if (miVariable > b) {
            System.out.println("miVariable es mayor que b");
        } else {
            System.out.println("miVariable no es mayor que b");
        }

        // Estructuras de Control - Iterativas
        System.out.println("Números del 1 al 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // DIFICULTAD EXTRA
        System.out.println("Números pares entre 10 y 55, excluyendo 16 y múltiplos de 3:");
        for (int i = 10; i <= 55; i++) {
            if (i % 2 == 0 && i != 16 && i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
}
