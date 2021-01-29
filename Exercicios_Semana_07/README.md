# Respostas das Questões Dissertativas - Semana 7


# Q7)
- Sim, pois ele utiliza os métodos *sacar* e *depositar*, os quais já estão "validados". Sim, a solução ficou mais robusta pois, além de tornar o código à prova de erros, tornou o código mais legível e simples.   

# Q9)
- 
-
- Os métodos serão alterados de forma a terem que colocar na assinatura do método a palavra reservada *throws* e o nome do tipo de exceção. Exemplo:
```java
	public void metodo(int num) throws AplicacaoException {
		...
	}
```

# Q10)
- Código na pasta Q10.

# Q11)
- 

# Q12)
- 

# Q13)
- a) 
	- Ponto falho de desconsiderar a operação: ficamos na incerteza do sucesso ou não da operação;
	- Ponto falho de exibir mensagem de erro: ficamos atrelados à interface (gráfica ou texto);
	- Pontos falhos de retornar um código de erro: temos que testar o valor de retorno para saber o que houve; é considerado uma má prática; o valor retornado não é intuitivo e carece de documentação para o endendimento.

- b) Porque através delas podemos tratar os erros que venham a surgir no programa, o que torna o código mais confiável.
- c) 
	- Sim.
	- Exemplo:
```java
		public void debitar(String numero, double valor) {
			Conta c;
			c = consultar(numero);
				if (c != null) {
					c.sacar(valor);
					System.out.println("Operação realizada com sucesso!");
				}
				else {
					System.out.println("Conta inexistente!");
				}
		}
```
	- Antes

```java
		public void debitar(String numero, double valor) {
			Conta c;
			c = consultar(numero);
			if (c == null) {
				throw new RuntimeException("Conta inexistente!");
			}
			c.sacar(valor);
		}
```
	- Depois
