public class ProdutoImpares {
    public static void main(String[] args) {
        int produtoInt = 1;
        float produtoFloat = 1.0f;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                produtoInt *= i;
                produtoFloat *= i;
            }
        }

        System.out.println("Produto dos números ímpares (int): " + produtoInt);
        System.out.println("Produto dos números ímpares (float): " + produtoFloat);
    }
}