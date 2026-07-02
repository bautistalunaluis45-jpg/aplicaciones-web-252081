function temporizador(callback) {
    console.log("Iniciando temporizador...");

    setTimeout(() => {
        console.log("3 segundos han pasado");
        callback();
    }, 3000);
}

temporizador(() => {
    console.log("Callback ejecutado con éxito");
});


function operar(num1, num2, callback) {
    const resultado = callback(num1, num2);
    console.log("Resultado de la operación:", resultado);
}

// Callbacks para cada operación
function sumar(a, b) {
    return a + b;
}

function restar(a, b) {
    return a - b;
}

function multiplicar(a, b) {
    return a * b;
}

function dividir(a, b) {
    if (b === 0) {
        return "Error: división entre 0";
    }
    return a / b;
}

// Uso
operar(10, 5, sumar);
operar(10, 5, restar);
operar(10, 5, multiplicar);
operar(10, 5, dividir);


function cortarIngredientes(callback) {
    console.log("Cortando ingredientes...");

    setTimeout(() => {
        console.log("Ingredientes listos");
        callback();
    }, 2000);
}

function cocinar(callback) {
    console.log("Cocinando...");

    setTimeout(() => {
        console.log("Comida cocinada");
        callback();
    }, 3000);
}

function servirPlato(callback) {
    console.log("Sirviendo plato...");

    setTimeout(() => {
        console.log("Plato servido");
        callback();
    }, 1000);
}

// Ejecución en cadena
cortarIngredientes(() => {
    cocinar(() => {
        servirPlato(() => {
            console.log("Receta completada con éxito");
        });
    });
});