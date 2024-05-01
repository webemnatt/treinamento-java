import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Classe ContaTerminal é responsável por receber dados via Scanner e exibir os
 * mesmos em forma de frase.
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 01/05/24
 */
public class ContaTerminal {
    /**
     * atributo <strong>agencia</strong> recebe como String o número da agência;
     * pode ser informado dígito verificador.
     */
    private String agencia;
    /**
     * atributo <strong>numero</strong> recebe como int um número de conta.
     */
    private int numero;
    /**
     * atributo <strong>nomeCliente</strong> recebe como String o nome completo do
     * cliente.
     */
    private String nomeCliente;
    /**
     * atributo <strong>saldo</strong> recebe como double o saldo disponível na
     * conta do cliente.
     */
    private double saldo;
    /**
     * Atributo <strong>scanner</strong> instancia um objeto do tipo Scanner
     */
    private Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    /**
     * O método <strong>preencherDadosCliente</strong> exibe as boas-vindas e
     * orienta o preenchimento dos dados de um cliente.
     * Para cada dado há instrução do que e como preencher.
     * <br>
     * <br>
     * A entrada de cada dado é feito fazendo uso da classe <strong>Scanner</strong>
     * do java.util
     * Por fim, exibe os dados coletados como uma frase de saudação ao cliente
     * fazendo uso do método concat() da classe String.
     */
    public void preencherDadosCliente() {
        System.out.println("-------------Bem-vindo ao Banco Dev!-------------");
        System.out.println();
        System.out.println("Por favor, informe os dados a seguir");
        System.out.println();

        System.out.print("Número da agência:\t");
        agencia = scanner.next();

        informarNumero();
        scanner.nextLine();

        System.out.print("Nome do cliente:\t");
        nomeCliente = scanner.nextLine();

        informarSaldo();

        scanner.close();
        System.out.println();

        System.out.println("Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia)
                .concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo de ")
                .concat(formatarValorParaMoedaLocal(saldo)).concat(" já está disponível para saque."));
    }

    /**
     * Método privado <strong>informarSaldo</strong> faz uma validação do valor de entrada
     * via Scanner para que somente valor do tipo <strong>double</strong> seja
     * informado como saldo, não permitindo seguir com o preenchimento enquanto o
     * formato
     * correto não for recebido.
     */
    private void informarSaldo() {
        while (true) {
            System.out.print("Saldo:\t");
            if (scanner.hasNextDouble()) {
                saldo = scanner.nextDouble();
                break;
            } else {
                System.out.println("Saldo inválido. Digite o saldo usando ponto como separador de centavos");
                scanner.nextLine();
            }
        }
    }

    /**
     * Método privado <strong>informarNumero</strong> faz uma validação do valor de entrada
     * via Scanner para que somente valor do tipo <strong>int</strong> seja
     * informado como número de conta, não permitindo seguir com o preenchimento
     * enquanto o formato correto não for recebido.
     */
    private void informarNumero() {
        while (true) {
            System.out.print("Número da conta:\t");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                break;
            } else {
                System.out.println("Por favor, informe número de conta válido");
                scanner.nextLine();
            }
            scanner.next();
        }
    }

    /**
     * Método privado <strong>moedaLocal</strong> formata a exibição do saldo na mensagem de
     * boas-vindas ao cliente.
     * 
     * @param value recebe o valor do saldo do tipo double
     * @return uma string no formato da moeda local, com notação da moeda, separador
     *         de milhares e de centavos.
     */
    public String formatarValorParaMoedaLocal(double value) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String productFormat = currency.format(value);
        return productFormat;
    }

    /**
     * Método principal de execução do programa. 
     * @param args recebe uma array de Strings
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        ContaTerminal ct = new ContaTerminal();
        ct.preencherDadosCliente();
    }
}
