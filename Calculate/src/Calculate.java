public class Calculate {
    public static void main(String[] args) {
       int x = Integer.parseInt(args[1]); // captura o indice 1 direto do cmd e guarda na variavel x
       int y = Integer.parseInt(args[2]); // captura o indice 2 direto do cmd e guarda na variavel y


       if(args[0].equals("sum")){ // verifica se o indice 0 é igual a palavra sum
           sum(x, y);
       } else if(args[0].equals("minus")) { // verifica se o indice 0 é igual a palavra minus
           minus(x, y);
       } else if(args[0].equals("share")) { // verifica se o indice 0 é igual a palavra share
           share(x, y);
       } else if(args[0].equals("multiply")){ // verifica se o indice 0 é igual a palavra multiply
           multiply(x, y);
       } else {
           System.out.println("Nenhuma instrucao definida!");
       }

    }

    //DECLARAÇÃO DE FUNÇÕES

    static void sum(int x, int y){
        System.out.println(x + y);
    }

    static void minus(int x, int y){
        System.out.println(x - y);
    }

    static void share(int x, int y){
        System.out.println(x / y);
    }

    static void multiply(int x, int y){
        System.out.println(x * y);
    }
}
