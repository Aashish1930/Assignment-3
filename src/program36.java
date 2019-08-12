import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class program36 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"mohan");
		hm.put(2,"Aashish");
		hm.put(3, "akash");
		hm.put(4,"naval");
		hm.put(5,"promod");
		Set<Entry<Integer,String>> set=hm.entrySet();
		Iterator<Entry<Integer, String>> i = set.iterator();
			while(i.hasNext()){
				Map.Entry<Integer, String> me = (Map.Entry<Integer, String>)i.next();
		         int key=Integer.parseInt(me.getKey().toString());
		         if(key%4!=0)
		         	System.out.println(me.getValue());}
	}

}
