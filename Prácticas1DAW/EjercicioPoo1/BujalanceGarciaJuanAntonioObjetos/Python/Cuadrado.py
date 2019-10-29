# coding=utf8

class Cuadrado():
    def __init__(self,lado):
        self.__lado = lado
        
    def toString(self):
        resultado = ""
        for i in range (0,self.__lado):
            resultado +="❏❏"
        resultado += "\n"  
        for i in range (1,self.__lado - 1):
            resultado += "❏❏"
            for espacios in range (1,self.__lado - 1):
                resultado += "  "
            resultado += "❏❏\n"
        for i in range (0,self.__lado) :
            resultado += "❏❏"  
        resultado += "\n"
        
        return resultado