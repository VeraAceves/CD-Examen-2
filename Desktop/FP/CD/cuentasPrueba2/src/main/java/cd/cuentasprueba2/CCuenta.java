package cd.cuentasprueba2;

/**
 * Clase que representa una cuenta bancaria.
 * 
 * Esta clase define las propiedades y métodos para gestionar una cuenta bancaria, como consultar el saldo,
 * ingresar y retirar dinero, y acceder y modificar los datos relacionados con la cuenta.
 * 
 */





public class CCuenta {

    // Atributos privados de la cuenta bancaria
    private String nombre;       // Nombre del titular de la cuenta
    private String cuenta;       // Número de la cuenta bancaria
    private double saldo;        // Saldo actual de la cuenta
    private double tipoInterés;  // Tipo de interés de la cuenta

    /**
     * Constructor por defecto de la clase CCuenta.
     * 
     * Este constructor inicializa la cuenta sin establecer valores específicos.
     * 
     */
    public CCuenta() {
    }

    /**
     * Constructor que inicializa una cuenta con los valores proporcionados.
     * 
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de la cuenta bancaria.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInterés = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return El saldo de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * 
     * Si la cantidad es negativa, se lanza una excepción.
     * 
     * 
     * @param cantidad La cantidad de dinero a ingresar.
     * @throws Exception Si la cantidad es negativa, se lanza una excepción.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     * 
     * Si la cantidad es negativa o si no hay suficiente saldo, se lanza una excepción.
     * 
     * 
     * @param cantidad La cantidad de dinero a retirar.
     * @throws Exception Si la cantidad es negativa o el saldo es insuficiente, se lanza una excepción.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre El nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de la cuenta bancaria.
     * 
     * @return El número de la cuenta bancaria.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de la cuenta bancaria.
     * 
     * @param cuenta El número de la cuenta bancaria.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta bancaria.
     * 
     * @param saldo El saldo de la cuenta bancaria.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta bancaria.
     * 
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta bancaria.
     * 
     * @param tipoInterés El tipo de interés de la cuenta bancaria.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    
    
        public double getTipoInterésCommit() {
        return tipoInterés;
    }

}
