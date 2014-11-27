public abstract class Video implements Precio{

	protected String nombre;
	protected String genero;
	protected Artista[] artistas;

	public Video(String nombre, String genero, Artista[] artistas){
		this.nombre=nombre;
		this.genero=genero;
		this.artistas=artistas;
	}



}
