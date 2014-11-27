public class SeparadorComas{
	public static void main(String[] args){

		String texto;
		int arreglo[];
		char[] chars;
		int palabras = 1;


		System.out.print("Dame el texto: ");
		texto = System.console().readLine();

		for(int j=0; j<texto.length();j++){
			if(texto.charAt(j) == ',')
				palabras++;
		}

		chars = new char[palabras];


		for(int k=0;k<palabras;k++){
			for(int i=0; i<chars[k].length();i++ ){
				if(texto.charAt(i) == ','){
					break;
				}
				chars[k] = texto.charAt(i);
			}
		}

		for(int h=0;h<palabras;h++){
			System.out.println(chars[h]);
		}

		//System.out.println(String.valueOf(chars[0]));
	}
}
