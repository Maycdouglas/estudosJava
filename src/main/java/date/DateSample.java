package date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateSample {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje); // imprime a data atual no formato ISO - yyyy-MM-dd

        System.out.println("Define data específica através dos parâmetros");
        // Define data específica através dos parâmetros
        LocalDate dataEspecifica = LocalDate.of(2020, 5, 6);
        System.out.println(dataEspecifica);

        System.out.println("Define o mês usando o enum MONTH");
        // Define o mês usando o enum MONTH
        LocalDate dataEspecifica2 = LocalDate.of(2020, Month.MAY, 6);
        System.out.println(dataEspecifica);

        System.out.println("Exemplo de conversão de string para data");
        // Exemplo de conversão de string para data
        String stringData = "2020-05-06";
        LocalDate dataOriundaString = LocalDate.parse(stringData);
        System.out.println(dataOriundaString);

        System.out.println("Exemplo com data formatada no padrão brasileiro");
        // Exemplo com data formatada no padrão brasileiro
        String stringDataBR = "06/05/2020";
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // se não converter, uma exceção será lançada
        LocalDate dataFormatadaBR = LocalDate.parse(stringDataBR,formatterBR);
        System.out.println(dataFormatadaBR); // mesmo enviando o padrão brasileiro, a impressão será em ISO.
        System.out.println(formatterBR.format(dataFormatadaBR)); // assim imprime no padrão brasileiro
        // Abaixo, exemplos de formatação em String
        System.out.println(dataEspecifica.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(dataEspecifica.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(dataEspecifica.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(dataEspecifica.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("Manipulação de data");
        // Manipulação de data
        LocalDate aniversario15Anos = dataEspecifica.plusYears(15);
        System.out.println(aniversario15Anos);

        System.out.println("Comparação de datas");
        // Comparação de datas
        System.out.println(aniversario15Anos.isAfter(dataEspecifica)); // True
        System.out.println(aniversario15Anos.isBefore(dataEspecifica)); // False
        System.out.println(aniversario15Anos.isEqual(dataEspecifica)); // False


        // LOCAL TIME
        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual);

        // o restante é bem parecido com LocalDate

        // LOCAL DATETIME
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual);

        // o restante é bem parecido com LocalDate
    }

}
