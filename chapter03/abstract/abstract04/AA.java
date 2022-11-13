public class AA extends Template {
	//计算任务
	@Override
	public void job() {	//重写 job 方法
		long num = 0;
		for (long i = 0; i <= 80000; i++) {
			num += i;
		}		
	}
}
