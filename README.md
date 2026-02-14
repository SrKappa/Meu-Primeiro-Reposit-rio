# Desafio: Programação Orientada a Objetos com Java

Este repositório contém uma implementação prática dos pilares da POO em Java:

- **Abstração** com a classe abstrata `Conteudo`.
- **Encapsulamento** com atributos privados e métodos de acesso.
- **Herança** nas classes `Curso` e `Mentoria` que estendem `Conteudo`.
- **Polimorfismo** na sobrescrita de `calcularXp()` para cada tipo de conteúdo.

## Estrutura

- `Bootcamp`: agrega conteúdos e controla período.
- `Dev`: representa quem se inscreve, progride e acumula XP.
- `Curso` e `Mentoria`: tipos concretos de conteúdo.
- `Main`: simulação de uso com dois devs.

## Como executar

```bash
javac -d out $(find src -name "*.java")
java -cp out br.com.dio.desafio.Main
```
