# 💱 Conversor de Monedas en Java

Un **conversor de monedas** de consola desarrollado en **Java 17** que utiliza la API [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener **tasas de cambio en tiempo real**.  
Ideal para practicar conceptos de Java, consumo de APIs y manipulación de JSON con Gson.

---

## ✨ Características

✅ Conversión en **tiempo real** usando la API pública de ExchangeRate-API.  
✅ Interfaz de texto simple y amigable.  
✅ Conversión rápida entre:

| De ⇄ A | Descripción |
|--------|-------------|
| 🇺🇸 USD ⇄ 🇦🇷 ARS | Dólar ↔ Peso Argentino |
| 🇺🇸 USD ⇄ 🇧🇷 BRL | Dólar ↔ Real Brasileño |
| 🇺🇸 USD ⇄ 🇨🇴 COP | Dólar ↔ Peso Colombiano |

✅ Validación de entradas para evitar errores.  
✅ Código **modular**, fácil de mantener y extender.

---

## 🛠 Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener:

- ☕ **Java 17** o superior  
- 📦 **Maven** o un IDE como IntelliJ IDEA / Eclipse  
- 🌐 Conexión a internet (para consultar la API)  
- 🔑 Una **API Key gratuita** de [ExchangeRate-API](https://www.exchangerate-api.com/)

---

## 🚀 Instalación y uso

1. **Clonar el repositorio**:
# 💱 Conversor de Monedas en Java

Un **conversor de monedas** de consola desarrollado en **Java 17** que utiliza la API [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener **tasas de cambio en tiempo real**.  
Ideal para practicar conceptos de Java, consumo de APIs y manipulación de JSON con Gson.

---

## ✨ Características

✅ Conversión en **tiempo real** usando la API pública de ExchangeRate-API.  
✅ Interfaz de texto simple y amigable.  
✅ Conversión rápida entre:

| De ⇄ A | Descripción |
|--------|-------------|
| 🇺🇸 USD ⇄ 🇦🇷 ARS | Dólar ↔ Peso Argentino |
| 🇺🇸 USD ⇄ 🇧🇷 BRL | Dólar ↔ Real Brasileño |
| 🇺🇸 USD ⇄ 🇨🇴 COP | Dólar ↔ Peso Colombiano |

✅ Validación de entradas para evitar errores.  
✅ Código **modular**, fácil de mantener y extender.

---

## 🛠 Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener:

- ☕ **Java 17** o superior  
- 📦 **Maven** o un IDE como IntelliJ IDEA / Eclipse  
- 🌐 Conexión a internet (para consultar la API)  
- 🔑 Una **API Key gratuita** de [ExchangeRate-API](https://www.exchangerate-api.com/)

---

## 🚀 Instalación y uso

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/tuusuario/conversor-monedas-java.git
   cd conversor-monedas-java
   
2.  Configurar tu API Key
En el archivo Conversor.java, reemplaza "TU_API_KEY" por tu clave real de ExchangeRate-API.

3. Compilar y ejecutar:

mvn compile
mvn exec:java -Dexec.mainClass="lad.com.alura.conversormoneda.ConversorApp"

4. Usar el programa:

-Selecciona la opción de conversión.
-Ingresa el monto a convertir.
-Obtén el resultado con la tasa más reciente.

📂 Estructura del proyecto:

src/
 └── main/
     └── java/
         └── lad/
             └── com/
                 └── alura/
                     └── conversormoneda/
                         ├── ConversorApp.java
                         ├── Conversor.java
                         ├── ExchangeRateResponse.java

📸 Ejemplo en ejecución:
Sea bienvenido/a al Conversor de Moneda

1) USD a ARS
2) ARS a USD
3) USD a BRL
4) BRL a USD
5) USD a COP
6) COP a USD
7) Salir

Elija una opción válida (1-7):
Introduce la cantidad a convertir (USD): 100
Resultado: 100 USD = 51250.00 ARS

📄 Licencia
Este proyecto está creado con mucho esfuerzo y dedicación por Flor del Carmen Villegas Beltrán💖💻✨


   git clone https://github.com/tuusuario/conversor-monedas-java.git
   cd conversor-monedas-java
