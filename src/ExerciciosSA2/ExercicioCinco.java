package ExerciciosSA2;

import java.util.List;

public class ExercicioCinco {

    //Função que imprime a lista enumerando os itens
    public static <T> void imprimirListaEnumerada(List<T> lista) {
        for (int i = 0; i < lista.size(); i++) {
            //Imprime o índice (i + 1 para começar de 1) e o elemento correspondente
            System.out.println((i + 1) + ". " + lista.get(i));
        }
    }

    public static void main(String[] args) {
        //Lista de animais
        List<String> listaAnimais = List.of("Cachorro", "Gato", "Esquilo", "Leão", "Tigre");

        System.out.println("Elementos da lista enumerados:");
        imprimirListaEnumerada(listaAnimais);
    }
}
