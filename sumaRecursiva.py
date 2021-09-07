def sumaRecursiva(list): #Es basicamente n(n+1)/2 con recuersion 
    acumulador = list.pop() #Obtener y eliminar el ultimo valor de la lista
    #Caso base
    if list.__len__() == 0: #Validacion de lista vacia
        return 0 #Regreso nulo
    else:    
        return acumulador + sumaRecursiva(list) #Recuersion y recorrido de lista   

#Main
n = 10 
lista = list(range(n + 1)) 
print(sumaRecursiva(lista))