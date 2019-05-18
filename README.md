# Congruencial Mixto
El metodo congruencial mixto: es el más utilizado en simulación en computadoras digitales y 
esta basado en una relación de recurrencia que ademas utiliza el operador MOD.
El objetivo es generar un valor aleatorio a partir de otro anterior.
Donde:

Xo : Semilla del generador (Xo > 0)

a: Constante multiplicativa (a>0)

c: Constante aditiva (c>0)

m: modulo (m>a; m>Xo ; m>c)

Xn : es el valor base anterior

Xn+1 : es el nuevo valor uniforme entero



En el programa podemos ingresar las constantes "a", "c", así como el modulo y la semilla "Xo".
![2](https://user-images.githubusercontent.com/33529522/57973693-8b313000-7972-11e9-8a67-fcb7b18e92ec.PNG)

Donde, mediante la formula: Xn+1 = (aXn + c) mod m:
![formulaCongMx](https://user-images.githubusercontent.com/33529522/57973678-5d4beb80-7972-11e9-8c27-3a6b8902df2a.PNG)

La suma (a*Xo+c) será dividida por “m” y “Xn+1” será el residuo de la división. 
Esto generará un periodo deseado en base a los valores ingreados.

![Result_CongMx](https://user-images.githubusercontent.com/33529522/57973668-2aa1f300-7972-11e9-983b-46520cf54d45.PNG)

