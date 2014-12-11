public class Person{
	public String name;
	public int age;
	public void say(String content){
		System.out.println(content);
	}
	public static void main(String[] args){
		/* 	System.out.println(); */
		Person p=new Person();
		p.say("love");
	}
}