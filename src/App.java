public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros ={10, 0, -5, 5, 15, 2};
        System.out.println("Estudiante: Bryan Barros");
        SortBubble claseSortBubble = new SortBubble();
        SortSelection claseSelection = new SortSelection();
        
       // System.out.println("Arreglo Original: ");
        // claseSortBubble.printArray(numeros); 
       // System.out.println(" Ordenado Ascendente: ");
        //claseSortBubble.sortBubbleAscedente(numeros); 
        //claseSortBubble.printArray(numeros);
        //System.out.println("Ordenado Descencente: ");
        //claseSortBubble.sortBubbleDescendente(numeros);
        //claseSortBubble.printArray(numeros);

        System.out.println("-- Metodo Selection -- ");

        System.out.println("Arreglo Original: ");
        claseSortBubble.printArray(numeros); 
        claseSelection.sortAscendente(numeros);

        System.out.println("Arreglo Ordenado Ascendente:");
        claseSelection.printArray(numeros);
        claseSelection.sortDescendente(numeros);
        
        System.out.println("Arreglo Ordenado Descendente: ");
        claseSelection.printArray(numeros);

    }
}   
