package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class EmpManager {
	private List<Emp> list = new ArrayList<>();

	public void create(Emp d){
		list.add(d);
	}
	public List<Emp> list(){
		return this.list;
	}
	
	public void delete(int Empno){
		for (int i = 0;i< list.size();i++) 
		{
			if (list.get(i).getEmpno() == Empno) {
					list.remove(list.get(i));
					break;
			}
		}
	}
	public void update(Emp newEmp) {
		for (int i = 0;i< list.size();i++) 
		{
			if (list.get(i).getEmpno() == newEmp.getEmpno()) {
				list.set(i,newEmp);
				System.out.println("Update " + newEmp);
				break;
			}
		}
	}

	public static void main(String[] args) {
		EmpManager mgr = new EmpManager();
		for(int i =1;i<=10;i++){
			Emp e = new Emp();
			e.setEmpno(i);
			e.setEname("Nameof"+i);
			e.setSalary(i*1000);
			mgr.create(e);
		}
		
		mgr.delete(1);
		Emp d= new Emp(2, "Vaishali",2222.22);
		mgr.update(d);
		for (Emp  emp : mgr.list) {
			System.out.println(emp);
		}
	}
}
