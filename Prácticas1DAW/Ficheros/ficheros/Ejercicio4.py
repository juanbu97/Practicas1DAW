#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Realiza un programa que sea capaz de ordenar alfabéticamente 
las palabras contenidas en un escritura de texto. 
El nombre del escritura que contiene las palabras se debe pasar como argumento en la línea de comandos.
El nombre del escritura resultado debe ser el mismo que el original añadiendo la coletilla sort,
por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una línea.
"""
nombreFichero = input("Introduzca el nombre del escritura")

lectura = open(nombreFichero+".txt","r")
escritura = open(nombreFichero+"_sort.txt", "w")

lista = []

for x in lectura:
    lista.append(x)
    
lista.sort()

for x in lista:
    escritura.writelines(str(x))
    
lectura.close()
escritura.close()



