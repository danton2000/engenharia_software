class Funcionario:
    """
        Classe Funcionário: Implemente a classe Funcionário.
        Um empregado tem um nome e um salário. Escreva um construtor com dois parâmetros (nome e salário) e métodos para devolver nome e salário.
        Devemos adicionar o método aumentarSalario (porcentualDeAumento) que aumenta o salário do funcionário em uma certa porcentagem.
        Exemplo de uso:
        harry=funcionário("Harry",25000)
        harry.aumentarSalario(10)
    """

    def __init__(self, nome, salario):

        """
        O encapsulamento refere-se à ideia de ocultar a implementação interna de uma classe ou objeto e fornecer apenas uma interface externa para interagir com ele.
        """

        self.__nome = nome

        self.__salario = salario

    @property
    def nome(self):

        return self.__nome

    @property
    def salario(self):

        return self.__salario

    @salario.setter
    def salario(self, salario):
        # Só atualiza salarios maiores que o salario atual
        if self.__salario < salario:

            self.__salario = salario

    def aumentar_salario(self, percentual_de_aumento):

        #enviou um pencetual, 10% = 110
        self.__salario *= ( (percentual_de_aumento / 100) + 1 )

    def __repr__(self):

        return f"nome: {self.__nome} salario: R$ {self.__salario:.2f}"

#Modulo Principal
if __name__ == '__main__':
    #Isolando os testes
    harry = Funcionario(
        nome = "Harry", salario = 25000
    )

    #harry.nome = 'D'

    print(harry)

    harry.aumentar_salario(10)

    harry.salario = 1000

    print(harry.salario)

    harry.salario = 30000

    print(harry.salario)