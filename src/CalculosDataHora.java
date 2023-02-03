import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        System.out.println("PARA CALCULAR ACRESCENTAR OU DIMINUIR DATA/HORA");
        LocalDate semanaPassada = d04.minusDays(7);
        System.out.println("Diminuir dias usamos 'minus p diminur' data: " + semanaPassada);

        LocalDate proximaSemana = d04.plusDays(7);
        System.out.println("Aumentar dias usamos 'plus p aumentar' data: " + proximaSemana);

        LocalDateTime semanaPassad = d05.minusDays(7);
        System.out.println("Diminuir dias usamos 'minus p diminur' com data e hora: " + semanaPassad);

        LocalDateTime proxsemana = d05.plusDays(7);
        System.out.println("Aumentar dias usamos 'plus p aumentar' com data e hora: " + proxsemana);

        Instant semanaPass = d06.minus(7, ChronoUnit.DAYS);
        System.out.println("Diminuir com 'Instant' usamos 'minus p diminur' com data e hora: " + semanaPass);

        Instant proxSem = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("Aumentar com 'Instant' usamos 'plus p aumentar' com data e hora: " + proxSem);
        System.out.println("--------------------------------------------------");
        System.out.println();
        System.out.println("PARA CALCULAR DURAÇÃO 'Duration.between to' DE DATA/HORA");

        System.out.println("Nao tem como calcular tempo de duraçao entre '2 LocalDate', temos q converter p 'LocalDateTime'");
        System.out.println("Pois vai dar dar exceçao no LocalDate'.UnsupportedTemporalTypeException!!");
        Duration duration1 = Duration.between(semanaPassada.atStartOfDay(), d04.atStartOfDay());
        System.out.println( "O resultado temos q usar o '.toDays': é em dias: " + duration1.toDays());
        System.out.println();

        System.out.println("Usando o LocalDateTime d05:");
        Duration duration2 = Duration.between(proxsemana, d05);
        System.out.println( "O resultado temos q usar o '.toDays': é em dias: " + duration2.toDays());
        System.out.println();

        System.out.println("Usando o Instant d06:");
        Duration duration3 = Duration.between(proxSem, d06);
        System.out.println( "O resultado temos q usar o '.toDays': é em dias: " + duration3.toDays());










    }
}