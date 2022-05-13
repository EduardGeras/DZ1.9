public class Main {
    public static void main(String[] args) {
        Author knyazev = new Author("Князев", "Милослав");
        Book sets = new Book("Полный набор. Наследие древних", knyazev, 2016);
        System.out.println("sets.getTitle = " + sets.getTitle());
        System.out.println("knyazev.getSurname = " + knyazev.getSurname());
        sets.setPublishingYear(2017);
        System.out.println("sets.setPublishingYear = " + sets.getPublishingYear());

        Author alyokhin = new Author("Алёхин", "Александр");
        Book tom4 = new Book("Полное собрание партий с авторскими комментариями. Том 4. 1931—1946", alyokhin, 2017);
        System.out.println("tom4.getTitle() = " + tom4.getTitle());
    }
}