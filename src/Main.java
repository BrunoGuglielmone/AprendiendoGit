public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema!");
        try{
            int var = 7/0;
        } catch (Exception e){
            System.out.println("No se puede dividir por 0");
        }
    }
}