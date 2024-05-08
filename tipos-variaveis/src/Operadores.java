public class Operadores {
    public static void main (String [] args){
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }
           

        if(condicao1 || condicao2){
                System.out.println("Uma das condiações é verdadeira");
        }
        
        System.out.println("FIM");
       
       
       
       
       
       
       
        /*String nome1 = "Luciano";
        String nome2 = new String("Luciano");

        System.out.println(nome1.equals(nome2)); 
        
        
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2)
            System.out.println("A nossa condição é verdadeira!");
    

        System.out.println("Numero é igual a numero 2?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero é diferente numero 2?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero é maior que o numero 2?" + simNao);

        simNao = numero1 < numero2;

        System.out.println("Numero é menor que o numero 2?" + simNao);

        /*if(numero1 > numero2)
            System.out.println("Numero 1 é maior que o numero 2");
        
        if(numero1 < numero2)
            System.out.println("Numero 1 é menor que o numero 2");*/

        
    }
}
