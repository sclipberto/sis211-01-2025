def suma(a,b):
    c=a+b
    return c 
def division(a,b):
    c=0
    if(b==0):
        raise Exception('error de division por cero')
    c=a/b
    return c

try:
    print('division=',division(5,0))
except Exception as ex:
    print(ex)
print('suma=',suma('ing','sistemas'))