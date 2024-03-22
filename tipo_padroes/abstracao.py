class Bola:
    """
    Abstração: imagem mental subjetiva, irreal.
    """

    """
    Classe que define uma bola
    """
    
    def __init__(self, cor, circuferencia, material):

        """
        Funçao especial __init__ que define que a minha classe Bola
        deve ter os atributos cor, circuferencia e material
        """

        #print(self)

        self.cor = cor

        self.circuferencia = circuferencia

        self.material = material

    def trocaCor(self, nova_cor):

        self.cor = nova_cor
    
    def mostrarCor(self):

        print(self.cor);

bola = Bola('Verde', 100, 'Couro')

#print(bola)

print('Cor: ', bola.cor)

print('Circuferência: ', bola.circuferencia)

print('Material: ', bola.material)

bola.trocaCor('Azul')

print('Cor: ', bola.cor)

print('Circuferência: ', bola.circuferencia)

print('Material: ', bola.material)

bola.mostrarCor()


