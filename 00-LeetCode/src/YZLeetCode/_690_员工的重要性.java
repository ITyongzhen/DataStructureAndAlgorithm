package YZLeetCode;

import java.util.HashMap;
import java.util.List;

public class _690_员工的重要性 {
public int getImportance(List<Employee> employees, int id) {
       HashMap<Integer, Employee> Map = new HashMap<>();
      for (Employee employee : employees) {
		Map.put(employee.id, employee);
      }
       return GetResultImportance(Map, id);
    }

	private int GetResultImportance(HashMap<Integer, Employee> Map,int id) {
		Employee employee = Map.get(id);
		int result = employee.importance;
		
		for (int i = 0; i < employee.subordinates.size(); i++) {
			Integer subordId = employee.subordinates.get(i);
			result += GetResultImportance(Map, subordId);
		}
		
		
		return result;
	}
}
