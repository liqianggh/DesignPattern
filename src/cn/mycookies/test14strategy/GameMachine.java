package cn.mycookies.test14strategy;

/**
 * 游戏机
 *
 * @author Jann Lee
 * @date 2019-08-21 0:15
 **/
public class GameMachine {

    private GameCard gameCard;

    public GameMachine(GameCard gameCard) {
        this.gameCard = gameCard;
    }

    public void playGame(){
        gameCard.load();
        System.out.println("点击开始游戏");
    }
}
