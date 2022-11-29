package study.numberBaseball;

import java.util.List;

public class StartMethod {
    public void start() {
        RandomNumber randomNumber = new RandomNumber();
        List<Integer> computerNumber = randomNumber.createNumberList(randomNumber.createNumber());
        while(game(computerNumber)== true){
            game(computerNumber);
        }
    }

    public boolean game(List computerlist) {
        RandomNumber randomNumber = new RandomNumber();
        List<Integer> inputNumber = randomNumber.userNumberList(randomNumber.scanner());
        int strike = strike(computerlist,inputNumber);
        run( computerlist, inputNumber);
        return gameover(strike);
    }
    public boolean gameover(int strike) {
        if(strike == 3 ) {
            System.out.println("게임 종료");
            return false;
        }
        return true;
    }

    public  void run(List computerlist,List inputNumber){
        int strike = strike(computerlist,inputNumber);
        int ball = calBall(computerlist,inputNumber);
        printCount(strike,ball);
    }

    public  int strike(List computerlist,List inputNumber) {
        int strikeCount = 0;
        for(int i = 0; i < 3; i++) {
            if(inputNumber.get(i) == computerlist.get(i)){
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public  int ball(List computerlist,List inputNumber) {
        int ballCount = 0;
        for(int i = 0; i<3; i++) {
            if(computerlist.contains(inputNumber.get(i))){
                ballCount++;
            }
        }
        return ballCount;
    }

    public int calBall(List computerlist,List inputNumber){
        int ball = ball(computerlist,inputNumber);
        int strike = strike(computerlist,inputNumber);
        if(strike<=ball){
            ball = ball-strike;
        }
        return ball;
    }

    public void printCount(int strike, int ball){
        if(strike!=0&&ball!=0){
            System.out.println(strike+"스트라이크 " + ball+"볼");
        } else if (strike!=0 && ball ==0 ) {
            System.out.println(strike+"스트라이크");
        }else if(strike == 0 && ball != 0 ){
            System.out.println(ball+"볼");
        } else {
            System.out.println("낫싱");
        }
    }

}
