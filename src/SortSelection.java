public class SortSelection {

    public SortSelection(){
    }

    public void sortAscendente (int [] numeros){
        for (int i = 0; i < numeros.length; i++) {   
            int posMenor = i; 
            for(int j = i + 1 ; j < numeros.length; j++){
                if(numeros[posMenor] > numeros[j]){
                    posMenor = j;
                }
            }
            if(posMenor !=i){
                int aux = numeros[posMenor];
                numeros[posMenor] =  numeros[i];
                numeros[i] = aux;
            }   
        }
    }

    public void sortDescendente(int[] numeros){
       for (int i = 0; i < numeros.length; i++) {   
            int posMenor = i; 
            for(int j = i + 1 ; j < numeros.length; j++){
                if(numeros[posMenor] < numeros[j]){
                    posMenor = j;
                }
            }
            if(posMenor !=i){
                int aux = numeros[posMenor];
                numeros[posMenor] =  numeros[i];
                numeros[i] = aux;
            }   
        }
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