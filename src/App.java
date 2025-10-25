public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros ={10, 0, -5, 5, 15, 2};

        String[] nombres = {"Pedro", "Ana", "Maria", "Luis", "Juan"};

        Persona [] personas = new Persona[]{
            new Persona((30), "Pedro"),
            new Persona((25), "Ana"),
            new Persona((28), "Maria"),
        };

        System.out.println("Estudiante: Bryan Barros");
        SortBubble claseSortBubble = new SortBubble();
        SortSelection claseSelection = new SortSelection();
        SortInserccion claseInserccion = new SortInserccion();

        /*
         * Metodo Burbuja (20/10/2025)
         */

        // System.out.println("Arreglo Original: ");
        // System.out.println("-- Metodo Burbuja --");
        // claseSortBubble.printArray(numeros); 

        // System.out.println(" Ordenado Ascendente: ");
        // claseSortBubble.sortBubbleAscedente(numeros); 
        // claseSortBubble.printArray(numeros);
        
        // System.out.println("Ordenado Descencente: ");        
        //claseSortBubble.sortBubbleDescendente(numeros);
        // claseSortBubble.printArray(numeros);
        
        /*
         * Metodo Seleccion (21/10/2025)
         */

        // System.out.println("-- Metodo Selection -- ");
        // System.out.println("Arreglo Original: ");
        // claseSortBubble.printArray(numeros); 
        // claseSelection.sortAscendente(numeros);

        // System.out.println("Arreglo Ordenado Ascendente:");
        // claseSelection.printArray(numeros);
        // claseSelection.sortDescendente(numeros);

        // System.out.println("Arreglo Ordenado Descendente: ");
        // claseSelection.printArray(numeros);

        /*
         * Metodo Inserccion(25/10/2025)
         */

        System.out.println("------ Metodo  Inserccion ------");
        /*
         * Numeros Enteros
         */
        System.out.println("Original: ");
        claseInserccion.printArray(numeros);

        System.out.println("Ordenado Ascendente:");
        claseInserccion.sortInserccion(numeros, false);
        claseInserccion.printArray(numeros);

        System.out.println("Ordenado Descendente:");
        claseInserccion.sortInserccionDescendente(numeros, false);
        claseInserccion.printArray(numeros);

        /*
         * Nombres
         */
        System.out.println("Array de Nombres Original:");
        claseInserccion.printArrayNombres(nombres);
        claseInserccion.sortByNameCadenas(nombres);

        System.out.println("Ordenado por Nombre:");
        claseInserccion.printArrayNombres(nombres);

        /*
         * Personas Nombres - Edad
         */

        System.out.println("Array de Personas Original:");
        claseInserccion.printArrayPersonas(personas);

        System.out.println("\nOrdenado por Nombre de Personas:");
        claseInserccion.sortByName(personas);
        claseInserccion.printArrayPersonas(personas);

        System.out.println("\nOrdenado por Edad de Personas:");
        claseInserccion.sortPersonaByAge(personas);
        claseInserccion.printArrayPersonas(personas);
}
}
