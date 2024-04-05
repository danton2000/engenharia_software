from __future__ import annotations
from abc import ABC, abstractmethod


class Criador(ABC):
    """
    A classe Creator declara o método de fábrica que deve retornar um
    objeto de uma classe Produto. As subclasses do Creator geralmente fornecem o
    implementação deste método.
    """

    @abstractmethod
    def factory_method(self):
        """
        Observe que o Criador também pode fornecer alguma implementação padrão de
        o método de fábrica.
        """
        pass

    def some_operation(self) -> str:
        """
        Observe também que, apesar do nome, a responsabilidade primária do Criador
        não está criando produtos. Geralmente, ele contém alguma lógica de negócios central
        que depende de objetos Product, retornados pelo método factory.
        As subclasses podem alterar indiretamente essa lógica de negócios, substituindo o
        método de fábrica e devolver um tipo diferente de produto dele.
        """

        # Chame o método fábrica para criar um objeto Produto.
        profissao = self.factory_method()

        # Agora, use o produto.
        resultado = f"Creator: The same creator's code has just worked with {profissao.operation()}"

        return resultado


"""
Os Criadores Concretos substituem o método de fábrica para alterar o resultado
tipo de produto.
"""


class CriadorAnalista(Criador):
    """
    Observe que a assinatura do método ainda usa o tipo abstrato de produto,
    mesmo que o produto concreto seja realmente retornado do método. Esse
    maneira como o Criador pode permanecer independente de classes concretas de produtos.
    """

    def factory_method(self) -> CietistaDeDados:
        return AnalistaConcreto()


class CriadorEngenheiro(Criador):
    def factory_method(self) -> CietistaDeDados:
        return EngenheiroConcreto()


class CietistaDeDados(ABC):
    """
    A interface Produto declara as operações que todos os produtos concretos
    deve implementar.
    """

    @abstractmethod
    def operation(self) -> str:
        pass


"""
Os Produtos Concretos fornecem várias implementações da interface do Produto.
"""


class AnalistaConcreto(CietistaDeDados):
    def operation(self) -> str:
        return "{Resultado do AnalistaConcreto}"


class EngenheiroConcreto(CietistaDeDados):
    def operation(self) -> str:
        return "{Resultado do EngenheiroConcreto}"


def client_code(creator: Criador) -> None:
    """
    O código cliente funciona com uma instância de um criador concreto, ainda que através
    sua interface básica. Contanto que o cliente continue trabalhando com o criador via
    a interface base, você pode passá-la para qualquer subclasse de criador.
    """

    print(f"Client: I'm not aware of the creator's class, but it still works.\n"
          f"{creator.some_operation()}", end="")


if __name__ == "__main__":
    print("Profissão: Sou Analista de Dados.")
    client_code(AnalistaConcreto())
    print("\n")

    # print("Profissão: Sou Engenheiro de Dados.")
    # client_code(EngenheiroConcreto())