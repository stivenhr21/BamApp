#language: es
  #Autor: Stiven Hernandez

Característica: sucursal virtual personas App
  Yo como usuario de la sucursal virtual personas
  Quiero ingresar al app e iniciar sesion
  para gestionar mis productos

  @InicioSesionExitoso
  Esquema del escenario: inicio de sesion exitoso
    Dado que el usuario se encuentra en pantalla de inicio de sesion
    Cuando el usuario inicia sesion con sus datos
      | usuario   | clave   |
      | <usuario> | <clave> |
    Entonces el usuario visualizara la pagina de inicio
    Ejemplos:
      | usuario     | clave      |
      | clienteqa15 | Test*2021! |