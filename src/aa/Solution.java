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
		// ��ӡKEYֵ

		System.out.println(map.get("key3"));
		// ��ӡVALUEֵ

		System.out.println(map.get("key1"));

		Set<String> keySet = map.keySet();

		int i = map.size() - 1;

		Map<Integer, String> mapKey = new HashMap<Integer, String>();
		Map<Integer, String> mapValue = new HashMap<Integer, String>();
		for (java.util.Map.Entry<String, String> entry : map.entrySet()) {
			// ��ԭ��MAP��VALUE�����µ�MAP��VALUE����
			mapKey.put(i, entry.getValue());
			// ��ԭ��MAP��KEY�����µ�MAP��VALUE ����
			mapValue.put(i, entry.getKey());
			i--;

		}
		// ��ӡKEYֵ

		System.out.println(mapKey.get(2));
		// ��ӡVALUEֵ

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
