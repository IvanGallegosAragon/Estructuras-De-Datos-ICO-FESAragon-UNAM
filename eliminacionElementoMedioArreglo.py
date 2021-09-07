def eliminacionElementoMedioArreglo(list):
    if list.__len__() % 2 == 0:
        #Como es el elemento previo al punto virtual medio utlizamos n/2 para obtenerlo
        #pero al ser un arreglo al que le eleiminamos por indices le tenemos que agregar el- 1  
        indice = int(((list.__len__()) / 2) - 1) #Se convierte primero en entero ya que __len__() regresa float
        list.pop( indice ) 
        
    else:
        indice = int(((list.__len__() + 1) / 2) - 1) #Se convierte primero en entero ya que __len__() regresa float
        list.pop(indice )
        #Al ser impar el elemento medio lo obtenemos con n + 1 / 2 
        #al ser arreglo por indices para localizarlo le agregamos el - 1
        
    return list    

#main
listas =[ [1,2,3,4,5,6,7] ,["Enero", "Febrero", "Marzo","Abril","Mayo","Junio"] ]#Arreglo impar y par en un solo arreglo
for i in listas:
    print(eliminacionElementoMedioArreglo(i)) 