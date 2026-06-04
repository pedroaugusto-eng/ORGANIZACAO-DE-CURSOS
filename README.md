# Sistema de Gerenciamento de Cursos com Árvore Binária de Busca (ABB)

## Sobre o Projeto

Este projeto consiste no desenvolvimento de um **Sistema de Gerenciamento de Cursos** utilizando a estrutura de dados **Árvore Binária de Busca (ABB)**. O objetivo é aplicar conceitos fundamentais de estruturas de dados, manipulação de árvores e recursividade para realizar o cadastro e gerenciamento eficiente de cursos.

Cada curso é armazenado na árvore utilizando seu **código** como chave de identificação, permitindo operações de inserção, busca e remoção de forma organizada.

---

## Objetivos

* Aplicar os conceitos de Árvore Binária de Busca (ABB).
* Utilizar recursividade nas operações da árvore.
* Implementar manualmente as funcionalidades sem bibliotecas prontas para manipulação de árvores.
* Desenvolver um sistema interativo em modo texto.

---

## Estrutura dos Cursos

Cada curso cadastrado possui as seguintes informações:

| Campo         | Descrição                                      |
| ------------- | ---------------------------------------------- |
| Código        | Identificador único do curso (chave da árvore) |
| Nome          | Nome do curso                                  |
| Carga Horária | Quantidade de horas do curso                   |
| Área          | Área de conhecimento do curso                  |

---

## Funcionalidades

O sistema oferece as seguintes operações:

### 1. Inserir Curso

Permite cadastrar um novo curso na árvore utilizando o código como chave de ordenação.

### 2. Buscar Curso

Realiza a busca de um curso específico a partir do seu código.

### 3. Remover Curso

Remove um curso da árvore, mantendo a estrutura correta da ABB.

### 4. Exibir Cursos em Ordem (In-Order)

Lista todos os cursos em ordem crescente de código.

### 5. Exibir Cursos em Pré-Ordem (Pre-Order)

Percorre a árvore exibindo primeiro o nó raiz, seguido dos nós da esquerda e da direita.

### 6. Exibir Cursos em Pós-Ordem (Post-Order)

Percorre a árvore exibindo primeiro os nós filhos e, por último, o nó raiz.

### 7. Quantidade de Cursos

Informa o número total de cursos cadastrados.

### 8. Altura da Árvore

Calcula e exibe a altura atual da árvore.

### 9. Curso de Maior Código

Localiza e exibe o curso com o maior código cadastrado.

### 10. Curso de Menor Código

Localiza e exibe o curso com o menor código cadastrado.

### 11. Encerrar Sistema

Finaliza a execução do programa.

---

## Estrutura de Dados Utilizada

O sistema utiliza uma **Árvore Binária de Busca (ABB)**, onde:

* Todos os cursos com código menor que o nó atual são armazenados à esquerda.
* Todos os cursos com código maior que o nó atual são armazenados à direita.
* Não são permitidos códigos duplicados.

---

## Requisitos do Projeto

* Utilização obrigatória de **recursividade** nas operações da árvore.
* Implementação manual de todas as funcionalidades da ABB.
* Interface baseada em **modo texto (terminal)**.
* Menu interativo com repetição contínua até que o usuário escolha sair do sistema.

---

## Exemplo de Menu

```text
===============================
 SISTEMA DE CURSOS - ABB
===============================
1 - Inserir Curso
2 - Buscar Curso
3 - Remover Curso
4 - Exibir Cursos em Ordem
5 - Exibir Cursos em Pré-Ordem
6 - Exibir Cursos em Pós-Ordem
7 - Quantidade de Cursos
8 - Altura da Árvore
9 - Curso de Maior Código
10 - Curso de Menor Código
11 - Encerrar Sistema
===============================
Escolha uma opção:
```

---

## Tecnologias Utilizadas

* Linguagem: Java
* Estrutura de Dados: Árvore Binária de Busca (ABB)

---

## Conceitos Aplicados

* Árvores Binárias de Busca (BST/ABB)
* Recursividade
* Inserção, busca e remoção em árvores
* Percursos em árvores:

  * In-Order
  * Pre-Order
  * Post-Order
* Cálculo de altura
* Busca por valores mínimos e máximos
* Programação Orientada a Objetos (POO)

---

## Autores
- João Vitor Bomfim de Souza
- Pedro Augusto Pereira Barbosa
- Graziele Cupertino De Souza
