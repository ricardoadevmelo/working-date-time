import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatacaoDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Podemos formatar de 3 maneiras: ");
        System.out.println("d04 usando '.format' para usar as barras '/' = " + d04.format(formato1));
        System.out.println("d04 usando '.format' para usar as barras '/' invertendo = " + formato1.format(d04));
        System.out.println("d04 usando '.format' e usando toda a instanciaçao = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println();
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Formatando com data e hora: " + d05.format(formato2));
        System.out.println();
        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("Quando for 'Instant' tem q formatar pq esta usando o fuso horario");
        System.out.println(String.format("d06 usando a zona do GMT do porque tem o 'Z': " + d06, formato3));
        System.out.println();
        System.out.println("Podemos usar o outro formato sem usar o 'padrao: .offPatern': ");
        DateTimeFormatter formato4 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("Substituindo o offPattern por ISO DATE TIME: " + formato4.format(d05));
        System.out.println();
        DateTimeFormatter formato5 = DateTimeFormatter.ISO_INSTANT;
        System.out.println(String.format("Imprimindo com o 'ISO INSTANT' o formato do 'Instant': " + d06, formato5));


    }
}