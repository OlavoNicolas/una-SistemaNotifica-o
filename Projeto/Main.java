import java.util.ArrayList;
import java.util.Scanner;
public class Main {    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        int escolha;

        ArrayList<String> notificacoes = new ArrayList<>();
        notificacoes.add("EMAIL");
        notificacoes.add("SMS");
        notificacoes.add("WhatsApp");


        do{
        
            System.out.println("MENU NOTIFICAÇÔES");
            System.out.println("Escolha uma das seguintes opções:");
            System.out.println("1-EMAIL");
            System.out.println("2-SMS");
            System.out.println("3-WhatsApp");
            System.out.println("4-Sair");
            escolha = sc.nextInt();
        
         switch (escolha) {
            case 1:
                System.out.println("Opção escolhida: " + notificacoes.get(0));
                break;
            case 2:
                System.out.println("Opção escolhida: " + notificacoes.get(1));
                break;
            case 3:
                System.out.println("Opção escolhida: " + notificacoes.get(2));
                break;
            case 4:
                System.out.println("Saindo...");
                loop = false;
                break;
            default:
                System.out.println("ERROR,Digite novamente!");
                break;
         }}while(loop == true);

    
    sc.close();
    }
}
