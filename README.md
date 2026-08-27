# Actividad-4---Estructura-Datos
# Red de Sensores IoT — Java + POO

Proyecto de la actividad integradora del curso de Programación Orientada a Objetos. Simula una pequeña red de sensores IoT para monitorear condiciones ambientales (temperatura, humedad, calidad del aire y luminosidad) en distintas zonas de una instalación.

## Qué hace el proyecto

- Modela distintos tipos de sensores a partir de una clase base común (`Sensor`).
- Cada sensor puede activarse, desactivarse, tomar una lectura y registrarla.
- Los sensores se agrupan por zonas (`Zona`).
- Una `EstacionMonitoreo` puede monitorear cualquier sensor.
- Un `ServicioEnvioDatos` simula el envío de cada lectura.
- Todo se recorre con **un solo ciclo polimórfico**, sin importar cuántos tipos de sensor existan.

## Estructura del proyecto

