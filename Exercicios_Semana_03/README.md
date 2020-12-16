# Respostas das Questões Dissertativas - Semana 3

# Q1)
- Não, pois o Java atribuirá um valor inteiro para a variável *quantReservas*.

# Q2)
- Erro, pois a classe *Hotel* não solicitou nenhum parâmetro.

# Q3)
- O resultado será 0, pois o Java atribui o valor 0 automaticamente para atributos inteiros não inicializados.

# Q4)
- Código da Questão:
''' Java

	void x(double valor) {
		valor = valor + valor;
	}

'''
- Dessa forma como está escrito o método fica confuso de se ler, pois o parâmetro e o atributo tem o mesmo nome, mas esse problema pode ser resolvido da seguinte forma:
''' Java

	void x(double valor) {
		this.valor = valor + valor;
	}

'''
- Usando o *this* fica mais fácil reconhecer que o primeiro valor se refere ao atributo da classe e que o segundo se refere ao parâmetro. 

# Q5)
- Falta declarar se a classe *Radio* é pública, privada ou protegida, o retorno e o tipo de retorno.

# Q6)
- a) Os dois *prints* terão com resultado o valor 90, pois como foi declarado *c1 = c2*, os dois valores se tornaram iguais (apontam para o mesmo endereço);

- b) O objeto *c1* estava no endereço *Conta@10* e o objeto *c2* no endereço *Conta@13*, ao fazer *c1 = c2*, *c1* passou a apontar para o endereço *Conta@13*.

# Q7)
- Código na pasta Q7.

# Q8)
- Código na pasta Q8;
- b) Sim.

# Q9)
- Código na pasta Q9.