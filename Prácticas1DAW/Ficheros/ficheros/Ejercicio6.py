#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Created on 1 abr. 2019

Realiza un programa que diga cu�ntas ocurrencias de una palabra hay en un
fichero. Tanto el nombre del fichero como la palabra se deben pasar como
argumentos en la l�nea de comandos.

@author: juanbu97
'''
#contador que almacena el número de veces que se repite la palabra
contador = 0

nombreFichero = input("Introduzca el nombre del fichero que desea contar las palabras")
palabraAContar = input("¿Que palabra desea contar?")

#abro el fichero en modo lectura
lectura = open(nombreFichero+".txt","r")

#leo el fichero y lo almaceno en la variable palabras
palabras = lectura.read()

#convierto la variable palabras en una lista y le quito los espacios, haciendo que cada palabra
#sea un elemento de la lista
lista = palabras.split()

#cierro el flujo de datos
lectura.close()

for x in lista:
    """
    For que recorre la lista y comprueba si la palabra a contar está en la lista.
    Si está en la lista suma 1 al contador.
    """
    if(x == palabraAContar):
        contador = contador +1


print("La palabra "+str(palabraAContar)+" se encuentra "+str(contador)+" veces en el fichero")
