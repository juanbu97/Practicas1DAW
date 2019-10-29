#-*- coding: utf-8 -*-
'''
Created on 5 feb. 2019

Crea la clase Vehiculo, as� como las clases Bicicleta y Coche como subclases de
la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreados y
kilometrosTotales, as� como el atributo de instancia kilometrosRecorridos. Crea
tambi�n alg�n m�todo espec�fico para cada una de las subclases. Prueba las
clases creadas mediante un programa con un men� como el que se muestra
a continuaci�n:

VEH�CULOS
=========
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opci�n (1-8):


@author: d18bugaj
'''


class Vehiculos():

    vehiculosCreados = 0
    kilometrosTotales = 0 
    

    def __init__(self):
        self.kilometrosRecorridos=0
        self.vehiculosCreados+=1
        
    
class Bicicleta(Vehiculos):
    
    km_bici_total=0
    
    
    
    def anda_bicicleta(self):
        self.kilometrosRecorridos = int(input("¿Cuantos kilometros vas a recorrer?"))
        self.km_bici_total += self.kilometrosRecorridos
        Vehiculos.kilometrosTotales += self.km_bici_total
        
    def caballito(self):
        print("Mira como hago el caballito")
        
    def km_bicicleta(self):
        print(str(self.km_bici_total))
        
     
class Coche(Vehiculos):
    
    km_coche_total = 0  
    
    
    
    def anda_coche(self):
        self.kilometrosRecorridos = int(input("¿Cuantos kilometros vas a recorrer?"))    
        self.km_coche_total += self.kilometrosRecorridos
        Vehiculos.kilometrosTotales += self.km_coche_total  
    def quema_rueda(self):
        print("Estoy quemando rueda")
        
    def km_coche(self):
        print(str(self.km_coche_total))
        
    
if __name__ == "__main__":
    
    bici = Bicicleta()
    coche = Coche()
    
    
    
    while True:
        
        
        
        
        opcion = int(input("VEH�CULOS"
                    "\n========="
                "\n1. Anda con la bicicleta"
                "\n2. Haz el caballito con la bicicleta"
                "\n3. Anda con el coche"
                "\n4. Quema rueda con el coche"
                "\n5. Ver kilometraje de la bicicleta"
                "\n6. Ver kilometraje del coche"
                "\n7. Ver kilometraje total"
                "\n8. Salir"
                "\nElige una opci�n (1-8):"))
        
        if (opcion==1):
            bici.anda_bicicleta()
        elif(opcion==2):
            bici.caballito()
        elif(opcion==3):
            coche.anda_coche()
        elif(opcion==4):
            coche.quema_rueda()
        elif(opcion==5):
            print(str(bici.km_bici_total))
        elif(opcion==6):
            print(str(coche.km_coche_total))
        elif(opcion==7):
            print(str(Vehiculos.kilometrosTotales))
        
        if (opcion==8):
            print("Fin del programa")
            break     
        
    
    
    
    
        