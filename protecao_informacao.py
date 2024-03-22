"""
A segurança da informação é a área do conhecimento que cuida da proteção dos dados. 
"""

# Lista de dicionário com 2 usuários e 1 administrador
usuarios = [
    {
    "nome": "Danton Rodrigues",
    "email": "danton@email.com",
    "tipo_adm": 0
    },
    {
    "nome": "Daniel Rodrigues",
    "email": "daniel@email.com",
    "tipo_adm": 0
    },
    {
    "nome": "Administrador",
    "email": "adm@email.com",
    "tipo_adm": 1
    }
]

email = input("Email: ")

for usuario in usuarios:

    #print(usuario)

    if usuario["email"] == email:

        print(f"""Mostrando dados de usuário: {usuario["nome"]}""")

        print(f"""Nome: {usuario["nome"]}""")
        print(f"""E-mail: {usuario["email"]}""")
    

    if usuario["email"] == email and usuario["tipo_adm"] == 1:

        print("Mostrando todos os usuários")

        for usuario in usuarios:

            if email != usuario["email"]:
                print(f"""Nome: {usuario["nome"]}""")
                print(f"""E-mail: {usuario["email"]}""")
                print("---")
    