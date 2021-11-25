public class Principal{
    public static void main(String[] args){
        Retângulo retangulo = new Retângulo();
        retangulo.setBase(4);
        retangulo.setAltura(2);

        System.out.println(retangulo.getNomeFigura());
        System.out.println(retangulo.getArea());
        System.out.println(retangulo.getPerimetro());
    }
}