/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainsPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Walker
 */
public class Methods implements IMethods{
    
    // returns ALL trains in the data as a String
    public static String getAllTrains(){
        ArrayList<Train> trainsArrayInstance = Populate();
       
        ArrayList<String> allTrainsStringList;
        allTrainsStringList = new ArrayList<String>();
        
        for(int i = 0; i < trainsArrayInstance.size(); i++) {
            
             try {
                 allTrainsStringList.add(trainsArrayInstance.get(i).getDeparts());
             } catch (Exception e) {
                 
             }
        }
        String returnAllTrainsString = "all trains: " + allTrainsStringList;
        return returnAllTrainsString;
     }
     
      // returns ONLY trains at selected platform as String
    public static String getTrainsAtPlatform(String platformQuery){
        ArrayList<Train> trainsArrayInstance = Populate();;
       
        ArrayList<String> trainsAtPlatformStringList;
        trainsAtPlatformStringList = new ArrayList<String>();
        
       
        
        for(int i = 0; i < trainsArrayInstance.size(); i++) {
            if(trainsArrayInstance.get(i).getPlatform().equals(platformQuery)) {
          
                try {
                    trainsAtPlatformStringList.add(trainsArrayInstance.get(i).getDeparts());
                } catch (Exception e) {
                    
                }
                  } else {
            }
        
        
         
    
        }
        String returnPlatformString = "all trains at platform " + platformQuery + ": " + trainsAtPlatformStringList;
        return returnPlatformString;
    }
   
    
// returns ONLY trains with an EXPECTED value as the are LATE as a String
      public static String getLateTrains(){
        ArrayList<Train> trainsArrayInstance = Populate();;
       
        ArrayList<String> trainsLateStringList;
        trainsLateStringList = new ArrayList<String>();
        
       
        
        for(int i = 0; i < trainsArrayInstance.size(); i++) {
            if(trainsArrayInstance.get(i).getExpected() != null) {
          
                try {
                    trainsLateStringList.add(trainsArrayInstance.get(i).getDeparts());
                } catch (Exception e) {
                    
                }
                  } else {
            }
        
        
         
    
        }
        String returnLateString = "all late trains: " + trainsLateStringList + "    Please be advised these trains are running late, plan your journey accordingly";
        return returnLateString;
    }
    
      
      
      // returns ONLY trains calling at a selected station as String
        public static String getTrainsAtStation(String stationQuery){
        ArrayList<Train> trainsArrayInstance = Populate();
        ArrayList<String> trainsAtStationStringList;
        trainsAtStationStringList = new ArrayList<String>();
        
         ArrayList<Stop> stopsArrayInstance = new ArrayList<Stop>(); 
        
        
        
        for(int i = 0; i < trainsArrayInstance.size(); i++) {
            trainsArrayInstance.get(i).getStops();
            stopsArrayInstance = (ArrayList<Stop>) trainsArrayInstance.get(i).getStops();
            ArrayList<String> stationNamesList = new ArrayList<String>(); 
           
            
            for (int j = 0; j < stopsArrayInstance.size(); j++) {
                stationNamesList.add( stopsArrayInstance.get(j).getName());
            }
            
            if(stationNamesList.contains(stationQuery)) {
                
                try {
                    trainsAtStationStringList.add(trainsArrayInstance.get(i).getDeparts());
                } catch (Exception e) {
                    
                }
                  } else {
            }
        
        }
         String returnTrainsAtStationString = "all trains calling at " + stationQuery + ": " + trainsAtStationStringList;
         return returnTrainsAtStationString;
    }
    
    
    
    
    
    
    
    
    
     // Gets the JSON data and turns in into an array of trains, each train contains an array of stops. returns the array of trains
    public static ArrayList<Train> Populate() {
        
        ArrayList<Train> trainsArray = new ArrayList<Train>();
        String jsonString = "";
        String jsonStringRetrieved = "";
         
		// get API from URL
                try 
                {
			URL url = new URL("http://web.socem.plymouth.ac.uk/david/trains.json");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while (null != (jsonString = br.readLine()))
                        {
                            jsonStringRetrieved = jsonString;
                        }
                } catch (Exception ex)
                {
			ex.printStackTrace();
                }
                
                JSONArray jsonArr = new JSONArray(jsonStringRetrieved);
                
    // into trains array
                try 
                {
                    for(int i=0; i<jsonArr.length(); i++){
                      ArrayList<Stop> stopsArray = new ArrayList<Stop>(); 
                      
                      JSONObject obj = jsonArr.getJSONObject(i);
                      JSONArray stops = (JSONArray) obj.get("stops");
                      
                      String trainDeparts = obj.getString("departs");
                      String platform = obj.getString("platform");
                    
                      // with stops array
                      for(int j=0; j<stops.length(); j++){
                          JSONObject stopsObj = stops.getJSONObject(j);
                          
                          String name = stopsObj.getString("name");
                          String arrives = stopsObj.getString("arrives");
                        
                          
                          try
                          {
                                 String stopDeparts = stopsObj.getString("departs");
                             
                                
                                 Stop newStop = new Stop(name, arrives, stopDeparts);
                                 stopsArray.add(newStop);
                          }
                          catch (Exception noDeparts)
                          {
                                 Stop newStop = new Stop(name, arrives);
                                 stopsArray.add(newStop);
                          }
                      }
                      
                      try
                      {
                          String expected = obj.getString("expected");
                     
                             
                          Train newTrain = new Train(platform, trainDeparts, expected ,stopsArray);
                          trainsArray.add(newTrain);
                             
                      
                      }
                      catch (Exception noExpected)
                      {
			Train newTrain = new Train(platform, trainDeparts, stopsArray);
                        trainsArray.add(newTrain);
                      }
                    }
                
                } catch (Exception ex)
                {
			ex.printStackTrace();
                }
    
    return trainsArray;
    }
    
   
}
