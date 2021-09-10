"""ADT Array
    ADT lineal estatico
"""

class Array():
  def __init__( self , tamano): #Constructor
    self.__tamano = tamano
    self.__data = [0 for x in range(self.__tamano)] #Generator declara una lista de 0 usando un for 

  def getItem(self, index):
    return self.__data[index]
  
  def toString(self):
    print(self.__data)
  
  def setItem(self, dato, index):
    self.__data[index] = dato   #Solo asignar por indice 
  
  def getLength(self):
      return self.__tamano #Ya tenemos un atrivuto que retornar sin usar __len__()
  
  def clear(self, dato):
    self.__data =  [dato for x in self.__data]  #Un nuevo generator que recorre el array


#Ejemplo
ejemplo = Array(5)
ejemplo.toString()
ejemplo.getItem(3)
ejemplo.setItem(4,2)
ejemplo.toString()
print(ejemplo.getLength())
ejemplo.clear(7)
ejemplo.toString()