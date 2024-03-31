from __future__ import annotations
from abc import ABC, abstractmethod


class Construcao(ABC):
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

        # Call the factory method to create a Product object.
        product = self.factory_method()

        # Now, use the product.
        result = f"Construção: O código do mesmo criador acabou de funcionar com {product.operation()}"

        return result


"""
Concrete Creators override the factory method in order to change the resulting
product's type.
"""


class ConstrucaoEdificio(Construcao):
    """
    Note that the signature of the method still uses the abstract product type,
    even though the concrete product is actually returned from the method. This
    way the Creator can stay independent of concrete product classes.
    """

    def factory_method(self) -> ConstrucaoDeCasas:
        return ConstruindoEdificio()


class ConstrucaoCastelo(Construcao):
    def factory_method(self) -> ConstrucaoDeCasas:
        return ConstruindoCastelo()


class ConstrucaoDeCasas(ABC):
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


class ConstruindoEdificio(ConstrucaoDeCasas):
    def operation(self) -> str:
        return "{Resultado da ConstruindoEdificio}"


class ConstruindoCastelo(ConstrucaoDeCasas):
    def operation(self) -> str:
        return "{Resultado da ConstruindoCastelo}"


def codigo_engenheiro(construcao: Construcao) -> None:
    """
    The client code works with an instance of a concrete creator, albeit through
    its base interface. As long as the client keeps working with the creator via
    the base interface, you can pass it any creator's subclass.
    """

    print(f"Engenheiro: Não conheço a classe do criador, mas ainda funciona.\n"
          f"{construcao.alguma_operacao()}", end="")


if __name__ == "__main__":
    print("App: Começando com a ConstrucaoEdificio.")
    codigo_engenheiro(ConstrucaoEdificio())
    print("\n")

    print("App: Começando com ConstrucaoCastelo.")
    codigo_engenheiro(ConstrucaoCastelo())