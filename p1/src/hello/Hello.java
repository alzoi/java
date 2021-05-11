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

// Компиляция с размещением байт кода в папке p1/classes/ и использования откомпилированных фрагментов из этой папки (опция -cp)
// cd /d/java-prj/p1/
// javac -d ./classes/ -cp ./classes/ ./src/hello/Hello.java ./src/person/Person.java ./src/person/prof/Prof.java
// Запуск с указанием папок с байт кодом пакетов, можно разелять двоеточием : (или ; для Windows)
// java -cp .:/d/java-prj/p1/classes/ hello.Hello
// или
// java -cp ./classes/ hello.Hello
// можно компилировать главный класс пакета и все зависимости класса будут скомпилированы автоматически
// cd p1/src/
// javac -d ../classes/ ./hello/Hello.java
// java -cp ../classes/ hello.Hello
//
// Для создания библиотеки пакетов (архива классов в байт-коде) необходимо перейти в папку с откомпилированными классами и создать добавить в архив все файлы
// cd p1/classes/
// jar -cvf p1.jar *
// Далее можно скопировать файл с архивом p1.jar в любую папку, например lib и запускать программу
// java -cp ./lib/p1.jar hello.Hello

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
