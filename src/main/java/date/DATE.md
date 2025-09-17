# DATAS EM JAVA

A biblioteca utilizada atualmente é a `JAVA.TIME`.

Anteriormente, a biblioteca `JAVA.UTIL.CALENDAR` era utilizada, mas devido desvantagens, foi substituída.

## LocalDate
O LocalDate representa uma data no formato ISO (aaaa-MM-dd) sem hora. 
- Podemos usá-lo para armazenar datas como aniversário e dias de pagamento.

Trecho para importação da biblioteca:
```java
import java.time.LocalDate;
```

## Month
É um ENUM que possui os meses do ano.
```java
import java.time.Month;

System.out.println(Month.JANUARY);
```

## Formatter
Permite formatar data de acordo com os padrões existentes pelo mundo

```java
import java.time.format.DateTimeFormatter;

DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
```

|Letra| Campo|Exemplo|
|----|------|-------|
|G	|Era designator	|AD|
|y	|Year	|2018 (yyyy), 18 (yy)|
|M	|Month in year	|July (MMMM), Jul (MMM), 07 (MM)|
|w	|Results in week in year	|16|
|W	|Results in week in month	|3|
|D	|Gives the day count in the year	|266|
|d	|Day of the month	|09 (dd), 9(d)|
|F	|Day of the week in month	|4|
|E	|Day name in the week	|Tuesday, Tue|
|u	|Day number of week |where 1 represents Monday, 2 represents Tuesday and so on	2|
|a	|AM or PM marker	|AM|
|H	|Hour in the day |(0-23)	12|
|k	|Hour in the day |(1-24)	23|
|K	|Hour in am/pm |for 12 hour format (0-11)	0|
|h	|Hour in am/pm |for 12 hour format (1-12)	12|
|m	|Minute in the hour	|59|
|s	|Second in the minute	|35|
|S	|Millisecond in the minute	|978|
|z	|Timezone	Pacific Standard| Time; PST; GMT-08:00|
|Z	|Timezone offset in hours (RFC pattern)	|-0800|
|X	|Timezone offset in ISO format	|-08; -0800; -08:00|

## LocalTime
Representa a hora sem data.

```java
import java.time.LocalTime;
```

## LocalDateTime
Representa data com hora.

```java
import java.time.LocalDateTime;
```