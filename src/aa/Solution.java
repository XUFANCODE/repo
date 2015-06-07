package aa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("key1", "value1");

		map.put("key2", "value2");

		map.put("key3", "value3");
		// 打印KEY值

		System.out.println(map.get("key3"));
		// 打印VALUE值

		System.out.println(map.get("key1"));

		Set<String> keySet = map.keySet();

		int i = map.size() - 1;

		Map<Integer, String> mapKey = new HashMap<Integer, String>();
		Map<Integer, String> mapValue = new HashMap<Integer, String>();
		for (java.util.Map.Entry<String, String> entry : map.entrySet()) {
			// 将原来MAP的VALUE放入新的MAP的VALUE里面
			mapKey.put(i, entry.getValue());
			// 将原来MAP的KEY放入新的MAP的VALUE 里面
			mapValue.put(i, entry.getKey());
			i--;

		}
		// 打印KEY值

		System.out.println(mapKey.get(2));
		// 打印VALUE值

		System.out.println(mapValue.get(0));

	}
}

class Employee {
	public Employee(String n) {
		name = n;
		salary = 0;
	}

	public String toString() {
		return "[name=" + name + ", salary=" + salary + "]";
	}

	private String name;
	private double salary;
}
