public abstract class Poem {
    public abstract int numLines();
    public abstract int getSyllables(int line);
    public void printRhythm(){
        for(int line = 1; line <= numLines(); line ++){
            for(int syls = 0; syls < getSyllables(line); syls++){
                System.out.print(("ta-"));
            }
            System.out.println("ta");
        }
    }

}
