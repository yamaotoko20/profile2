package person;

public class Person {
	//インスタンス変数
	public String name;//名前を表す文字列
	public int age;//年齢を表す整数
	public double height;//身長を表す浮動小数点数
	public double weight;// 体重を表す浮動小数点数
	public static int count = 0; // インスタンスが作成された回数をカウントするクラス変数

	
	//各パラメータを受け取り、インスタンスの初期化
	public Person(String name, int age, double height, double weight){
	this.name = name;
	this.age = age;
	this.height = height;
	this.weight = weight;
	count++; // インスタンスが作成される度に count をインクリメント
	}
	//BMIを計算するメソッド
	public double bmi(){
	return this.weight / this.height / this.height;
	}
	//インスタンスの名前と年齢を表示するメソッド
	public void print(){
		if (this.name != null && this.age != 0) {
	        System.out.println("名前は" + this.name + "です");
	        System.out.println("年は" + this.age + "です");
	    } else {
	        System.out.println("エラー：名前または年齢がnullです。");
	    }
	}
	
	
	//インスタンスの総数を表示するメソッド
	  public static void printCount(){
	        System.out.println("合計" + count + "人です");
	    }
	
	
	
	
}
