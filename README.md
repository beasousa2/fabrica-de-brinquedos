# 🎮 Fábrica de Brinquedos

Bem-vindo à **Fábrica de Brinquedos**! Este projeto é um exemplo prático que utiliza o Spring Boot para demonstrar padrões de projeto como **Factory Method** e **Abstract Factory**, além de incluir documentação e testes interativos com o **Swagger**.

---

## 📋 Funcionalidades

- Gerenciamento de fábricas de brinquedos com os padrões de projeto:
  - **Factory Method** para criar brinquedos específicos.
  - **Abstract Factory** para criar temas inteiros de brinquedos (ex.: Natal e Espaço).
- API documentada e interativa com **Swagger UI**.
- Fácil de executar e expandir com o Spring Boot.

---

## 🚀 Tecnologias utilizadas

- **Java 21**
- **Spring Boot 3.4.0**
- **Springdoc OpenAPI** (Swagger)
- **Maven** para gerenciamento de dependências

---

## 🛠️ Como executar o projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/beasousa2/fabrica-de-brinquedos.git
   cd fabrica-de-brinquedos
   ```

2. **Certifique-se de que o Java e Maven estão instalados.**
   - Verifique com:
     ```bash
     java -version
     mvn -version
     ```

3. **Instale as dependências:**
   ```bash
   mvn clean install
   ```

4. **Inicie a aplicação:**
   ```bash
   mvn spring-boot:run
   ```

5. **Acesse a API:**
   - Documentação Swagger: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
   - Endpoints disponíveis:
     - `/brinquedos/carrinho` - Cria um carrinho.
     - `/brinquedos/boneca` - Cria uma boneca.
     - `/temas/natal` - Cria brinquedos com o tema de Natal.
     - `/temas/espaco` - Cria brinquedos com o tema espacial.

---

## 📚 Exemplos de uso

### Criar um carrinho (Factory Method)
```bash
GET http://localhost:8080/brinquedos/carrinho
```
**Resposta:**
```json
"Carrinho criado!"
```

### Criar brinquedos de Natal (Abstract Factory)
```bash
GET http://localhost:8080/temas/natal
```
**Resposta:**
```json
"Carrinho de Natal criado! e Boneca de Natal criada!"
```

---

## 🛡️ Testando a API

1. Acesse a documentação interativa do Swagger em:  
   [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

2. Teste os endpoints diretamente pelo navegador.

---

## 📜 Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter mais detalhes.

---

## 🤝 Contribuições

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do projeto.
2. Crie sua feature branch:
   ```bash
   git checkout -b feature/sua-feature
   ```
3. Commit suas alterações:
   ```bash
   git commit -m "Adicionei uma nova feature"
   ```
4. Envie para o repositório remoto:
   ```bash
   git push origin feature/sua-feature
   ```
5. Abra um Pull Request.

---

## ✨ Autor

- **Beatriz Sousa**
  - LinkedIn: [Beatriz Sousa](https://www.linkedin.com/in/bea-sousa-20/)
  - Email: beasousa20@outlook.com
