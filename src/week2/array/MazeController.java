package week2.array;

import java.util.Stack;

public class MazeController  {
    int[][] myMaze ={
            {0, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 0}
    };
    Stack<Maze> stack = new Stack<>();
    public void dfs(int x, int y) { // x 가 세로, y 가 가로
        Maze now = new Maze(x,y);
        if(x==0 && y==0){
            myMaze[x][y] = 1;
        }
                go(now);
    }
    void go(Maze now){
        // 종료조건??
        if(now.x == myMaze.length - 1 && now.y == myMaze.length - 1) {
            System.out.println("출구는 ("+now.x+","+now.y+")");
            return;
        }
        // 이동
        if (now.x > 0 && now.y>0) { // 인덱스 0에서 -1 을 해버리면 오류
            if (myMaze[now.x - 1][now.y] != 1) { // 위
                stack.push(new Maze(now.x - 1, now.y));
                myMaze[now.x - 1][now.y] = 1;
            }
             if (myMaze[now.x][now.y - 1] != 1) { //왼
                stack.push(new Maze(now.x, now.y - 1));
                myMaze[now.x][now.y - 1] = 1;
            }
        }
        if (now.x < myMaze.length - 1) { // 아래
            if (myMaze[now.x + 1][now.y] != 1) {
                stack.push(new Maze(now.x + 1, now.y));
                myMaze[now.x + 1][now.y] = 1;
            }
        }
        if (now.y < myMaze.length - 1) { // 오
            if (myMaze[now.x][now.y + 1] != 1) {
                stack.push(new Maze(now.x, now.y + 1));
                myMaze[now.x][now.y + 1] = 1;
            }
        }
        System.out.println("집은스택 : "+stack.peek()); // 스택동작원리 이해
        Maze temp = stack.pop();
        System.out.println(stack); // 스택동작원리 이해
        if(stack.isEmpty()) {
            System.out.println("(" + temp.x + "," + temp.y + ")");
        }
        now.x = temp.x;
        now.y = temp.y;
        go(now);
    }



}
