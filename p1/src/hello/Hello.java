// Запуск:
// установить бесплатную версию jdk1.8u202 с сайта oracle.com или бесплатную https://www.azul.com/downloads/
// прописать путь к jdk/bib/ в переменную PATH
// Компиляция
// cd src/
// javac hello/Hello.java
// Запуск
// java Hello
// Просмотр байт кода
// javap -v Hello.class

// В java есть вложенные пакеты, при импорте из родительской папки нужно указывать полное имя класса из вложенного пакета [имя вложенного пакета].[имя класса] .

// Для запуска нужно перейти в коревую папку, которая содержит пакеты 
// cd ~/Desktop/java-proj/p1/src
// java hello.Hello
// или задать путь к папке с пакетами классов
// java -cp ~/Desktop/java-proj/p1/src hello.Hello

package hello;

import person.Person;
import person.prof.*;

public class Hello {
  public static void main(String[] args) {

	  Person pers = new Person();
    pers.setName("Java");

	  Prof prf = new Prof();
    prf.setName("web");

    System.out.println("Hello world " + pers.getName() + " " + prf.getName() + "!");
  }
}
