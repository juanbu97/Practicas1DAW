#-*- coding: utf-8 -*-
'''
Created on 24 feb. 2019

@author: d18bugaj
'''
from herenciaEjercicios.Terminal import Terminal

class Movil(Terminal):
    '''
    Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
    anterior que ya no hace falta modificar). Cada m�vil lleva asociada una tarifa
    que puede ser �rata�, �mono� o �bisonte�. El coste por minuto es de 6, 12 y
    30 c�ntimos respectivamente. Se tarifican los segundos exactos. Obviamente,
    cuando un m�vil llama a otro, se le cobra al que llama, no al que recibe la
    llamada. A continuaci�n se proporciona el contenido del main y el resultado
    que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
    decimales, puedes utilizar DecimalFormat.
    '''
    dinero = 0

    def __init__(self, numero_telefono, tarifa):
        """
            Definimos el parametro tarifa
        """
        self.tarifa = tarifa
        """
            Llamamos al constructor de la clase Terminal
        """
        Terminal.__init__(self, numero_telefono)
    
    def llamar(self, objeto_terminal, tiempo):
        Terminal.llamar(self, objeto_terminal, tiempo)
        
        if(self.tarifa == "rata"):
            self.dinero += tiempo * 0.1
        if(self.tarifa == "mono"):
            self.dinero += tiempo * 0.2
        if(self.tarifa == "bisonte"):
            self.dinero += tiempo * 0.5
    
    def __str__(self):
        cadena = " - tarificados " + str(self.dinero) + " centimos"
        return Terminal.__str__(self) + cadena
    
    


if __name__ == "__main__":
    
    m1 =  Movil("678 11 22 33", "rata");
    m2 =  Movil("644 74 44 69", "mono");
    m3 =  Movil("622 32 89 09", "bisonte");
    print(m1);
    print(m2);
    m1.llamar(m2, 320);
    m1.llamar(m3, 200);
    m2.llamar(m3, 550);
    print(m1);
    print(m2);
    print(m3);       