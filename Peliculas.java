public class Peliculas extends Video{

	private String cla;
	private int duracion;

	public Peliculas(String nombre,String genero,Artista[] artistas,String cla,int duracion){
		super(nombre,genero,artistas);
		this.cla=cla;
		this.duracion=duracion;
	}
	public double costo(){
		int costo = 18;
		double total = 0;
		if(cla.equals("c") || cla.equals("d") || cla.equals("C") || cla.equals("D")){
			total = costo*1.15;
			return total;
		}
		else{
			return costo;
		}
	}
}
