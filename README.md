# Jogo de Tabuleiro em Java

## Descrição

Este é um jogo de tabuleiro em Java, projetado para ser executado no terminal. O objetivo do jogo é competir com outros jogadores para chegar à última casa do tabuleiro. Cada jogador pode ser de um tipo diferente com características específicas: Azarado, Sortudo ou Normal. Além disso, o jogo implementa padrões de design como Singleton, Factory e Decorator.

## Funcionalidades

- **Tipos de Jogadores**: Azarado, Sortudo e Normal.
- **Tabuleiro**: 40 casas com diferentes tipos de casas, como CasaPrisao, CasaSurpresa, CasaSorte, CasaTroca, etc.
- **Jogabilidade**: Rolagem de dados com diferentes regras dependendo do tipo de jogador.
- **Decorações**: Jogadores podem adquirir itens de avatar como Boné, Moletom e Óculos Escuros.
- **Modo Debug**: Permite definir a posição do jogador manualmente.

## Requisitos

- Java 11 ou superior

## Compilação

Para compilar o projeto, siga os passos abaixo:

1. **Clone o Repositório**

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio

## Configuração do Ambiente

Para configurar o ambiente necessário para executar o projeto, siga os passos abaixo:

1. **Instale o Java Development Kit (JDK)**

   O projeto é desenvolvido em Java, portanto, você precisa ter o **Java Development Kit (JDK)** instalado no seu sistema. O JDK inclui o compilador Java (`javac`) e a Máquina Virtual Java (`java`), que são necessários para compilar e executar o código.

   - **Verifique se o JDK está instalado:**

     Abra um terminal e execute o seguinte comando para verificar se o JDK está instalado e qual versão está em uso:

     ```bash
     java -version
     ```

     Se o JDK estiver instalado corretamente, você verá uma saída semelhante a esta:

     ```
     java version "1.8.0_251"
     Java(TM) SE Runtime Environment (build 1.8.0_251-b08)
     Java HotSpot(TM) 64-Bit Server VM (build 25.251-b08, mixed mode)
     ```

   - **Instale o JDK se necessário:**

     Se o JDK não estiver instalado, você pode baixá-lo e instalá-lo a partir do [site oficial do Oracle](https://www.oracle.com/java/technologies/javase-downloads.html). Escolha a versão do JDK adequada para o seu sistema operacional e siga as instruções de instalação.

     Alternativamente, você pode usar um gerenciador de pacotes para instalar o JDK. Por exemplo:

     - **Para sistemas baseados em Debian/Ubuntu:**

       ```bash
       sudo apt update
       sudo apt install openjdk-11-jdk
       ```

     - **Para sistemas baseados em Red Hat/CentOS:**

       ```bash
       sudo yum install java-11-openjdk-devel
       ```

     - **Para macOS (usando Homebrew):**

       ```bash
       brew install openjdk@11
       ```

2. **Configure a Variável de Ambiente JAVA_HOME**

   É recomendável configurar a variável de ambiente `JAVA_HOME` para apontar para o diretório onde o JDK está instalado. Isso ajuda em alguns processos de build e ferramentas que dependem dessa configuração.

   - **Para sistemas baseados em Unix (Linux/macOS):**

     Adicione a seguinte linha ao final do arquivo `~/.bashrc`, `~/.bash_profile`, ou `~/.zshrc`, dependendo do shell que você usa:

     ```bash
     export JAVA_HOME=/caminho/para/jdk
     export PATH=$JAVA_HOME/bin:$PATH
     ```

     Substitua `/caminho/para/jdk` pelo caminho real onde o JDK está instalado.

     Após adicionar a linha, recarregue o perfil do shell com o comando:

     ```bash
     source ~/.bashrc  # ou ~/.bash_profile ou ~/.zshrc
     ```

   - **Para Windows:**

     1. Abra o Painel de Controle e vá para **Sistema e Segurança** > **Sistema** > **Configurações Avançadas do Sistema**.
     2. Clique em **Variáveis de Ambiente**.
     3. Em **Variáveis do sistema**, clique em **Novo** e adicione uma nova variável com o nome `JAVA_HOME` e o valor definido como o caminho para o diretório do JDK (por exemplo, `C:\Program Files\Java\jdk-11`).
     4. Encontre a variável `Path` na lista de variáveis do sistema, selecione-a e clique em **Editar**. Adicione `%JAVA_HOME%\bin` ao final da lista.
     5. Clique em **OK** para salvar as configurações e fechar todas as janelas.

3. **Instale um Editor de Código**

   Você pode usar qualquer editor de código de sua escolha para editar o código-fonte Java. Alguns editores populares incluem:

   - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
   - [Eclipse IDE](https://www.eclipse.org/)
   - [Visual Studio Code](https://code.visualstudio.com/)

   Certifique-se de que o editor de código que você escolher está configurado para trabalhar com projetos Java e suporte a recursos como destaque de sintaxe, refatoração e depuração.

4. **Verifique a Configuração**

   Após configurar o JDK e o `JAVA_HOME`, execute o seguinte comando para garantir que tudo esteja configurado corretamente:

   ```bash
   javac -version

## Como Jogar

### Configuração Inicial

1. **Número de Jogadores:**
   - O jogo solicitará o número de jogadores, que deve ser entre 2 e 6.

2. **Escolha de Cor e Tipo de Jogador:**
   - Cada jogador escolherá uma cor.
   - O tipo de jogador (Azarado, Sortudo ou Normal) será atribuído aleatoriamente.

### Jogabilidade

1. **Rodadas:**
   - Em cada rodada, o jogador pode optar por:
     - **Jogar os Dados:** O resultado dos dados será somado à posição atual do jogador.
     - **Modo Debug:** Definir a posição manualmente.

2. **Tipo de Jogador:**
   - Dependendo do tipo de jogador, o resultado dos dados será aceito ou rejeitado com base nas regras específicas do tipo.

### Interação com o Tabuleiro

1. **Movimento pelo Tabuleiro:**
   - O jogador se moverá pelo tabuleiro e encontrará diferentes tipos de casas que aplicarão regras específicas, como:
     - **CasaTroca:** Permite trocar moedas por itens de avatar.
     - **CasaSorte:** Oferece uma vantagem ao jogador.

### Itens de Avatar

1. **Na CasaTroca:**
   - O jogador pode usar suas moedas para adquirir itens de avatar, como:
     - **Boné** (1 moeda)
     - **Moletom** (2 moedas)
     - **Óculos Escuros** (3 moedas)

### Objetivo

1. **Vencer o Jogo:**
   - O objetivo é ser o primeiro a chegar à última casa do tabuleiro.

## Estrutura do Projeto

- **`src/`**: Código-fonte Java.
- **`Players/`**: Pacote contendo as classes de jogadores e seus tipos.
- **`Casas/`**: Pacote contendo as diferentes casas no tabuleiro e suas regras.
- **`Utils/`**: Pacote contendo utilitários como a classe Tabuleiro e a lógica do jogo.
- **`JogadorDecorator/`**: Pacote contendo a implementação do padrão Decorator para itens de avatar.
- **`Main.java`**: Ponto de entrada do jogo.

## Contribuindo

Se você deseja contribuir para o projeto, por favor, siga as diretrizes abaixo:

1. **Faça um Fork do Repositório:**
   - Clique em "Fork" no canto superior direito do repositório no GitHub.

2. **Crie uma Nova Branch para sua Alteração:**
   - Execute o comando:
     ```bash
     git checkout -b minha-alteracao
     ```

3. **Faça suas Alterações e Commit:**
   - Adicione suas alterações e faça commit:
     ```bash
     git commit -am 'Adiciona nova funcionalidade'
     ```

4. **Envie sua Branch para o Repositório Remoto:**
   - Execute o comando:
     ```bash
     git push origin minha-alteracao
     ```

5. **Crie um Pull Request:**
   - Vá para a página do repositório no GitHub e clique em "Compare & pull request".

## Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

Se você tiver alguma dúvida ou sugestão, entre em contato com [kellylarissa35@gmail.com](mailto:kellylarissa35@gmail.com).
