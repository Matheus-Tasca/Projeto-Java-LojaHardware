import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    protected static Scanner escolha = new Scanner(System.in);
    protected static Scanner scannerNome = new Scanner(System.in);
    protected static Scanner scannerIdade = new Scanner(System.in);
    protected static Scanner scannerEndereco = new Scanner(System.in);
    protected static Scanner scannerTelefone = new Scanner(System.in);
    protected static Scanner scannerPessoaFisica = new Scanner(System.in);
    protected static Scanner scannerCPF = new Scanner(System.in);
    protected static Scanner scannerCNPJ = new Scanner(System.in);
    protected static String escolhaPessoaFisica = "";
    protected static String escolhaPessoaFisicaMaiuscula;
    protected static Scanner scannerEscolhaExcluirCliente = new Scanner(System.in);
    protected static String escolhaExcluirCliente;
    protected static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    protected static ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();


    public static void main(String[] args) {
        Scanner escolhaMenuPrincipal = new Scanner(System.in);
        int opcaoMenuPrincipal;
        do {
            exibirMenu();
            opcaoMenuPrincipal = escolhaMenuPrincipal.nextInt();

            switch (opcaoMenuPrincipal) {
                case 1:
                    menuClientes();
                    break;
                case 2:

                    break;

                case 3:
                    menuFuncionario();
                    break;
            }
        } while (opcaoMenuPrincipal != 0);

    }


    //Método responsável pela exibição do menu principal
    public static void exibirMenu() {
        System.out.println("===================================================================================\n" +
                "BEM VINDO AO SISTEMA, SELECIONE O QUE DESEJA:\n" +
                "(1) CADASTRO CLIENTE\n" +
                "(2) CADASTRO PRODUTOS\n" +
                "(3) CADASTRO FUNCIONARIO\n" +
                "(0) PARA SAIR\n" +
                "===================================================================================");
    }

    //Método que cria e implementa o menu de clientes
    public static void menuClientes() {
        Scanner escolha = new Scanner(System.in);
        int opcao;
        System.out.println("===================================================================================\n" +
                "MENU DE CLIENTES, ESCOLHA UMA OPÇÃO:\n" +
                "(1) CADASTRAR UM NOVO CLIENTE\n" +
                "(2) VISUALIZAR OS CLIENTES EXISTENTES\n" +
                "(3) EXCLUIR UM CLIENTE\n" +
                "(4) BUSCAR CLIENTE POR NOME\n" +
                "(5) INFORMAÇÕES SOBRE CLIENTES\n" +
                "(0) VOLTAR PARA O MENU PRINCIPAL");
        opcao = escolha.nextInt();

        if (opcao == 1) {
            //Sistema de criacao de clientes
            System.out.println("===================================================================================\n" +
                    "SISTEMA DE CRIAÇÃO DE CLIENTES\n");

            do {
                System.out.println("===================================================================================\n" +
                        "INFORME SE É UMA PESSOA FISICA : F para PESSOA FÍSICA e J para PESSOA JURÍDICA \n" +
                        "(DIGITE S PARA SAIR)\n" +
                        "===================================================================================\n");

                escolhaPessoaFisica = scannerPessoaFisica.nextLine();
                escolhaPessoaFisicaMaiuscula = escolhaPessoaFisica.toUpperCase();

                //Constutor se a pessoa for fisica
                if (escolhaPessoaFisicaMaiuscula.equals("F")) {
                    try {
                        System.out.println("Digite o nome: \n");
                        String nome = scannerNome.nextLine();
                        System.out.println("Digite a idade: \n");
                        int idade = scannerIdade.nextInt();
                        System.out.println("Digite o endereco: \n");
                        String endereco = scannerEndereco.nextLine();
                        System.out.println("Digite o telefone: \n");
                        int telefone = scannerTelefone.nextInt();
                        System.out.println("Digite o CPF: \n");
                        int cpf = scannerCPF.nextInt();

                        Cliente a = new Cliente(nome, idade, telefone, endereco, cpf);
                        listaClientes.add(a);
                    } catch (enderecoException a) {
                        System.out.println(a.getMessage());
                        break;
                    } catch (foneException b) {
                        System.out.println(b.getMessage());
                        break;
                    } catch (cpfException c) {
                        System.out.println(c.getMessage());
                        break;
                    } catch (nomeException f) {
                        System.out.println(f.getMessage());
                        break;
                    } catch (idadeException g) {
                        System.out.println(g.getMessage());
                    } catch (Exception h) {
                        System.out.println("ERRO");
                        break;
                    }

                    //Construtor se a pessoa for juridica
                } else if (escolhaPessoaFisicaMaiuscula.equals("J")) {
                    try {
                        System.out.println("Digite o nome: \n");
                        String nome = scannerNome.nextLine();
                        System.out.println("Digite o endereco: \n");
                        String endereco = scannerEndereco.nextLine();
                        System.out.println("Digite o telefone: \n");
                        int telefone = scannerTelefone.nextInt();
                        System.out.println("Digite o CNPJ: \n");
                        String CNPJ = scannerCNPJ.nextLine();

                        Cliente a = new Cliente(nome, telefone, endereco, CNPJ);
                        listaClientes.add(a);
                    } catch (enderecoException a) {
                        System.out.println(a.getMessage());
                        break;
                    } catch (foneException b) {
                        System.out.println(b.getMessage());
                        break;
                    } catch (cnpjException c) {
                        System.out.println(c.getMessage());
                        break;
                    } catch (nomeException f) {
                        System.out.println(f.getMessage());
                        break;
                    } catch (Exception g) {
                        System.out.println("ERRO");
                        break;
                    }

                } else if (escolhaPessoaFisicaMaiuscula.equals("S")) {
                    break;
                } else {
                    System.out.println("opção invalida");
                }
            } while (escolhaPessoaFisicaMaiuscula.equals("F") || escolhaPessoaFisicaMaiuscula.equals("J"));

        } else if (opcao == 2) {
            //Sistema de exibição dos dados dos clientes
            for (Cliente i : listaClientes) {
                i.exibeDados();
                System.out.println("=========================================================\n");
            }
        } else if (opcao == 3) {
            //Sistema de exclusão de clientes de uma lista
            System.out.println("=========================================================\n");
            System.out.println("EXCLUSÃO DE CLIENTES. DIGITE O ID DO CLIENTE QUE DESEJA EXLCUIR\n");

            for (Cliente i : listaClientes) {
                i.exibeDados();
                System.out.println("=========================================================\n");
            }

            escolhaExcluirCliente = scannerEscolhaExcluirCliente.nextLine().toUpperCase();

            for (Cliente i : listaClientes) {
                String idPessoaFisica = i.getIdPessoaFisicaObjeto();
                String idPessoaJuridica = i.getIdPessoaJuiridicaObjeto();

                if ((escolhaExcluirCliente.equals(idPessoaFisica)) || (escolhaExcluirCliente.equals(idPessoaJuridica))) {
                    listaClientes.remove(i);
                    break;
                }

            }
        } else if (opcao == 4) {
            sistemaBuscaCliente();
        }else if(opcao == 5){
            if (listaClientes.size() > 0) {
                Cliente cVelho = listaClientes.get(0);
                Cliente cNovo = listaClientes.get(0);
                int numIdosos = 0;
                int numMenores = 0;
                double idadeMedia = 0;

                int idadeMaior = cVelho.getIdade();
                int idadeMenor = cNovo.getIdade();

                for (Cliente c : listaClientes) {
                    idadeMedia += c.getIdade();

                    if (c.getIdade() > 60) {
                        numIdosos++;
                    } else if (c.getIdade() < 18) {
                        numMenores++;
                    }

                    if (c.getIdade() > idadeMaior) {
                        idadeMaior = c.getIdade();
                        cVelho = c;
                    }

                    if (c.getIdade() < idadeMenor) {
                        idadeMenor = c.getIdade();
                        cNovo = c;
                    }
                }
                System.out.println("Cliente mais  velho: ");
                cVelho.exibeDados();
                System.out.println("===================================================================================\n");
                System.out.println("Cliente mais  novo: ");
                cNovo.exibeDados();
                System.out.println("===================================================================================\n");
                System.out.println("Quantidade de clientes maiores de 60 anos: " + numIdosos);
                System.out.println("Quantidade de clientes menores de 18 anos: " + numMenores);
                System.out.println("Média das idades: " + (idadeMedia / listaClientes.size()));

            }
        }
    }

    public static void menuFuncionario() {

        Scanner escolha = new Scanner(System.in);
        int opcao;
        System.out.println("===================================================================================\n" +
                "MENU DE FUNCIONÁRIOS, ESCOLHA UMA OPÇÃO:\n" +
                "(1) CADASTRAR UM NOVO FUNCIONÁRIO\n" +
                "(2) VISUALIZAR OS FUNCIONÁRIO EXISTENTES\n" +
                "(3) EXCLUIR UM FUNCIONÁRIO\n" +
                "(4) BUSCA DE FUNCIONARIO" +
                "(0) VOLTAR PARA O MENU PRINCIPAL");
        opcao = escolha.nextInt();

        if (opcao == 1) {
            System.out.println("===================================================================================\n" +
                    "SISTEMA DE CRIAÇÃO DE FUNCIONÁRIO\n");
            Scanner teclado = new Scanner(System.in);

            Funcionario a = new Funcionario();
            System.out.println("Digite o ID: ");
            int id = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Digite o nome: \n");
            String nome = teclado.nextLine();
            System.out.println("Digite a idade: \n");
            int idade = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Digite o endereco: \n");
            String endereco = teclado.nextLine();
            System.out.println("Digite o telefone: \n");
            int telefone = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Digite o CPF: \n");
            int cpf = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Digite o salário: ");
            double salario = teclado.nextDouble();

            a.setNome(nome);
            a.setId(id);
            a.setIdade(idade);
            a.setEndereco(endereco);
            a.setTelefone(telefone);
            a.setCpf(cpf);
            a.setSalario(salario);

            listaFuncionarios.add(a);
            //EXIBIÇÃO DE FUNCIONARIOS CADASTRADOS
        } else if (opcao == 2) {
            for (Funcionario i : listaFuncionarios) {
                i.exibeDados();
                System.out.println("====================================");
            }

            //EXCLUSÃO DE FUNCIONARIOS CADASTRADOS
        } else if (opcao == 3) {
            int id = 0;
            System.out.println("Digite o ID de quem vc deseja excluir");
            id = escolha.nextInt();
            for (Funcionario i : listaFuncionarios) {
                if (id == i.getId()) {
                    listaFuncionarios.remove(i);
                    break;

                }
            }
            //BUSCA DE FUNCIONARIOS
        } else if (opcao == 4) {
            sistemaBuscaFuncionario();
        }

    }

    public static void sistemaBuscaFuncionario() {
        String nomeFuncionario;
        System.out.println("Digite o nome do funcionário: ");
        nomeFuncionario = escolha.nextLine().toUpperCase();
        for (Funcionario i : listaFuncionarios) {
            if (i.getNome().equals(nomeFuncionario)) {
                i.exibeDados();
                System.out.println("======================================\n");
            }
        }
    }

    public static void sistemaBuscaCliente() {
        String nomeCliente;
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = escolha.nextLine().toUpperCase();
        for (Cliente i : listaClientes) {
            if (i.getNome().equals(nomeCliente)) {
                i.exibeDados();
                System.out.println("======================================\n");
            }
        }
    }


}


