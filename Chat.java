package StringBufferBuilder;

@FunctionalInterface
public interface Chat {
	
//	Interface fonctionnelle qui s'appelle Chat et � l'int�rieur une m�thode qui s'appelle mioler 
//	qui prend une  Cha�ne de caract�res en parametre qui est le nom du chat
//		Pour pouvoir cr�er une expression lambda li�e � un objet chat qui affiche (nom + � miole ! �)
	
	public void mioler(String nom);

	
}
