package baseball;

// このクラスは呼び出して使用
public class BaseBallTeam {
    
    private String name;
    private int win;
    private int lose;
    private int draw;
    
    public BaseBallTeam() {
        
    }
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWin() {
        return win;
    }
    public void setWin(int win) {
        this.win = win;
    }
    public int getLose() {
        return lose;
    }
    public void setLose(int lose) {
        this.lose = lose;
    }
    public int getDraw() {
        return draw;
    }
    public void setDraw(int draw) {
        this.draw = draw;
    }
    
    // 勝率の計算メソッド
    public double getRate(int win, int lose) {
        double result = (double)win/(win + lose);
        return result;
    }
    
    // 勝率を報告するメソッド
    public void report(String name, int win, int lose, int draw) {
        double result = getRate(win, lose);
        System.out.println(name + " の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + result + "です。");
    }

}
