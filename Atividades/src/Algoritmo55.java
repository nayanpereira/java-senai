
     /* Desáfio
     Considerando a aula de lógica aristotélica e os programas de fluxograma e pseudocódigo a saber:

     visualgo.net/en
     csvistool.com
     geeksforgeeks.org
     FAQ do professor nesse repositório: faq_logica.pdf

     crie um arquivo que possa armazenar valores de um dicionário
     Map(Interface) - HashMap(Classe)
     Ambiente - Lavoratório de programação java
     chave: F07
     chave: F07 Descrição " Laboratório de Programção Java"
     chave: B03 Descrição: "Saula de aula padrão"
     chave: G09 Descrição: "Oficina de lanternagem e pintura"

     Problema: criar um cadastro de um dicionário de ambientes
     esse cadastro deverá armazenar em um arquivo .txt
     Deverá ter um loop (do while ) com um menu de opções.
     //cadastrar
     //listar
     //pesquisar
     //excluir
     //alterar
     //sair
   

    
       Avaliação de Capacidades
       (cada item: 3,10 pontos)
       - Elaborar e Explicar um Try Catch Finally (Seg)
       - Uso de JOptionPane ou JFrame ou outros SWING
       - Elaborar e Explicar DateTimeFormatter (Ter)
       - Elaborar e Explicar LocalDateTime (Ter)
       - Elaborar e Explicar FileWriter (Ter)
       - Elaborar e Explicar HashMap (Qua)
       - Elaborar e Explicar Map (Qua)
       - Elaborar e Explicar a Organização do Código (Qui)
     
     
     */
import java.util.Map; //Lê-se: Importa a interface Map do pacote java.util. O que faz: Traz a interface (contrato) que define a estrutura de dados de chave e valor.
import java.util.HashMap; // Importa a classe HashMap do pacote java.util. O que faz: Traz a classe concreta que implementa o Map usando uma tabela de espalhamento (hash) para buscas rápidas.
import javax.swing.JOptionPane; // Importa a classe JOptionPane do pacote javax.swing. O que faz: Permite criar janelas gráficas (caixas de diálogo) para interagir com o usuário (entrada e saída). Avaliação: Uso de JOptionPane ou JFrame ou outros SWING - Aplicado para toda a interface com o usuário.
import java.io.FileWriter; // Importa a classe FileWriter do pacote java.io. O que faz: Traz a ferramenta necessária para escrever dados em um arquivo de texto.
import java.io.IOException; // Importa a classe de exceção IOException do pacote java.io. O que faz: Traz a classe que representa um erro de entrada/saída (como erro ao salvar um arquivo).
import java.time.LocalDateTime; // Importa a classe LocalDateTime do pacote java.time. O que faz: Permite capturar e manipular a data e a hora exatas do sistema (sem fuso horário).
import java.time.format.DateTimeFormatter; //  Importa a classe DateTimeFormatter do pacote java.time.format. O que faz: Permite criar um formato específico (um molde) para exibir a data e a hora como texto.

public class Algoritmo55 { // Declaração pública da classe chamada Algoritmo55. O que faz: Inicia o bloco principal do programa Java, que é a classe exigida no exercício.

