package fpdualeveris;

import variables.Developer;

public class FPDual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		variablesChallenge();

	}

	private static void variablesChallenge() {

		// Creacion de los 4 programadores
		Developer dev1 = new Developer("Pedro Picapiedra");
		Developer dev2 = new Developer("Anuel AA");
		Developer dev3 = new Developer("Juan Alejandro Tellez");
		Developer dev4 = new Developer("Brocco Lee");

		// Comprobar el numero de desarrolladores en el desarrollador 1 y el 4
		System.out.println("Numero de desarrolladores (mostrando desde dev1): " + dev1.getNumbDev());
		System.out.println("Numero de desarrolladores (mostrando desde dev4): " + dev4.getNumbDev());

		// Mostrar numero de empleado de cada uno de los empleados
		System.out.println("Numero de empleado del empleado 1: " + dev1.getCodEmpl());
		System.out.println("Numero de empleado del empleado 2: " + dev2.getCodEmpl());
		System.out.println("Numero de empleado del empleado 3: " + dev3.getCodEmpl());
		System.out.println("Numero de empleado del empleado 4: " + dev4.getCodEmpl());

		// Mostrar numero de vacaciones de los empleados en este caso al dev1 se le resta 4 dias, al dev2 2 (como pide el ejercicio), al dev3 1 (con el segundo
		// metodo) y del dev4 unicamente se muestran los dias
		System.out.println("Dias de vacaciones del dev1: " + dev1.subtractVacDays(4));
		System.out.println("Dias de vacaciones del dev2: " + dev2.subtractVacDays(2));
		System.out.println("Dias de vacaciones del dev3: " + dev3.subtractVacDays());
		System.out.println("Dias de vacaciones del dev4: " + dev4.getVacDays());

	}

}
