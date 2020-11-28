public class Zoo {
	private Animal a1;
	private Animal a2;
	public Animal getA1() {
		return a1;
	}
	public void setA1(Animal a1) {
		this.a1 = a1;
	}
	public Animal getA2() {
		return a2;
	}
	public void setA2(Animal a2) {
		this.a2 = a2;
	}
	public void fight(){
		System.out.print(a1.getName()+"正在和"+a2.getName()+"打架！");
	}
}
