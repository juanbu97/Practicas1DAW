# coding=utf8

from _ast import Num
class Fraccion:
    def __init__(self,num,den):
        self.__numerador = num 
        self.__denominador = den
    def setNumerador(self,numerador):
        self.__numerador = numerador
        
    def setDenominador(self,denominador):
        if (self.__denominador != 0):
            self.__denominador = denominador
        else:
            print("El denominador no puede ser 0")
            self.__denominador = 1
    def getNumerador(self):
        return self.__numerador
    def getDenominador(self):
        return self.__denominador
    
    def mostrarFraccion(self):
        cadena = "\t "+str(self.getNumerador())+"\n  ---------------- \n\t "+str(self.getDenominador())+"\n\n"
        return cadena
    def modificarFraccion(self,nuevoNum,nuevoDen):
        self.setNumerador(nuevoNum)
        self.setDenominador(nuevoDen)
    def obtenerResultado(self):
        return self.__numerador/self.__denominador
    def multiplicaFraccion(self,num):
        self.setNumerador(self.getNumerador()*num)
    def multiplicaFracciones(self,segundaFraccion):
        resultado = Fraccion(self.getNumerador()*segundaFraccion.getNumerador(),self.getDenominador()*segundaFraccion.getDenominador())
        return resultado
    def sumaFracciones(self,segundaFraccion):
        numerador1 = self.getNumerador() * segundaFraccion.getDenominador()
        numerador2 = self.getDenominador() * segundaFraccion.getNumerador()
        denominadorComun = self.getDenominador() * segundaFraccion.getDenominador()
        resultado = Fraccion(numerador1+numerador2,denominadorComun)
        return resultado
    def restaFracciones(self,segundaFraccion):
        numerador1 = self.getNumerador() * segundaFraccion.getDenominador()
        numerador2 = self.getDenominador() * segundaFraccion.getNumerador()
        denominadorComun = self.getDenominador() * segundaFraccion.getDenominador()
        resultado = Fraccion(numerador1-numerador2,denominadorComun)
        return resultado
    def simplificaFraccion(self):
        contador = 0
        nuevoNumerador = self.getNumerador()
        nuevoDenominador = self.getDenominador()
        if (self.getNumerador() >= self.getDenominador()):
            contador = self.getNumerador()
        else:
            contador = self.getDenominador()
        for i in range(contador,0,-1):
            if(nuevoNumerador%i == 0 and nuevoDenominador%i == 0):
                nuevoNumerador = int(nuevoNumerador/i);
                nuevoDenominador = int(nuevoDenominador/i);
        self.setNumerador(nuevoNumerador);
        self.setDenominador(nuevoDenominador);
