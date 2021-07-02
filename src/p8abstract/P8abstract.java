package p8abstract;

public class P8abstract{
    public static void main(String[] args) {
    
        Poligono poligono;
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        
        poligono = new Triangulo();
        System.out.println(poligono);
        
    }
}
