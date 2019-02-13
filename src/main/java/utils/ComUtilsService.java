package utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ComUtilsService {
    private ComUtils comUtils;

    public ComUtilsService(InputStream inputStream, OutputStream outputStream) throws IOException {
        comUtils = new ComUtils(inputStream, outputStream);
    }

    public void writeTest() throws IOException {
        //TODO: put your code here
        String nom = "German Barquero Garcia";
        comUtils.write_string(nom);
        comUtils.write_int32(22);
        int header = 2;
        String comentari = "Exemple: write_string_variable(2,”Hola!”), escriurà una trama amb una capçalera de dos caràcters";
        comUtils.write_string_variable(header, comentari);
        comUtils.writeChar('I');
        
    }

    public String readTest() throws IOException {
        String result = "";
        result = comUtils.read_string();
        int num = comUtils.read_int32();
        String comentari = comUtils.read_string_variable(2); //header= 2
        char c = comUtils.readChar();
        System.out.println(result);
        System.out.println(num);
        System.out.println(comentari);
        System.out.println(c);
        return result;
    }



}
