import java.util.Scanner;

class exerciciocenso
{
	public static void main (String[] args)
	{
        Scanner ler = new Scanner(System.in);

        int quantidadeadulto = 0, genero = 0,feminino = 0,masculino = 0,outros = 0,idadefeminino = 0, idademasculino = 0, idadeoutros = 0,totalidadefeminino = 0, totalidademasculino = 0, totalidadeoutros = 0, mediaidadefeminino = 0, mediaidademasculino = 0, mediaidadeoutros = 0, mediaidadegrupo = 0;
        // Declarado 15 variaveis inteiras para entrada de valores
        float porcentagemadulto = 0, alturafeminino = 0, alturamasculino = 0, alturaoutros = 0, totalalturafeminino = 0, totalalturamasculino = 0, totalalturaoutros = 0, mediaalturafeminino = 0, mediaalturamasculino = 0, mediaalturaoutros = 0;
        // Declarado 10 variaveis em float para entrada de valores com numeros fracionados
        int i = 0;
        // Declarado 1 variavel para fazer o laco de repeticao
	   	do 
        // Inicio do ciclo do loop
        { 
            i++;
            // Acrescenta +1 variavel a cada ciclo

            System.out.print("\n\nPara a pesquisa e necessario que voce escolha as seguintes opcoes:\nNumero 0 para genero feminino\nNumero 1 para genero masculino\nNumero 2 se voce se identifica com outro genero\n");
            // Exibe a mensagem "\n\nPara a pesquisa e necessario que voce escolha as seguintes opcoes:\nNumero 0 para genero feminino\nNumero 1 para genero masculino\nNumero 2 se voce se identifica com outro genero\n" 
            // \n para fazer a quebra de linha 
            genero = ler.nextInt();     
            // Faz a leitura da variavel

            switch(genero)
            // Comando switch para o usuario realizar uma escolha
            {
            case 0:
                feminino++;
                // Acrescenta um numero na variavel feminino
                System.out.print ("Informe sua idade:\n"); 
                // Exibe a mensagem "Informe sua idade"
                idadefeminino=ler.nextInt();
                // Faz a leitura da variavel
                if (idadefeminino>=18 && idadefeminino <=35)
                // Comando if: se a variavel idadefeminino for maior igual a 18 e menor igual 35
                {
                    quantidadeadulto++;
                    // Acrescenta +1 na variavel quantidadeadulto
                }
                totalidadefeminino=totalidadefeminino+idadefeminino;
                // Atribuido totalidadefeminino + idadefeminino na variavel totalidadefeminino 
                mediaidadefeminino=totalidadefeminino/feminino;
                // Atribuido a divisao de feminino por totalidadefeminino na variavel mediaidadefeminino
                System.out.print ("Informe sua altura(m):\n");
                // Exibe a mensagem "Informe sua altura(m):" para o usuario
                alturafeminino=ler.nextFloat();
                // Realiza a leitura da variavel alturafeminino
                totalalturafeminino=totalalturafeminino+alturafeminino;
                // Atribuido a soma de totalfaturafeminino + alturafeminino na variavel totalalturafeminino
                mediaalturafeminino=totalalturafeminino/feminino;
                // Atribuido a divisao de totalalturafeminino por feminino na variavel mediaalturafeminino
                break;
                // Comando para pular para o fim do switch case
            case 1:
                masculino++;
                // Acrescenta um numero na variavel masculino
                System.out.print ("Informe sua idade:\n"); 
                // Exibe a mensagem "Informe sua idade" para o usuario
                idademasculino=ler.nextInt();
                // Realiza a leitura da variavel idademasculino
                if (idademasculino>=18 && idademasculino <=35)
                // Comando if: se a variavel idademasculino for maior igual a 18 e menor igual 35 
                {
                    quantidadeadulto++;
                    // Acrescenta um numero na variavel quantidadeadulto
                }
                totalidademasculino=totalidademasculino+idademasculino;
                // Atribuido a soma de totalidademasculino + idademasculino na variavel totalidademasculino
                mediaidademasculino=totalidademasculino/masculino;
                // Atribuido a divisao de totalidademasculino por masculino na variavel mediaidademasculino
                System.out.print ("Informe sua altura(m):\n");
                alturamasculino=ler.nextFloat();
                // Realiza a leitura da variavel alturamasculino
                totalalturamasculino=totalalturamasculino+alturamasculino;
                // Atribuido a soma de totalalturamasculino + alturamasculino na variavel totalalturamasculino
                mediaalturamasculino=totalalturamasculino/masculino;
                // Atribuido a divisao de totalalturamasculino por masculino na variavel mediaalturamasculino
                break;
                // Comando para pular para o fim do switch case
            case 2:
                outros++;
                // Acrescenta um numero na variavel outros
                System.out.print ("Informe sua idade:\n"); 
                // Exibe a mensagem "Informe sua idade" para o usuario
                idadeoutros=ler.nextInt();
                // Realiza a leitura da variavel idadeoutros
                if (idadeoutros>=18 && idadeoutros <=35)
                // Comando if: se a variavel idadeoutros for maior igual a 18 e menor igual 35 
                {
                    quantidadeadulto++;
                    // Acrescenta um numero na variavel quantidadeadulto
                }
                totalidadeoutros=totalidadeoutros+idadeoutros;
                // Atribuido a soma de totalidadeoutros + idadeoutros na variavel totalidadeoutros
                mediaidadeoutros=totalidadeoutros/outros;
                // Atribuido a divisao de totalidadeoutros por outros na variavel mediaidadeoutros
                System.out.print ("Informe sua altura(m):\n");
                // Exibe a mensagem "Informe sua altura(m)" para o usuario
                alturaoutros=ler.nextFloat();
                // Realiza a leitura da variavel alturaoutros
                totalalturaoutros=totalalturaoutros+alturaoutros;
                // Atribuido a soma de totalalturaoutros + alturaoutros na variavel totalalturaoutros
                mediaalturaoutros=totalalturaoutros/outros;
                // Atribuido a divisao de totalalturaoutros por outros para a variavel mediaalturaoutros
                break;
                // Comando para pular para o fim do switch case

            
            }	 
        } while(i<1000); 
        // Enquanto a variavel i for menor que 1000 vai realizar o loop para contagem de pessoas que fizeram a pesquisa

        porcentagemadulto=(quantidadeadulto*100)/(feminino+masculino+outros);
        // Atribuido o valor de quantidadealduto multiplicado por 100, dividido pela soma de feminino + masculino + outrosna varivael porcentagemadulto

        mediaidadegrupo = (totalidademasculino+totalidadefeminino+totalidadeoutros)/(masculino+feminino+outros);
        // Atribuido o valor da soma de totalidademasculino + totalidadefeminino + totalidadeoutros, dividido pela soma de masculino + feminino + outros
        System.out.print("\n\n\nResultado da pesquisa:\n\nMedia da idade do grupo: "+mediaidadegrupo+" anos\nMedia altura das mulheres: "+mediaalturafeminino+"m\nMedia da idade dos homens: "+mediaidademasculino+" anos\nO numero de pessoas que se identificaram como outros e: "+outros+" pessoas\nA porcentagem de pessoas entre 18 e 35 anos e de: "+porcentagemadulto+"%");
        // Exibe a mensagem ""\n\n\nResultado da pesquisa:\n\nMedia da idade do grupo: "+mediaidadegrupo+" anos\nMedia altura das mulheres: "+mediaalturafeminino+"m\nMedia da idade dos homens: "+mediaidademasculino+" anos\nO numero de pessoas que se identificaram como outros e: "+outros+" pessoas\nA porcentagem de pessoas entre 18 e 35 anos e de: "+porcentagemadulto+"%" para o usuario
        // \n para fazer a quebra de linha
        // + para concatenar os valores e exibir na tela, junto com a mensagem para o usuario
    } 
}    