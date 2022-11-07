public class PolyParameter {
	public static void main(String[] args) {
		Worker tom = new Worker("tom", 2500);
		Manager milan = new Manager("milan", 5000, 200000);
		PolyParameter polyParameter = new PolyParameter();
		polyParameter.showEmpAnnual(tom);
		polyParameter.showEmpAnnual(milan);	

		polyParameter.testWork(tom);
		polyParameter.testWork(milan);
	}

	//测试类 中添加一个方法 showEmpAnnal(Employee e)
	//实现获取任何员工对象的年工资，并在main方法中调用该方法[e.getAnnual()]
	public void showEmpAnnual(Employee e) {
		System.out.println(e.getAnnual());	//动态绑定机制
	}

	//测试类 中添加一个方法，testWork,如果是普通员工，则调用work方法，如果是经理，则调用 manage 方法
	public void testWork(Employee e) {
		if (e instanceof Worker) {
			((Worker) e).work();	//向下转型
		} else if (e instanceof Manager) {
			((Manager) e).manage();	//向下转型
		} else {
			System.out.println("不做操作...");
		}
	}
}
