import java.util.ArrayList;

class Cuenta {
    public int numero;
    public double saldo;
    public String titular;
    public String tipoCuenta; // Se añade el tipo de cuenta (ahorros o corriente)

    public Cuenta(int numero, double saldo, String titular, String tipoCuenta) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
    }
}

class BancoMuchoDinero {
    public ArrayList<Cuenta> cuentas;

    public BancoMuchoDinero() {
        cuentas = new ArrayList<>();
    }

    public void agregarCuenta(int numero, double saldoInicial, String titular, String tipoCuenta) {
        cuentas.add(new Cuenta(numero, saldoInicial, titular, tipoCuenta));
    }

    public double calcularTotalDinero() {
        double total = 0;
        for (Cuenta cuenta : cuentas) {
            total += cuenta.getSaldo();
        }
        return total;
    }

    public String obtenerClienteConMayorSaldo() {
        double maxSaldo = Double.MIN_VALUE;
        String clienteConMayorSaldo = "";

        for (Cuenta cuenta : cuentas) {
            if (cuenta.getSaldo() > maxSaldo) {
                maxSaldo = cuenta.getSaldo();
                clienteConMayorSaldo = cuenta.getTitular() + " (" + cuenta.getTipoCuenta() + ")";
            }
        }

        return clienteConMayorSaldo;
    }

    public void mostrarListaDeCuentas() {
        System.out.println("Listado de cuentas:");
        for (Cuenta cuenta : cuentas) {
            System.out.println("Titular: " + cuenta.getTitular() + ", Tipo de cuenta: " + cuenta.getTipoCuenta() +
                    ", Saldo: $" + cuenta.getSaldo());
        }
    }
}