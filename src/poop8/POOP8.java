package poop8;

public class POOP8 {

    public static void main(String[] args) {
        Poligono poligono = new Poligono();
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        Triangulo triangulo = new Triangulo();
        
        System.out.println(" ");
        System.out.println("*****EJERCICIO 1*****");
        System.out.println(" ");
        System.out.println(poligono);
        System.out.println(cuadrilatero);
        System.out.println(triangulo);
        
        Poligono pol; //Variable que apunta al objeto Poligono 
        pol = new Poligono(); 
        System.out.println(pol);
        
        Object objeto;//Objeto que apunto a Poligono 
        objeto = pol; 
        System.out.println(objeto);
        
        pol = triangulo; 
        System.out.println(" ");
        System.out.println(pol);
        System.out.println(objeto);
        
        System.out.println(" ");
        System.out.println("*****EJERCICIO 2: POLIMORFIS DINAMICO*****");
        System.out.println(" ");
        getPoligono(cuadrilatero);
        getPoligono(triangulo);
        getPoligono(poligono);
        
        System.out.println(" ");
        System.out.println("*****EJERCICIO 3: CLASES ABSTRACTAS*****");
        System.out.println(" ");         
    }
    
    public static void getPoligono(Poligono p){
        if(p instanceof Triangulo){
            System.out.println("Esto es un triangulo");
        }else if(p instanceof Cuadrilatero){
            System.out.println("Esto es un cuadrilatero");
        }else{
            System.out.println("Esto es un poligono");
        }       
    }
}
