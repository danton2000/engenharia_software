from __future__ import annotations
from abc import ABC, abstractmethod


<<<<<<< HEAD
class Criador(ABC):
=======
class Construcao(ABC):
>>>>>>> 5d67f3ec592ff610578ca92784a72af7fff6e9ed
    """
    The Creator class declares the factory method that is supposed to return an
    object of a Product class. The Creator's subclasses usually provide the
    implementation of this method.
    """

    @abstractmethod
    def factory_method(self):
        """
        Note that the Creator may also provide some default implementation of
        the factory method.
        """
        pass

    def alguma_operacao(self) -> str:
        """
        Also note that, despite its name, the Creator's primary responsibility
        is not creating products. Usually, it contains some core business logic
        that relies on Product objects, returned by the factory method.
        Subclasses can indirectly change that business logic by overriding the
        factory method and returning a different type of product from it.
        """

<<<<<<< HEAD
        # Chame o método fábrica para criar um objeto Produto.
        profissao = self.factory_method()

        # Agora, use o produto.
        resultado = f"Creator: The same creator's code has just worked with {profissao.operation()}"
=======
        # Call the factory method to create a Product object.
        product = self.factory_method()

        # Now, use the product.
        result = f"Construção: O código do mesmo criador acabou de funcionar com {product.operation()}"
>>>>>>> 5d67f3ec592ff610578ca92784a72af7fff6e9ed

        return resultado


"""
Concrete Creators override the factory method in order to change the resulting
product's type.
"""


<<<<<<< HEAD
class CriadorAnalista(Criador):
=======
class ConstrucaoEdificio(Construcao):
>>>>>>> 5d67f3ec592ff610578ca92784a72af7fff6e9ed
    """
    Note that the signature of the method still uses the abstract product type,
    even though the concrete product is actually returned from the method. This
    way the Creator can stay independent of concrete product classes.
    """

<<<<<<< HEAD
    def factory_method(self) -> CietistaDeDados:
        return AnalistaConcreto()


class CriadorEngenheiro(Criador):
    def factory_method(self) -> CietistaDeDados:
        return EngenheiroConcreto()


class CietistaDeDados(ABC):
=======
    def factory_method(self) -> ConstrucaoDeCasas:
        return ConstruindoEdificio()


class ConstrucaoCastelo(Construcao):
    def factory_method(self) -> ConstrucaoDeCasas:
        return ConstruindoCastelo()


class ConstrucaoDeCasas(ABC):
>>>>>>> 5d67f3ec592ff610578ca92784a72af7fff6e9ed
    """
    The Product interface declares the operations that all concrete products
    must implement.
    """

    @abstractmethod
    def operation(self) -> str:
        pass


"""
Concrete Products provide various implementations of the Product interface.
"""


<<<<<<< HEAD
class AnalistaConcreto(CietistaDeDados):
    def operation(self) -> str:
        return "{Resultado do AnalistaConcreto}"


class EngenheiroConcreto(CietistaDeDados):
    def operation(self) -> str:
        return "{Resultado do EngenheiroConcreto}"


def client_code(creator: Criador) -> None:
=======
class ConstruindoEdificio(ConstrucaoDeCasas):
    def operation(self) -> str:
        return "{Resultado da ConstruindoEdificio}"


class ConstruindoCastelo(ConstrucaoDeCasas):
    def operation(self) -> str:
        return "{Resultado da ConstruindoCastelo}"


def codigo_engenheiro(construcao: Construcao) -> None:
>>>>>>> 5d67f3ec592ff610578ca92784a72af7fff6e9ed
    """
    The client code works with an instance of a concrete creator, albeit through
    its base interface. As long as the client keeps working with the creator via
    the base interface, you can pass it any creator's subclass.
    """

    print(f"Engenheiro: Não conheço a classe do criador, mas ainda funciona.\n"
          f"{construcao.alguma_operacao()}", end="")


if __name__ == "__main__":
<<<<<<< HEAD
    print("Profissão: Sou Analista de Dados.")
    client_code(AnalistaConcreto())
    print("\n")

    # print("Profissão: Sou Engenheiro de Dados.")
    # client_code(EngenheiroConcreto())
=======
    print("App: Começando com a ConstrucaoEdificio.")
    codigo_engenheiro(ConstrucaoEdificio())
    print("\n")

    print("App: Começando com ConstrucaoCastelo.")
    codigo_engenheiro(ConstrucaoCastelo())
>>>>>>> 5d67f3ec592ff610578ca92784a72af7fff6e9ed
