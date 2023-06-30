package Entidades;

/**
 *
 * @author bruno
 */
public class DivisionNumero {

    public float division(String _A, String _B) throws NumberFormatException {
        int A;
        int B;
        try {
            A = Integer.parseInt(_A);
        } catch (NumberFormatException e) {
            System.out.println("El primer valor debe ser un numero");
            throw new NumberFormatException();
        }

        System.out.println("El programa sigue");
        try {
            B = Integer.parseInt(_B);
        } catch (NumberFormatException e) {
            B = 3;
            System.out.println("Debe ingresar un numero - Valor por defecto segundo numero: 3");
        }

        try {
            if (A / B == 0) {
                float A_ = (float) A;
                float B_ = (float) B;
                return A_ / B_;
            }
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
            float A_ = (float) A;
            float B_ = (float) B;
            return A_ / B_;
        }

        return A / B;
    }
//NumberFormatException
}
