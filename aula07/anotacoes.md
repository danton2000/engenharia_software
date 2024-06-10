# Anotações da revisão do conteudo

## Padrões de Projeto
    O que é? Soluções, ideias. Soluções reciclaveis.
    Para  melhorar a flebildiades e padrões no codigo
    Facilitando a comunicação atraves do código. Facilita a manutenção(depende do padrão utilizado).
    Boas praticas, para a evoluçã do desenvolvimento do sistema.

### Criacionais:
    Focado na forma de criação dos objeteos, como eles são construidos.
    Exemplos: Singleton, Factory, Abstract Factory, Builder e Prototype. Como principais

#### Singleton
    Proposito: Ele garante que uma classe tenha apenas uma instancia e fornece um ponto global de acesso a essa instancia.
    
    Aplicações: Ideal para recursos que devem ser únicos, como gerenciadores de configuração, loggers, e conexões de banco de dados.
    
    Exemplo: Conexão em um banco de dados, você abre o canal de conexão/comunicação apenas uma vez e encerra uma vez, reaproveitando esse  canal.

    Beneficios:
    - Controle sobre a criação de instâncias.
    - Facilita o acesso a uma instância única.

    Considerações:
    - Pode dificultar o teste de unidade.
    - Cuidado com o uso excessivo que pode levar a problema de desing

#### Factory Method
    Propósito: Defini uma interface para criar um objeto, mas deixar as subclasses decidirem qual classe instanciar.

    Aplicações: Quando uma classe não pode antecipar a classe de objetos que deve criar

    Beneficios:
    - Maior flexibilidade na criação de objetos
    - Promove a reutilização de código

    Considerações:
    - Pode adicionar complexidade ao código
    - Nem semple é necessário, uso com moderação.

#### Abstract Factory
    Propósito: Fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

    Aplicações: Quando o sitema deve ser independente de como sesu produtos são criados, compostos e representados.

    Benefícios:
    - Facilita a troca de familias de produtos
    - Garante a compatibilidade entre produtos

    Considerações:
    - Pode ser complexto e dificil de implementar.
    - Exige uma clara hierarquia de classes.

#### Builder
    Proposito: Separar a construção de um objeto complexo da sua representação, permitindo a criação de diferentes representações.

    Aplicações: Quando a construção de um objeto envolve muitas etapas e a configuração dos objetos  pode varias.

    Tem os seguintes 'Papeis':
    - Director: Direciona o processo de contrução. Chama os métodos do builder para construir partes do produto.
    - Builder: Interface ou classe abstrata que define os métodos para construir as diferentes partes do produto
    - ConcreteBuilder: Implementa a interface Builder e define a construção especifica das partes do produto
    - Product: O Objeto final que está sendo construído

    Beneficios:
    - Controla a construção de objetos complexos.
    - Permite a criação de diferentes reprsentações de um objeto

    Considerações:
    - Pode ser excessivo para objetos simples.
    - A complexidade adicional deve ser justificada.

#### Prototype
    Proposito: Especifica os tipos de objetos a serem criadas usando um instância prototipica e criar novos objetos copiando esse protótipo.

    Aplicações: Quando a criação direta de um objeto á cara ou complexa.

    Beneficios:
    - Reduz a ncessidade de criar novas instancias diretamente
    - Permite a adição ou remoção de prototipos em tampo de execução.

    Considerações: 
    - Implementar o clone pode ser complicado para objetos complexos.

    - Cuidados especiais devem ser tomados com objetos que possuem referências a outros objetos
        
### Estruturais:
    Fala sobre a compisição entre as classes e objetos. Como elas se relacionam, como são criadas em um estilo mais arquitetural.
    Exemplos: Adapter, Composite, Proxy, Flyweight, Facede, Bridge, Decoratos.

#### Padão Adapter
    Proposito: Permite que interface incompativeis trabalhem juntas.

    Contexto: Quando temos duas interface incompativeis que precisam trabalhar juntas

    Soluções: Um adaptador converte a interface de uma classe em outra interface esperada pelos clientes.

    Estrutura:
    - Classes principais:
        - Target: Interface esperada pelos cliente.
        - Adapter: Adapta a interface existente para a interface esperada
        - Adaptee: Interface existente que precisa ser adaptada.

    Quandos usar:
    - Integração de  APIs de terceiros
    - Reutilização de classes existentes que não correspondem a interface necessária.
    - Suporte a sistemas legado

    Beneficios:
    - Reutilização de codigo existentes.
    - Maior flexibilidade e manutenção

    Limitações:
    - Pode aumentar a complexidade do codigo
    - Adicionar mais uma camada.

