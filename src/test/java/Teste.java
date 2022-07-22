public class Teste {
    public static void main(String[] args) {
        usandoConstantes();

        System.out.println();

        usandoEnum();
    }

    private static void usandoConstantes(){

        int segunda = DiaSemanaConstantes.SEGUNDA;
        int terca = DiaSemanaConstantes.TERCA;
        int quarta = DiaSemanaConstantes.QUARTA;
        int quinta = DiaSemanaConstantes.QUINTA;
        int sexta = DiaSemanaConstantes.SEXTA;
        int sabado = DiaSemanaConstantes.SABADO;
        int domingo = DiaSemanaConstantes.DOMINGO;

        System.out.println("Teste utilizando constantes no Java");
//        imprimeDiaSemana(segunda);
//        imprimeDiaSemana(terca);
//        imprimeDiaSemana(quarta);
//        imprimeDiaSemana(quinta);
//        imprimeDiaSemana(sexta);
//        imprimeDiaSemana(sabado);
//        imprimeDiaSemana(domingo);
    }

    private static void imprimeDiaSemana (DiaSemana dia){
        switch (dia){
            case SEGUNDA:
                System.out.println("Segunda-feira");
                break;
            case TERCA:
                System.out.println("Terça-feira");
                break;
            case QUARTA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }

    private static void usandoEnum(){
        System.out.println("Teste utilizando constantes no Java");

        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;
    }
}
