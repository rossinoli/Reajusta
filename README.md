# 📈 Reajusta - Calculadora de Aumento Salarial

O **Reajusta** é um aplicativo Android desenvolvido em **Java** para calcular o reajuste anual de colaboradores com base em faixas salariais específicas. O projeto foca na automação de cálculos trabalhistas simples, oferecendo uma interface centralizada e feedback personalizado com o nome do usuário.

## 🎯 Funcionalidades e Estrutura
O sistema processa o salário atual, valida os campos e aplica o percentual de aumento correspondente, exibindo o detalhamento completo.

| Recurso | Descrição | Componente Envolvido |
| :--- | :--- | :--- |
| **Identificação** | Campo para o nome do colaborador para saída personalizada. | `EditText` (inputType: textPersonName) |
| **Entrada de Salário** | Campo numérico para inserção do salário atual em Reais. | `EditText` (inputType: numberDecimal) |
| **Cálculo Automático** | Lógica de `if/else` que define a porcentagem por faixa. | Java Logic (MainActivity) |
| **Relatório de Saída** | Exibe salário antigo, % aplicada, valor do aumento e novo total. | `TextView` (String.format) |

## 📊 Regras de Negócio (Tabela de Reajustes)
O app segue os critérios técnicos abaixo para definir o aumento:
* **Salários até R$ 280,00 (inclusive)**: Aumento de **20%**.
* **Salários entre R$ 280,00 e R$ 700,00**: Aumento de **15%**.
* **Salários entre R$ 700,00 e R$ 1.500,00**: Aumento de **10%**.
* **Salários acima de R$ 1.500,00**: Aumento de **5%**.

## 🛠️ Configurações e Tecnologias
* **Linguagem:** Java (com suporte a `java.util.Locale` para formatação monetária).
* **Plataforma:** Android (SDK Nativa).
* **Interface:** XML (LinearLayout com gravidade centralizada).
* **IDE:** Android Studio.

## ⚙️ Instruções de Instalação (Setup)
Para rodar o projeto em sua máquina local ou emular no Android Studio:

1. **Clone o Repositório:**
   ```bash
   git clone (https://github.com/rossinoli/Reajusta.git)
