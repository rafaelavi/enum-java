public class Formulario {

    enum Genero{
        FEMENINO('F'), MASCULINO('M');

        private char valor;

        Genero(char valor){
            this.valor = valor;
        }

    }

    private String nome;
    private Genero genero;
}
