## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Compilar/recompilar fora deste projeto via IDE

1. Navegue via terminal até onde se encontra o arquivo *.java* (dentro da pasta src)
2. Dê o comando `javac -d ../bin *.java` para (re)compilar o arquivo de extensão *.class*
3. Saia desta pasta e navegue até a pasta bin `cd ../bin`.
4. Dentro da pasta *bin* dê o comando `java NomeDoArquivo` sem nenhuma extensão.
5. A saída será exibido no terminal

Para arquivos que se encontram em subpastas de *src*, como `com/Empresa/app`
1. Navegue via terminal até onde se encontra o arquivo *.java* (dentro da pasta src)
2. Dê o comando `javac -d ../../../../bin *.java` para (re)compilar o arquivo de extensão *.class*
3. Saia desta pasta e navegue até a pasta bin `cd ../bin`.
Neste caso, para executar o arquivo *.class* que se encontra dentro do subdiretório, 
4. permaneça dentro da pasta *bin*
5. digite: `java com.Empresa.App.EstaClasse`
6. A saída será exibida no terminal.

## Informando dados via comando java

A classe AboutMe.java faz uso do parâmetro *args* para receber argumentos de fora, na interação com o usuário com o arquivo de extensão *.class*

Há duas maneiras de injetar os dados:
* via linha de comando
* passando os dados no *launch.json*

Observe que o arquivo **AboutMe.java** está recebendo os argumentos dentro de cada atributo dentro da classe main(). Há um `if-else`envolvendo o código para o caso de a classe ser executada sem argumentos. A saída é uma impressão no terminal com os dados posicionados para formar uma frase de apresentação.

### via linha de comando do terminal

1. Navegue até a pasta *bin* do projeto
2. Digite: `java edu.meu.semana02.AboutMe`
  2.1 Veja que a mensagem provém do bloco `else` do código porque não foram passados os argumentos.
3. Desta vez, digite: `java edu.meu.semana02.AboutMe Clara Lucia 45 1.63`
4. Veja a saída no terminal.

### via arquivo *launch.json*
1. Abra o arquivo **AboutMe.java** através do caminho *Executar>Adicionar configuração*
2. Em *configurations* procure pelo nome do arquivo
3. Já estará preenchido com exemplo de dados em **args**, todos passados como String.
4. Clique em *Run* e veja a saída do terminal.

**Obs.:** Sem essa configuração, ao executar o arquivo, a saída seria sempre a do bloco *else* do código.

## Informando dados vias *java.util.Scanner*
A classe java Scanner permite organizar melhor a saída e a entrada de dados, orientando o usuário sobre qual dado informar.

Desta vez a classe **AboutAnyone** pede os dados um por um ao usuário.
* Funciona tanto executando o arquivo de extensão *.java* 
* quanto pela linha de comando na pasta *bin*
  * Digitando apenas `java AboutAnyone`

**Obs.:** Não foi alterado o arquivo *launch.json* porque não há manipulação do parâmetro `args` do método `main()`.

