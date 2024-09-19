# Conversor de Moneda

Este es un programa de conversión de monedas que permite convertir entre dólares estadounidenses (USD), pesos colombianos (COP) y euros (EUR). El programa interactúa con el usuario a través de la consola, ofreciendo diferentes opciones para realizar conversiones utilizando las tasas de cambio actuales obtenidas de una API externa.

## Requisitos

- Java 17 o superior
- Conexión a internet (para obtener las tasas de cambio)
- Librería [Gson](https://github.com/google/gson) para manipulación de JSON

## Cómo usar el programa

1. **Ejecuta el programa.**
2. Se mostrará un menú con las siguientes opciones:
   - Dólar → Peso colombiano
   - Dólar → Euro
   - Peso colombiano → Dólar
   - Peso colombiano → Euro
   - Euro → Dólar
   - Euro → Peso colombiano
   - Salir
3. Elige una opción ingresando el número correspondiente.
4. Ingresa la cantidad de la moneda a convertir.
5. El programa calculará y mostrará la cantidad equivalente en la otra moneda.
6. Elige "Salir" (opción 7) para terminar el programa.

## Funcionamiento del programa

- El programa utiliza la clase `ConsultaTasas` para obtener las tasas de cambio actuales desde la API de [ExchangeRate-API](https://www.exchangerate-api.com/).
- La tasa de cambio para USD, COP y EUR se almacena en la clase `Tasa`.
- El usuario puede ingresar una cantidad en una moneda, y el programa calcula la cantidad equivalente en otra moneda utilizando las tasas de cambio.

## Componentes principales

### 1. `Principal.java`
Este es el archivo principal del programa, donde se presenta el menú y se ejecutan las conversiones de acuerdo con la opción seleccionada por el usuario.

### 2. `ConsultaTasas.java`
Esta clase se encarga de hacer una petición HTTP a la API para obtener las tasas de cambio de las monedas. Utiliza la clase `HttpClient` y la librería `Gson` para parsear la respuesta JSON.

### 3. `Tasa.java`
Esta clase almacena las tasas de cambio para USD, COP y EUR, y tiene un método `toString` para mostrar las tasas actuales de manera legible.

### 4. `RespuestaAPI.java`
Es un registro (`record`) que modela la respuesta de la API. Incluye un campo para las tasas de conversión en formato `Map<String, Double>`.

## Ejemplo de uso

Si eliges convertir 100 dólares a pesos colombianos:
1) Dólar → Peso colombiano

Ingrese la cantidad de dólares a convertir a pesos colombianos: 100


100 dólares equivalen a 400,000 pesos colombianos

## Nota
Este programa utiliza la API de ExchangeRate-API, por lo que es necesario tener una clave API válida para obtener las tasas de cambio actualizadas.