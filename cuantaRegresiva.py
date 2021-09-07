def cuentaRegresiva(n): #Es basicamente una modificacion del código visto en clase 
    if n >= 1:
        print(n) 
        cuentaRegresiva(n-1)
    else: 
        print("BOOMMMMM !!!")
n = 3
cuentaRegresiva(n)