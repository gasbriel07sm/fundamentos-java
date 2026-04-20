package curso_nelio_alves_poo.data_e_hora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {

        // LocalDate - armazenar somente data
        // LocalDateTime - armazenar data e hora
        // Instant - com fuso horário global
        // Duration - duração

        System.out.println("Instanciação: ");

        // instanciando data e hora (agora)

        System.out.println("Instanciando data e hora (momento atual):  ");

        LocalDate d01 = LocalDate.now(); // data somente
        LocalDateTime d02 = LocalDateTime.now(); // data hora total
        Instant d03 = Instant.now(); // fuso horario
        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);

        // texto ISO 8601 e transformar para data-hora

        System.out.println("\nTexto ISO8601 e transformar para data e hora: ");

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // Londres
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // FUSO -03
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);

        // texto formato customizado para data e hora

        System.out.println("\nTexto customizado para data-hora: ");

        // instanciando conforme um padrão
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        System.out.println(d08);
        System.out.println(d09);

        // instanciando datas de forma isolada dia, mes, ano [horário] para uma data local

        System.out.println("\nInstanciando datas de forma isolada: ");

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println(d10);
        System.out.println(d11);

        // --------------------------------------------------------------- //

        System.out.println("\nFormatação: ");

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println(d04.format(fmt3));
        System.out.println(fmt1.format(d04));
        System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(d05.format(fmt3));
        System.out.println(d05.format(fmt4));

        System.out.println(fmt5.format(d06));

        // ------------------------------------------------------ //

        System.out.println("\nOperações com data e hora: ");

        System.out.println("Conveter data hora global para local: ");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime  r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 =  LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println("\nObter dados de uma data hora local: ");

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("d05 hora: " + d05.getHour());

        // --------------------------------------------------------- //

        System.out.println("\nOperações com data e hora: ");

        LocalDate d001 = LocalDate.parse("2022-07-20");
        // criar um como uma semana antes
        LocalDate pastWeekLocalDate = d001.minusDays(1);
        LocalDate nextWeekLocalDate = d001.plusDays(1);
        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);

        LocalDateTime d002 = LocalDateTime.parse("2022-07-20T01:30:26");
        LocalDateTime pastWeekLocalDateTime = d002.minusDays(10);
        LocalDateTime nextWeekLocalDateTime = d002.plusDays(10);
        System.out.println(pastWeekLocalDateTime);
        System.out.println(nextWeekLocalDateTime);

        Instant d003 = Instant.parse("2022-07-20T01:30:26Z");
        Instant pastWeekInstant = d003.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d003.plus(7, ChronoUnit.DAYS);
        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);

        // DURAÇÃO ENTRE DUAS DATAS HORAS
        Duration d1 =  Duration.between(pastWeekLocalDateTime, d002);
        Duration d2 =  Duration.between(pastWeekLocalDate.atTime(0,0,0), d001.atTime(0,0,0));
        Duration d3 =  Duration.between(pastWeekLocalDate.atStartOfDay(), d001.atTime(0,0,0));
        Duration d4 = Duration.between(pastWeekInstant, d003);

        System.out.println(d1.toDays());
        System.out.println(d2.toDays());
        System.out.println(d4.toDays());
    }
}
