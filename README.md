<h1>ExerciciosClasses - <a href="https://wiki.python.org.br/ExerciciosClasses">Python Brasil</a></h1>

<p align="center">▶️ PLAYLIST COM OS EXERCÍCIOS RESOLVIDOS POO CLASSES - JAVA  ▶️</p>
<p align="center">⚠️<em> Os exercícios foram adaptados! </a>️</em>⚠️</p>

<h2>
🛑 Pré-requistos
</h2>

- [x] JDK 8+
- [x] IDE Java de sua preferência (usarei IntelliJ)<br>
<a href="https://web.digitalinnovation.one/course/dominando-ides-java/learning/b0f1ae39-6af7-4a2c-8fc2-c73ae8463c84/?back=/browse">Curso Dominando IDEs Java</a>
- [x] Noções acerca do Paradigma Orientado a Objetos
- [x] Conhecer o básico da Sintaxe Java


<ol>
  <li>
<h3><strong>Classe Bola:</strong><br></h3> Crie uma classe que modele uma bola:
<em>Atributos:</em> Cor, circunferência, material.<br>
<em>Métodos:</em> trocaCor e mostraCor.
  </li>
  <li>
<h3><strong>Classe Quadrado:</strong><br></h3> Crie uma classe que modele um quadrado:<br>
<em>Atributos:</em> Tamanho do lado.<br>
<em>Métodos:</em> Mudar valor do Lado, Retornar valor do Lado e calcular Área.
  </li>
  <li>
<h3><strong>Classe Retangulo:</strong><br></h3> Crie uma classe que modele um retangulo:<br>
<em>Atributos:</em> LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher).<br>
<em>Métodos:</em> Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular Perímetro.
  </li>
  <li>
<h3><strong>Classe Aluno:</strong><br></h3> Crie uma classe que modele um aluno de academia:<br>
<em>Atributos:</em> Nome, idade, peso e altura.<br>
<em>Métodos:</em>Envelhecer, engordar, emagrecer, crescer.<br>
Por padrão, a cada ano que nossa pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm.
  </li>
  <li>
<h3><strong>Classe Conta Corrente:</strong><br></h3> Crie uma classe que modele uma conta corrente.<br>
<em>Atributos:</em> número da conta, nome do correntista e saldo.<br>
<em>Métodos:</em> alterar nome, depósito e saque.<br>
No construtor, o saldo é opcional, com o valor default zero e os demais atributos são obrigatórios.  
  </li>
  <li>
<h3><strong>Classe TV:</strong><br></h3> Faça um programa que simule um televisor criando-o como um objeto.<br>
O usuário deve ser capaz de informar o número do canal e aumentar ou diminuir o volume.<br>
Certifique-se de que o número do canal e o nível do volume permanecem dentro de faixas válidas.  
  </li>
  <li>
<h3><strong>Classe Tamagotchi:</strong><br></h3> Crie uma classe que modele um bichinho virtual.<br>
<em>Atributos:</em> Nome, fome, saúde e idade.<br>
<em>Métodos:</em> Alterar nome, fome, saúde e idade; retornar nome, fome, saúde e idade.<br>
<strong>Obs:</strong> Existem mais de uma informação que devemos considerar: O humor do nosso Tamagotchi. Este humor é uma combinação entre os atributos fome e saúde, ou seja, um campo calculado. Não devemos criar um atributo para armazenar esta informação já que pode ser calculada a qualquer momento.  
  </li>
  <li>
<h3><strong>Classe Macaco:</strong><br></h3> Crie uma classe que modele um macaco.<br>
<em>Atributos:</em> Nome e bucho (estômago).<br>
<em>Métodos:</em> Comer, verBucho e digerir.<br>
Faça um programa e teste interativamente:<br>
- Crie 2 macacos.<br>
- Alimente-os com 3 alimentos diferentes e verificando o conteúdo do estômago a cada refeição.<br>
Experimente fazer com que um macaco coma o outro. É possível criar um macaco canibal?  
  </li>
  <li>
<h3><strong>Classe Ponto e retângulo:</strong><br></h3> Faça um programa completo utilizando funções e classes que:<br>
- Possua uma classe Ponto, com os atributos x e y.<br>
- Possua uma classe Retângulo, com os atributos largura e altura.<br>
- Possua uma função para imprimir os valores da classe Ponto.<br>
- Possua uma função para encontrar o centro de um Retângulo.<br>
- Você deve criar alguns objetos da classe Retângulo.<br>
- Cada objeto deve ter um vértice de partida, por exemplo, o vértice inferior esquerdo do retângulo, que deve ser um objeto da classe Ponto.<br>
- A função para encontrar o centro do retângulo deve retomar o valor para um objeto do tipo ponto que indique os valores de x e y para o centro do objeto.<br>
- O valor do centro do objeto deve ser mostrado na tela.<br>
- Crie um menu para alterar os valores do retângulo e imprimir o centro deste retângulo.<br>  
  </li>
  <li>
