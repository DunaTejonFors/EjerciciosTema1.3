public class Main {
    public static void main(String[] args) {

        suma(15, 3, 1);

        Coche miCoche = new Coche();
        miCoche.AñadirPuertas();
        miCoche.AñadirPuertas();
        miCoche.AñadirPuertas();

        System.out.println(miCoche.num_puertas);
    }
    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }

}
class Coche{
    public int num_puertas = 4;
    public void AñadirPuertas() {
        this.num_puertas++;}

    }