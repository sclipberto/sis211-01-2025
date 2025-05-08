a=int(input('Introduzca un numero:'))
b=int(input('Introduzca un numero:'))
c=a+b
print('suma=',c)
# if c%2==0:
#     print('Par')
# else:
#     print('Impar')
print('Par' if c%2==0 else 'Impar')
#lunes martes miercoles jueves viernes sabado domingo
#0     1        2       3       4       5       6
#7      8       9       10      11      12      13
#14
modulo=c%7
if modulo==0:
    print('lunes')
elif modulo==1:
    print('martes')
elif modulo==2:
    print('miercoles')
elif modulo==3:
    print('jueves')
elif modulo==4:
    print('viernes')
elif modulo==5:
    print('sabado')
elif modulo==6:
    print('domingo')
