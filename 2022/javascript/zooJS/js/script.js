class Animal{
    constructor(nombre, edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    getInfo(){
        console.log (`Soy un animal me llamo ${this.nombre} y tengo ${this.edad} años`);
    }
}

const unAnimal = new Animal ("Malón", 5);
unAnimal.getInfo();


class Gato extends Animal{
    #peso;
    constructor(nombre, edad, peso){
        super(nombre, edad);
        this.peso = peso;
    }

    getPeso(){
        return this.#peso;
    }
    maullar(){

        console.log("Miau");
    }
}

const unGato = new Gato("Pereza", 2, 4);

unGato.maullar();