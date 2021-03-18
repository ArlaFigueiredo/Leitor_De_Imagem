# Leitor_de_Imagem

--> Versão 1.0

# Classe CorRGB

ii.a representação estática da classe criada

iii.os métodos que lêem e alteram os valores das componentes RGB da cor

iv.um método que leia a luminosidade da cor

v.construtores sobrecarregados que permitam a criação de uma cor
  i.um construtor de cópia, que crie uma cor idêntica (mesmo valor de R, G e B)
  ii.um construtor sem parâmetros, que crie a cor preta (<R=0, G=0, B=0>)
  iii.um construtor que receba três valores como parâmetros e crie uma considerando estes valores como os valores de R, G e B, respectivamente

vi.um método que verifique se duas cores são iguais. As cores são consideradas iguais se seus valores de R, G e B são idênticos entre si (o R de uma cor igual o R da outra e assim por diante)

vii.altere as propriedades Red, Green e Blue e Luminosidade para serem exclusivamente leitura

viii.um método que gere uma representação String da cor como hexadecimal. A representação é composta pelo caracter # seguida de dois dígitos representando o valor de R, G e B em hexadecimal. Por exemplo, para a cor RGB, onde R=37, G=150, B=190, o método deve retornar: #2596BE

ix.um método clarear que receba um valor e modifique a tonalidade da cor em questão a tornando mais clara. Para isso, o método deve modificar os valores RGB, para um novo valor p percentual menor, onde  p deve ser indicado como parâmetro. Por exemplo, para a cor  #2596BE, se o parâmetro de clarear for 0.1 (10%), a cor deve se tornar #2187ab.

x. um método escurecer que receba um valor e modifique a tonalidade da cor em questão a tornando mais escura. Para isso, o método deve modificar os valores RGB, para um novo valor p percentual maior, onde p deve ser indicado como parâmetro. Por exemplo, para a cor  #2596BE, se o parâmetro de escurecer for 0.1 (10%), a cor deve se tornar #2187AB.

xi.Um método que retorne uma nova instância de CorRGB, igual a cor que recebeu a mensagem


