[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/T2vUNN1h)

4- Quando é criado um array de tipos primitivos, os valores são guardados diretamente dentro do array. Por exemplo, quando um int[3] é criado, ele já reserva espaço para três números inteiros, mesmo que ainda não tenha colocado nenhum valor neles.
Já quando um array de objetos é criado, de início são apenas espaços vazios (nulos) que servem para guardar referencias, os "endereços" que apontam para os objetos. Esses objetos ainda não existem até realmente criar cada um com new.

a - Já a memória, os tipos primitivos ocupam um espaço direto e contínuo, com cada posição do array armazenando o valor real, no caso dos objetos, o array guarda só as referências, e cada objeto é criado separadamente na memória, em lugares diferentes.

b - O principal é verificar se a posição do array usado realmente já tem um objeto criado. Se estiver nula e tentar acessar algo ali, o programa vai travar, além disso, acessar posições fora do tamanho do array pode causar outro erro.
