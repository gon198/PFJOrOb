public class Temporada{
	private int anio;
	private Capitulo[] capitulos;

	public Temporada(int anio, Capitulo[] capitulos){
		this.anio=anio;
		this.capitulos=capitulos;
	}

	public int duracion(){
		int total =0;
		for(int i=0;i<capitulos.length;i++){
			total += capitulos[i].getDuracion();
		}
		return total;
	}

}
