package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class DeptManager {
	private List<Dept> list = new ArrayList<>();

	public List<Dept> getList() {
		return list;
	}
	public void setList(List<Dept> list) {
		this.list = list;
	}
	
	public void update(Dept newDept) {
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

	}
}
