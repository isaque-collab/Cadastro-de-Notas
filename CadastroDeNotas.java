package Exercicious;
import java.util.Scanner;
public class CadastroDeNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos alunos serão cadastrados? ");
        int qtdAlunos = input.nextInt();
        input.nextLine();

        String[] nome = new String [qtdAlunos];
        double[] nota = new double [qtdAlunos];
        double somaTotal = 0.0;
        double media;
        String melhorAluno = "";
        double maiorNota = 0.0;
        int qtdAlunosPiores = 0;

        for (int i=0; i<qtdAlunos; i++){
            System.out.print("Nome do aluno: ");
            nome[i] = input.nextLine();
            System.out.print("Nota do aluno: ");
            nota[i] = input.nextDouble();
            input.nextLine();

            if (nota[i]>maiorNota){
                melhorAluno = nome[i];
                maiorNota = nota[i];
            }
        }

        for (int i=0; i<qtdAlunos; i++){
            somaTotal += nota[i];
        }

        media = somaTotal / qtdAlunos;

        for (int j=0; j<qtdAlunos; j++){
            if (nota[j]<media){
                qtdAlunosPiores+=1;
            }
        }

        System.out.println("Média da turma: "+media);
        System.out.println("Aluno com a maior nota: "+melhorAluno);
        System.out.println("Quantidade de alunos abaixo da média da turma: "+qtdAlunosPiores);

    }
}
