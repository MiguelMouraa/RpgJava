
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.security.DigestInputStream;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;

/*
 * Delta's Darkness
 */

public class RpgTextual  {
    
    static int temp_dialog =1, temp_narrativa = 50, temp_transicao = 25;
    static String nome_do_personagem;
    static Scanner sc = new Scanner (System.in);
    static int vidas = 3;
    
    //Main, a função principal do jogo...
    public static void main(String[] args) throws Exception {
        //RpgTextual App = new RpgTextual();
        //AppRpg.alternativas();
        
        Digita("Em um reino distante chamado Luminaire, as forças das equações matemáticas mantêm a luz do mundo. No entanto, um feiticeiro maligno chamado Delta lançou um feitiço sobre o reino. A única maneira de quebrar o feitiço é resolver os enigmas matemáticos que ele deixou para trás.\r\n" + //
                "\r\n" + //
                "No reino Luminaire, foneciam a luz do mundo através de seus magos matemáticos que resolviam equações e mantiam a luz do reino, quando delta lança o feitiço os magos perdem suas habilidades de resolver equações instantâneamente, mas só uma pessoa de fora do reino pode resolver esse problema e quebrar esse feitiço.\r\n" + //
                "\r\n" + //
                "O jogador assume o papel de um jovem aprendiz de magia que estava fora do reino quando o feitiço foi lançado. Ao retornar e descobrir o caos, o jovem aprendiz é informado por Solion, espírito do Raio de Sol que a única maneira de salvar o reino é resolver as equações de segundo grau deixadas por Delta.\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\nEstão preparados para entrar no mundo de Luminaire?",TimeUnit.MILLISECONDS, temp_dialog);
    System.out.println("\n1 - Sim | 2 - Claro! | 3 - Acho que não :( | 4 - Ver descrição primeiro! ");
    int MenuChoice = sc.nextInt();
        if (MenuChoice == 1 || MenuChoice == 2){
            Digita("\nVamos começar a jornada então!", TimeUnit.MILLISECONDS, temp_dialog);
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


    /**
     * @throws Exception
     */
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
        
        Digita("MAGO - Muito bem!\nParece que você conseguiu completar os 2 desafios\nNos despedimos aqui "+nome_do_personagem+ ", encontre o Monte das Equações para completar e complete os próximos desafios, espero que nos encontremos em breve e com um final feliz nessa sua jornada!\n", TimeUnit.MILLISECONDS,temp_dialog);
        System.out.println("1 - Continuar jornada | 2 - Sair do jogo");
        int choice2 = sc.nextInt();
        if(choice2 == 1){
            jornada1();
        }
        else if(choice2 == 2){
            System.exit(0);
        }
        else{
            Digita("Opção inválida, digite uma opção válida...", TimeUnit.MILLISECONDS, temp_dialog);
        }
        Digita("Parebéns, você conseguiu passar dos montes das equações!\nAgora a sua jornada está perto de acabar, mas não será fácil passar do final\n"+
        "Agora siga o seu caminho e aproveite!", TimeUnit.MILLISECONDS, temp_dialog);
        jornada2();
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
        do{
            if(choice_desafio1 == 1){
                desafio1ex1();
            }
            else if(choice_desafio1 == 2){
                desafio1ex2();
            }    
            else{
                Digita("Opção inválida, digite uma opção válida...", TimeUnit.MILLISECONDS, temp_dialog);
            }
        }
        while(choice_desafio1 != 1 && choice_desafio1 != 2);
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
        Digita("Você seguiu o caminho e encontrou um mago que o chamou para perto\nEsse mago igualmente os demais foram afetados pelo feitiço e só você "+nome_do_personagem+" pode salva-lo\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("1 - Interagir com o mago || 2 - Sair do jogo\n", TimeUnit.MILLISECONDS, temp_dialog);
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
        Digita("Ache o Delta desta equação: 3x² - 2x - 1 = 0\n", TimeUnit.MILLISECONDS, temp_dialog);
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
        Digita("Que bom que você conseguiu completar o primeiro exercício, você está cada vez mais perto de completar o desafio.\nVamos praticar um pouco sobre o calculo de delta...\n", TimeUnit.MILLISECONDS, temp_dialog);
        int resposta = 0;
        Digita("A formula de delta éΔ = -b² - 4*a*c \n", TimeUnit.MILLISECONDS, temp_dialog);
        

       do {
        mostrarVidas();
        Digita("Ache o Delta desta equação: x² + 4x + 3 = 0\n", TimeUnit.MILLISECONDS, temp_dialog);
        resposta = sc.nextInt();
        if (resposta==4) {
            Digita("Parabéns! você acertou.\n", TimeUnit.MILLISECONDS, temp_dialog);

        }
        else{
            Digita("Parece que você ainda não entendeu o desafio, tente novamente!\n", TimeUnit.MILLISECONDS, temp_dialog);
            perderVida();

       }
       } while (resposta!=4);

    }

    static void jornada1()throws Exception{
        Digita("Se você chegou até aqui, significa que você completou o primeiro capítulo...\nVamos Seguir...", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Você está andando por um caminho de terra, ouve alguns passos...\nMas são só pessoas tentando encontrar o caminho de casa.\n"+
        "Você percebe que tanto você quanto as pessoas, desconfiam de todos que encontram pelo caminho\nEntão você continua pelo caminho de terra, tentando achar alguma saida... Mas derrenpende você encontra mais viajantes andando em sua direção e cria coragem para falar com eles\n"+
        nome_do_personagem+":\n1 - Olá, vocês podem me dizer onde que fica o Monte das Esquações?\n2 - Olá, onde é a vila mais próxima?\nCaso respondam a pergunta 1 você terá que andar até chegar no monte das equações!"+
        " Caso respondam a pergunta 2 você poderá ir até a vila e descansar para os próximos desafios\nObs: Se o monte das equações for longe, você chegará cansado e só terá 2/3 vidas para os dois desafios mas terá uma dica...\nSe a Vila estiver perto, você descansará mas não terá a dica!\nEscolha sabiamente!\n", TimeUnit.MILLISECONDS, temp_dialog);
        int choice1 = sc.nextInt();
        do{
            if (choice1 == 1) {
                Digita("Viajantes - O monte das equações é seguindo esse caminho de terra por 1 kilometro\n"+nome_do_personagem+" - Ufa, achei que era longe de onde estou.\n", TimeUnit.MILLISECONDS, temp_dialog);
                monteDasEquacoes();
            }
            else if(choice1 == 2){
                Digita("Viajantes - A vila mais próxima é seguindo por esse caminho de terra por 7 kilometros\n"+nome_do_personagem+" - Obrigado pela informação\n"+
                "Desolado com a notícia de que a vila é longe você volta para a suas caminhada e ouve sussuros de outros viajantes dizendo que estão indo para o Monte das Equações e decide segui-los...\n"+
                "Ao seguir os viajantes você cai em uma emboscada, ladrões querem que você resolva o desafio para o caminho deles ser iluminado!\n"+
                "1 - Ir para desafio e ceder a luz para os ladrões!\n2 - Recusar a ajuda e perder 1 vida\n", TimeUnit.MILLISECONDS, temp_dialog);
                int choice2 = sc.nextInt();
                do{
                    if(choice2 == 1){
                        desafiojornada();
                    }
                    else if (choice2 == 2){
                        perderVida();
                        mostrarVidas();
                    }
                    else{
                        Digita("Opção inválida, digite uma opção válida...", TimeUnit.MILLISECONDS, temp_dialog);
                    }
                }
                while(choice2 != 1 && choice2 != 2);

            }
            else{
                Digita("Opção inválida, digite uma opção válida...", TimeUnit.MILLISECONDS, temp_dialog);
            }

        }
        while(choice1 != 1 && choice1 != 2);
        
    }

    static void jornada2() throws Exception{
        Digita("Enquanto você caminha em direção a FLORESTA DE DELTA, você encontra magos andando.\n"+
        "Esses magos te perguntam...\nMagos - Você que é "+nome_do_personagem+"?\n"+nome_do_personagem+" :Sim, sou eu\nMagos - Queriamos te agradecer por tudo que você fez até agora"+
        "já estamos com boa parte de nossos vilarejos iluminados por sua causa, continue assim, vença o DELTA, pois se ele sair vitorioso a escuridão voltará e nunca mais sairá...", TimeUnit.MILLISECONDS, temp_dialog);

        florestaDeDelta();
    }

    static void monteDasEquacoes()throws Exception{
        Digita("Você caminhou por 1 kilometro e encontrou o Monte das equações...\n Na subida para do Monte você encontra outro Mago..."+
        "Esse mago já está mais velho e debilitado e precisa muito da sua ajuda.\n MAGO - Que bom que você chegou não temos muito tempo!"+
        " Você precisa concluir esse desafio para nos ajudar o mais rapido possível...", TimeUnit.MILLISECONDS, temp_dialog);
        DELTA4();
            
            resetarVida();
            Digita("MAGO - Muito bem! Você concluiu um desafio do Monte das equações!\nMas ainda falta mais um, resolva o próximo desafio para ir para o capítulo final!\n", TimeUnit.MILLISECONDS, temp_dialog);
            Digita("O próximo desafio será igual o primeiro, mas você poderá escolher com qual delta resolverá a equação\n", TimeUnit.MILLISECONDS, temp_dialog);
            Digita("1 - DELTA = 1 || 2 - DELTA = 0\n", TimeUnit.MILLISECONDS, temp_dialog);
            
            
        int respostaDelta;    
        do{
            respostaDelta = sc.nextInt();
                if (respostaDelta == 1) {
                   DELTA1();
            }
            else if(respostaDelta == 2){
                   DELTA0();
            }
            else{
                Digita("Valor inválido, escolha o DELTA com 1 ou 2!\n", TimeUnit.MILLISECONDS, temp_dialog);
            } 
        } 
            while(respostaDelta != 1 && respostaDelta != 2);
           
    }

    static void florestaDeDelta()throws Exception{
        
    }



    static void DELTA4()throws Exception{
         Digita("Vamos começar o desafio...\nO delta da conta será 4.\n", TimeUnit.MILLISECONDS, temp_dialog);
         Digita("Equação: x² + 4x + 3 = 0\n", TimeUnit.MILLISECONDS, temp_dialog);

        int delta1 = 4;
        int a = 1;
        int b = 4;
        int c = 3;
        double x1 = 0;
        double x2 = 0;
        
        do{
            resetarVida();
            mostrarVidas();
                System.out.print("Digite o x1: ");
                x1 = sc.nextDouble();
                System.out.print("Digite o x2: ");
                x2 = sc.nextDouble();
                   
                if ((x1 == (-b + Math.sqrt(delta1)) / (2 * a) && x2 == (-b - Math.sqrt(delta1)) / (2 * a)) || (x1 == (-b - Math.sqrt(delta1)) / (2 * a) && x2 == (-b + Math.sqrt(delta1)) / (2 * a) )) {
                        Digita("Parabéns! Você resolveu corretamente a equação e teve seu caminho iluminado com sucesso!\n", TimeUnit.MILLISECONDS, temp_dialog);

                    } 
                    else {
                        Digita("Oh não! Sua resposta está incorreta. Tente novamente.\n", TimeUnit.MILLISECONDS, temp_dialog);
                        perderVida();
                        Digita(" x² + 4x + 3 = 0\n", TimeUnit.MILLISECONDS, temp_dialog);

                    }
            } while((x1 != -1 || x2 != -3 ) && (x1 != -3 || x2 != -1 ));
    } 

    static void DELTA1()throws Exception{
            int delta2 = 1;
            int a1 = 1;
            int b1 = -5;
            int c1 = 6;
            double x11 = 0;
            double x21 = 0;     
             Digita("Você escolheu o DELTA 1\nAqui está a equação para você resolver\nEquação: x² - 5x + 6 = 0\n", TimeUnit.MILLISECONDS, temp_dialog);
        do{
                       
                        mostrarVidas();
                        System.out.print("Digite o x1: ");
                        x11 = sc.nextDouble();
                        System.out.print("Digite o x2: ");
                        x21 = sc.nextDouble();
                        
                            if ((x11 == (-b1 + Math.sqrt(delta2)) / (2 * a1) && x21 == (-b1 - Math.sqrt(delta2)) / (2 * a1)) || (x11 == (-b1 - Math.sqrt(delta2)) / (2 * a1) && x21 == (-b1 + Math.sqrt(delta2)) / (2 * a1) )) {
                            Digita("Parabéns! Você resolveu corretamente a equação e teve seu caminho iluminado com sucesso!\n", TimeUnit.MILLISECONDS, temp_dialog);
                            }
                        
                            
                            else {
                                    Digita("Oh não! Sua resposta está incorreta. Tente novamente.\n", TimeUnit.MILLISECONDS, temp_dialog);
                                    perderVida();

                            }
            
                    
                    
                } while((x11 != 2 || x21 != 3 ) && (x11 != 3 || x21 != 2 ));
    }

    static void DELTA0()throws Exception{
            int delta3 = 0;
            int a2 =  1;
            int b2 = -4;
            int c2 = 4;
            double x12 = 0;
            double x22 = 0;
            Digita("Você escolheu o DELTA 0\nAqui está a equação para você resolver\nEquação: x² - 4x + 4 = 0", TimeUnit.MILLISECONDS, temp_dialog);
        do{                
                                
                                mostrarVidas();
                                System.out.print("Digite o x1: ");
                                x12 = sc.nextDouble();
                                System.out.print("Digite o x2: ");
                                x22 = sc.nextDouble();
                                
                                    if ((x12 == (-b2 + Math.sqrt(delta3)) / (2 * a2) && x22 == (-b2 - Math.sqrt(delta3)) / (2 * a2)) || (x12 == (-b2 - Math.sqrt(delta3)) / (2 * a2) && x22 == (-b2 + Math.sqrt(delta3)) / (2 * a2) )) {
                                        Digita("Parabéns! Você resolveu corretamente a equação e teve seu caminho iluminado com sucesso!\n", TimeUnit.MILLISECONDS, temp_dialog);

                                    }
                                    else {
                                        Digita("Oh não! Sua resposta está incorreta. Tente novamente.\n", TimeUnit.MILLISECONDS, temp_dialog);
                                        perderVida();

                                }
            
                    
                            }  while(x12 != 2 || x22 != 2);
    }

    static void desafiojornada()throws Exception{
        Digita("Com os ladrões te pressionando você precisa conseguir passar do desafio, você terá 3 vidas para concluir o desafio\nBoa sorte!\n", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Aí esta a equação: x² - 5x + 6 = 0\n", TimeUnit.MILLISECONDS, temp_dialog);
        double a1 = 1;
        double b1 = -5;
        double c1 = 6;
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
        
                if (valorDeA == a1 && valorDeB == b1 && valorDeC == c1){
                    Digita("Parabéns!\nVocê acertou todos\n", TimeUnit.MILLISECONDS, temp_dialog);
                }
                else{
                    Digita("Acho que você ainda não entendeu, tente novamente!\n", TimeUnit.MILLISECONDS, temp_dialog);
                    perderVida();
                    Digita("x² - 5x + 6 = 0\n", TimeUnit.MILLISECONDS, temp_dialog);
                    
                }
        }
        while(valorDeA != a1 || valorDeB != b1 || valorDeC != c1);
        resetarVida();
        Digita("Você cedeu a luz para o caminho dos ladrões e eles te liberaram...\n", TimeUnit.MILLISECONDS, temp_dialog);
        monteDasEquacoes();
    }



    // Função que retira uma vida do jogador depois que ele erra uma questão
    static void perderVida()throws Exception{
        if(vidas > 0){
        vidas --;
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

    /**
     * @throws Exception
     */
  

    
     // Função onde tem as configurações sobre o "Digita" que vai aparecendo o texto.
    public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException{
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
        }
    } 
    
}
