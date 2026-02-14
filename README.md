# Desafio Final - Design Patterns em Java

Este repositório contém uma implementação simples para portfólio aplicando **três padrões de projeto**:

- **Chain of Responsibility** para decidir qual desconto aplicar em um pedido;
- **Factory** para montar a cadeia padrão de regras;
- **Singleton** para centralizar configuração global da campanha sazonal.

## Estrutura

- `DiscountHandler` e suas implementações: regras de desconto encadeadas;
- `DiscountChainFactory`: cria a cadeia de handlers na ordem de prioridade;
- `AppConfig`: configuração global única da aplicação;
- `Main`: demonstração de uso.

## Regras de desconto (ordem de prioridade)

1. Cliente fidelidade: 10% de desconto;
2. Compra com 10 itens ou mais: 15% de desconto;
3. Campanha sazonal ativa: 5% de desconto;
4. Sem desconto.

## Como executar

```bash
mvn test
mvn -q exec:java -Dexec.mainClass="br.com.portfolio.patterns.Main"
```

> Observação: para executar com `exec:java`, pode ser necessário adicionar o plugin `exec-maven-plugin` no `pom.xml` dependendo do ambiente.
