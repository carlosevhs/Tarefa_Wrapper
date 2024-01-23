public class TarefaWrapper {
    public static void main (String[] args) {

        int valorPrimitivo = 10;

        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        System.out.println("Valor (primitivo): " + valorPrimitivo);
        System.out.println("Valor convertido (wrapper): " + valorWrapper);


    }
}
