public class Main {
    
    public static void main(String[] args) {
        // Ejemplo 1: Matrix cuadrada todas las filas tienen el mismo tamaño)
        int[][] array1 = {
            {1, 2, 3},    // suma = 6
            {4, 5, 6},    // suma = 15
            {7, 8, 9}     // suma = 24
        };
        
        int resultado1 = twoDimensionalArrayOperation(array1);
        System.out.println("Ejemplo 1 (matriz cuadrada)):");
        System.out.println("Array: {{1,2,3}, {4,5,6}, {7,8,9}}");
        System.out.println("Producto de las sumas de filas: " + resultado1);
        System.out.println("Cálculo: 6 * 15 * 24 = " + resultado1);
        System.out.println();
        
        // Ejemplo 2: Matriz no cuadrada (filas con diferentes tamaños)
        int[][] array2 = {
            {10, 20},           // suma = 30
            {5, 15, 25},        // suma = 45
            {100}               // suma = 100
        };
        
        int resultado2 = twoDimensionalArrayOperation(array2);
        System.out.println("Ejemplo 2 (matriz no cuadrada):");
        System.out.println("Array: {{10,20}, {5,15,25}, {100}}");
        System.out.println("Producto de las sumas de filas: " + resultado2);
        System.out.println("Cálculo: 30 * 45 * 100 = " + resultado2);
        System.out.println();
        
        // Ejemplo 3: Matriz con una sola fila
        int[][] array3 = {
            {2, 4, 6, 8}        // suma = 20
        };
        
        int resultado3 = twoDimensionalArrayOperation(array3);
        System.out.println("Ejemplo 3 (una sola fila):");
        System.out.println("Array: {{2,4,6,8}}");
        System.out.println("Producto: " + resultado3);
        System.out.println();
    }
    
    public static int twoDimensionalArrayOperation(int[][] array) {
        // CONCEPTO CLAVE: Inicializamos el producto en 1 (elemento neutro de la multiplicación)
        int product = 1;
        
        // Recorremos cada fila del array bidimensional
        // array.length nos da el número de filas
        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            
            // IMPORTANTE: array[i].length nos da el número de columnas de la fila i
            // Esto es crucial porque las filas pueden tener diferentes longitudes
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
            }
            
            // Multiplicamos el producto acumulado por la suma de esta fila
            product *= rowSum;
        }
        
        return product;
    }
}
