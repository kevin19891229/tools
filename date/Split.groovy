import java.time.LocalDate
import java.time.format.DateTimeFormatter

DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
LocalDate begin = LocalDate.of(2020, 4, 25);
LocalDate next;
int step = 15;
int threshold = 240;
int count = 0;
while (count < threshold) {
    next = begin.plusDays(step - 1);
    System.out.println(begin.format(FORMATTER) + "," + next.format(FORMATTER));
    begin = next.plusDays(1);
    count = count + step;
}