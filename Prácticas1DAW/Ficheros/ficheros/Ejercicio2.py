#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Realiza un programa que lea el escritura creado en el ejercicio anterior y que muestre los números por pantalla.
"""
#Abrimos el escritura primos.dat en modo lectura
lectura = open("primos.dat","r")

#Imprimimos por pantalla lo que contiene el escritura
print (lectura.read())

#Cerramos el flujo del escritura
lectura.close()