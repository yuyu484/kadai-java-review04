package jp.co.kiramex.animal;

public class Animal {

    // フィールド
    public String name; //名前
    public int age; // 年齢

    // コンストラクタ
    public Animal() {
        System.out.println("インスタンス化時にコンストラクタが呼ばれました");
        name = "未設定";
        age = 0;
    }

    // 引数ありのコンストラクタ
    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println(this.name + "です。" + this.age + "歳です。");
    }
}