<h3><strong>Classe Bomba de Combustível:</strong><br></h3> Crie uma classe que modele uma bomba de combustível.<br>
Atributos: tipo de combustível, valor do litro, quantidade do combustível.<br>
<em>Métodos:</em><br>
- Abastecer por valor: método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo.<br>
- Abastecer por litro: método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.<br>
- Alterar o valor do litro do combustível: altera o valor do litro do combustível.<br>
- Alterar quantidade de combustível: altera a quantidade de combustível restante na bomba.<br>
Sempre que acontecer um abastecimento é necessário atualizar a quantidade de combustível total na bomba. A bomba inicia com 100 L de combustível.<br>  
  </li>
  <li>
<h3><strong>Classe carro:</strong><br></h3> Crie uma classe que modele um carro.<br>
Um veículo tem um certo consumo de combustível (medidos em km/l) e uma certa quantidade de combustível no tanque.<br>
O consumo é especificado no construtor e o nível de combustível inicial é 0.<br>
<em>Métodos:</em> Andar, obter gasolina e adicionar gasolina:<br>
- meuFusca = Carro(15);           # 15 quilômetros por litro de combustível.<br> 
- meuFusca.adicionarGasolina(20); # abastece com 20 litros de combustível.<br> 
- meuFusca.andar(100);            # anda 100 quilômetros.<br>
- meuFusca.obterGasolina();        # Imprime o combustível que resta no tanque.<br>  
  </li>
  <li>
<h3><strong>Classe Conta de Investimento:</strong><br></h3> Faça uma classe contaInvestimento que seja semelhante a classe ContaBancaria, com a diferença de que se adicione um atributo taxaJuros.<br>
- Forneça um construtor que configure tanto o saldo inicial com a taxa de juros.<br>
- Forneça um método adicioneJuros (sem parâmetro explícito) que adicione juros à conta.<br>
- Escreva um programa que construa uma poupança com um saldo inicial de R$1.000,00 e uma taxa de juros de 10%.<br>
- Depois aplique o método adicioneJuros() cinco vezes e imprima o saldo resultante.<br>  
  </li>
  <li>
<h3><strong>Classe Funcionário:</strong><br></h3> Crie uma classe que modele um funcionário.
Um empregado tem um nome (String) e um salário (Double).<br>
- Escreva um <em>construtor</em> com dois parâmetros (nome e salário).<br>
- <em>Métodos</em> para devolver nome, salário, aumentar salário (porcentualDeAumento) que aumente o salário do funcionário em uma certa porcentagem.<br>
- Escreva um pequeno programa que teste sua classe.<br>
Exemplo de uso:<br>
harry=funcionário("Harry",25000)<br>
harry.aumentarSalario(10)<br>  
  </li>
  <li>
<h3><strong>Classe Tamagotchi ++:</strong><br></h3> Melhore o programa do bichinho virtual.
Permitindo que o usuário especifique quanto de comida ele fornece ao bichinho e por quanto tempo ele brinca com o bichinho.<br>
- Faça com que estes valores afetem quão rapidamente os níveis de fome e tédio caem.<br>
- Crie uma "porta escondida" que mostre os valores exatos dos atributos do objeto. Consiga isto mostrando o objeto quando uma opção secreta, não listada no menu, for informada na escolha do usuário.<br>
Dica: acrescente um método especial str() à classe Bichinho.<br>  
  </li>
  <li>
<h3><strong>Programa Fazenda de Tamagotchi:</strong><br></h3>
- Crie uma Fazenda de Bichinhos instanciando vários objetos Tamagotchi e mantendo o controle deles através de uma lista.<br> 
- Imite o funcionamento do programa básico, mas ao invés de exigir que o usuário tome conta de um único bichinho, exija que ele tome conta da fazenda inteira.<br> 
- Cada opção do menu deveria permitir que o usuário executasse uma ação para todos os bichinhos (alimentar todos os bichinhos, brincar com todos os bichinhos, ou ouvir a todos os bichinhos).<br> 
- Para tornar o programa mais interessante, dê para cada bichinho um nível inicial aleatório de fome e tédio.<br>  
  </li>
</ol>

<h2> 🤝 Contribuindo </h2>

Este repositório foi criado para fins de estudo, então contribua com ele.
Se te ajudei de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identidique com o conteúdo, não deixe de compatilhar.

Se possível:

⭐️  Star o projeto

🐛 Encontrar e relatar issues


------------

Disponibilizado com ♥ por [cami-la](https://www.linkedin.com/in/cami-la/ "cami-la").




























