package week2.array;

public class MazeStart  {
    public static void main(String[] args) {

    MazeController mazeController = new MazeController();
    mazeController.dfs(0,0);

    }
}
//            {0, 0, 1, 1, 1, 1, 1, 1},
//            {1, 0, 0, 0, 0, 0, 0, 1},
//            {1, 1, 1, 0, 1, 1, 1, 1},
//            {1, 1, 1, 0, 1, 1, 1, 1},
//            {1, 0, 0, 0, 0, 0, 0, 1},
//            {1, 0, 1, 1, 1, 1, 1, 1},
//            {1, 0, 0, 0, 0, 0, 0, 0},
//            {1, 1, 1, 1, 1, 1, 1, 0}