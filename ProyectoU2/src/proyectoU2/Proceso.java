package proyectoU2;

/**
 *
 * @author 18progb0133
 */
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;import java.awt.Desktop;

import javax.swing.JOptionPane;

public class Proceso {

    public void cargarArchivo() {
        abrir();
    }

    private void abrir() {
        //ruta del archivo en el pc
        String fileLocal = "src/Documentos/ProcesosDeRespiracion.pdf";

        try {
            File path = new File(fileLocal);
            Desktop.getDesktop().open(path);

        } catch (IOException e) {
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }   
}