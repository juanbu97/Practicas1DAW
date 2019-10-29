#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Clase Gato
"""

from excepciones.ApareamientoImposible import ApareamientoImposible
class Gato(object):
    '''
    classdocs
    '''

    def __init__(self, sexo):
        self.sexo = sexo
        self.color = ""
        self.raza = ""
        self.edad = 0
        self.peso = 0

    def get_sexo(self):
        return self.sexo

    def maulla(self):
        print("Miau")

    def ronrronea(self):
        print("Rrrrrrr")

    def come(self, comida):
        if comida == "pescado":
            print("Que rico")
        else:
            print("Yo solo como pescado")

    def pelea_con(self, contrincante):
        if self.sexo == "hembra":
            print("No me gusta pelear")
        else:
            if contrincante.sexo == "hembra":
                print("No peleo con gatitas")
            else:
                print("Ven aqui que te vas a enterar")

    """
    Pone a pelear dos gatos.
    Solo se van a pelear dos machos entre s�.
    param: contrincante es el gato contra el que pelear
    """
    def peleaCon(self,contrincante):
        if(self.s == "hembra"):
            print("No me gusta pelear")
        else:
            if(contrincante.s =="hembra"):
                print("No peleo contra gatitas")
            else:
                print("Ven aqui que te vas a enterar")
    def apareaCon(self,pareja):
        if(self.s == pareja.s):
            raise ApareamientoImposible()
        else:
            print("Apareamiento realizado con �xito")





