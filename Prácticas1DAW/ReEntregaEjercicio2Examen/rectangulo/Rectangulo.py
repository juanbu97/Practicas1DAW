#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Created on 5 abr. 2019

@author: juanbu97
'''
import sys

class Rectangulo(object):
    '''
    Esta clase es Rectangulo y no puede tener ni el alto ni 
    el ancho menores que 0 ni mayores que 10
    '''
    def __init__(self, alto, ancho):
        '''
        Constructor
        '''
        #Rectangulo.__verifica_alto(alto)
        #Rectangulo.__verifica_ancho(ancho)
        self.alto = alto
        self.ancho = ancho
    
    
    @property
    def alto(self):
        return self.__alto
    
    @alto.setter
    def alto(self, alto):
        Rectangulo.__verifica_alto(alto)
        self.__alto = alto
    
    @property
    def ancho(self):
        return self.__ancho
    
    @ancho.setter
    def ancho(self, ancho):
        Rectangulo.__verifica_ancho(ancho)
        self.__ancho = ancho
    
    
        
    def __str__(self):
        cadena = ""
        
        for i in range (self.ancho):
            cadena += "*"
        cadena += "\n"
        
        for i in range(self.alto - 2):
            cadena += "*"
            for x in range(1, self.ancho - 1):
                cadena += " "
            cadena += "*\n"
        
        for i in range (self.ancho):
            cadena += "*"
        cadena += "\n"
        
        return cadena
    
    @staticmethod
    def __verifica_alto(al):
        if(al < 0 or al > 10):
            raise TypeError
        
    @staticmethod
    def __verifica_ancho(ancho):
        if(ancho < 0 or ancho > 10):
            raise TypeError
        
class Cuadrado(Rectangulo):
    """
    En este ejercicio tenía un error al crear el cudrado
    que le pasaba 2 parámetros en vez de uno
    """
    def __init__(self, lado):
        super().__init__(lado, lado)
    
    def __str__(self):
        return Rectangulo.__str__(self)
    
    def __eq__(self, other):
        """Sobrecarga del operador =="""
        return (self.alto == other.alto)
    
    def __lt__(self, other):
        """Sobrecarga del operador <"""
        return (self.alto < other.alto)
    
    def __gt__(self, other):
        """sobre cargar del operador >"""
        return (self.alto > other.alto)
    
    @property
    def lado(self):
        return super.alto
    
    @lado.setter
    def lado(self, lado):
        self.alto=lado
        self.ancho=lado
    


if __name__ == "__main__": 
    
    print("Pinto el rectangulo")
    rectangulo2 = Rectangulo(3,6)
    print(rectangulo2)
    
    cuadrado = Cuadrado(4)
    cuadrado2 = Cuadrado(3)
    cuadrado3 = Cuadrado(5)
    print("Pinto el cuadrado")
    print(cuadrado)
    
    print(cuadrado2)
    cuadrado2.lado = 9
    print(cuadrado2)
    
    
    print("El cuadrado es igual al cuadrado "+str(cuadrado==cuadrado))
    
    print("El cuadrado es mayor que el cuadrado 2 "+str(cuadrado > cuadrado2))
    print("El cuadrado es menor que el cuadrado 2 "+str(cuadrado < cuadrado2))

    print("El cuadrado es mayor que el cuadrado 3 "+str(cuadrado > cuadrado3))
    print("El cuadrado es menor que el cuadrado 3 "+str(cuadrado < cuadrado3))
    
    print("Provoco un error haciendo un rectangulo invalido")
    try:
        rectangulo1 = Rectangulo(25,-6)
    except:
        sys.stderr.write("Error")