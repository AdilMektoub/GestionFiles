package StringBufferBuilder;

@FunctionalInterface
public interface Chat {
	
//	Interface fonctionnelle qui s'appelle Chat et à l'intérieur une méthode qui s'appelle mioler 
//	qui prend une  Chaîne de caractères en parametre qui est le nom du chat
//		Pour pouvoir créer une expression lambda liée à un objet chat qui affiche (nom + « miole ! »)
	
	public void mioler(String nom);

	
}
