FutureSkills Hub - Sistema de Gestão de Usuários

👥 Integrantes do Grupo
  João Víctor Flaitt - RM 553888
  Lucca Calsolari - RM 553678
  Miguel leal Tasso - RM 553009

🎯 Objetivo do Projeto
  Sistema para cadastro e gestão de usuários educacionais, integrado com serviços do IBGE para consulta de municípios. A plataforma visa facilitar o acesso à educação através de uma gestão eficiente de usuários e dados geográficos.

🚀 Funcionamento
O sistema permite:
  Cadastrar usuários com dados pessoais e endereço completo
  Listar todos os usuários cadastrados
  Consultar cidades brasileiras através da API do IBGE por estado
  Validação automática de dados de entrada
  Persistência em banco de dados MySQL com controle de versões

💡 Informações Adicionais
Estrutura do Código
  application/    → Controladores e DTOs
  domain/         → Entidades, Serviços e Regras de Negócio  
  infra/          → Repositórios e Integrações Externas
  config/         → Configurações da Aplicação

Tecnologias Utilizadas
  Java 17 com Spring Boot 3.1.4
  MySQL para persistência de dados
  Flyway para versionamento do banco
  API IBGE para consulta de municípios
  Swagger para documentação automática

Como Executar
  Configurar banco MySQL com nome 'futureskills'
  Executar a classe FutureSkillsHubApplication
  Acessar http://localhost:8080/swagger-ui.html para documentação
  Utilizar endpoints /api/users e /api/ibge/municipios/{uf}

Validações Implementadas
  Campos obrigatórios e formatos válidos
  E-mail único no sistema
  Tamanhos máximos de campos
  Tratamento de erros centralizado
