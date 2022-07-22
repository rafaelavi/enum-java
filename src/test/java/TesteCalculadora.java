public class TesteCalculadora {

    public static void main(String[] args) {
        for (Operacoes op: Operacoes.values()) {
            System.out.println(op.executarOperacao(32,4));
        }
    }
}
