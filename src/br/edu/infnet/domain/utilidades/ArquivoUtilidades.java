package br.edu.infnet.domain.utilidades;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class ArquivoUtilidades {
	
	public static <T> void criarArquivo(String caminho, T classe) {
		Path path = Path.of(caminho);

        try {
            if (Files.notExists(path.getParent())) {
                Files.createDirectories(path.getParent());
            }

            if (Files.notExists(path)) {
                Files.createFile(path);
            }

            Files.writeString(path, classe.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static String obterDiretorioPai(String caminhoCompleto) {
        int ultimoIndiceBarra = caminhoCompleto.lastIndexOf("\\");
        if (ultimoIndiceBarra != -1) {
            return caminhoCompleto.substring(0, ultimoIndiceBarra);
        }
        return caminhoCompleto; 
    }
}
