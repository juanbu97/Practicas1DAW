"""
Mini-diccionario espannol ingles
"""
import random

diccionario={'casa':'hose', 'coche':'car', 'verde':'green','rojo':'red','azul':'blue',
             'pagina':'page','noche':'night','caballero':'knigth','negro':'dark','manzana':'apple'}

listaDiccionario = []
palabrasAleatorias = []

contadorFallos = 0
contadorAciertos = 0
indice = 0

for x in diccionario:
    listaDiccionario.append(x)

random.shuffle(listaDiccionario)

for x in range(5):
    palabrasAleatorias.append(listaDiccionario.pop(0))

for x in palabrasAleatorias:
    respuesta = input("Introduca la traduccion de esta palabra "+ x +"\n")

    if(respuesta == diccionario.get(x)):
        contadorAciertos = contadorAciertos+1
    else:
        contadorFallos = contadorFallos +1
    indice = indice +1

print("Has acertado " + str(contadorAciertos)+ " palabras y has fallado "+str(contadorFallos)+" palabras")
