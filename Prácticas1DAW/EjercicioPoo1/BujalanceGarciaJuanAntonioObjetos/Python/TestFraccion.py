# coding=utf8

from Relacion1ObjetosPython import Fraccion
#main:

fraccion1 = Fraccion.Fraccion(8,4)
        
print("Fraccion 1:")
print(fraccion1.mostrarFraccion())
print("Fraccion 1 simplificada:")
fraccion1.simplificaFraccion()
print(fraccion1.mostrarFraccion())
        
print("El resultado decimal de Fraccion 1 es:")
print(fraccion1.obtenerResultado())
        
        
fraccion2 = Fraccion.Fraccion(1,4)
fraccion3 = Fraccion.Fraccion(7,2)
print("Fraccion 2:")
print(fraccion2.mostrarFraccion())
print("Fraccion 3:")
print(fraccion3.mostrarFraccion())
        
print("Suma de fracciones 2 y 3:")
print(fraccion2.sumaFracciones(fraccion3).mostrarFraccion())
print("Resta de fracciones 2 y 3:")
print(fraccion2.restaFracciones(fraccion3).mostrarFraccion())
print("Multiplicacion de fracciones 2 y 3:")
print(fraccion2.multiplicaFracciones(fraccion3).mostrarFraccion())
        
print("La fraccion 2 multiplicada por un numero:")
fraccion2.multiplicaFraccion(10)
print(fraccion2.mostrarFraccion())

