# coding=utf8

class Cubo:
    #constructor
    def __init__(self,cap):
        self.__capacidad = cap
        self.__contenido = 0
    #Setters y Getters
    def setContenido(self,con):
        self.__contenido = con
    def getContenido(self):
        return self.__contenido
    def getCapacidad(self):
        return self.__capacidad
    #Funciones
    """
    Vacia el contenido del cubo
    """
    def vacia(self):
        self.__contenido = 0
    """
    Llena el cubo al m�ximo de su capacidad.
    """
    def llena(self):
        self.__contenido = self.__capacidad
    """
    Pinta el cubo en la pantalla.
    Se muestran los bordes del cubo con el car�cter # y el
    agua que contiene con el car�cter ~.
    """
    def pinta(self):
        for x in range(0,self.__capacidad - self.__contenido):
            print("#      #")
        for x in range(0,self.__contenido):
            print("#------#")
        print("########")
        print()
    """
    Vuelca el contenido de un cubo sobre un cubo destino.
    """
    def vuelcaEn(self,destino):
        libres = destino.getCapacidad() - destino.getContenido()
        
        if(libres > 0):
            if(self.__contenido <= libres):
                destino.setContenido(destino.getContenido() + self.__contenido)
                self.vacia()
            else:
                self.__contenido -= libres
                destino.llena()

