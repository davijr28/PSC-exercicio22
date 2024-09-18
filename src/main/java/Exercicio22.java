
public class Exercicio22 {

    public static void main(String[] args) {
        double media;
        double soma = 0.0;
        int i = 1;
        while (i <= 1000) {
            soma += i;
            i++;
        }
        media = soma / 1000;
        System.out.println("média: " + media);
    }
}
