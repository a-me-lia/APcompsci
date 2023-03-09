public class EnglishClassBooWhoLikesEnglishAnywayHowBoring {
    public static void main(String[] args) {
        Poem p1 = new Haiku();
        Poem h1 = new Haiku();
        Object o1 = new Limerick();
        Poem l1 = new Limerick();

        System.out.println("my BEST haiku");
        h1.printRhythm();

        System.out.println("my BEST limerick");
        l1.printRhythm();
    }
}
