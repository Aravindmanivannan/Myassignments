package week3day2;

public class Automation extends MultipleLanguage implements Language,TestTool {
	public void java() {
		System.out.println("Runprog");
		
	}
public void javaScript() {
	System.out.println("Script");
}
public void ruby() {
	System.out.println("Language");
	
}
public void selenium() {
	System.out.println("tool");
	
}
public static void main(String[] args) {
	Automation auto=new Automation();
	auto.java();
	auto.javaScript();
	auto.ruby();
	auto.selenium();
	auto.python();
	
}
}
