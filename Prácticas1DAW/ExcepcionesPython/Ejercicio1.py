"""
Realiza un programa que pida 6 numeros por teclado y nos diga cual es el maximo.
Si el usuario introduce un dato erroneo(algo que no sea un numero entero)
el programa debe indicarlo y debe pedir de nuevo el numero.
"""

print("Este programa pide 6 numeros(enteros) por teclado y muestra el mayor de ellos")

listaNumeros = []

for i in range(6):
    while True:
        try:
            listaNumeros.append(int(input("Introduzca el numero "+ str(i+1)+"\n")))
            break  # Si no da error, salgo el while con break
        except:
            print("Eso no es un numero, prueba otra vez...")

print("El numero maximo es el " + str(max(listaNumeros)))