/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj;

/**
 *
 * @author Joel_
 */
public class Empleado {
    private final double DEFAULT_SALARIO = 300000.0;
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    static int totalEmpleados;

    // Constructor
    public Empleado(String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    // Constructor solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = DEFAULT_SALARIO;
    }
    
    // Método actualizarSalario por cantidad fija
    public void actualizarSalario(double cantidadFija) {
        System.out.println("\nEmpleado: " + nombre);
        System.out.println("Sueldo actual: " + salario);
        System.out.println("Aumento fijo: $" + cantidadFija);
        salario += cantidadFija;
        System.out.println("Sueldo final: $" + salario + "\n");
    }
    
    // Método actualizarSalario por porcentaje
    public void actualizarSalario(int porcentaje) {
        System.out.println("\nEmpleado: " + nombre);
        System.out.println("Sueldo actual: " + salario);
        System.out.println("Aumento en porcentaje: " + porcentaje + "%");
        double aumento = salario * (porcentaje / 100.0);
        salario += aumento;
        System.out.println("Total a aumentar: $" + aumento);
        System.out.println("Sueldo final: $" + salario + "\n");
    }
    
    // Muestreo de datos del empleado
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    // Retorna el total de empleados creados hasta el momento
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getter & Setter de los atributos encapsulados
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
