package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class SampleController implements Initializable{

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt1;

    @FXML
    void handleMe(ActionEvent event) throws IOException {
    	 String key=txt1.getText().toString();
    	 String value=txt2.getText().toString();
    	 HashMap<String, String> h=new HashMap<String,String>();
         Properties properties=new Properties();
         h.put(key,value);
        //for(Map.Entry<String, String> entry: h.entrySet()){
        //	properties.put(entry.getKey(), entry.getValue());
       // }
        properties.putAll(h);
        System.out.println(h);
        File file=new File("data.properties");
        FileOutputStream writer = new FileOutputStream(file,true);
        properties.store(writer,null);
        txt1.clear();
        txt2.clear(); 
    }
    
    @FXML
    void checkMe(ActionEvent event) throws FileNotFoundException, IOException {
        HashMap<Object, Object> h=new HashMap<Object,Object>();
        File file=new File("data.properties");
        FileInputStream reader=new FileInputStream(file);
        Properties properties=new Properties();
        properties.load(reader);
        reader.close();
       //properties.load(new FileInputStream("data.properties"));
        System.out.println("Before changes:"+properties);
        for(Object key: properties.stringPropertyNames()){
        	h.put(key, properties.get(key).toString());
        }
      // System.out.println(h.containsKey("Paper"));
        if(h.containsKey("Paper")){
       	h.remove("Paper");
        properties.remove("Paper");
      }
       FileOutputStream writer=new FileOutputStream("data.properties");
       properties.store(writer, "removed paper");
       System.out.println("After changes:"+properties);
       System.out.println(h);
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

    
    

}
