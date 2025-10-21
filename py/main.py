from sortSelection import SortSelection

def main ():
    numeros =[5, 2, 9, 1, 5, 6]
    print("Estudiante: Bryan Barros")
    print("Original: ", numeros)

    ## Instanciar la clase
    selection = SortSelection()
    selection.sort_ascendente(numeros)
    print("Ordenado Ascendente: " , numeros)
    selection.sort_Descendente(numeros)
    print("Ordenado Descendente: ", numeros)

if __name__ == "__main__":
    main()