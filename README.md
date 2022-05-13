# CTD | Programação Orientada à Objetos | POO
<h5>Prof. Marcelo Gonçalves de Souza</h5>

<h3>Ferramentas - Downloads</h3>
<ul>
  <li><strong>Java SE Development Kit 17.0.3.1</strong></li>
  <ul>
	<li><strong>Windows x64 Compressed Archive</strong></li>     
		https://download.oracle.com/java/17/archive/jdk-17.0.3.1_windows-x64_bin.zip	  
	<li><strong>Linux x64 Compressed Archive</strong></li>     
		https://download.oracle.com/java/17/archive/jdk-17.0.3.1_linux-x64_bin.tar.gz	  
	<li><strong>macOS x64 Compressed Archive</strong></li>	  
		https://download.oracle.com/java/17/archive/jdk-17.0.3.1_macos-x64_bin.tar.gz	  
  </ul>
</ul>

<ul>
  <li><strong>IntelliJ IDEA</strong></li>
  <ul>
	<li><strong>Windows x64</strong></li>     
	https://www.jetbrains.com/es-es/idea/download/download-thanks.html?platform=windows&code=IIC	  
	<li><strong>Linux x64</strong></li>     
    https://www.jetbrains.com/es-es/idea/download/download-thanks.html?platform=linux&code=IIC
	<li><strong>macOS x64</strong></li>	  
    https://www.jetbrains.com/es-es/idea/download/download-thanks.html?platform=mac&code=IIC
  </ul>
</ul>

<ul>
  <li><strong>Drawio UML</strong></li>
  https://app.diagrams.net/
</ul>

<h3>Atalhos para o IntelliJ IDEA</h3>
<ul>
  <li><strong>F1:</strong> Abre o browser padrão no Help de noções básicas do editor.</li>
  <li><strong>F3:</strong> Habilita a barra de pesquisa (search).</li>
  <li><strong>F5:</strong> Abre assistente para copiar(duplicar) uma classe.</li>
  <li><strong>F6:</strong> Abre assistente para mover membros estáticos.</li>
  <li><strong>F9:</strong> Abre assistente para o Debug do código.</li>
  <li><strong>F10:</strong> Abre o menu File.</li>
  <li><strong>F11:</strong> Adiciona um bookmark (anotações de tarefas/problemas) na linha corrente.</li>
  <li><strong>F12:</strong> Restaura a guia do console.</li>
</ul>

<ul>
  <li><strong>Alt + Insert:</strong> Abre o menu generate.</li>
  <li><strong>Alt + Enter:</strong> Abre sugestões automáticas.</li>
  <li><strong>Ctrl + d:</strong> Duplica a linha corrente.</li>
  <li><strong>Digitar main + TAB:</strong> Autocompleta o método main.</li>
  <li><strong>Digitar sout + TAB:</strong> Autocompleta o System.out.println.</li>
</ul>

<h3>Tipos de dados primitivos em Java</h3>
<ul>
  <li><strong>byte:</strong> Inteiros Pequenos:</li>
      <ul>
		  <li>Tamanho: 8 bits (1 byte)</li>
	      <li><strong>-128</strong></li>
	      <li><strong>127</strong></li>
      </ul>
  <li><strong>short:</strong> Inteiros:</li>
      <ul>
		  <li>Tamanho: 16 bits (2 bytes)</li>
	      <li><strong>-32768</strong></li>
	      <li><strong>32767</strong></li>
      </ul>
  <li><strong>int:</strong> Inteiros grandes:</li>
      <ul>
		  <li>Tamanho: 32 bits (4 bytes)</li>
	      <li><strong>-2.147.483.648</strong></li>
	      <li><strong>2.147.483.647</strong></li>
      </ul>
  <li><strong>long:</strong> Inteiros muito grandes:</li>
      <ul>
		  <li>Tamanho: 64 bits (8 bytes)</li>
	      <li><strong>-9.223.372.036.854.775.808</strong></li>
	      <li><strong>9.223.372.036.854.775.807</strong></li>
      </ul>
  <li><strong>float:</strong> Número com vírgula, menor capacidade:</li>
      <ul>
		  <li>Tamanho: 32 bits (4 bytes)</li>
	      <li><strong>-3,402823e38</strong></li>
	      <li><strong>3,402823e38</strong></li>
      </ul>
  <li><strong>double:</strong> Número com vírgula, maior capacidade:</li>
	  <ul>
		  <li>Tamanho: 64 bits (8 bytes)</li>
	      <li><strong>-1,79769313486232e308</strong></li>
	      <li><strong>1,79769313486232e308</strong></li>
      </ul>
  <li><strong>String:</strong> Cadeia de caracteres.</li>
  <li><strong>char:</strong> Um caractere (Ex: 'a') Unicode.</li>
	  <ul>
		  <li>Tamanho: 16 bits (2 bytes)</li>
	      <li><strong>0</strong></li>
	      <li><strong>65535</strong></li>
      </ul>
  <li><strong>boolean:</strong> Verdadeiro ou falso (true/false).</li>
	  <ul>
		  <li>Tamanho: 1 bit</li>
	      <li><strong>false</strong></li>
	      <li><strong>true</strong></li>
      </ul>
</ul>

<h3>Classe Scanner - entrada de dados via console</h3>
<ul>
  <li><strong>Scanner sc = new Scanner(System.in);</strong></li>
  <li><strong>sc.next()</strong> - para ler uma palavra (texto sem espaços);</li>
  <li><strong>sc.next().charAt(0)</strong> - para ler um caractere;</li>
  <li><strong>sc.nextLine()</strong> - para ler um texto até a quebra de linha;</li>
  <li><strong>sc.nextInt</strong> - para ler um número inteiro;</li>
  <li><strong>sc.nextFloat()</strong> - para ler um número do tipo float com ponto flutuante.</li>
  <li><strong>sc.nextDouble()</strong> - para ler um número do tipo double com ponto flutuante.</li>
</ul>

<h3>Tipos de saídas via console</h3>
<ul>
  <li><strong>System.out</strong></li>
  <ul>
    <li><strong>System.out.print</strong> - Escrever na tela sem quebra de linha.</li>
  </ul>
  <ul>
    <li><strong>System.out.println</strong> - Escrever na tela com quebra de linha.</li>
  </ul>
  <ul>
    <li><strong>System.out.printf</strong> - Escrever na tela de forma incorporada textos e váriáveis.</li>
	  <ul>
	    <li>%d - inteiro</li>
	    <li>%f - ponto flutuante</li>
	    <li>%s - texto</li>
	    <li>%n - quebra de linha</li>
	  </ul>
  </ul>
</ul>