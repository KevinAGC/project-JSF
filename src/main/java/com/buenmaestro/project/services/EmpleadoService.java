/**
 * 
 */
package com.buenmaestro.project.services;

import java.util.ArrayList;
import java.util.List;

import com.buenmaestro.project.entity.Empleado;

/**
 * @author kevin Clase que permite realizar del negocio para empleados
 */
public class EmpleadoService {

	//Metodo que permite consultar la lista de empleados
	
	public List<Empleado> consultarEmpleados() {

		List<Empleado> empleados = new ArrayList<Empleado>();

		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();

		empleadoIBM.setNombre("Victor");
		empleadoIBM.setPrimerApellido("Ramirez");
		empleadoIBM.setSegundoApellido("Gonzalez");
		empleadoIBM.setPuesto("Senior Developer");
		empleadoIBM.setEstatus(true);

		empleadoMicrosoft.setNombre("Luis");
		empleadoMicrosoft.setPrimerApellido("Altamira");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);

		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("Lopez");
		empleadoApple.setSegundoApellido("Hernandez");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setEstatus(true);

		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);

		return empleados;
	}

}
