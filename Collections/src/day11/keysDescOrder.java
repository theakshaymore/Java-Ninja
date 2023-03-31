package day11;
import java.util.Comparator;

public class keysDescOrder implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -Integer.compare(o1, o2);
	}

}