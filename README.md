# Projeto Tecnologia Java e Orientação a Objetos

### Objetivo:
#### Criar um projeto que organize as regras de negocios de solicitações de pedidos, produtos e solicitantes. Deve-se ter: 
- Uma classe mãe abstrata
- Três classes filhas
- Uma classe concreta sem mãe
- Uma classe principal que tenha dois relacionamentos:
  - 1:1 com a classe concreta
  - 1:n com a classe mãe


<details>
  <summary><h4>UML fornecida para o projeto</h4></summary>

![Tecnologia Java e OrientaÃ§Ã£o a Objetos-imagemPD](https://github.com/YohanDevPs/edu-infet-java-POO/assets/87953006/dc20c14e-e269-48c6-849a-b1deba251a4c)
</details>

### Como funciona:
1. Após configurar o ambiente e compilar o projeto, um dialog será aberto pedindo o caminho de um arquivo txt. Será necessario criar esse arquivo manualmente com informações do solicitante, que são:
   - Nome
   - CPF
   - E-mail
  
    <details>
      <summary>1.1 Print do Dialog</summary>
    
    ![image](https://github.com/YohanDevPs/edu-infet-java-POO/assets/87953006/7bd4147d-03f6-4d9e-a906-abd1a357169d)
    </details>
         

2. Após o primeiro passo, informe as informações sobre o pedido no console da IDE. Como por exemplo, selecionar se o pedido será feito pela web, ou se deseja comida vegana ou não vegana, se deseja bebida gelada.
    <details>
          <summary>2.1 Print do console</summary>
        
     ![image](https://github.com/YohanDevPs/edu-infet-java-POO/assets/87953006/c792a975-5e74-4746-819b-143dcc8525ec)
    </details>
   - OBS: Se inserir informações inválidas, o programa irá disparar excessões.
    

3. Ao final, será gerado um arquivo "arquivo_pedido.txt" no mesmo caminho informado no dialog no inicio do programa, no qual conterá informações sobre o pedido, preços e solicitante.
    <details>
      <summary>3.1 Print do "arquivo_pedido.txt"</summary>
    
    ![image](https://github.com/YohanDevPs/edu-infet-java-POO/assets/87953006/55827770-5318-4842-b6b2-8ffd346920a4)
    </details>

