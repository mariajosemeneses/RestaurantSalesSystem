/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSalesSystem.utils;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAVID
 */
public class FileManager implements Persistence {

    @Override
    public void create(String data) {
        File file = new File("Users.json");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            fw.write(data);
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    @Override
    public void read() {
        try {
            String user;
            File file = new File("Users.json");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedreader = new BufferedReader(reader);
            while ((user = bufferedreader.readLine()) != null) {
                System.out.println(user);
            }

            bufferedreader.close();
        } catch (Exception e) {
            System.out.println("File don't found");
        }
    }

    @Override
    public void update(String dataToFind, String datatoUpdate) {
        File fAntiguo = new File("Users.json");
        Random numaleatorio = new Random(3816L);
        String nFnuevo = fAntiguo.getParent() + "/auxiliar" + String.valueOf(Math.abs(numaleatorio.nextInt())) + ".txt";
        File fNuevo = new File(nFnuevo);
        BufferedReader br;
        try {
            if (fAntiguo.exists()) {
                br = new BufferedReader(new FileReader(fAntiguo));
                String linea;
                while ((linea = br.readLine()) != null) {
                    if (linea.equals(dataToFind)) {
                        create("Users.json");

                    } else {
                        create("Users.json");
                    }
                }
                br.close();
                String nAntiguo = fAntiguo.getName();
                delete("Users.json");
                fNuevo.renameTo(fAntiguo);
            } else {
                System.out.println("File doesn't exist");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void delete(String dataToDelete) {
        boolean deleted = false;
        boolean ignore = false;
        String newLine = "";
        Gson gson = new Gson();

        try {
            FileReader readFile = new FileReader("Users.json");
            BufferedReader read = new BufferedReader(readFile);
            String line;
            while ((line = read.readLine()) != null) {

                Properties properties = (Properties) gson.fromJson(line, Properties.class);
                Set<String> keys = properties.stringPropertyNames();

                for (String key : keys) {
                    if (dataToDelete.equals(properties.getProperty(key))) {

                        ignore = true;
                        deleted = true;
                    }
                }
                if (!ignore) {
                    newLine = newLine + line + "\n";

                }
                ignore = false;
            }
            read.close();
            try (FileWriter writer = new FileWriter("Users.json")) {
                writer.write(newLine);
                writer.close();

            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void findName(String dataToFind) {
        
    }

}
