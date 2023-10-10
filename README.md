# 1- Ejercicio de Encapsulamiento, herencia y polimorfismo

Ejemplo de aplicación de encapsulamiento, herencia y polimorfismo. 

- La clase Punto es la clase base que representa un punto en un plano bidimensional. 
- La clase PuntoTiempo es una subclase de Punto que agrega un campo adicional tiempo para representar el tiempo asociado a un punto. 
- Y finalmente, la clase Punto3D es una subclase de PuntoTiempo que representa un punto en un espacio tridimensional, agregando un campo z adicional.

Se aplica el polimorfismo en los métodos constructores y el método módulo.

## Diagrama de clases

<!--
https://gist.github.com/noamtamim/f11982b28602bd7e604c233fbe9d910f
Usar para generar con plantuml:
plantuml -tsvg README.md
-->

<!--
```
@startuml diagrama-clases
class Punto {
  - x: int
  - y: int
  + Punto(x: int, y: int)
  + getX(): int
  + getY(): int
  + setX(x: int): void
  + setY(y: int): void
  + modulo(): double
}

class PuntoTiempo {
  - tiempo: int
  + PuntoTiempo(x: int, y: int, tiempo: int)
  + getTiempo(): int
  + setTiempo(t: int): void
}

class Punto3D {
  - z: int
  + Punto3D(x: int, y: int, z: int, tiempo: int)
  + modulo(): double
}

Punto <|-- PuntoTiempo
PuntoTiempo <|-- Punto3D
@enduml
```
-->

![](diagrama-clases.svg)

## About :octocat:

:alien: **Author:** exercise were made by Norbey Danilo Muñoz Cañón and Universidad Distrital students.

:blue_book: **Thanks!**

> :bird: "Hazlo todo tan simple como sea posible, pero no más simple"
