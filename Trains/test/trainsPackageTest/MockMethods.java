/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainsPackageTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import trainsPackage.IMethods;
import trainsPackage.Stop;
import trainsPackage.Train;

/**
 *
 * @author Walker
 */
public class MockMethods implements IMethods{
     
    // returns ALL trains in the mock data as a String
    public static String getAllTrains(){
        ArrayList<Train> trainsArrayInstance = MockPopulate();
       
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
     
     
      // returns ALL trains in the edge case data as a String
    public static String getAllTrainsEdge(){
        ArrayList<Train> trainsArrayInstance = MockPopulateEdge();
       
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
        ArrayList<Train> trainsArrayInstance = MockPopulate();;
       
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
    
    
    
    
    
    
      // returns ONLY trains at selected platform as String USING EDGE case data
     public static String getTrainsAtPlatformEdge(String platformQuery){
        ArrayList<Train> trainsArrayInstance = MockPopulateEdge();;
       
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
        ArrayList<Train> trainsArrayInstance = MockPopulate();;
       
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
    
      
      
      // returns ONLY trains with an EXPECTED value as the are LATE as a String USING EDGE CASE DATA
       public static String getLateTrainsEdge(){
        ArrayList<Train> trainsArrayInstance = MockPopulateEdge();;
       
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
        ArrayList<Train> trainsArrayInstance = MockPopulate();
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
    
        
        
           // returns ONLY trains calling at a selected station as String USING EDGE CASE DATA
        public static String getTrainsAtStationEdge(String stationQuery){
        ArrayList<Train> trainsArrayInstance = MockPopulateEdge();
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
    
        
        
        
        
        
    
     // Gets the MOCK JSON data and turns in into an array of trains, each train contains an array of stops. returns the array of trains
     public static ArrayList<Train> MockPopulate() {
        
        ArrayList<Train> trainsArray = new ArrayList<Train>();
        
        // mock api data
        String jsonStringRetrieved = "[{\"stops\":[{\"name\":\"Totnes\",\"arrives\":\"0959\",\"departs\":\"1000\"},{\"name\":\"Ivybridge\",\"arrives\":\"1016\",\"departs\":\"1016\"},{\"name\":\"Plymouth\",\"arrives\":\"1029\",\"departs\":\"1033\"},{\"name\":\"Saltash\",\"arrives\":\"1041\",\"departs\":\"1042\"},{\"name\":\"St Germans\",\"arrives\":\"1048\",\"departs\":\"1049\"},{\"name\":\"Liskeard\",\"arrives\":\"1100\",\"departs\":\"1101\"},{\"name\":\"Bodmin Parkway\",\"arrives\":\"1115\",\"departs\":\"1117\"},{\"name\":\"Par\",\"arrives\":\"1127\",\"departs\":\"1128\"},{\"name\":\"St Austell\",\"arrives\":\"1135\",\"departs\":\"1136\"},{\"name\":\"Truro\",\"arrives\":\"1152\",\"departs\":\"1153\"},{\"name\":\"Redruth\",\"arrives\":\"1206\",\"departs\":\"1207\"},{\"name\":\"Camborne\",\"arrives\":\"1212\",\"departs\":\"1213\"},{\"name\":\"Hayle\",\"arrives\":\"1220\",\"departs\":\"1220\"},{\"name\":\"St Erth\",\"arrives\":\"1224\",\"departs\":\"1225\"},{\"name\":\"Penzance\",\"arrives\":\"1234\",\"departs\":null}],\"platform\":\"2\",\"departs\":\"0947\"},{\"stops\":[{\"name\":\"Torquay\",\"arrives\":\"1003\",\"departs\":\"1005\"},{\"name\":\"Paignton\",\"arrives\":\"1011\",\"departs\":null}],\"platform\":\"2\",\"departs\":\"0953\"},{\"stops\":[{\"name\":\"Exeter St Davids\",\"arrives\":\"1021\",\"departs\":\"1023\"},{\"name\":\"Tiverton Parkway\",\"arrives\":\"1035\",\"departs\":\"1038\"},{\"name\":\"Taunton\",\"arrives\":\"1049\",\"departs\":\"1050\"},{\"name\":\"Bristol Temple Meads\",\"arrives\":\"1124\",\"departs\":\"1130\"},{\"name\":\"Bristol Parkway\",\"arrives\":\"1138\",\"departs\":\"1140\"},{\"name\":\"Cheltenham Spa\",\"arrives\":\"1209\",\"departs\":\"1211\"},{\"name\":\"Birmingham New Street\",\"arrives\":\"1256\",\"departs\":\"1303\"},{\"name\":\"Burton-on-Trent\",\"arrives\":\"1324\",\"departs\":\"1326\"},{\"name\":\"Derby\",\"arrives\":\"1339\",\"departs\":\"1345\"},{\"name\":\"Chesterfield\",\"arrives\":\"1402\",\"departs\":\"1403\"},{\"name\":\"Sheffield\",\"arrives\":\"1418\",\"departs\":\"1421\"},{\"name\":\"Wakefield Westgate\",\"arrives\":\"1446\",\"departs\":\"1447\"},{\"name\":\"Leeds\",\"arrives\":\"1500\",\"departs\":\"1508\"},{\"name\":\"York\",\"arrives\":\"1530\",\"departs\":\"1532\"},{\"name\":\"Darlington\",\"arrives\":\"1559\",\"departs\":\"1601\"},{\"name\":\"Durham\",\"arrives\":\"1617\",\"departs\":\"1618\"},{\"name\":\"Newcastle\",\"arrives\":\"1630\",\"departs\":\"1635\"},{\"name\":\"Morpeth\",\"arrives\":\"1648\",\"departs\":\"1649\"},{\"name\":\"Alnmouth For Alnwick\",\"arrives\":\"1703\",\"departs\":\"1704\"},{\"name\":\"Dunbar\",\"arrives\":\"1744\",\"departs\":\"1745\"},{\"name\":\"Edinburgh\",\"arrives\":\"1807\",\"departs\":\"1811\"},{\"name\":\"Haymarket\",\"arrives\":\"1815\",\"departs\":\"1817\"},{\"name\":\"Inverkeithing\",\"arrives\":\"1830\",\"departs\":\"1831\"},{\"name\":\"Kirkcaldy\",\"arrives\":\"1848\",\"departs\":\"1849\"},{\"name\":\"Markinch\",\"arrives\":\"1858\",\"departs\":\"1859\"},{\"name\":\"Ladybank\",\"arrives\":\"1906\",\"departs\":\"1907\"},{\"name\":\"Cupar\",\"arrives\":\"1915\",\"departs\":\"1916\"},{\"name\":\"Leuchars\",\"arrives\":\"1922\",\"departs\":\"1923\"},{\"name\":\"Dundee\",\"arrives\":\"1935\",\"departs\":\"1936\"},{\"name\":\"Arbroath\",\"arrives\":\"1951\",\"departs\":\"1952\"},{\"name\":\"Montrose\",\"arrives\":\"2005\",\"departs\":\"2006\"},{\"name\":\"Stonehaven\",\"arrives\":\"2026\",\"departs\":\"2027\"},{\"name\":\"Aberdeen\",\"arrives\":\"2048\",\"departs\":null}],\"platform\":\"3\",\"departs\":\"1003\"},{\"stops\":[{\"name\":\"Totnes\",\"arrives\":\"1015\",\"departs\":\"1016\"},{\"name\":\"Plymouth\",\"arrives\":\"1042\",\"departs\":null}],\"platform\":\"2\",\"departs\":\"1004\"},{\"stops\":[{\"name\":\"Torre\",\"arrives\":\"1015\",\"departs\":\"1015\"},{\"name\":\"Torquay\",\"arrives\":\"1018\",\"departs\":\"1018\"},{\"name\":\"Paignton\",\"arrives\":\"1025\",\"departs\":null}],\"platform\":\"1\",\"departs\":\"1007\",\"expected\":\"1015\"},{\"stops\":[{\"name\":\"Teignmouth\",\"arrives\":\"1028\",\"departs\":\"1029\"},{\"name\":\"Dawlish\",\"arrives\":\"1033\",\"departs\":\"1034\"},{\"name\":\"Exeter St Davids\",\"arrives\":\"1045\",\"departs\":\"1047\"},{\"name\":\"Tiverton Parkway\",\"arrives\":\"1059\",\"departs\":\"1100\"},{\"name\":\"Taunton\",\"arrives\":\"1112\",\"departs\":\"1117\"},{\"name\":\"Bristol Temple Meads\",\"arrives\":\"1151\",\"departs\":\"1200\"},{\"name\":\"Bristol Parkway\",\"arrives\":\"1208\",\"departs\":\"1209\"},{\"name\":\"Cheltenham Spa\",\"arrives\":\"1238\",\"departs\":\"1240\"},{\"name\":\"Birmingham New Street\",\"arrives\":\"1325\",\"departs\":\"1331\"},{\"name\":\"Wolverhampton\",\"arrives\":\"1347\",\"departs\":\"1348\"},{\"name\":\"Stafford\",\"arrives\":\"1401\",\"departs\":\"1402\"},{\"name\":\"Stoke-on-Trent\",\"arrives\":\"1417\",\"departs\":\"1420\"},{\"name\":\"Macclesfield\",\"arrives\":\"1436\",\"departs\":\"1437\"},{\"name\":\"Stockport\",\"arrives\":\"1449\",\"departs\":\"1450\"},{\"name\":\"Manchester Piccadilly\",\"arrives\":\"1500\",\"departs\":null}],\"platform\":\"3\",\"departs\":\"1022\"},{\"stops\":[{\"name\":\"Totnes\",\"arrives\":\"1043\",\"departs\":\"1044\"},{\"name\":\"Plymouth\",\"arrives\":\"1110\",\"departs\":\"1119\"},{\"name\":\"Liskeard\",\"arrives\":\"1142\",\"departs\":\"1144\"},{\"name\":\"Bodmin Parkway\",\"arrives\":\"1155\",\"departs\":\"1157\"},{\"name\":\"Par\",\"arrives\":\"1206\",\"departs\":\"1208\"},{\"name\":\"St Austell\",\"arrives\":\"1214\",\"departs\":\"1215\"},{\"name\":\"Truro\",\"arrives\":\"1231\",\"departs\":\"1233\"},{\"name\":\"Redruth\",\"arrives\":\"1244\",\"departs\":\"1246\"},{\"name\":\"Camborne\",\"arrives\":\"1251\",\"departs\":\"1253\"},{\"name\":\"St Erth\",\"arrives\":\"1302\",\"departs\":\"1303\"},{\"name\":\"Penzance\",\"arrives\":\"1313\",\"departs\":null}],\"platform\":\"2\",\"departs\":\"1032\"},{\"stops\":[{\"name\":\"Exeter St Davids\",\"arrives\":\"1053\",\"departs\":\"1055\"},{\"name\":\"Tiverton Parkway\",\"arrives\":\"1110\",\"departs\":\"1111\"},{\"name\":\"Taunton\",\"arrives\":\"1123\",\"departs\":\"1125\"},{\"name\":\"Reading\",\"arrives\":\"1242\",\"departs\":\"1249\"},{\"name\":\"London Paddington\",\"arrives\":\"1315\",\"departs\":null}],\"platform\":\"3\",\"departs\":\"1034\"},{\"stops\":[{\"name\":\"Teignmouth\",\"arrives\":\"1046\",\"departs\":\"1046\"},{\"name\":\"Dawlish\",\"arrives\":\"1051\",\"departs\":\"1051\"},{\"name\":\"Dawlish Warren\",\"arrives\":\"1055\",\"departs\":\"1056\"},{\"name\":\"Starcross\",\"arrives\":\"1100\",\"departs\":\"1100\"},{\"name\":\"Exeter St Thomas\",\"arrives\":\"1109\",\"departs\":\"1109\"},{\"name\":\"Exeter St Davids\",\"arrives\":\"1113\",\"departs\":\"1116\"},{\"name\":\"Exeter Central\",\"arrives\":\"1119\",\"departs\":\"1120\"},{\"name\":\"St James' Park\",\"arrives\":\"1122\",\"departs\":\"1122\"},{\"name\":\"Polsloe Bridge\",\"arrives\":\"1125\",\"departs\":\"1125\"},{\"name\":\"Digby & Sowton\",\"arrives\":\"1128\",\"departs\":\"1129\"},{\"name\":\"Newcourt\",\"arrives\":\"1131\",\"departs\":\"1132\"},{\"name\":\"Topsham\",\"arrives\":\"1134\",\"departs\":\"1135\"},{\"name\":\"Exton\",\"arrives\":\"1138\",\"departs\":\"1139\"},{\"name\":\"Lympstone Commando\",\"arrives\":\"1140\",\"departs\":\"1141\"},{\"name\":\"Lympstone Village\",\"arrives\":\"1143\",\"departs\":\"1143\"},{\"name\":\"Exmouth\",\"arrives\":\"1148\",\"departs\":null}],\"platform\":\"3\",\"departs\":\"1039\"},{\"stops\":[{\"name\":\"Torre\",\"arrives\":\"1049\",\"departs\":\"1049\"},{\"name\":\"Torquay\",\"arrives\":\"1052\",\"departs\":\"1052\"},{\"name\":\"Paignton\",\"arrives\":\"1059\",\"departs\":null}],\"platform\":\"1\",\"departs\":\"1041\"},{\"stops\":[{\"name\":\"Teignmouth\",\"arrives\":\"1058\",\"departs\":\"1058\"},{\"name\":\"Dawlish\",\"arrives\":\"1103\",\"departs\":\"1103\"},{\"name\":\"Dawlish Warren\",\"arrives\":\"1107\",\"departs\":\"1116\"},{\"name\":\"Exeter St Davids\",\"arrives\":\"1128\",\"departs\":null}],\"platform\":\"3\",\"departs\":\"1051\"},{\"stops\":[{\"name\":\"Torre\",\"arrives\":\"1109\",\"departs\":\"1110\"},{\"name\":\"Torquay\",\"arrives\":\"1112\",\"departs\":\"1113\"},{\"name\":\"Paignton\",\"arrives\":\"1120\",\"departs\":null}],\"platform\":\"1\",\"departs\":\"1101\"},{\"stops\":[{\"name\":\"Exeter St Davids\",\"arrives\":\"1122\",\"departs\":\"1124\"},{\"name\":\"Tiverton Parkway\",\"arrives\":\"1137\",\"departs\":\"1138\"},{\"name\":\"Taunton\",\"arrives\":\"1150\",\"departs\":\"1150\"},{\"name\":\"Bristol Temple Meads\",\"arrives\":\"1222\",\"departs\":\"1230\"},{\"name\":\"Bristol Parkway\",\"arrives\":\"1238\",\"departs\":\"1240\"},{\"name\":\"Cheltenham Spa\",\"arrives\":\"1309\",\"departs\":\"1316\"},{\"name\":\"Birmingham New Street\",\"arrives\":\"1356\",\"departs\":\"1403\"},{\"name\":\"Tamworth\",\"arrives\":\"1418\",\"departs\":\"1419\"},{\"name\":\"Derby\",\"arrives\":\"1440\",\"departs\":\"1445\"},{\"name\":\"Chesterfield\",\"arrives\":\"1502\",\"departs\":\"1503\"},{\"name\":\"Sheffield\",\"arrives\":\"1518\",\"departs\":\"1521\"},{\"name\":\"Wakefield Westgate\",\"arrives\":\"1546\",\"departs\":\"1547\"},{\"name\":\"Leeds\",\"arrives\":\"1600\",\"departs\":\"1608\"},{\"name\":\"York\",\"arrives\":\"1630\",\"departs\":\"1631\"},{\"name\":\"Darlington\",\"arrives\":\"1658\",\"departs\":\"1700\"},{\"name\":\"Durham\",\"arrives\":\"1715\",\"departs\":\"1717\"},{\"name\":\"Newcastle\",\"arrives\":\"1731\",\"departs\":\"1737\"},{\"name\":\"Alnmouth For Alnwick\",\"arrives\":\"1801\",\"departs\":\"1803\"},{\"name\":\"Berwick-upon-Tweed\",\"arrives\":\"1823\",\"departs\":\"1824\"},{\"name\":\"Edinburgh\",\"arrives\":\"1906\",\"departs\":\"1911\"},{\"name\":\"Haymarket\",\"arrives\":\"1915\",\"departs\":\"1916\"},{\"name\":\"Motherwell\",\"arrives\":\"1954\",\"departs\":\"1955\"},{\"name\":\"Glasgow Central\",\"arrives\":\"2015\",\"departs\":null}],\"platform\":\"3\",\"departs\":\"1104\"},{\"stops\":[{\"name\":\"Totnes\",\"arrives\":\"1200\",\"departs\":\"1201\"},{\"name\":\"Plymouth\",\"arrives\":\"1226\",\"departs\":null}],\"platform\":\"2\",\"departs\":\"1105\"},{\"stops\":[{\"name\":\"Torre\",\"arrives\":\"1140\",\"departs\":\"1140\"},{\"name\":\"Torquay\",\"arrives\":\"1143\",\"departs\":\"1143\"},{\"name\":\"Paignton\",\"arrives\":\"1150\",\"departs\":null}],\"platform\":\"2\",\"departs\":\"1132\"},{\"stops\":[{\"name\":\"Teignmouth\",\"arrives\":\"1144\",\"departs\":\"1145\"},{\"name\":\"Dawlish\",\"arrives\":\"1149\",\"departs\":\"1150\"},{\"name\":\"Dawlish Warren\",\"arrives\":\"1154\",\"departs\":\"1154\"},{\"name\":\"Starcross\",\"arrives\":\"1158\",\"departs\":\"1158\"},{\"name\":\"Exeter St Thomas\",\"arrives\":\"1207\",\"departs\":\"1208\"},{\"name\":\"Exeter St Davids\",\"arrives\":\"1211\",\"departs\":\"1216\"},{\"name\":\"Exeter Central\",\"arrives\":\"1219\",\"departs\":\"1220\"},{\"name\":\"St James' Park\",\"arrives\":\"1222\",\"departs\":\"1222\"},{\"name\":\"Polsloe Bridge\",\"arrives\":\"1225\",\"departs\":\"1225\"},{\"name\":\"Digby & Sowton\",\"arrives\":\"1227\",\"departs\":\"1229\"},{\"name\":\"Newcourt\",\"arrives\":\"1230\",\"departs\":\"1232\"},{\"name\":\"Topsham\",\"arrives\":\"1234\",\"departs\":\"1235\"},{\"name\":\"Exton\",\"arrives\":\"1238\",\"departs\":\"1239\"},{\"name\":\"Lympstone Commando\",\"arrives\":\"1240\",\"departs\":\"1241\"},{\"name\":\"Lympstone Village\",\"arrives\":\"1243\",\"departs\":\"1243\"},{\"name\":\"Exmouth\",\"arrives\":\"1248\",\"departs\":null}],\"platform\":\"1\",\"departs\":\"1137\"},{\"stops\":[{\"name\":\"Totnes\",\"arrives\":\"1152\",\"departs\":\"1153\"},{\"name\":\"Plymouth\",\"arrives\":\"1220\",\"departs\":null}],\"platform\":\"2\",\"departs\":\"1140\"},{\"stops\":[{\"name\":\"Teignmouth\",\"arrives\":\"1156\",\"departs\":\"1157\"},{\"name\":\"Dawlish\",\"arrives\":\"1202\",\"departs\":\"1203\"},{\"name\":\"Exeter St Davids\",\"arrives\":\"1215\",\"departs\":\"1217\"},{\"name\":\"Tiverton Parkway\",\"arrives\":\"1231\",\"departs\":\"1232\"},{\"name\":\"Taunton\",\"arrives\":\"1245\",\"departs\":\"1246\"},{\"name\":\"Castle Cary\",\"arrives\":\"1306\",\"departs\":\"1307\"},{\"name\":\"Westbury\",\"arrives\":\"1325\",\"departs\":\"1327\"},{\"name\":\"Pewsey\",\"arrives\":\"1343\",\"departs\":\"1345\"},{\"name\":\"Newbury\",\"arrives\":\"1404\",\"departs\":\"1405\"},{\"name\":\"Reading\",\"arrives\":\"1423\",\"departs\":\"1424\"},{\"name\":\"London Paddington\",\"arrives\":\"1454\",\"departs\":null}],\"platform\":\"3\",\"departs\":\"1150\",\"expected\":\"1159\"}]";
         
		
                
                
                JSONArray jsonArr = new JSONArray(jsonStringRetrieved);
                
                try 
                {
                    for(int i=0; i<jsonArr.length(); i++){
                      ArrayList<Stop> stopsArray = new ArrayList<Stop>(); 
                      
                      JSONObject obj = jsonArr.getJSONObject(i);
                      JSONArray stops = (JSONArray) obj.get("stops");
                      
                      String trainDeparts = obj.getString("departs");
                      String platform = obj.getString("platform");
                    
                      
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
    
    
    
     // Gets the EDGE CASE JSON data and turns in into an array of trains, each train contains an array of stops. returns the array of trains
     // One train 
     // Edge times e.g. 0001
     public static ArrayList<Train> MockPopulateEdge() {
        
        ArrayList<Train> trainsArray = new ArrayList<Train>();
        
        // mock api data
        String jsonStringRetrieved = "[{\"stops\":[{\"name\":\"Totnes\",\"arrives\":\"0002\",\"departs\":\"0003\"},{\"name\":\"Ivybridge\",\"arrives\":\"0004\",\"departs\":\"0005\"},{\"name\":\"Plymouth\",\"arrives\":\"0006\",\"departs\":\"1033\"},{\"name\":\"Saltash\",\"arrives\":\"1041\",\"departs\":\"1042\"},{\"name\":\"St Germans\",\"arrives\":\"1048\",\"departs\":\"1049\"},{\"name\":\"Liskeard\",\"arrives\":\"1100\",\"departs\":\"1101\"},{\"name\":\"Bodmin Parkway\",\"arrives\":\"1115\",\"departs\":\"1117\"},{\"name\":\"Par\",\"arrives\":\"1127\",\"departs\":\"1128\"},{\"name\":\"St Austell\",\"arrives\":\"1135\",\"departs\":\"1136\"},{\"name\":\"Truro\",\"arrives\":\"1152\",\"departs\":\"1153\"},{\"name\":\"Redruth\",\"arrives\":\"1206\",\"departs\":\"1207\"},{\"name\":\"Camborne\",\"arrives\":\"1212\",\"departs\":\"1213\"},{\"name\":\"Hayle\",\"arrives\":\"1220\",\"departs\":\"1220\"},{\"name\":\"St Erth\",\"arrives\":\"2357\",\"departs\":\"2358\"},{\"name\":\"Penzance\",\"arrives\":\"2359\",\"departs\":null}],\"platform\":\"1\",\"departs\":\"0001\"}]";
         
		
                
                
                JSONArray jsonArr = new JSONArray(jsonStringRetrieved);
                // mock data into trains array
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
