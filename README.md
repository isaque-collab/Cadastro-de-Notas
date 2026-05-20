# 📚 CadastroDeNotas

Programa em Java para cadastro e análise de notas de alunos via terminal.

## 📋 Descrição

O usuário informa quantos alunos serão cadastrados, digita o nome e a nota de cada um, e o programa exibe um resumo estatístico da turma.

## ⚙️ Funcionalidades

- Cadastro dinâmico de alunos (quantidade definida pelo usuário)
- Leitura de nome e nota via `Scanner`
- Cálculo da média da turma
- Identificação do aluno com a maior nota
- Contagem de alunos abaixo da média

## 🖥️ Exemplo de uso

```
Quantos alunos serão cadastrados? 3
Nome do aluno: Isaque
Nota do aluno: 10
Nome do aluno: João Pedro
Nota do aluno: 6.5
Nome do aluno: Maria
Nota do aluno: 8

Média da turma: 8.166666666666666
Aluno com a maior nota: Isaque
Quantidade de alunos abaixo da média da turma: 1
```

## 🛠️ Tecnologias

- Java 15+
- `java.util.Scanner` para leitura do terminal

## 📝 Observações técnicas

- Após `nextInt()` e `nextDouble()`, é utilizado `input.nextLine()` para limpar o buffer do `Scanner` e evitar erros na leitura de strings.
- Os nomes são lidos com `nextLine()`, permitindo nomes compostos (ex: "João Pedro").
