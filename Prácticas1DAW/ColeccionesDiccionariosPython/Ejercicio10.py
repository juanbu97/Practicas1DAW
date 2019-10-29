"""
Mini-diccionario espannol ingles
"""

diccionario={'casa':'hose', 'coche':'car', 'verde':'green','rojo':'red','azul':'blue',
             'pagina':'page','noche':'night','caballero':'knigth','negro':'dark','manzana':'apple'}

respuesta = (input("Introduzca la palabra que desea traducir "))

if(respuesta in diccionario):
    print(diccionario.get(respuesta))
else:
    print("La palabra no se encuentra en el diccionario")
