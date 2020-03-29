import java.util.Scanner;

public class Votos{
    public static void main(String[] args){
        System.out.println("Digite a sua idade: ");
        int idade = new Scanner(System.in).nextInt();
        
        if(idade >= 18 && idade <= 70){
            System.out.println("Você é obrigado a votar!");
        }else if((idade >=16 && idade <18) || idade > 70){
            System.out.println("Você não é obrigado a votar!");
        }else{
            System.out.println("Você não pode votar!");
        }
    }
}
