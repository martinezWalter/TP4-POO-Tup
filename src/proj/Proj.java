/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proj;

/**
 *
 * @author Joel_
 */
public class Proj {

    public static void main(String[] args) {
        
        // Instancia de empleados utilizando ambos constructores
        Empleado emp1 = new Empleado("Jose", "Dev back-end");
        Empleado emp2 = new Empleado("Juan", "Dev Android");
        Empleado emp3 = new Empleado("Martina", "PM", 500000.0);
        Empleado emp4 = new Empleado("Micaela", "Dev iOS");
        
        // Aplicar aumentos
        emp3.actualizarSalario(10); // Utilizando entero para definir el porcentaje
        emp1.actualizarSalario(20000.0); // Decimal para un aumento fijo sobre el salario
        
        // Muestreo de empleados
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());
        
        // Muestreo total de empleados
        System.out.println("\nTotal empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
