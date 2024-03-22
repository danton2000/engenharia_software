# arquivo calc.py
def media (lista):

    return float( sum(lista ) ) / len(lista)

#caso seja principal faça um teste
if __name__ == '__main__':

    print('Execução de teste')

    lista_teste = [10, 40, 50]

    print(media (lista_teste) )