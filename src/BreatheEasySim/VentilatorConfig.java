/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BreatheEasySim;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author calebgomez
 */
public class VentilatorConfig {
    private Properties properties;
    private File configFile = new File("config.properties");
    
    public VentilatorConfig() {
        properties = new Properties();
        loadConfig();
    }
    
    private void loadConfig() {
        
        try (FileReader reader = new FileReader(configFile)){
            properties.load(reader);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentilatorConfig.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VentilatorConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
    
    public void setProperty(String key, String value) {
        properties.setProperty(key, value);
        saveConfig();
    }
    
    private void saveConfig() {
        try (FileWriter writer = new FileWriter(configFile)) {
            properties.store(writer, "Updated configuration");
        } catch (IOException ex) {
            Logger.getLogger(VentilatorConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
