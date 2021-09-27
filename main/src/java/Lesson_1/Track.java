package Lesson_1;

public class Track implements Let {
    private int length;

    public Track(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(Human human) {
        return human.run(length);
    }
    public int getLength(){
        return length;
    }
}
