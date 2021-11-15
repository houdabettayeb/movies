package tn.esprit;

import java.io.File;

public class RepositoryLocation {
	public static void main(String[] args) {
		File file = new
		File("/Users/macbookprohouda/Documents/workspace-sts-3.9.12.RELEASEhouda/tpMaven2");
		String absolutePath = file.getAbsolutePath();
		String filePath = absolutePath.
		substring(0,absolutePath.indexOf(File.separator, 30));
		System.out.println("Le dossier contenant les dépendances "
		+ "et les livrables des projets est : ");
		System.out.println( filePath);
		}
		}


