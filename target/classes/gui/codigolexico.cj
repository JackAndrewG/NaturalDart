"""
FLOTANTE sumar(in = 5) {
    FLOTANTE a = 3.6;
    ENTERO   b = 5 + 1;
    FLOTANTE c = a * b;
    
    SI(a >= b) {
        SALIDA(a);
    } SINO {
        SALIDA("Contrario");
        b = b - 1;
    }
    
    SI(b == 6) {
        SALIDA("Iguales");
        a = a / 2;
    }
    
    MIENTRAS (ellanoteama == VERDADERO) {
        lagrimas = lagrimas + 1;
    }
                        
    DEVOLVER c;
}
"""