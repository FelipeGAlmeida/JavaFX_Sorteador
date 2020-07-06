<p align="center">
  <img src="/Resources/sample/icon.png" />
</p>

<h1 align="center">Sorteador de números</h1>

Aplicação para sorteio de números aleatórios dentro de um intervalo predefinido. Foi criada apenas para com o intuito de testar o desenvolvimento de interface gráfica utilizando a biblioteca JavaFX.

## Funcionamento

Ao executar o projeto, ou o _.JAR_ disponível em _/out/artifacts/ProjetoBase_jar/ProjetoBase.jar_, a aplicação se iniciará.

<p align="center">
  <img src="/Screenshots/ScrShot0.PNG" />
</p>

A utilização é simples e intuitiva, basta selecionar um intervalo de valores (padrão é de 0 a 100) e então tocar sobre o botão **Sortear** na parte inferior.
O intervalo de valores definido inclui os dois valores entrados.

<p align="center">
  <img src="/Screenshots/ScrShot1.PNG" />
</p>

O sorteio se iniciará exibindo diversos valores dentre os possíveis, promovendo um efeito de animação. Essa exibição se inicia em um intervalo de tempo mais rápido e vai se tornando mais lenta com o passar do tempo.
Esse efeito foi pensado de forma a aumentar a tensão enquanto ocorre o sorteio.

<p align="center">
  <img src="/Screenshots/ScrShot2.PNG" />
</p>

Uma vez que o efeito está lento, os valores param de ser exibidos, revelando o número sorteado e colocando-o com a cor verde.

Durante o sorteio, enquanto os números ainda estiverem animando, o botão sortear fica desabilitado até que o sorteio termine.

Caso o intervalo de valores seja inválido, por exemplo, começando a partir de um número menor que o número final, um erro é exibido na tela alertando o usuário.
