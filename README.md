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
### **Arquivo main:**
#### *Arquivo onde esta "rodando" a aplicação.*

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

##### OBS:Código feito e Executado via "Eclipse".
---
## Trabalho_Heloisa2:
### Objetivo:
#### Refatorar um código que está excessivamente complexo, 
#### tornando-o mais simples, claro e direto, sem alterar sua 
#### funcionalidade.

### Descrição:
##### O código a seguir verifica se um número é par ou ímpar, mas 
##### está com lógica e estrutura mais complicadas do que o necessário. 

#

### Resultado
### **Arquivo main:**
#### *Arquivo onde esta "rodando" a aplicação.*

![image](https://github.com/user-attachments/assets/038a79c9-8f19-4ca5-93c2-fda9bf26c6ba)

### **Arquivo**
### *Arquivo onde verifica se o numero é Par ou Impar*

![image](https://github.com/user-attachments/assets/f93b6236-5ce9-47b6-b070-42783c9b828c)

# Considerações Finais:
O princípio KISS — Keep It Simple, Stupid (em português, "Mantenha Simples, Estúpido") — é uma filosofia de design que valoriza a simplicidade e clareza. Ele é amplamente usado em áreas como engenharia, desenvolvimento de software, design gráfico, redação, e até na vida pessoal e negócios. Aqui vão as principais vantagens do KISS:

#### ✅ 1. Facilidade de manutenção
##### Soluções simples são mais fáceis de entender e modificar no futuro. Menos código ou menos complexidade = menos dor de cabeça.
#### ✅ 2. Menor chance de erros
##### Quanto mais complexo algo é, maiores as chances de falhas. A simplicidade reduz a probabilidade de bugs ou mal-entendidos.
#### ✅ 3. Melhor desempenho
##### Soluções simples tendem a ser mais eficientes, exigindo menos recursos computacionais e tempo de execução.
#### ✅ 4. Curva de aprendizado menor
##### Pessoas novas no projeto ou ideia conseguem entender mais rápido e contribuir com mais facilidade.
#### ✅ 5. Comunicação mais clara
##### Quando tudo é direto e simples, é mais fácil comunicar ideias, seja em uma equipe ou com clientes.
#### ✅ 6. Agilidade na entrega
##### Soluções mais simples geralmente são mais rápidas de implementar, o que ajuda a entregar resultados mais cedo.
### ✅ 7. Mais fácil de testar
#### Uma estrutura simples permite testes mais diretos, economizando tempo de QA e aumentando a confiabilidade do produto.
### ✅ 8. Reduz o custo a longo prazo
#### Com menos manutenção, menos bugs e mais entendimento, os custos operacionais e de suporte caem.
