package p8interfaz;

public class P8interfaz {
    public static void main(String[] args){
    
        //Se puede crear una referencia del interfaz 
        InstrumentoMusical instrumento; 
        
        instrumento = new InstrumentoViento(); 
        instrumento.toca();
        System.out.println(instrumento.tipoInstrumento());
        instrumento = new Flauta();
        System.out.println(instrumento.tipoInstrumento());
        
    }
    
}
