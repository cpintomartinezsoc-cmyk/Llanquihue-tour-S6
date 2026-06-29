<img width="488" height="157" alt="image" src="https://github.com/user-attachments/assets/f80ca68b-059b-4ed7-8500-7e1562cc24f6" />

🧠 Actividad Formativa Semana 6 – Creando Jerarquías de Clases con Herencia Simple
👤 

Nombre completo: Camilo Pinto

Carrera: Analista Programador

Asignatura: Desarrollo Orientado a Objetos I

Caso: Llanquihue Tour



📘 Descripción general del sistema


Este proyecto corresponde a la actividad formativa de la Semana 6 de la asignatura Desarrollo Orientado a Objetos I.

El objetivo del sistema es representar los distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour mediante una jerarquía de clases, aplicando los principios fundamentales de la Programación Orientada a Objetos, especialmente la herencia simple, la reutilización de atributos y métodos, y la sobrescritura del método toString().

La aplicación permite crear diferentes tipos de servicios turísticos a partir de una clase base común, facilitando la futura ampliación del sistema con nuevos servicios.


🧱 Estructura del proyecto


src/

│

├── model/

│   ├── ServicioTuristico.java

│   ├── RutaGastronomica.java

│   ├── PaseoLacustre.java

│   └── ExcursionCultural.java

│

├── data/

│   └── GestorServicios.java

│

└── ui/

    └── Main.java



📂 Descripción de las clases

ServicioTuristico


Clase base que representa un servicio turístico.

Atributos:

nombre

duracionHoras





Subclase de ServicioTuristico.

Atributo adicional:

numeroDeParadas

Sobrescribe el método toString() para mostrar la información heredada y el atributo propio.





PaseoLacustre

Subclase de ServicioTuristico.

Atributo adicional:

tipoEmbarcacion

Utiliza super() para inicializar los atributos heredados y sobrescribe el método toString().





ExcursionCultural

Subclase de ServicioTuristico.

Atributo adicional:

lugarHistorico

Extiende la funcionalidad de la clase base reutilizando sus atributos mediante herencia.





GestorServicios

Clase encargada de crear instancias de prueba de cada tipo de servicio turístico.





Main

Clase principal del sistema.

Su función consiste en crear un objeto de GestorServicios y ejecutar el método encargado de crear y mostrar todos los servicios turísticos.






▶️ Instrucciones para ejecutar el proyecto


1.Clonar el repositorio desde GitHub.

2.git clone https://github.com/cpintomartinezsoc-cmyk/Llanquihue-tour-S6.git

3.Abrir el proyecto en IntelliJ IDEA.

4.Verificar que todas las clases se encuentren organizadas en los paquetes correspondientes.

5.Ejecutar la clase:

6.ui/Main.java

7.Observar en la consola la información correspondiente a todos los servicios turísticos creados.





🧪 Prueba realizada

Repositorio GitHub: https://github.com/cpintomartinezsoc-cmyk/Llanquihue-tour-S6.git

Fecha de entrega: [29/06/2026]
