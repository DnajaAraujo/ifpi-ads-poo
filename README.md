# Resposta Questões Dissertativas

# 1) 
- javac Avaliacao.java --> compila o programa;
- java Avaliacao --> executa o programa.

# 2)
- Ocorre erro de compilação, onde é informado que a variável contador não foi inicializada, e por ser atribuida como int é necessário inicializar com qualquer valor do tipo inteiro.

# 3)
- O operador && (and) avalia se os dois lados da condição são verdadeiros;
- Como o primeiro lado é falso, a segunda condição não é avaliada, dessa forma o incremento em b não ocorre e é impresso o resultado de a-b;
- Caso a fosse verdadeiro ocorreria o incremento em b que passaria a valer 1.

# 4)
- O comando switch...case testa todos os casos e imprime o valor em cada caso;
- Normalmente é usado com um break no final de cada caso;
- Sem o break todos os casos são testados.

# 5)
``` Java
// Código da questão
public class Exemplo {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        System.out.println("Soma: " + a + b);
    }
}

// Código corrigido
public class Exemplo {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        int soma = a +b;
        System.out.println("Soma: " + soma);
    }
} 
```

# 6)
``` Java
public class Saudacao {
    public static void main(String[] args) {
        System.out.println("Bom Dia!");
    }
}
```

# 7)
``` Java
public class Saudacao {
    String texto;
    String destinatario;

    // Método
    String obterSaudacao() {
        System.out.println(texto + " " + destinatario);
    }
}
```

# 8)
``` Java
public class TestaSaudacao {
    public static void main(String[] args) {
        Saudacao s = new Saudacao();
        s.texto = "Bom dia";
        s.destinatario = "Joao";

        System.out.println(s.obterSaudacao());
    }    
}
```

# 9)
- O modelo abordado na questão 8 é o mais estruturado, mais voltado a Orientação a Objeto e que proporciona maior portabilidade e modularização. Também é o mais burocrático, pois há a necessidade de criar mais arquivos e linhas de código.

# 10)
- Código na pasta.

# 11)
- Código na pasta.

# 12)
- Código na pasta.

# 13)
- Código na pasta.

# 14)
- Código na pasta.

# 15)
- Código na pasta.
