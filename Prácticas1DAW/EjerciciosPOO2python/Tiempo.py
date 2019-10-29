#-*- coding: utf-8 -*-
'''
Created on 6 feb. 2019

Ejercicio 6

Crea la clase Tiempo con los m�todos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
30) donde los par�metros que se le pasan al constructor son las horas, los
minutos y los segundos respectivamente. Crea el m�todo toString para ver los
intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
35m 20s el resultado deber�a ser 1h 6m 0s. Realiza un programa de prueba para
comprobar que la clase funciona bien.

@author: d18bugaj

'''

class Tiempo():
 
    #Constructor de la clase Tiempo 
    
    def __init__(self, horas, minutos, segundos):
        
        self.horas = horas
        self.minutos = minutos
        self.segundos = segundos
        
    #Metodo str
    def __str__(self):
        cadena=str(self.horas)+"h "+str(self.minutos)+"m " + str(self.segundos)+"s"
        return cadena
    
    #Metodo que suma dos horas
    def sumar(self,tiempo):
        self.horas = self.horas + tiempo.horas
        self.minutos = self.minutos + tiempo.minutos
        self.segundos = self.segundos + tiempo.segundos
        
        #en este if se le suma una hora si los minutos son mayores o iguales que 60
        if(self.minutos >= 60):
            self.horas+= 1
            self.minutos =  self.minutos - 60
        #en este if se le suma un minutos si los segundos son mayores o iguales que 60
        if(self.segundos >= 60):
            self.minutos+= 1
            self.segundos = self.segundos - 60

if __name__ == "__main__":
       
    #creamos los objetos de tipo Tiempo
    hora = Tiempo(8,59,20)
    hora2 = Tiempo(0,40,40)
    
    #invocamos el metodo sumar en el objeto hora
    hora.sumar(hora2)
    
    #al poner el print de un objeto llamamos al metodo str que nos devuelve una cadena
    print(hora)
    
    
