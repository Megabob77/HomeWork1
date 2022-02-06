package Exercise1;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        System.out.println("Введите имя автора: ");
        author.setAuthor(in.nextLine());

        System.out.println("Введите зпголовок книги: ");
        title.setTitle(in.nextLine());

        System.out.println("Введите текст книги : ");
        content.setContent(in.nextLine());
        System.out.println();

        author.show();
        title.show();
        content.show();
    }

    public static class Author {
        public String author;

        public void setAuthor(String author) {

            this.author = author;
        }

        void show() {
            System.out.println("Автор: " + author);
        }
    }

    public static class Title {
        public String title;

        public void setTitle(String title) {

            this.title = title;
        }

        void show() {

            System.out.println("Заголовок: " + title);
        }
    }

    public static class Content {
        public String content;

        public void setContent(String content) {

            this.content = content;
        }

        void show() {

            System.out.println("Текст книги: " + content);
        }
    }

}

