package cn.mycookies.test14strategy;

/**
 * @author Jann Lee
 * @date 2019-08-21 0:22
 **/
public class Client {

    public static void main(String[] args) {
        GameMachine gameMachine = new GameMachine(new ContraGameCart());
        gameMachine.playGame();
    }
}
