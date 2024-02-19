package Fechas;

import java.time.*;
import java.util.Scanner;

public class FechasConLocal {
    public static void main(String[] args) {
        LocalDate fechaOf = LocalDate.of(2015,3,4);
        System.out.println(fechaOf);

        LocalDate fechaParse = LocalDate.parse("2015-03-04");
        System.out.printf("Día: %02d\n" +
                "Mes: %s\n" +
                "Año: %d\n", fechaParse.getDayOfMonth(), fechaParse.getMonth(), fechaParse.getYear());

        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);

        LocalTime horaActual = LocalTime.now();
        System.out.println(horaActual);

        LocalTime horaOf = LocalTime.of(15,40,22,1);
        System.out.println(horaOf);

        LocalTime horaParse = LocalTime.parse("15:40:22.25");
        System.out.println(horaParse);

        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println(fechaHora.toString().replace("T"," "));

        System.out.println(fechaParse.plusMonths(3));
        System.out.println(fechaParse.minusDays(15));
        System.out.println(fechaParse.plus(Period.ofWeeks(3)));

        System.out.println(fechaParse.isEqual(fechaOf));
        System.out.println(fechaActual.isBefore(fechaOf));
        System.out.println(fechaActual.isAfter(fechaOf));

        Instant instantNow = Instant.now();
        System.out.println(instantNow);

        Duration duration = Duration.between(horaActual, horaParse);
        System.out.println(duration);

        Period periodo = Period.between(fechaActual,fechaParse);
        System.out.println(periodo);

        System.out.println(Duration.between(
                LocalDateTime.of(2024, Month.JANUARY, 20, 0, 0, 0),
                LocalDateTime.now()
        ));

        Scanner sc = new Scanner(System.in);
        String fechaString = sc.nextLine();
        LocalDate fechaDesdeCadena = LocalDate.parse(fechaString);
        System.out.println(fechaDesdeCadena);
    }
}