    public static void main(String[] args) { // Método público, estático, sem retorno, chamado principal (main), que recebe um vetor de textos chamado argumentos (args).
    //  É o ponto de partida do programa. O Java procura esse método para começar a executar tudo.
        int opcao = 0;
        // Lê-se: Declara uma variável inteira chamada opcao e a inicializa com o valor zero. O que faz: Cria a variável que vai armazenar a escolha do usuário no menu.

        // AVALIAÇÃO: Elaborar e Explicar Map e HashMap 
        // EXPLICAÇÃO:
        // - Map (Interface): É como um "contrato" ou uma "planta de casa". Ele dita as regras dizendo que
        //   um dicionário precisa ter uma "Chave" única e um "Valor" associado a ela. Ele não faz o trabalho, só dita a regra.
        // - HashMap (Classe): É a "casa construída" usando a planta. Ele é quem realmente armazena os dados na memória.
        //   Ele usa um algoritmo de "Hash" (espalhamento) para organizar as chaves de forma que a busca seja quase instantânea.
        // -------------------------------------------------------------------------
        
        Map<String, String> dicionarioAmbientes = new HashMap<>();
        // Lê-se: Cria uma variável chamada dicionarioAmbientes do tipo Interface Map, que associa Textos(chave) a Textos(valor), e recebe uma nova instância da classe HashMap.
        // O que faz: Instancia o nosso dicionário na memória onde a chave será a sala (ex: F07) e o valor a descrição (ex: Laboratório).

        // Inserindo os dados iniciais solicitados no problema para testes:
        dicionarioAmbientes.put("F07", "Laboratório de Programação Java");
        // Lê-se: No dicionarioAmbientes, coloque a chave "F07" associada ao valor "Laboratório de Programação Java".
        // O que faz: Adiciona ou atualiza esse par de dados dentro do mapa.
        
        dicionarioAmbientes.put("B03", "Sala de aula padrão");
        // Lê-se: No dicionarioAmbientes, coloque a chave "B03" associada ao valor "Sala de aula padrão".
        // O que faz: Armazena o segundo ambiente no dicionário.
        
        dicionarioAmbientes.put("G09", "Oficina de lanternagem e pintura");
        // Lê-se: No dicionarioAmbientes, coloque a chave "G09" associada ao valor "Oficina de lanternagem e pintura".
        // O que faz: Armazena o terceiro ambiente.

        // AVALIAÇÃO: Elaborar e Explicar a Organização do Código
        // EXPLICAÇÃO: O código está organizado de forma sequencial lógica (Top-Down). 
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
        // Lê-se: Cria/declara um variável do tipo string chamada"texto" chamado menu que recebe as opções numeradas separadas por quebra de linha (\n).
        // O que faz: Prepara os textos do menu que aparecerá na tela do usuário.

        do {
        // Lê-se: Faça o seguinte bloco de código...
        // O que faz: Inicia o laço de repetição. O conteúdo aqui dentro será executado pelo menos uma vez.

            try {
            // Lê-se: Tente executar este bloco... O que faz: Inicia um tratamento de erro temporário para evitar que o programa feche se o usuário digitar uma letra no menu numérico.
                
                String entradaUsuario = JOptionPane.showInputDialog(null, menu);
                // Lê-se: Declara variável do tipo string chamada entradaUsuario que recebe o que o usuário digitar na caixa de diálogo do menu do JOptionPane.
                // O que faz: Cria o menu visual do SWING na tela com os textos da variável menu e captura a resposta, salvando a resposta na variável entradaUsuário.
                
                // Bloco da tratamento e leitura da opção do menu que o usuário digitou
                if (entradaUsuario == null) {
                // Lê-se: Se a entrada do usuário for nula (se ele clicar em Cancelar ou fechar a janela). O que faz: Verifica se o usuário quis abortar forçadamente a operação.
                    opcao = 6; // Lê-se: Atribui 6 à variável opcao. O que faz: Aciona/força a opção de saída do menu (6) para encerrar o programa de forma limpa.
                } else { // Lê-se: Senão...  Se não for nula - O que faz: Executa esse bloco caso o usuário tenha digitado um valor no meu e clicado em "OK".
                    opcao = Integer.parseInt(entradaUsuario); // Lê-se: A variável opcao recebe a conversão do texto digitado para um número Inteiro. // O que faz: Transforma o texto digitado pelo usuário no menu (ex: "1") no número 1 para o switch funcionar.
                }

                switch (opcao) { // Lê-se: (Interruptor/Desvio) Avalie a variável opcao e escolha um dos casos a seguir... O que faz: Direciona o fluxo do programa dependendo do número escolhido.

                    case 1:
                    // Lê-se: Caso a opção seja 1... O que faz: Entra na rotina de "Cadastrar".
                        String chaveCadastro = JOptionPane.showInputDialog("Digite a chave (Ex: A01):");
                        // Lê-se: Cria chaveCadastro recebendo a digitação da caixa de diálogo.
                        String valorCadastro = JOptionPane.showInputDialog("Digite a descrição do ambiente:");
                        // Lê-se: Cria valorCadastro recebendo a descrição da caixa de diálogo.
                        dicionarioAmbientes.put(chaveCadastro.toUpperCase(), valorCadastro);
                        // Lê-se: Insere no dicionário a chave (convertida para maiúscula) e a descrição.
                        JOptionPane.showMessageDialog(null, "Ambiente cadastrado com sucesso!");
                        // Lê-se: Mostra uma mensagem de sucesso na tela.
                        break;
                        // Lê-se: Pare e saia do switch.

                    case 2:
                    // Lê-se: Caso a opção seja 2...
                    // O que faz: Entra na rotina de "Listar".
                        String lista = "Ambientes Cadastrados:\n\n";
                        // Lê-se: Cria um texto base para acumular os resultados.
                        for (Map.Entry<String, String> item : dicionarioAmbientes.entrySet()) {
                        // Lê-se: Para cada 'item' (conjunto Chave-Valor) dentro da lista de entradas do dicionário...
                        // O que faz: Faz um loop passando por todos os registros do HashMap.
                            lista += "Chave: " + item.getKey() + " | Descrição: " + item.getValue() + "\n";
                            // Lê-se: Adiciona ao texto da 'lista' a chave atual e o valor atual.
                        }
                        JOptionPane.showMessageDialog(null, lista);
                        // Lê-se: Mostra a lista completa de ambientes na tela.
                        break;
                        // Lê-se: Pare e saia do switch.

                    case 3:
                    // Lê-se: Caso a opção seja 3...
                    // O que faz: Entra na rotina de "Pesquisar".
                        String chavePesquisa = JOptionPane.showInputDialog("Digite a chave para pesquisar:");
                        // Lê-se: Pede ao usuário qual chave procurar.
                        if (dicionarioAmbientes.containsKey(chavePesquisa.toUpperCase())) {
                        // Lê-se: Se o dicionário contém a chave digitada (convertida para maiúscula)...
                            String resultado = dicionarioAmbientes.get(chavePesquisa.toUpperCase());
                            // Lê-se: Busca e guarda em 'resultado' o valor associado a essa chave.
                            JOptionPane.showMessageDialog(null, "Encontrado:\n" + resultado);
                            // Lê-se: Mostra o valor na tela.
                        } else {
                        // Lê-se: Senão...
                            JOptionPane.showMessageDialog(null, "Ambiente não encontrado.");
                            // Lê-se: Avisa que não achou.
                        }
                        break;
                        // Lê-se: Pare e saia do switch.

                    case 4:
                    // Lê-se: Caso a opção seja 4...
                    // O que faz: Entra na rotina de "Excluir".
                        String chaveExcluir = JOptionPane.showInputDialog("Digite a chave para EXCLUIR:");
                        // Lê-se: Pede a chave para deletar.
                        if (dicionarioAmbientes.containsKey(chaveExcluir.toUpperCase())) {
                        // Lê-se: Se a chave existir no mapa...
                            dicionarioAmbientes.remove(chaveExcluir.toUpperCase());
                            // Lê-se: Remove do dicionário a entrada referente àquela chave.
                            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
                            // Lê-se: Confirma a exclusão visualmente.
                        } else {
                        // Lê-se: Senão...
                            JOptionPane.showMessageDialog(null, "Chave não existe no cadastro.");
                            // Lê-se: Informa que nada foi excluído.
                        }
                        break;
                        // Lê-se: Pare e saia do switch.

                    case 5:
                    // Lê-se: Caso a opção seja 5...
                    // O que faz: Entra na rotina de "Alterar".
                        String chaveAlterar = JOptionPane.showInputDialog("Digite a chave que deseja ALTERAR:");
                        // Lê-se: Solicita a chave alvo da alteração.
                        if (dicionarioAmbientes.containsKey(chaveAlterar.toUpperCase())) {
                        // Lê-se: Se o mapa possui essa chave...
                            String novoValor = JOptionPane.showInputDialog("Digite a NOVA descrição:");
                            // Lê-se: Pede o novo texto descritivo.
                            dicionarioAmbientes.put(chaveAlterar.toUpperCase(), novoValor);
                            // Lê-se: Substitui o valor antigo pelo novo na mesma chave usando o 'put'.
                            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                            // Lê-se: Confirma a alteração.
                        } else {
                        // Lê-se: Senão...
                            JOptionPane.showMessageDialog(null, "Ambiente não existe para ser alterado.");
                            // Lê-se: Avisa do erro.
                        }
                        break;
                        // Lê-se: Pare e saia do switch.

                    case 6:
                    // Lê-se: Caso a opção seja 6...
                    // O que faz: Opção de Sair e gerar o arquivo de texto.
                        JOptionPane.showMessageDialog(null, "Encerrando o sistema e salvando o arquivo...");
                        // Lê-se: Avisa que está finalizando.
                        break;
                        // Lê-se: Pare e saia do switch.

                    default:
                    // Lê-se: Caso contrário (se não for nenhum dos números acima)...
                    // O que faz: Trata entradas de números não listados no menu (ex: 9).
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                        // Lê-se: Exibe um erro de opção inválida.
                }

            } catch (NumberFormatException e) {
            // Lê-se: Pegue a exceção de Formato de Número (caso a pessoa digite uma letra em vez de número).
            // O que faz: Impede que o programa exploda (crash) quando o `Integer.parseInt` falhar.
                JOptionPane.showMessageDialog(null, "Por favor, digite apenas números válidos do menu.");
                // Lê-se: Alerta o usuário do erro de digitação.
            }

        } while (opcao != 6);
        // Lê-se: ...enquanto a opção for diferente de 6.
        // O que faz: Finaliza o laço "do-while". Se a opção for 6, ele sai do laço e vai para a linha de baixo.


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
        // O que faz: Captura o relógio e calendário do computador do usuário neste milissegundo.

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        // Lê-se: Cria um objeto Formatador de Tempo e Data com o padrão Dia/Mês/Ano Hora:Minuto:Segundo.
        // O que faz: Define a regra visual de como a data será transformada em texto no documento.

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
            // Lê-se: Para cada entrada (item) no mapa de ambientes...
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
        
    // Lê-se: Fim do método main.
    }

// Lê-se: Fim da classe Algoritmo55.
}
    
