package collectionsTest;
import java.util.HashMap;
import java.util.Set;


public class HashMapTestClass {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("First", "Asha");
		map.put("Second", "avinash");
		map.put("Third", "Jiya");
		System.out.println("Hashmap@@"+map);
		//iterate and print the values
//		Set<String> hs = map.keySet();
//		for(String key : hs)
//		{
//			System.out.println("Key  :"+key+"key value :"+map.get(key));
//		}
		
		//copy this map into anothe sub map
		HashMap<String, String> submap = new HashMap<String,String>();
		submap.put("Fourth", "XYZ");		
		submap.put("Fifth", "ABC");
		
		map.putAll(submap);
		//iterate and print the values
				Set<String> hs = map.keySet();
				for(String key : hs)
				{
					System.out.println("Key  :"+key+"key value :"+map.get(key));
				}
		
	}

}
