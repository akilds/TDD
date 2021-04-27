import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CabInvoiceGenerator {

	public int count = 0;
	public int totalFare = 0;
	public int id;
	Map<Integer, ArrayList<Integer>> idMap = new HashMap<>();

	public CabInvoiceGenerator() {}

	//USE CASE 1
	public int calculateFare(int distance, int time)
	{
		int fare;
		fare = (10*distance) + (1*time);
		count++;
		return fare;
	}

	//USE CASE 2
	public int calculateTotalFare(int count, int[] fare)
	{
		for(int i=0; i<count; i++)
			totalFare += fare[i];
		return totalFare;
	}

	//USE CASE 3
	public int getCount()
	{
		return count;
	}

	public int calculateTotalFare(ArrayList<Integer> fare)
	{
		for(Integer i : fare)
			totalFare += i;
		return totalFare;
	}

	public int getAvgFare()
	{
		return totalFare/count;
	}

	//USE CASE 4
	public void idList(int id)
	{
		this.id = id;
		ArrayList<Integer> idList = new ArrayList<>();
		idList.add(this.count);
		idList.add(this.totalFare);
		idList.add(this.totalFare/this.count);
		idMap.put(this.id, idList);
	}

	public ArrayList<Integer> getList(int id)
	{
		for(Map.Entry m : idMap.entrySet())
		{
			int keyId = (Integer) m.getKey();
			if(id == keyId)
			{
				ArrayList<Integer> value = (ArrayList<Integer>) m.getValue();
				return value;
			}
		}
		return null;
	}

	//USE CASE 5
	public int calculateFare(String cx, int distance, int time)
	{
		int fare;
		if(cx.equals("Premium"))
		{
			fare = (15*distance) + (2*time);
		}
		else
		{
			fare = (10*distance) + (1*time);
		}
		return fare;
	}
}
