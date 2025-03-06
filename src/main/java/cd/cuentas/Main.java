package cd.cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, 2300, 695, 100.5f);
    }

    public static void operativa_cuenta(CCuenta cuenta, double cantidadARetirar, double cantidadAIngresar, float cantidad) {
        double saldoActual = cuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta.retirar(cantidadARetirar);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidadAIngresar);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

        System.out.println("Operativa adicional con la cantidad: " + cantidad);
    }
}
