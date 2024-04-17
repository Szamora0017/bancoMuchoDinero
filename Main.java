
public class Main {
    public static void main(String[] args) {
        BancoMuchoDinero banco = new BancoMuchoDinero();

        // Agregar cuentas de ejemplo
        banco.agregarCuenta(1, 1500000, "Leo PG", "Ahorros");
        banco.agregarCuenta(2, 3000000, "Sergio Amaya", "Corriente");
        banco.agregarCuenta(3, 2000000, "Juan Perez", "Ahorros");
        banco.agregarCuenta(4, 3500000, "Janfry", "Corriente");

        // Mostrar lista de cuentas
        banco.mostrarListaDeCuentas();

        // Mostrar el total de dinero en el banco
        System.out.println("Total dinero en el banco: $" + banco.calcularTotalDinero());

        // Mostrar el cliente con el saldo más alto y el tipo de cuenta
        System.out.println("Cliente con mayor saldo: " + banco.obtenerClienteConMayorSaldo());
    }
}