#### Padrão Composite
    Proposito: Compor objetos em estruturas de arvore para representar hierarquias parte-todo

    Contexto: Quando queremos tratar objetos individuas e composições de objetos de maneira uniforme.

    Estrutura:
    - Classes principais:
        - Component: interface comum para objetos folhas e composições.
        - Leaf: Implementa o comportamento dos objetos folhas
        - Composite: Armazena componentes filhos e implementa comportamento relacionado aos filhos

    Quando usar:
    - Representação de hierarquias de objetos
    - Implementação de estruturas de arvore, como arquivos e diretorios.

    Beneficios:
    - Simplificacao do código cliente
    - Facilita a adição de novos tipos  de componentes

    Limitações:
    - Pode ser complexo gerenciar o ciclo de vida dos objetos compostos.

    - Pode dificultar a implemntação de operações especificar para componentes.

#### Padrão Proxy
    Proposito: Fornece um substituto ou ponto atravès do qual um objeto pode controlar o acesso a outro.

    Contexto: Quando precisamos deum controle adicional ou processamento quando acessamos um objeto.

    Estrutura:
    - Classes principais:
        - Subject: Interface comum para RealSubject e Proxy
        - RealSubject: O objeto real que o proxy representa.
        - Proxy: Controla o acesso ao RealSubject

    Quando usar:
    - Controle de acesso
    - Redução de carga(Lazy initialization, Virtual Proxy)
    - Controle de operações remotas(Remote Proxy)

    Benificios:
    - Controle adicional sobre o acesso ao objeto
    - Maior flexibilidade na implementação de politicas de acesso.

    Limitações:
    - Pode introduzir latencia adicional.
    - Pode aumentar a complexidade do sistema.

#### Padrão Flyweight
    Propósito: Usar compartilhamento para suportar grandes quantidades de objetos de forma eficiente.

    Contexto: Quando temos um grande numero de objetos similares e queremos reduzir o uso de momoria

    Estrutura:
    - Classes principais:
        - Flyweight: Interface para objetos que podem ser compartilhados
        - ConcreteFlyweight: Implementa a interface Flyweight e compartilha estado.
        - FlyweightFactory: Cria e gerencia objetos Flyweight

    Quandos usar:
    - Sistemas que necessitam crair grandes quantidades de objetos.
    - Aplicacoes que exigem otimização de memoria.

    Beneficios:
    - Redução significativa no uso de momoria.
    - Compartilhamento eficiente de objetos.

    Limitações:
    - Pode introduzir complexidade adicional.
    - A coordenação de estado intrinseco e extrinseco pode ser complicada.

#### Padrão Facade
    Proposito: Fornecer uma interface simplificada para um conjunto de interfaces em um subsitema.

    Contexto: Quando queremos simplificar a interação com um subsistema complexo

    Estrutura:
    - Classes principais:
        - Facade: Fornece métodos simplificados para os clientes.
        - Susystem Classes: Classes que compoem o subsistema complexo.

    Quando usar:
    - Simplificação de interações com subsistemas complexos.
    - Manutenção de código legivel e organizado

    Benefícios:
    - Simplifica a interface com subsistemas complexos.
    - Reduz a dependência entre clientes e subsistemas.

    Limitações:
    - Pode mascarar a complexidade real do subsistema.
    - O Facade pode se tornar um ponto unico de falha.

####  padrão Bridge
    Proposito: Desacoplar uma abstração de sua implementação para que as duas possam varias indepedentemente.

    Contexto: Quando se deseja evitar a ligação permanente entre uma abstração e sua implementação

    Estrutura:
    - Classes principais:
        - Abstraction: Define a interface  de controle
        - Implementor: Define a interface para a implementação
        - Concretelmplementor: Implementa a interface implementor
        - RefinedAbstraction: Estende a interface Abstraction.

    Quando usar:
    - Quando você quer que as abstrações e as implementações variem indepedentemente
    - Quando mudanças na implementação não devem afetar os clientes.

    Beneficios:
    - Desacopla abstrações de implementações.
    - Facilita a evolução das classes de abstração e implementação

    Limitações:
    - Pode aumentar a complexidade devido á maior quantidade de classes

#### Padrão Decorator
    Proposito: Adicionar responsabilidades a um objeto dinamicamente.

    Contexto: Quando queremos adicioanr funcionalidades a objetos individuais de maneira flexivel.

    Estrutura:
    - Classes principais:
        - Component: Interface comum para objetos que podem ter responsabilidades adicinadas.

        - ConcreteComponent: Implementação de objeto base

        - Decorator: Implementa Component e contem um componente Component.

        - ConcreteDecorator: Adiciona responsabilidades ao componente     


### Comportamentais:
    Lida com a comunicação dos objetos.
    Exemplos: Observer, Strategy, Commanand, State, Visitor, Mediator, Chain os Responsibility, Memento, Iterator, Template Method, Interpreter.

    