# Instrucoes para clonar o projeto
git clone git@github.com:EmerF/aulas_bee_projeto_pratico2.git

cd aulas_bee_projeto_pratico2

Criando um fork.Esse comando cria uma cópia do projeto em seu repositório pessoal no GitHub

git remote add aulas_bee_projeto_pratico2 git@github.com:<seu_user_git_hub>/aulas_bee_projeto_pratico2.git

 onde: aulas_bee_projeto_pratico2 é nome do fork

 <seu_user_git_hub>: seu nome de usuário git hub
 
 aulas_bee_projeto_pratico2.git: endereço do repositorio original
  
# Crie uma branch com seu nome
git checkout -b emerson

#Fazer as alterações

git add .

git commit -m "Adicione uma descrição concisa das alterações aqui"

git push aulas_bee_projeto_pratico2 master

#Pull Request

Acessar https://github.com/EmerF/aulas_bee_projeto_pratico2/pull/new/emerson

criar um pull request de sua branch para a branch master


