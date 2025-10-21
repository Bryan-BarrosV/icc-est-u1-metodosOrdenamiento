public class App {
    public static void main(String[] args) {
        int[] numeros = {10, 0, -5, 5, 15, 2};

        SortBubble claseSortBubble = new SortBubble();

        System.out.println("Array");
        System.out.println("10, 0, -5, 5, 15, 2");

        System.out.println("\nAscendente:");
        claseSortBubble.sortBubbleAscedente(numeros);
        claseSortBubble.printArray(numeros);

        System.out.println("\nDescendente:");
        claseSortBubble.sortBubbleDescendente(numeros);
        claseSortBubble.printArray(numeros);
        
    }
}
