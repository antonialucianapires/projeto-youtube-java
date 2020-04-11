
public class ProjetoYoutube {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 2 de POO");
		v[2] = new Video("Aula 3 de POO");
		
		Gafanhoto g[] = new Gafanhoto[2];
		
		g[0] = new Gafanhoto("Antonia", 23, "F", "antonia");
		g[1] = new Gafanhoto("Juliana", 28, "F", "jujuba");
		
		Visualizacao visualizacao[] = new Visualizacao[5];
		
		visualizacao[0] = new Visualizacao(g[0], v[2]);
		visualizacao[0].avaliar();
		System.out.println(visualizacao[0].toString());
		
		
		visualizacao[1] = new Visualizacao(g[0], v[1]);
		visualizacao[0].avaliar(87.0);
		System.out.println(visualizacao[0].toString());
		
		
		
	}

}
