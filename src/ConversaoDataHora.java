import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConversaoDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate res1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("res1 do sistema GMT" + res1);

        LocalDate res2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("res1 de Portugal por exemplo: " + res2);

        LocalDateTime res3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("res1 de Portugal por exemplo: " + res3);

        LocalDateTime res4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("res1 de Portugal por exemplo: " + res4);

        System.out.println("Pegar uma data / hora usando o 'get' = dia do mê: " + res4.getDayOfMonth());
        System.out.println("Pegar uma data / hora usando o 'get' = mês: " + res4.getMonthValue());
        System.out.println("Pegar uma data / hora usando o 'get' = mês: " + res4.getDayOfYear());
        System.out.println();
        System.out.println("Pegar uma data / hora usando o 'get' = hora: " + d05.getHour());
        System.out.println("Pegar uma data / hora usando o 'get' = minutos: " + d05.getMinute());




    }
}