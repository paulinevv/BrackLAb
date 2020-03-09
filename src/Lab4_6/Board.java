package Lab4_6;

public class Board {
    private int amclics;
    private int height;
    private int width;
    private int ammines;
    private enum level {beginner, intermediate, expert};



    public Board(String level)
    {
        amclics = 0;

        if(level == "beginner") {
            height = 8;
            height = width;
            ammines = 10;
        }
        if(level == "intermediate" )
        {
            height = 16;
            height = width;
            ammines = 40;
        }
        if(level == "expert")
        {
            height = 16;
            width = 30;
            ammines = 99;
        }
    }

}
