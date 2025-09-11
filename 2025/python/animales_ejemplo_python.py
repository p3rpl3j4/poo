
#Animal
from abc import ABC, abstractmethod

class Animal(ABC):
  def __init__(self, nombre, edad, codigo):
    self.nombre = nombre
    self.edad = edad
    self.codigo = codigo

  def dormir(self):
    print("El animal " + self.nombre + " esta durmiendo.")

  def comer(self):
    print("El animal " + self.nombre + " esta comiendo.")

  @abstractmethod
  def emitir_sonido(self):
    pass

class Perro(Animal):
  def __init__(self, nombre, dead, codigo, raza):
    super().__init__(nombre, dead, codigo)
    self.raza = raza

  def emitir_sonido(self):
    print("El perro " + self.nombre + " esta ladrando.")

#Gato
class Gato(Animal):
  def __init__(self, nombre, edad, codigo, cascabel):
    super().__init__(nombre, edad, codigo)
    self.cascabel = cascabel

  def emitir_sonido(self):
    print("El gato " + self.nombre + " esta maullando.")

def main():
  animales = []

  can1 = Perro("Pepo", 2, 10, "Salchicha")

  g1 = Gato("Pereza", 8, 11, True)

  animales.append(can1)
  animales.append(g1)

  for animal in animales:
      print ("Nombre del animal: " + animal.nombre)
      print ("Edad del animal: " + str(animal.edad))
      print ("Codigo del animal: " + str(animal.codigo))

if __name__ == "__main__":
  main()