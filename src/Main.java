public class Main {
    public static void main(String[] args){

        try{
            for(int i=0;i<100;i++){
                System.out.println("Iteracion "+(i+1)+":");
                ClasePrincipal claseprincipal=new ClasePrincipal();
            }
        }catch (InterruptedException exc){
            System.out.println("Hilo interrumpido.");
        }
        System.out.println("Hilo principal finalizado.");
    }

}
