
public class Main {
    public static void main(String[] args) {
        BancoMuchoDinero banco = new BancoMuchoDinero();

        // Agregar cuentas de ejemplo
        banco.agregarCuenta(1, 1000, "Juan Perez", "Ahorros");
        banco.agregarCuenta(2, 2000, "Maria Lopez", "Corriente");
        banco.agregarCuenta(3, 1500, "Pedro Ramirez", "Ahorros");

        // Mostrar lista de cuentas
        banco.mostrarListaDeCuentas();

        // Mostrar el total de dinero en el banco
        System.out.println("Total dinero en el banco: $" + banco.calcularTotalDinero());

        // Mostrar el cliente con el saldo más alto y el tipo de cuenta
        System.out.println("Cliente con mayor saldo: " + banco.obtenerClienteConMayorSaldo());
    }
}