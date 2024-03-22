# Verificando nome
def valida_nome():
    nome = ''
    while len(nome) < 3:
        nome = input('Nome: ')

# Verificando idade
def valida_idade():    
    idade = -1 
    while (idade < 0) or (idade > 150):

        try:
            idade = int(input('Idade: '))

        except ValueError:
            #print("Valor informado é invalido!, Digite um valor entre 0 e 150")
            pass
            #raise SystemExit
        
# Verificando Salário
salario = -1
def valida_salario():
    while salario <= 0:
        try:
            salario = float(input('Salário: '))
            
        except ValueError:
            #print("Valor informado é invalido!, Digite um salario maior que 0")
            pass
            #raise SystemExit

# Verificando Sexo
def valida_sexo():
    sexo = ''
    while (sexo != 'F') and (sexo != 'M'):
        sexo = input('Sexo (F/M): ')

# Verificando Estado
def valida_estado_civil():
    estado_civil = ''
    while ((estado_civil != 'S') and
        (estado_civil != 'C') and
        (estado_civil != 'V') and
        (estado_civil != 'D')):
        estado_civil = input('Estado Civil (S/C/V/D): ')