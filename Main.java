import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dig = new Scanner(System.in);

        System.out.println("Informe o salário do funcionário: ");
       float v1 = Float.parseFloat(dig.next().replace(",", "."));  // v1 = valor do salario

        int dep = 0;
        System.out.println("Informe a quantidade de dependentes: "); // dep = quantidade de dependentes
        dep = dig.nextInt();


        float depTax = (float) (134.98 * dep); // depTax = valor das taxas
        float perc = (float) (3 * depTax / 100); // percentual de acrescimo
        float depTot = (float)(v1 + depTax + perc); //depTot = valor das taxas com o acrescimo do dependente
        float v1Fam = depTax + perc;

        System.out.printf("#########################\n");
        System.out.printf("#####CALCULO SALARIO#####\n");
        System.out.printf("#########################\n");
        System.out.println("Salario:R$ "+ v1);
        System.out.println("Dependentes: "+ dep);
        System.out.println("Salario Familia:R$ "+ v1Fam);
        System.out.println("Salario Final:R$ "+ depTot);
        System.out.printf("\n#########################");


    }
}
