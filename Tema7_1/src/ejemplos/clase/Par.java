package ejemplos.clase;

public class Par<K, V> implements IPar<K, V> {

	public K clave;
	public V valor;
	
	public Par(K clave, V valor) {
		super();
		this.clave = clave;
		this.valor = valor;
	}

	@Override
	public K getClave() {
		return this.clave;
	}

	@Override
	public V getValor() {
		return this.valor;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Par [");
		builder.append(clave);
		builder.append(", ");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}

	public static void main(String[] args) {
		Par<Integer, String> mipar = new Par(44, "Javi");
		System.out.println(mipar);
		
		Par<String, String> otroPar = new Par("Javier", "Guillén");
		System.out.println(otroPar);
	}

}
