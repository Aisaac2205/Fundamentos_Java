package com.proyecto.curso;
// https://www.java.com/

/*

 EJERCICIO:
 - Crea un comentario en el código y coloca la URL del sitio web oficial del
   lenguaje de programación que has seleccionado.
 - Representa las diferentes sintaxis que existen de crear comentarios
   en el lenguaje (en una línea, varias...).
 - Crea una variable (y una constante si el lenguaje lo soporta).
 - Crea variables representando todos los tipos de datos primitivos
   del lenguaje (cadenas de texto, enteros, booleanos...).
 - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 */

public class ejercicio00 {
public static void main(String[] args) {
//Crear una variable y una constante
    int miVariable = 10;
    final double MI_CONSTANTE = 3.1416;

//Crear variables primitivas
        String myVariable = "Hola Java";
        int NumberFavorite = 19;
        final double Pi = 3.1416;
        boolean isJavaFun = true;
        char myChar = 'A';
        boolean isFishTasty = false;
        long myLong = 123456789L;
        float myFloat = 5.75f;
        byte myByte = 100;
        short myShort = 5000;

    //Imprimir el texto de saludo
    System.out.printf(myVariable);
    }

}
