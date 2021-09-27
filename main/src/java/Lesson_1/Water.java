package Lesson_1;

public class Water implements Let {
    private int length;

    public Water(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(Human human) {
        if (human instanceof Swimable)
            return ((Swimable) human).swim(length);
        else
            return false;
    }
    public int getLength(){
        return length;
    }
}
