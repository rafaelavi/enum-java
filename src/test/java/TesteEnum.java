public class TesteEnum {
    public static void main(String[] args) {

//        DiaSemana dia = DiaSemana.DOMINGO;
//
//        System.out.println(dia.toString() + " - " + dia.getValor());
//
//        Data data = new Data(1,4,2002, DiaSemana.SEGUNDA);

        DiaSemana[] dias = DiaSemana.values();

        for(int i = 0; i<dias.length; i++){
            System.out.println(dias[i]);
        }


        for(DiaSemana dia : DiaSemana.values()){
            System.out.println(dia);
        }
    }
}
