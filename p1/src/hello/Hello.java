// Запуск:
// установить бесплатную версию jdk1.8u202
// прописать путь к jdk/bib/ в переменную PATCH
// Компиляция
// javac Hello.java
// Запуск
// java Hello
// Просмотр байт кода
// javap -v Hello.class

// В java есть вложенные пакеты, при импорте из родительской папки нужно указывать полное имя класса из вложенного пакета [имя вложенного пакета].[имя класса] .

// Для запуска нужно перейти в коревую папку, которая содержит пакеты 
// cd ~/Desktop/java-proj/p1/src
// java hello.Hello
// или задать путь к папке с пакетами
// java -cp ~/Desktop/java-proj/p1/src hello.Hello

package hello;

import person.Person;

public class Hello {
  public static void main(String[] args) {
	  Person pers = new Person();
    pers.setName("Java");
    System.out.println("Hello world " + pers.getName() + "!");
  }
}
