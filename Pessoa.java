package colegio;

public class Pessoa {
         
	    // atributos da classe pessoa
	    String nome;
	    String cpf;
	    double peso;
	    double altura;
        
	    // classe construtora
	    public Pessoa(String nome, String cpf, double peso, double altura) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.peso = peso;
	        this.altura = altura;
	    }
	}
        // atributos adicionais 
	class Aluno extends Pessoa {
	    double nota;
	    double percentualPresenca;
        
	    // classe construtora aluno
	    public Aluno(String nome, String cpf, double peso, double altura, double nota, double percentualPresenca) {
	        super(nome, cpf, peso, altura);
	        this.nota = nota;
	        this.percentualPresenca = percentualPresenca;
	    }
	}
        // verifica e valida o CPF ( apenas verifica se possui o comprimento de 11 caracteres)
	class FuncoesUteis {
	    public static boolean verificarCpf(String cpf) {
	        return cpf.length() == 11; // verifica o comprimento
	    }
        
	    // calcula o IMC
	    public static double calcularIMC(double peso, double altura) {
	        return peso / (altura * altura);
	    }
        
	    // classe que informa se o aluno foi aprovado ou reprovado 
	    public static String avaliarAluno(Aluno aluno) {
	    	// para a aprovaçao o aluno tem que ter uma nota equivalente ou maoir que 5 e 75% de presença
	        return (aluno.nota >= 5 && aluno.percentualPresenca >= 75) ? "Aprovado" : "Reprovado";
	    }
	}

	class Main {
	    public static void main(String[] args) {
	    	// cria o objeto aluno com seus dados 
	        Aluno aluno = new Aluno("Ryan Rezani", "16348854781", 70, 5.75, 5.5, 80);
	        
	        // verifica o CPF, calcula o IMC do aluno e avaliaçao do aluno, e por fim exibindo seus resultados 
	        System.out.println("CPF Válido: " + FuncoesUteis.verificarCpf(aluno.cpf));
	        System.out.println("IMC: " + FuncoesUteis.calcularIMC(aluno.peso, aluno.altura));
	        System.out.println("Resultado da Avaliação: " + FuncoesUteis.avaliarAluno(aluno));
	    }
	}



