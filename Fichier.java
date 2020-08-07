package StringBufferBuilder;

import java.io.File;
import java.io.IOException;

@FunctionalInterface
public interface Fichier {

	public void Lire(File f, String[] tab)
			throws IOException;
	
}
