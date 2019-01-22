import java.util.Scanner;
class Teste{
public static  void main(String[]args){
	Scanner sc = new Scanner (System.in);
    Tamagotchi usuario = new Tamagotchi();
    usuario.energia = 20;
    usuario.fome = 10;
    usuario.limpeza = 15;
    usuario.diamante = 0;
    usuario.idade = 0;
    
    ///menu
    System.out.println(" ----------------------------------------------");
    System.out.println("|                 Bem Vindo!                   |");
    System.out.println("| 1. Brincar                                   |");
    System.out.println("| 2. comer                                     |");
    System.out.println("| 3. Dormir                                    |");
    System.out.println("| 4. Banho                                     |");
    System.out.println(" ----------------------------------------------");
    while(usuario.fome > 0 && usuario.limpeza > 0 && usuario.energia > 0){
    System.out.println(" ----------------------------------------------");
    System.out.println("| informacoes do seu bichinho virtual:         |");
    System.out.println("| E:"+usuario.energia+ "/20, F:" +usuario.fome+ "/10, L:" +usuario.limpeza+ "/15, I:" +usuario.idade+ ", D:" +usuario.diamante+"          |");
    System.out.println(" ----------------------------------------------");
    System.out.println("Digite sua opcao:");
    usuario.opcao = sc.nextInt();
    switch(usuario.opcao){
     case 1:
     usuario.brincar();
     break;
     case 2:
     usuario.comer();
     break;
    case 3:
     usuario.dormir();
     break;
    case 4:
     usuario.banho();
     break;
     default:
     System.out.println("Putz! opcao invalida tente digitar um numero de 1 ate 4");
     break;
   }
}
System.out.println("Seu Bixinho Virtual Morreu!");
}
}