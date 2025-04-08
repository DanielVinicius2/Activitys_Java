# EXPLICANDO FOLDERS:

## Trabalho_Heloisa:
### Objetivo:
##### Refatorar um código eliminando repetições e aplicando boas 
##### práticas de Programação Orientada a Objetos (POO)

### Descrição:
##### O código calcula o preço final de diferentes produtos considerando descontos específicos.
##### No entanto, ele contém repetições desnecessárias.

#  

### Resultado:
### **Arquivo main:Arquivo onde esta "rodando" a aplicação.**

![image](https://github.com/user-attachments/assets/9da040d6-d90d-459a-841e-a72b16ef27f4)

#

### **Arquivo Produto:** 
#### *Arquivo responsável por armazenar as informações principais e obrigatorias do Produto*
- Nome do Produto (`nome`)
- Preço do Produto (`preco`)

**Uso do `private`:**
- O uso do Private reforça a Ideia do Encapsulamento

![image](https://github.com/user-attachments/assets/649e9d75-57e5-4c07-88ee-97ff5f5a14c5)

# 

### **Arquivo DescontoProduto:**
#### *Arquivo responsável por armazenar informações relacionadas ao Desconto dos Produtos*
- Valor do Desconto (`desconto`)

**Uso do `private`:**
- O uso do Private reforça a Ideia do Encapsulamento

![image](https://github.com/user-attachments/assets/da2444f5-7f77-4410-99a5-12f9c6977723)

# 

### **Arquivo PrecoFinalProduto:**
#### *Arquivo responsável por armazenar informações relacionadas ao cálculo do Preço Final Do Produto*
- Classe Produto (`produto`)
- Classe DescontoProduto (`desconto`)

**Uso do `private`:**
- O uso do Private reforça a Ideia do Encapsulamento

![image](https://github.com/user-attachments/assets/40e25f0e-5a67-496a-a84b-9242f5b7989f)

#

**Resultado(OutPut):**

![image](https://github.com/user-attachments/assets/580516d4-8498-44fd-bd4f-ea060c85a6e3)

# CONSIDERAÇÕES FINAIS:
#### Neste Projeto foi possivel Perceber a Importância do uso do "DRY"(*"Don't Repeat Yourself"*), visto que, após o uso do "DRY" o código fica visivelmente mais "limpo", principalmente por possuir menos linhas de código no arquivo "MAIN"
#### Além disso, é possivel perceber mais facilmente erros no código, facilitando refatorações futuras.



