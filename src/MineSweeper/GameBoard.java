package MineSweeper;
//import java.util.Scanner;
import java.util.*;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class GameBoard {
    private int mines;
    private int height;
    private int width;
    ArrayList<Integer> colum = new ArrayList<>();
    ArrayList<Integer> row = new ArrayList<>();


    public GameBoard()
    {
        height = getHeight();
        width = getWidth();
        mines = getMines();
    }

    public void setHeight(int H)
    {
        height = H;
    }
    public int getHeight(){
        if(height < 0)
        {
            System.out.print("This is not possible, height is set to default size 8");
            return height = 8;
        }
        return height;
    }

    public void setWidth(int W)
    {
        width = W;
    }
    public int getWidth(){
        if(width < 0)
        {
            System.out.print("This is not possible, width is set to default size 8");
            return width = 8;
        }
        return width;
    }

    public void setMines(int M)
    {
        mines = M;
    }
    public int getMines(){
        if(mines < 0)
        {
            System.out.print("This is not possible, mines is set to default size 10");
            return mines = 8;
        }
        return mines;
    }

    public int randomGen()
    {
        int i = (int) Math.random();
        return i;
    }

    public ArrayList allBombsC()
    {

        return colum;
    }

    public ArrayList allBombsR()
    {
        if(row.contains(randomGen()))
        {

        }
        else
        {
            row.add(randomGen());
        }
        return row;
    }
}
