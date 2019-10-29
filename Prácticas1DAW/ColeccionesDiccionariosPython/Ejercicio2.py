"""
Crea una lista con un tamanno aleatorio entre 10 20 que te calcules la media suma maximo y minimo de los elementos
aleatorios del 0 al 100

"""

from random import randint



lista = []

for x in range(randint(10, 20)):
    lista.append(randint(0, 100))

print(lista)
print ("Suma "+str(sum(lista)))
print ("Maximo "+str(max(lista)))
print ("Minimo "+str(min(lista)))
print ("Media "+str(sum(lista)//len(lista)))

