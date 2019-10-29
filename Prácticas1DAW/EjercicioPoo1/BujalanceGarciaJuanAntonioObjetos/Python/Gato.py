'''
Created on 11 ene. 2019

@author: d18bugaj
'''

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
            
    
    def pelea_con(self,contrincante):
        if self.sexo == "hembra":
            print("No me gusta pelear")
        else:      
            if contrincante.sexo == "hembra":
                print("No peleo con gatitas")
            else:
                print("Ven aqui que te vas a enterar")
                
#Prueba de la clase
if __name__ == "__main__":
    floro = Gato("macho")
    floro.maulla()
    floro.come("pienso")
    floro.come("pescado")
                
                
    florinda = Gato("hembra")
    florinda.pelea_con(floro)
    
    pulgoso = Gato("macho")
    pulgoso.pelea_con(floro)
    
    pulgoso.pelea_con(florinda)

        
        