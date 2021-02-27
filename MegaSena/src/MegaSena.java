import java.util.Random;

public class MegaSena {
    public static void main(String[] args) {
        Random generate = new Random(); // instancia um objeto do tipo Random e guarda na variavel generate

        System.out.println("===========LACO DE REPETICAO COM FOR===========");

        for (int i=0; i<6; i++) { //laço for que vai de 0 a 5 (6 repetições)

            int number = generate.nextInt(60); //executa o metodo nextInt e guarda na variavel number
            System.out.println("Numero: " +number);
        }

        System.out.println("===========LACO DE REPETICAO COM WHILE===========");

        int i = 0;
        while (i < 6){ //enquanto o i menor que 6
            int number = generate.nextInt(60); //executa o metodo nextInt e guarda na variavel number
            System.out.println("Numero: " +number); //mostra o numero
            i++; //adiciona 1 na variavel i (contador) -> necessário para sair do loop
        }
    }
}
