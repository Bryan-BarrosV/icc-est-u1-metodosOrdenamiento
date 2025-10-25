public class SortInserccion {
    /*
     * Ordenamiento Enteros Ascendete y Descendente
     */
    public void sortInserccion(int[] numeros, boolean pasos){
        for(int i = 1; i < numeros.length; i++){
            int j = i - 1;
            int aux = numeros[i];
            if (pasos){
                System.out.println("i: " + i + ", j: " + j +", aux: " + aux);
            }
            while (j >= 0 && numeros[j] > aux) {
                if(pasos)
                    System.out.println("Compara aux: " + aux + " con numeros[" + j + "]: " + numeros[j]);
                numeros[j + 1] = numeros[j];
                j--;
                if(pasos)
                    printArray(numeros);
            }
            numeros[j + 1] = aux;
            if(pasos){
                System.out.println("Insertar aux: " + aux + " en la posicion " + (j + 1));
                System.out.println("Estado actual:");
                printArray(numeros);
            }
        }
    }

    public void sortInserccionDescendente(int[] numeros, boolean pasos){
        for(int i = 1; i < numeros.length; i++){
            int j = i - 1;
            int aux = numeros[i];
            if (pasos){
                System.out.println("i: " + i + ", j: " + j +", aux: " + aux);
            }
            while (j >= 0 && numeros[j] < aux) {
                if(pasos)
                    System.out.println("Compara aux: " + aux + " con numeros[" + j + "]: " + numeros[j]);
                numeros[j + 1] = numeros[j];
                j--;
                if(pasos)
                    printArray(numeros);
            }
            numeros[j + 1] = aux;
            if(pasos){
                System.out.println("Insertar aux: " + aux + " en la posicion " + (j + 1));
                System.out.println("Estado actual:");
                printArray(numeros);
            }
        }
    }

    /*
     * Arreglo de cadenas (nombres)
     */
    public void sortByNameCadenas(String[] nombres){
        for(int i = 1; i < nombres.length; i++){
            int j = i -1;
            String aux = nombres[i];
            while(j >= 0 && nombres[j].compareTo(aux) > 0){
                nombres[j + 1] = nombres[j];
                j--;
            }
            nombres[j + 1] = aux;
        }
    }

    /*
     * Arreglo de personas ordenado por nombre
     */
    public void sortByName(Persona[] personas){
        for (int i = 1; i < personas.length; i++) {
            int j = i - 1;
            Persona aux = personas[i];
            while(j >= 0 && aux.getNombre().compareTo(personas[j].getNombre()) < 0){
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }

    /*
     * Arreglo de personas ordenado por edad
     */
    public void sortPersonaByAge(Persona[] personas){
        for (int i = 1; i < personas.length; i++) {
            int j = i -1;
            Persona aux = personas[i];
            while(j >= 0 && aux.getEdad() < personas[j].getEdad()){
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }

    
    public void printArrayPersonas(Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getNombre() + ", Edad: " + personas[i].getEdad());
        }
    }

    public void printArrayNombres(String[] nombres) {
        System.out.print("[");
        for (int i = 0; i < nombres.length; i++) {
            if (i == nombres.length - 1) {
                System.out.print(nombres[i]);
            } else {
                System.out.print(nombres[i] + ", ");
            }
        }
        System.out.println("]");
    }

    public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
