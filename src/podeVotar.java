public class podeVotar {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite a idade: ");
//        int idade = sc.nextInt();
//        sc.close();
//        permitidoVotar(idade);

        String[][] arrayVoto = {{"20", "VOTO OBRIGATORIO"},
                {"18", "VOTO OBRIGATORIO"},
                {"17", "VOTO FACULTATIVO"},
                {"16", "VOTO FACULTATIVO"},
                {"17", "Sem direito a votar"},
                {"45", "VOTO OBRIGATORIO"},
                {"85", "VOTO FACULTATIVO"},
                {"5", "Sem direito a votar"},
                {"10", "Sem direito a votar"},
        };
        String [] arrayResultado = new String[9];


        for (int i = 0; i < arrayVoto.length; i++) {
            if(arrayVoto[i][1].equalsIgnoreCase(permitidoVotar(Integer.parseInt(arrayVoto[i][0])))){
                System.out.println("Teste "+ (i+1) + ": sucesso");
                arrayResultado[i] = ("Teste "+ (i+1) + ": sucesso");
            }else{
                System.out.println("Teste "+ (i+1)+ ": falha");
            }
        }

    }

    public static String permitidoVotar(int idade){
        if (idade < 16){
            return "Sem direito a votar";

        } else if (idade >= 18 && idade <=70){
            return "Voto obrigatorio";
        } else{
            return "Voto facultativo";

        }

    }
}
