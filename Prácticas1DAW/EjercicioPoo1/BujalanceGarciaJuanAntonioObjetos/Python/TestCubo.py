# coding=utf8

from Relacion1ObjetosPython import Cubo

#main:

cubito = Cubo.Cubo(2)
cubote = Cubo.Cubo(7)
print("Cubito: \n")
cubito.pinta()
print("\nCubote: \n")
cubote.pinta()
print("\nLleno el cubito: \n")
cubito.llena()
cubito.pinta()
print("\nEl cubote sigue vac�o: \n")
cubote.pinta()
print("\nAhora vuelco lo que tiene el cubito en el cubote.\n")
cubito.vuelcaEn(cubote)
print("Cubito: \n")
cubito.pinta()
print("\nCubote: \n")
cubote.pinta()
print("\nAhora vuelco lo que tiene el cubote en el cubito.\n")
cubote.vuelcaEn(cubito)
print("Cubito: \n")
cubito.pinta()
print("\nCubote: \n")
cubote.pinta()
