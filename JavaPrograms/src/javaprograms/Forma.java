
/*Atividade 10: Sistema de Gestão de Formas Geométricas

Desenvolva um sistema para gerenciar e calcular propriedades de formas geométricas.

Interface: Crie uma interface chamada Forma com os métodos:

double getArea(): Calcula e retorna a área da forma.

double getPerimetro(): Calcula e retorna o perímetro da forma.

Classes: Implemente classes imutáveis para as seguintes formas:

Circulo: Propriedade: raio.

Retangulo: Propriedades: largura e altura.

Classe de Teste: No método main, crie uma lista de Forma e adicione instâncias de Circulo e Retangulo. Em seguida, itere sobre a lista e imprima a área e o perímetro de cada forma.

Dica: Utilize a constante Math.PI para os cálculos do círculo.
*/

//package javaprograms;

public interface Forma {
    double getArea ();
    double getPerimetro();
    
}
