#-*- coding: utf-8 -*-
'''
Created on 24 feb. 2019

@author: d18bugaj
'''

class Terminal():
    '''
       Implementa la clase Terminal. Un terminal tiene asociado un n�mero. Los
        terminales se pueden llamar unos a otros y el tiempo de conversaci�n corre
        para ambos.
    '''
    tiempo = 0


    def __init__(self, numero_telefono):
        self.numero_telefono = numero_telefono
    
    
    def llamar(self, objeto_terminal, tiempo):
        self.tiempo += tiempo
        objeto_terminal.tiempo += tiempo
    
    def __str__(self):
        cadena = "N� "+ str(self.numero_telefono)+ " - " + str(self.tiempo)+ " de conversacion"
        return cadena
    
    
    
if __name__ == "__main__":
    
    t1 = Terminal("957655249")
    t2 = Terminal("957655888")
    t3 = Terminal("957655999") 
    t4 = Terminal("957444596")
    print(t1)
    print(t2)
    t1.llamar(t2, 320)
    t1.llamar(t3, 200)
    print(t1)
    print(t2)
    print(t3)
    print(t4)
        
        