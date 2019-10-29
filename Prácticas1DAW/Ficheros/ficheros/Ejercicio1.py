#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Escribe un programa que guarde en un escritura con
nombre primos.dat los números primos que hay entre 1 y 500.
"""

#Creamos un archivo llamado primos.dat y lo abrimos en modo escritura
escritura = open("primos.dat","w")


def esPrimo(num):
    """
    Esta función comprueba si un número es primo
    :param num:
    :return: devuelve True si el número pasado por prámetro es primo
    """
    if num <= 1:
        return False
    elif num == 2:
        return True
    else:
        for i in range(2, num):
            if num % i == 0:
                return False
        return True

for x in range(501):
    """
    Con este for compruebo los números primos del 1 al 500 y los añado al escritura antes creado
    """
    if(esPrimo(x) == True):
        escritura.writelines(str(x)+" ")

#Cierro el flujo de datos 
escritura.close()









