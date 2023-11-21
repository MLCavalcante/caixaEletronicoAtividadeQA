public class Main {
    public static void main(String[] args) {
        int valor = 976; // O valor daquele teste para nível junior passado em aula.

        int[] notas = {200, 100, 50, 20, 10, 5, 2};


        if (valor % 2 == 0) { //verifica se o valor é par
            for (int i = 0; i < notas.length; i++) {
                int nota = notas[i];

                // Pula a nota 5
                if (nota == 5) {
                    continue;
                }

                if (valor >= nota) {
                    int quantidade = valor / nota;
                    valor %= nota;
                    System.out.println(nota + " = " + quantidade);
                }
            }
        } else {
            // Se o valor não for par, loop continua normal
            for (int i = 0; i < notas.length; i++) {
                int nota = notas[i];

                if (valor >= nota) {
                    int quantidade = valor / nota;
                    valor %= nota;
                    System.out.println(nota + " = " + quantidade);
                }
            }
        }
    }
}
