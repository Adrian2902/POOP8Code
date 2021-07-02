package p8abstract;

public class Cuadrilatero extends Poligono {
    
    private int alfa, beta, gama; 
    private float a, b;
    private float base, altura;
    
    
    public Cuadrilatero() {
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float perimetro(){
        return 4*a;
    }

    @Override
    public float area(){
        return a*a;
    }
   
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
}
