public class Serie extends Video{

	private Temporada[] temporadas;

	public Serie(String nombre,String genero,Artista[] artistas,Temporada[] temporadas){
		super(nombre,genero,artistas);
		this.temporadas=temporadas;
	}

	public int duracion(){
		int total =0;
			for(int i=0;i<temporadas.length;i++){
				total += temporadas[i].duracion();
			}
		return total;
	}

	public double costo(){
		double serie = 20;
		if(temporadas.length==1){
			return serie;
		}
		else if(temporadas.length>=2 && temporadas.length<5){
		return serie +5;
		}
		else if(temporadas.length<4){
		return serie+10;
		}
		return 0;
	}
}
