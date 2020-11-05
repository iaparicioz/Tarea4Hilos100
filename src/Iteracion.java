public class Iteracion extends Thread{
    ClasePrincipal clasePrincipal;
    public Iteracion(ClasePrincipal clasePrincipal) {

        public void run(){
            int dormido=0;
            int contador=0;
            dormido=ClasePrincipal.getNumRandom();
            try{
                sleep(dormido);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(" ha dormido por "+dormido+" milisegundos");
        }

    }
}
