package br.com.furb.cripto;

import java.io.File;

/**
 * Constantes do sistema.
 * 
 * @author Guilherme.Rosa
 */
public class Constants {
    private static final String TEMP_DIR = System.getProperty("java.io.tmpdir") + File.separator + "tratamsg" + File.separator;

    public static final File tempDir = new File(Constants.TEMP_DIR);

}
