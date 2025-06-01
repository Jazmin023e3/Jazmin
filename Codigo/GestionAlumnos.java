import java.util.ArrayList;
import java.util.List;

public class GestionAlumnos {
    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<>();
        Alumno alumno1 = new Alumno(1, "Ana Pérez", "AP2023101");
        Alumno alumno2 = new Alumno(2, "Carlos López", "CL2022205");
        Alumno alumno3 = new Alumno(3, "Sofía Gómez", "SG2024030");
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        System.out.println("--- Listado de Alumnos ---");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
}