import java.util.Map; 
import java.util.HashMap; 
import javax.swing.JOptionPane;
import java.io.FileWriter; 
import java.io.IOException;  
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

public class Algoritmo55 {  

    public static void main(String[] args) {  
        int opcao = 0;
        Map<String, String> dicionarioAmbientes = new HashMap<>();
        // Lê-se: Cria/Declaro uma variável chamada dicionarioAmbientes do tipo Interface Map, que associa Textos(chave) a Textos(valor), e recebe uma nova instância da classe HashMap. Cria um dicionário(vetor) e salva na variável
        // O que faz: Instancia o nosso dicionário na memória onde a chave será a sala (ex: F07) e o valor a descrição (ex: Laboratório).
        // AVALIAÇÃO: Elaborar e Explicar Map e HashMap 
        // EXPLICAÇÃO:
        // - Map (Interface): É como um "contrato" ou uma "planta de casa". Ele dita as regras dizendo que
        //   um dicionário precisa ter uma "Chave" única e um "Valor" associado a ela. Ele não faz o trabalho, só dita a regra.
        // - HashMap (Classe): É a "casa construída" usando a planta. Ele é quem realmente armazena os dados na memória.
        //   Ele usa um algoritmo de "Hash" (espalhamento) para organizar as chaves de forma que a busca seja quase instantânea.

        // Inserindo os dados iniciais solicitados no problema para testes:
        dicionarioAmbientes.put("F07", "Laboratório de Programação Java"); // Lê-se: No dicionarioAmbientes, coloque a chave "F07" associada ao valor "Laboratório de Programação Java". O que faz: Adiciona ou atualiza esse par de dados dentro do mapa.
        dicionarioAmbientes.put("B03", "Sala de aula padrão"); // O que faz: Armazena o segundo ambiente no dicionário..
        dicionarioAmbientes.put("G09", "Oficina de lanternagem e pintura"); // O que faz: Armazena o terceiro ambiente.

        // AVALIAÇÃO: Elaborar e Explicar a Organização do Código
        // EXPLICAÇÃO: O código está organizado de forma sequencial lógica. 
        // 1. Declaração de variáveis globais do escopo (Map, opcao).
        // 2. Loop principal para manter o programa rodando (Menu).
        // 3. Estrutura condicional (Switch) isolando a responsabilidade de cada funcionalidade.
        // 4. Fechamento e persistência de dados (Salvar no arquivo no final).

        String menu = "Cadastro de Ambientes\n" +
                      "1 - Cadastrar\n" +
                      "2 - Listar\n" +
                      "3 - Pesquisar\n" +
                      "4 - Excluir\n" +
                      "5 - Alterar\n" +
                      "6 - Sair e Salvar em TXT";
        do {
        // Lê-se: Faça o seguinte bloco de código... enquanto while (opcao != 6);
        // O que faz: Inicia o laço de repetição. O conteúdo aqui dentro será executado repetidamete até digitarem 6 "while", se digitar valor maior que 6 ou letra mostra um aviso

            try { // Lê-se: Tente executar este bloco... O que faz: Inicia um tratamento de erro temporário para evitar que o programa feche se o usuário digitar uma letra no menu numérico.
                String entradaUsuario = JOptionPane.showInputDialog(null, menu); 
                // Lê-se: Declara variável do tipo string chamada entradaUsuario que recebe o que o usuário digitar na caixa de diálogo do menu do JOptionPane.
        
                // Bloco da tratamento e leitura da opção do menu que o usuário digitou
                if (entradaUsuario == null) { //Se a entrada do usuário for nula (se ele clicar em Cancelar ou fechar a janela). O que faz: Verifica se o usuário quis abortar forçadamente a operação.
                    opcao = 6; // Atribui 6 à variável opcao. O que faz: Aciona/força a opção de saída do menu (6) para encerrar o programa de forma limpa.
                } else { // Senão...  Se não for nula - O que faz: Executa esse bloco caso o usuário tenha digitado um valor no meu e clicado em "OK".
                    opcao = Integer.parseInt(entradaUsuario); 
                    // A variável opcao recebe a conversão do texto digitado para um número Inteiro. 
                    // // O que faz: Transforma o texto digitado pelo usuário no menu (ex: "1") no número 1 para o switch funcionar.
                }

                switch (opcao) { // Lê-se: (Interruptor/Desvio ("Escolha"/selecione)) Avalie a variável opcao e escolha um dos casos a seguir... O que faz: Direciona o fluxo do programa dependendo do número escolhido.
                    
                    case 1: // ROTINA 1: Cadastrar chaves e valor - Caso 1 faça isso:
                        String chaveCadastro = JOptionPane.showInputDialog("Digite a chave (Ex: A01):");
                        String valorCadastro = JOptionPane.showInputDialog("Digite a descrição do ambiente:");
                        dicionarioAmbientes.put(chaveCadastro.toUpperCase(), valorCadastro);
                        JOptionPane.showMessageDialog(null, "Ambiente cadastrado com sucesso!");
                        break;

                    case 2: // ROTINA 2: LISTAR AMBIENTES (Seu estudo sobre Map.Entry) - Caso 2 faça isso: 
                        StringBuilder lista = new StringBuilder("Ambientes Cadastrados:\n\n");
                        for (Map.Entry<String, String> item : dicionarioAmbientes.entrySet()) {
                            // para cada iteração entre no dicionário e extraia com entreSet um conjunto de chave=valor e garde na variável item do tipo Entry"interface interna", com par de chave=valor ambos Strings
                            // .append() modifica o mesmo objeto na memória, sem criar textos *objetos* novos deixando lixo (Boa Prática "Performance")
                            lista.append("Chave: ").append(item.getKey())
                                .append(" | Descrição: ").append(item.getValue())
                                .append("\n");
                        }
                        // Converte para String só na hora de exibir
                        JOptionPane.showMessageDialog(null, lista.toString());   
                        break;

                    case 3:  // ROTINA 3: PESQUISAR AMBIENTE - Caso 3 faça isso:
                        String chavePesquisa = JOptionPane.showInputDialog("Digite a chave para pesquisar:"); 
                        // Lê-se: Solicita via caixa de entrada gráfica a chave a ser pesquisada e armazena o retorno. Captura o texto digitado pelo usuário. Retorna null caso o usuário clique em "Cancelar".
                        if (chavePesquisa != null) {
                        // Lê-se: Se a variável 'chavePesquisa' for diferente de null (ou seja, o usuário não cancelou)...
                        // O que faz: Protege o código contra 'NullPointerException' (erro fatal de tentar acessar memória nula).
                            chavePesquisa = chavePesquisa.toUpperCase(); // Lê-se: Atribui a 'chavePesquisa' o seu próprio valor convertido para letras maiúsculas. Garante a padronização e busca insensível a maiúsculas/minúsculas de forma eficiente
                            String resultado = dicionarioAmbientes.get(chavePesquisa); 
                            // O que faz: O método .get() busca no dicionário. Se a chave existir, devolve o valor associado; 
                            // se não existir, devolve diretamente 'null' sem lançar erro.
                            if (resultado != null) { // Lê-se: Se 'resultado' for diferente de null (a chave foi encontrada)... O que faz: Confirma que o mapeamento Chave -> Valor existe.
                                JOptionPane.showMessageDialog(null, "Encontrado:\n" + resultado);
                                // Lê-se: Exibe a janela de mensagem contendo o texto formatado com o resultado.
                            } else {
                            // Senão (se 'resultado' veio null)...
                            // O que faz: Trata o cenário de chave inexistente no Mapa.
                                JOptionPane.showMessageDialog(null, "Ambiente não encontrado."); // Lê-se: Exibe a janela informando que o ambiente não foi localizado.
                            }
                        }
                        break; // Lê-se: Pare e interrompa a execução do bloco 'switch'. O que faz: Impede que a execução continue para os casos abaixo 

                    case 4: // ROTINA 4: EXCLUIR AMBIENTE - Caso 4 faça isso:
                        String chaveExcluir = JOptionPane.showInputDialog("Digite a chave para EXCLUIR:");
                        if (chaveExcluir != null) {  // Lê-se: Se 'chaveExcluir' não for nula (usuário confirmou a entrada)... O que faz: Valida a entrada do usuário evitando execução em caso de cancelamento.
                            chaveExcluir = chaveExcluir.toUpperCase();
                            String removido = dicionarioAmbientes.remove(chaveExcluir); // Lê-se: Chama o método .remove() de 'dicionarioAmbientes' passando 'chaveExcluir' e guarda em 'removido'.  Se a chave não existia, retorna 'null'.
                            if (removido != null) {
                            // Lê-se: Se a variável 'removido' for diferente de null...
                            // O que faz: Confirma que o elemento realmente existia e foi removido da memória do Mapa.
                                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
                            } else {
                            // Lê-se: Senão (se 'removido' retornou null)...
                            // O que faz: Trata a tentativa de remoção de algo inexistente.
                                JOptionPane.showMessageDialog(null, "Chave não existe no cadastro.");
                            }
                        }
                        break;

                    case 5: // ROTINA 5: ALTERAR AMBIENTE - Caso 5 faça isso:
                        String chaveAlterar = JOptionPane.showInputDialog("Digite a chave que deseja ALTERAR:");
                        // O que faz: Captura a chave alvo da edição.
                        if (chaveAlterar != null) {// Lê-se: Se 'chaveAlterar' for diferente de null... O que faz: Garante que o usuário digitou algo e não clicou em cancelar.
                            chaveAlterar = chaveAlterar.toUpperCase(); // Lê-se: Normaliza a chave alvo para maiúsculas. Garante a correspondência exata no Mapa.
                            if (dicionarioAmbientes.containsKey(chaveAlterar)) {
                            // Lê-se: Executa .containsKey() no dicionario passando 'chaveAlterar' e checa se devolve 'true'.
                            // O que faz: Verifica se a chave já existe no cadastro ANTES de pedir o novo valor.
                                String novoValor = JOptionPane.showInputDialog("Digite a NOVA descrição:");
                                // O que faz: Coleta o novo texto de valor.
                                if (novoValor != null) { // Se 'novoValor' não for nulo... O que faz: Evita sobrescrever o cadastro existente com um valor nulo caso o usuário cancele esta etapa.
                                    dicionarioAmbientes.put(chaveAlterar, novoValor);
                                    // Lê-se: Executa o método .put() passando a chave existente e o novo valor.
                                    // O que faz: No 'Map', se a chave já existe, o método .put() SOBRESCREVE o valor antigo 
                                    // pelo novo valor (atualização). Se a chave não existisse, ele criaria uma nova entrada.
                                    JOptionPane.showMessageDialog(null, "Alterado com sucesso!"); // Lê-se: Exibe a confirmação da alteração.
                                }

                            } else { // Lê-se: Senão (se a chave não existe no dicioário, = null)... O que faz: Trata o caso de tentativa de alteração de um registro não cadastrado.
                                JOptionPane.showMessageDialog(null, "Ambiente não existe para ser alterado."); // O que faz: Informa o usuário sobre o erro de busca antes do recadastro.
                            }
                        }
                        break; // Lê-se: Encerra o 'case 5'. O que faz: Sai do bloco do 'switch'. Conclui a opção do menu e permite ao fluxo chegar à checagem do 'do-while'.


                    case 6: // ROTINA 6: SAIR - Caso 6 faça isso: Define a condição de parada do sistema.
                        JOptionPane.showMessageDialog(null, "Encerrando o sistema e salvando o arquivo...");
                        break; // Sai do 'switch'. O que faz: Conclui a opção do menu e permite ao fluxo chegar à checagem do 'do-while'.

                    default:  // ROTINA PADRÃO (OPÇÃO INVÁLIDA) - Em qualquer outro caso não mapeado pelos números anteriores de 1 a 6, faça isso:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");

                } // Fechamento do bloco do'switch'

            } catch (NumberFormatException e) { // TRATAMENTO DE EXCEÇÃO NUMÉRICA
            // Lê-se: Capture 'NumberFormatException' e armazene os detalhes do erro na variável 'e'.
            // O que faz: Intercepta a falha que ocorre se 'Integer.parseInt()' tentar converter uma String com letras 
            // ou vazia ("abc", "", "1a") em um inteiro. Impede que a aplicação aborte abruptamente (crash).

                JOptionPane.showMessageDialog(null, "Por favor, digite apenas números válidos do menu.");
                // Lê-se: Alerta o usuário sobre a necessidade de informar apenas caracteres numéricos.
                // O que faz: Oferece uma mensagem amigável e permite que a repetição do menu continue sem travar o sistema.
            }

        } while (opcao != 6);  // CONDIÇÃO DE PARADA DO LAÇO DO-WHILE
        // Lê-se: Repita todo o bloco acima ENQUANTO a variável 'opcao' for diferente (!=) do inteiro 6.
        // O que faz: Finaliza o laço "do-while". Se a opção for 6, ele sai do laço e vai para a linha de baixo. Garante que o menu reapareça continuamente após a execução de cada operação. 
        // Quando 'opcao' for igual a 6, a expressão resulta em 'false', quebrando o laço e avançando a execução.


        // -------------------------------------------------------------------------
        // AVALIAÇÃO: Elaborar e Explicar LocalDateTime (Ter) e DateTimeFormatter (Ter)
        // EXPLICAÇÃO: 
        // - LocalDateTime é a classe que tira uma "fotografia" do instante exato em que o 
        //   código passa por essa linha (Data e Hora do sistema).
        // - DateTimeFormatter é a máscara que aplicamos para não sair algo feio como "2026-10-01T09:59:14",
        //   mas sim um formato humano e legível como "01/10/2026 09:59:14".
        // -------------------------------------------------------------------------

        LocalDateTime dataHoraAtual = LocalDateTime.now(); 
        // Lê-se: Cria um objeto do tipo Tempo e Data Local chamado dataHoraAtual que recebe o exato Agora do sistema.
        // O que faz: Captura o relógio e calendário do computador do usuário neste milissegundo, A classe 'LocalDateTime' cria um objeto imutável que representa um ponto no tempo sem fuso horário.
        // O método '.now()' obtém a data e a hora exatas do sistema operacional no milissegundo em que a linha é executada.
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        // Lê-se: Declara uma variável 'formatador' do tipo 'DateTimeFormatter' e instancia um objeto via método '.ofPattern(...)'.
        // O que faz: Define a regra visual de como a data será transformada em texto no documento.
        // Significados: 'dd' = dia em 2 dígitos, 'MM' = mês em 2 dígitos (maiúsculo para não confundir com minuto), 
        // 'yyyy' = ano com 4 dígitos, 'HH' = hora em formato 24h (00-23), 'mm' = minutos, 'ss' = segundos.
        String dataHoraFormatada = dataHoraAtual.format(formatador);
        // Lê-se: Cria um texto chamado dataHoraFormatada que recebe a dataHoraAtual processada pelo formatador.
        // O que faz: Converte aquele objeto complexo de data em uma String bonita pronta para gravar no TXT.


        // -------------------------------------------------------------------------
        // AVALIAÇÃO: Elaborar e Explicar FileWriter (Ter) e um Try Catch Finally (Seg)
        // EXPLICAÇÃO:
        // - FileWriter: É uma ponte/encanamento que o Java abre até o seu disco rígido (HD/SSD) para despejar texto.
        // - Try: "Tente fazer isso". Usado porque mexer com arquivo é perigoso (o disco pode estar cheio, sem permissão, etc).
        // - Catch: "Pegue o erro". Se a ponte quebrar no bloco 'Try', o programa pula pra cá em vez de travar bruscamente.
        // - Finally: "Finalmente, faça isso sempre". Independentemente de dar erro ou dar certo, este bloco sempre roda no fim.
        //   É vital usá-lo para FECHAR o arquivo (senão ele fica corrompido ou preso na memória).
        // -------------------------------------------------------------------------

        FileWriter escritor = null;
        // Lê-se: Declara a variável de escrita em arquivo chamada escritor começando vazia (nula).
        // O que faz: Prepara o terreno fora do 'try' para que o 'finally' consiga enxergar a variável depois.

        try {
        // Lê-se: Tente executar o bloco abaixo sabendo que pode dar um erro perigoso de IO (Input/Output).
        
            escritor = new FileWriter("dicionario_ambientes.txt");
            // Lê-se: O objeto 'escritor' recebe uma nova instância de Escritor de Arquivo com o nome "dicionario_ambientes.txt".
            // O que faz: Cria o arquivo no computador ou abre um existente para sobrescrever.
            
            escritor.write("--- Relatório de Dicionário de Ambientes ---\n");
            // Lê-se: O escritor escreve (write) o texto de cabeçalho no arquivo, com quebra de linha.
            // O que faz: Despeja texto para dentro do TXT.
            
            escritor.write("Data da exportação: " + dataHoraFormatada + "\n\n");
            // Lê-se: O escritor escreve a linha de data, somando o texto com a nossa data formatada anteriormente.
            
            for (Map.Entry<String, String> item : dicionarioAmbientes.entrySet()) {
            // Lê-se: Para cada entrada (item) no dicionário de ambientes...
            // O que faz: Repete o processo de ir linha a linha do dicionário para salvar no arquivo.
                escritor.write("Chave: " + item.getKey() + " -> " + item.getValue() + "\n");
                // Lê-se: Escreve no arquivo o texto "Chave: " concatenado com o valor real da chave e da descrição do loop atual.
            }
            
            JOptionPane.showMessageDialog(null, "Arquivo TXT gerado com sucesso!");
            // Lê-se: Mostra caixa de mensagem avisando que tudo deu certo.
            
        } catch (IOException e) {
        // Lê-se: Caso dê o erro de Entrada/Saída, pegue-o na variável 'e'.
        // O que faz: Se acabar o espaço no disco, ou der erro de permissão do Windows/Linux, o programa cai aqui.
            JOptionPane.showMessageDialog(null, "Erro crítico ao gravar o arquivo: " + e.getMessage());
            // Lê-se: Avisa na tela qual foi exatamente o erro, pegando a mensagem gerada internamente pelo Java (e.getMessage).
            
        } finally {
        // Lê-se: Finalmente (deu certo ou deu erro no Try/Catch), execute obrigatoriamente esse bloco a seguir.
        // O que faz: Garante que os recursos de sistema (uso da memória e do disco do PC) sejam liberados.
        
            try {
            // Lê-se: Tente executar esse fechamento. (Fechar arquivo também pode dar erro no Java, precisa de try/catch).
                if (escritor != null) {
                // Lê-se: Se o escritor não estiver vazio (se ele realmente foi aberto lá em cima)...
                    escritor.close();
                    // Lê-se: Feche (close) o escritor de arquivos.
                    // O que faz: Desliga a conexão (ponte) do Java com o disco rígido, salvando definitivamente o .txt.
                }
            } catch (IOException e) {
            // Lê-se: Pegue o erro de Entrada/Saída caso dê pane exatamente na hora de fechar.
                System.out.println("Erro ao tentar fechar o arquivo.");
                // Lê-se: Imprime no terminal de controle um aviso de falha.
            }
        }
        
    
    } //Fim do método main.

}// Fim da classe Algoritmo55.
 