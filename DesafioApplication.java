import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> list = new ArrayList<>();
		int a = 0, b = 1, aux = 0;
		list.add(a);
		list.add(b);

		while(aux < 350){
			aux = a + b;
			a = b;
			b = aux;
			list.add(aux);
		}
		return list;

	}

	public static Boolean isFibonacci(Integer a) {

		if(fibonacci().contains(a)){
			return true;
		}
		else{
			return false;
		}
	}

}
