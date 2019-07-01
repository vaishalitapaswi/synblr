package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class DeptManager implements Manager<Department> {
	private List<Department> list = new ArrayList<>();

	public List<Department> getList() {
		return list;
	}
	public void setList(List<Department> list) {
		this.list = list;
	}
	
	public void update(Department newDept) {
		for (int i = 0;i< list.size();i++) 
		{
			if (list.get(i).getDeptno() == newDept.getDeptno()) {
				list.set(i,newDept);
				System.out.println("Update " + newDept);
				break;
			}
		}
	}

	public static void main(String[] args) {
		DeptManager mgr = new DeptManager();
		for(int i = 10; i< 100;i+=10) {
			Department d = null;
			if((i %20)==0)
					d= new Department(i,"Dept"+i, "Hyd");
			else
				d= new Department(i,"Dept"+i, "Pune");
			mgr.create(d);
		}
		//list.removeIf(pred);
		mgr.list();
		Department d= new Department(10,"HR","Blr");
		mgr.update(d);
		mgr.delete(e -> e.getDeptno() == 20);
		mgr.list();
		mgr.delete(e -> e.getDname().equals("Dept30" ));
		mgr.list();
		mgr.delete(e -> e.getLoc().equals("Hyd" ));
	
		mgr.list();
	}

}
