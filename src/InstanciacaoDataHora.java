import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciacaoDataHora {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        System.out.println("Data local: " + d01);
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("Data e hora local: " + d02);
        Instant d03 = Instant.now();
        System.out.println("Data e hora ISO GMT: " + d03);
        System.out.println();

        System.out.print("Pegar um texto ISO GMT e gerar uma data local: ");
        LocalDate d04 = LocalDate.parse("2022-07-20");
        System.out.println(d04);
        System.out.print("Pegar uma data e hora local e gerar uma data e hora GMT: ");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        System.out.println(d05);

        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        System.out.println("Gerar data e hora GMT: " +  d06);
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
        System.out.println("Gerar data e hora GMT formato retirando horas: " +  d07);
        System.out.println();
        System.out.println("Especificar p gerar o texto formato customizado a partir de um padrão - DateTimeFormat");
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("20/07/2022", formatoData);
        System.out.println("Gerar um formato de data: " + d08);
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", formatoDataHora);
        System.out.println("Gerar um formato de data e hora: " + d09);
        System.out.println();

        LocalDate d10 = LocalDate.of(2022, 11, 29);
        System.out.println("Instanciar um dia, mês, ano, separadamente: " + d10);
        LocalDateTime d11 = LocalDateTime.of(2022, 11, 29,  20, 19);
        System.out.println("Instanciar um dia, mês, ano, [horário] separadamente: " + d11);
        System.out.println();







    }
}