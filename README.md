# 🏀 BolaPOO

![Java](https://img.shields.io/badge/Java-17-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)
![License](https://img.shields.io/badge/License-MIT-yellow)

---

## 📖 Descrição

Este projeto implementa a **classe Bola** em **Java**, aplicando os princípios da **Programação Orientada a Objetos (POO)**, principalmente:  

- **Encapsulamento** 🔒  
- **Ocultação de informações** 🛡️  
- **Sobrecarga de construtores** ⚙️  

A classe possui **atributos privados** e **métodos públicos**, garantindo acesso seguro aos dados.

---

## 🏷️ Atributos

| Atributo  | Tipo    | Descrição                       |
|-----------|--------|---------------------------------|
| `material`  | `String` | Material da bola                |
| `cor`       | `String` | Cor da bola                     |
| `tamanho`   | `int`    | Tamanho da bola                 |
| `cheia`     | `boolean`| Indica se a bola está cheia     |

> Todos os atributos são **private**, seguindo o princípio de **encapsulamento**.

---

## ⚡ Construtores

1️⃣ **Construtor padrão**

Bola bola = new Bola();

2️⃣ Construtor com todos os atributos

Bola bola = new Bola("Borracha", "Vermelha", 5, true);

3️⃣ Construtor com cor e tamanho

Bola bola = new Bola("Azul", 3);

---

🔧 Métodos
Getters e Setters

Permitem acessar e modificar os atributos de forma segura:

bola.getCor();
bola.setMaterial("PVC");

---

Métodos específicos

bola.pintar("Amarela"); // Altera a cor da bola
bola.encher();           // Marca a bola como cheia
bola.esvaziar();         // Marca a bola como vazia

---

💡 Conceitos aplicados

🔒 Encapsulamento: atributos privados + métodos públicos (getters/setters).

🛡️ Ocultação de informações: atributos não acessíveis diretamente fora da classe.

⚙️ Sobrecarga de construtores: permite criar bolas de diferentes formas.

---

🔗 Repositório

Acesse o código no GitHub:
https://github.com/CrisleiKeliJenuino/BolaPOO

---

🚀 Como usar

Clone o repositório: git clone https://github.com/CrisleiKeliJenuino/BolaPOO.git

Compile a classe: javac Bola.java

Execute e teste os métodos: java Bola
