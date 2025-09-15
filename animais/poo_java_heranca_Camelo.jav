public class Heranca {
 	public static void main(String[] args) {
		Animal a = new Animal();
		a.emitirSom();

		Cachorro c = new Cachorro();
		c.nome = "Thor";
		System.out.println("Nome do cachorro:" + c.nome);
		
		Gato g =new Gato();
		g.nome = "Star";
		g.emitirSom();
		System.out.println("Nome do gato:" + g.nome);
	}
 }