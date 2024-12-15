package jp.co.kiramex.animal;

public class Human extends Animal implements Thinkable  {
   // 趣味の情報を保管するフィールド
    private String hobby; // 趣味

   // 引数ありのコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name,age);
        this.hobby = hobby;
    }

   // this メソッドを実装
    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");

    }

}