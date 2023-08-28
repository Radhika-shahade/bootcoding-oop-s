package enumeration;

public class Enumeration1 {

    enum Direction
    {
        EAST,WEST,NORTH,SOUTH;
    }
    public static void main(String[] args) {
        //values() return an array containing all the values of enum
        for(Direction direction:Direction.values())
        {
            System.out.println(direction);
        }

        //in valueOF() we have to give string
        System.out.println("index of WEST is1 "+Direction.valueOf("WEST").ordinal());
    }

}
