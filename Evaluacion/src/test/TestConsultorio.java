package test;

public class TestConsultorio {
    public static void main(String[] args) {
        Medico medico1 = new Medico("Daniel", "López", "Cardiología");
        Paciente paciente1 = new Paciente("José", "Pérez", 1.75f, 80f);
        Paciente paciente2 = new Paciente("Jorge", "Fernández", 1.65f, 95f);

        System.out.println("Visita 1:");
        System.out.println("Médico: " + medico1.getNombre());
        System.out.println("Paciente " + paciente1.traerNombreCompleto() + ": IMC " + medico1.calcularIMC(paciente1));
        System.out.println("Paciente " + paciente2.traerNombreCompleto() + ": IMC " + medico1.calcularIMC(paciente2));

        paciente1.setPeso(75f);
        paciente2.setPeso(90f);

        System.out.println("\nVisita 2:");
        System.out.println("Médico: " + medico1.getNombre());
        System.out.println("Paciente " + paciente1.traerNombreCompleto() + ": IMC " + medico1.calcularIMC(paciente1));
        System.out.println("Paciente " + paciente2.traerNombreCompleto() + ": IMC " + medico1.calcularIMC(paciente2));
    }
}
