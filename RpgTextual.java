import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.security.DigestInputStream;
import java.util.ArrayList;

/*
 * Delta's Darkness
 */

public class RpgTextual {
    static int temp_dialog =1, temp_narrativa = 50, temp_transicao = 25;
    static String nome_do_personagem;
    static Scanner sc = new Scanner (System.in);
    static int vidas = 3;
    //Main, a função principal do jogo...
    public static void main(String[] args) throws Exception {
        Digita("Em um reino distante chamado Luminaire, as forças das equações matemáticas mantêm a luz do mundo. No entanto, um feiticeiro maligno chamado Delta lançou um feitiço sobre o reino. A única maneira de quebrar o feitiço é resolver os enigmas matemáticos que ele deixou para trás.\r\n" + //
                "\r\n" + //
                "No reino Luminaire, foneciam a luz do mundo através de seus magos matemáticos que resolviam equações e mantiam a luz do reino, quando delta lança o feitiço os magos perdem suas habilidades de resolver equações instantâneamente, mas só uma pessoa de fora do reino pode resolver esse problema e quebrar esse feitiço.\r\n" + //
                "\r\n" + //
                "O jogador assume o papel de um jovem aprendiz de magia que estava fora do reino quando o feitiço foi lançado. Ao retornar e descobrir o caos, o jovem aprendiz é informado por Solion, espírito do Raio de Sol que a única maneira de salvar o reino é resolver as equações de segundo grau deixadas por Delta.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\nEstão preparados para entrar no mundo de Luminaire?",TimeUnit.MILLISECONDS, temp_dialog);
    System.out.println("\n1 - Sim | 2 - Claro! |3 - Acho que não :( |4 - Ver descrição primeiro! ");
    int MenuChoice = sc.nextInt();
        if (MenuChoice == 1 || MenuChoice == 2){
            Digita("\nVamos começar a joranada então!", TimeUnit.MILLISECONDS, temp_dialog);
            menu();
        }
        else if (MenuChoice == 3){
            Digita("Infelizmente você não tem escolha, vamos lá do mesmo jeito!", TimeUnit.MILLISECONDS, temp_dialog);
            menu();
        }
        else if (MenuChoice == 4) {
            Digita("\nEsse RPG se trata de um jogo que te trará maneiras diferentes de resolver uma equação de 2° grau, pense bem nas suas escolhas mas principalmente se divirta! :)", TimeUnit.MILLISECONDS, temp_dialog);
            menu();
        }
        else {
            Digita("\nVocê escolheu uma opção inválida, por favor aceite e vamos lá de qualquer jeito", TimeUnit.MILLISECONDS, temp_dialog);
            menu();
        }
    }    
/**
 * @throws Exception
 */
static void menu() throws Exception {
    int options_menu;
    System.out.println("\n");
    do{
        Digita("1 - Jogar || 2 - Ver Desafios || 3 - Créditos || 4 - Sair", TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n");
        options_menu = sc.nextInt();
        if(options_menu == 1){
            jogo();
        }
        else if(options_menu == 2){
            VerDesafios();
        }    
        else if(options_menu == 3){
            creditos();
        }
        else if (options_menu == 4){
            System.exit(0);
        }
        else{
            System.out.println("Opção inválida, Escolha uma opção válida!");
        }
        
    }while(options_menu != 1 && options_menu != 2 && options_menu != 3 && options_menu != 4);

}


    public static void jogo()throws Exception{
        Scanner sc = new Scanner(System.in);
        Digita("Antes de mergulharmos nas profundezas desta aventura, preciso conhecer nosso protagonista. Agora nós vamos começar os desafios, mas antes, nos fale o nome do seu personagem!",TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n");
        Digita("Digite o nome do seu personagem: ", TimeUnit.MILLISECONDS, temp_dialog);
        nome_do_personagem = sc.nextLine();
        Digita("Seja bem-vindo "+ nome_do_personagem + "! Vamos começar os desafios...", TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n");
        Digita("1 - Desafios | 2 - Sair", TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n");
        int choice1 = sc.nextInt();
        do{
            if(choice1 == 1){
                desafios();
            }
            else if(choice1 == 2){
                System.exit(0);
            }
            else{
                System.out.println("Opção inválida, digite uma opção válida...");
            }
        }
        while(choice1 != 1 && choice1 != 2);
        System.out.println("Continuação do jogo");

    }

    static void VerDesafios()throws Exception{
        Digita("1° Desafio será a CAVERNA DE BHASKARA, nesse desafio você deve resolver equações relacionadas a bhaskara para\r\n" + //
                "iluminar seu caminho.\n ", TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("-----------------------------\n");   
        Digita("2° Desafio será o MONTE DAS EQUAÇÕES, onde criaturas mágicas\r\n" + //
                "protegem a passagem, e para passar por eles você terá que resolver as equações\n", TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("-----------------------------\n");
        Digita("3° Desafio será a FLORESTA DE DELTA, local onde o feiticeiro reside. \n" + // 
                "Você terá que resolver equações de DELTA para finalizar a última parte do jogo!\n", TimeUnit.MILLISECONDS, temp_dialog);
                menu();
    }

    static void creditos()throws Exception{
        System.out.println("- Créditos -");
        menu();
    }

    static void desafios() throws Exception{
        Scanner sc = new Scanner(System.in);
        Digita("Você está caminhando em uma floresta muito escura, o que não faz diferença, pois o feitiço lançado por delta deixa tudo em trevas! \nMas um caminho fluorescente chama a sua atenção... ", TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n");
        Digita("1 - Ir pelo o caminho fluorescente... || 2 - Continuar a jornada...\n", TimeUnit.MILLISECONDS, temp_dialog);
        int choice_desafio1 = sc.nextInt();
        if(choice_desafio1 == 1){
            desafio1ex1();
        }
        else if(choice_desafio1 == 2){
            desafio1ex2();
        }    

    }

    static void desafio1ex1()throws Exception{
        Scanner sc = new Scanner(System.in);
        Digita("Opa, você seguiu o caminho fluorescente e encontrou uma caverna...\nVocê encontrou um mago que foi afetado pelo feitiço...\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Bem-vindo ao primeiro desafio! \nVamos aprender mais sobre bhaskara\n", TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("1 - Interagir com o mago || 2 - Sair do jogo\n");
        int interacao = sc.nextInt();
        do{
            if(interacao == 1){
                Digita("MAGO - Olá, que bom que vc está por aqui, esta é a Caverna de bhaskara, para atravessar a caverna cumpra o desafio...\nCom o desafio completo você terá o caminho iluminado e poderá seguir...\n", TimeUnit.MILLISECONDS, temp_dialog);
                System.out.println("--------------------------------------");
                formulaBhaskara();

            }
            else if(interacao == 2){
                System.exit(0);
            }
            else {
                System.out.println("Opção inválida, digite uma opção válida...");
            }
        }
        while(interacao != 1 && interacao != 2);
    }

    static void desafio1ex2()throws Exception{
        mostrarVidas();
        Digita("Você seguiu o caminho e encontrou um mago que o chamou para perto\n"+ //
        "Esse mago igualmente os demais foram afetados pelo feitiço e só você "+nome_do_personagem+" pode salva-lo", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("1 - Interagir com o mago || 2 - Sair do jogo\\n", TimeUnit.MILLISECONDS, temp_dialog);     
        int interacao = sc.nextInt();
        do{
            if(interacao == 1){
                Digita("MAGO - Olá, que bom que vc está por aqui, esta é a Caverna de bhaskara depois do caminho fluorescente, me pergunto porque você não\n"+//
                "seguiu o caminho fluorescente, você parece ser diferente! Para atravessar a caverna cumpra o desafio...\nCom o desafio completo você terá o caminho iluminado e poderá seguir...\n", TimeUnit.MILLISECONDS, temp_dialog);
                System.out.println("--------------------------------------");
                formulaBhaskara2();

            }
            else if(interacao == 2){
                System.exit(0);
            }
            else {
                System.out.println("Opção inválida, digite uma opção válida...");
            }
        }
        while(interacao != 1 && interacao != 2);       
    }

    static void formulaBhaskara()throws Exception{
        Scanner sc = new Scanner(System.in);
        double a = 1;
        double b = -3;
        double c = 2;
        Digita("Primeiramente vou te explicar como funciona a fórmula de bhaskara...", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Esta é uma equação de 2° grau: x² - 3x + 2 = 0", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Nessa equação de 2° grau, temos os coeficientes 'a', 'b', 'c'... \nEsses coeficientes tem o valor de A = "+a+" B = "+b+ " e C = "+c +"\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Vamos para a prática... \nVou te mostrar uma equação de 2° grau, e você terá que digitar os coeficientes da equação conforme mostrado no exemplo!\n", TimeUnit.MILLISECONDS, temp_dialog);
        mostrarVidas();
        Digita("Aí esta a equação: x² - 4x + 3 = 0\n", TimeUnit.MILLISECONDS, temp_dialog);
        double a1 = 1;
        double b1 = -4;
        double c1 = 3;
        int valorDeA;
        int valorDeB;
        int valorDeC;
        do{
            mostrarVidas();
            Digita("Qual o valor de A: \n", TimeUnit.MILLISECONDS, temp_dialog);
            valorDeA = sc.nextInt();
            Digita("Qual o valor de B: \n", TimeUnit.MILLISECONDS, temp_dialog);
            valorDeB = sc.nextInt();
            Digita("Qual o valor de C: \n", TimeUnit.MILLISECONDS, temp_dialog);
            valorDeC = sc.nextInt(); 
        
                if (valorDeA == 1 && valorDeB == -4 && valorDeC == 3){
                    Digita("Parabéns, parece que você já entendeu como funciona \nVocê acertou todos\n", TimeUnit.MILLISECONDS, temp_dialog);
                }
                else{
                    Digita("Acho que você ainda não entendeu, tente novamente!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    perderVida();
                    
                }
        }
        while(valorDeA != 1 || valorDeB != -4 || valorDeC != 3);
        Digita("Que bom que você conseguiu completar o primeiro exercício, você está cada vez mais perto de completar o desafio.\nVamos praticar um pouco sobre o calculo de delta...\n", TimeUnit.MILLISECONDS, temp_dialog);
        int resposta = 0;
        Digita("A formula de delta éΔ = -b² - 4*a*c \n", TimeUnit.MILLISECONDS, temp_dialog);
        

       do {
        mostrarVidas();
        Digita("Ache o Delta desta equação: 3x² - 2x -1 = 0\n", TimeUnit.MILLISECONDS, temp_dialog);
        resposta = sc.nextInt();
        if (resposta==16) {
            Digita("Parabéns! você acertou.\n", TimeUnit.MILLISECONDS, temp_dialog);

        }
        else{
            Digita("Parece que você ainda não entendeu o desafio, tente novamente!\n", TimeUnit.MILLISECONDS, temp_dialog);
            perderVida();

       }
       } while (resposta!=16);

    }

    static void formulaBhaskara2() throws Exception{
        double a = 1;
        double b = -3;
        double c = 2;
        Digita("Primeiramente vou te explicar como funciona a fórmula de bhaskara...", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Esta é uma equação de 2° grau: x² - 3x + 2 = 0", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Nessa equação de 2° grau, temos os coeficientes 'a', 'b', 'c'... \nEsses coeficientes tem o valor de A = "+a+" B = "+b+ " e C = "+c +"\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Vamos para a prática... \nVou te mostrar uma equação de 2° grau, e você terá que digitar os coeficientes da equação conforme mostrado no exemplo!\n", TimeUnit.MILLISECONDS, temp_dialog);
        mostrarVidas();
        Digita("Aí esta a equação: 2x² + x - 3 = 0\n", TimeUnit.MILLISECONDS, temp_dialog);
        double a1 = 2;
        double b1 = 1;
        double c1 = -3;
        int valorDeA;
        int valorDeB;
        int valorDeC;
        do{
            mostrarVidas();
            Digita("Qual o valor de A: \n", TimeUnit.MILLISECONDS, temp_dialog);
            valorDeA = sc.nextInt();
            Digita("Qual o valor de B: \n", TimeUnit.MILLISECONDS, temp_dialog);
            valorDeB = sc.nextInt();
            Digita("Qual o valor de C: \n", TimeUnit.MILLISECONDS, temp_dialog);
            valorDeC = sc.nextInt(); 
        
                if (valorDeA == 2 && valorDeB == 1 && valorDeC == -3){
                    Digita("Parabéns, parece que você já entendeu como funciona \nVocê acertou todos\n", TimeUnit.MILLISECONDS, temp_dialog);
                }
                else{
                    Digita("Acho que você ainda não entendeu, tente novamente!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    perderVida();
                    
                }
        }
        while(valorDeA != 2 || valorDeB != 1 || valorDeC != -3);
    }




    // Função que retira uma vida do jogador depois que ele erra uma questão
    static void perderVida()throws Exception{
        if(vidas > 0){
        vidas --;
        Digita("Você errou!\n", TimeUnit.MILLISECONDS, temp_dialog);
            if (vidas == 0){
                Digita("Você não tem mais vidas! Fim de jogo.", TimeUnit.MILLISECONDS, temp_dialog);
                System.exit(0);
            }
        } 
        else{
        Digita("Você já está sem vidas!", TimeUnit.MILLISECONDS, temp_dialog);
        }   
    }
    // Função que reseta a vida do jogador
    static void resetarVida()throws Exception{
        if(vidas == 1 || vidas == 2){
                vidas = 3;   
            }
            else{
                System.out.println("--------------------");
            }
        
    } // Função que mostra as vidas do jogador
    static void mostrarVidas()throws Exception{
        Digita("Você tem "+vidas+" vidas!\n", TimeUnit.MILLISECONDS, temp_dialog);
    }


    
     // Função onde tem as configurações sobre o "Digita" que vai aparecendo o texto.
    public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException{
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
        }
    } 
    
}