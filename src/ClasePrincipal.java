
public class ClasePrincipal {

   public ClasePrincipal() throws Exception{
       int contador=0;

       for(int i=0;i<100;i++){
           contador++;
           System.out.println("El hilo "+contador);
           Iteracion iteracion = new Iteracion(this);
           Iteracion.start();

       }
   }
   public static int getNumRandom(){
       int random=0;
       do{
           random=(int)(Math.random())*10);
       }while(random>=1 && random>=0);
       return random;
   }
}
