package ua.od.zpk.zpk;

import android.util.Log;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class LaptopServer {

    private static final String LOG_TAG = "Termometry";
   // private String serverIP = "10.107.0.31";
    private int serverPORT = 2088;
   // private int serverPORT = 2000;
   private String serverIP = "185.153.120.114";

    private Socket socket = null;


    public LaptopServer(){


    }


public void OpenConection() throws Exception {

        closeConnection();
try {
    socket = new Socket(serverIP,serverPORT);


}catch (IOException e){
    throw new Exception("невозможно создать сокет" + e.getMessage());
}


}

public void closeConnection() {

        if (socket !=null && !socket.isClosed()){
            try {
                socket.close();
            }catch (Exception e){
                Log.e(LOG_TAG, "невозможно закрыть сокет" + e.getMessage());
            }finally {
                socket = null;
            }
        }
socket = null;
    }

public void sendData(String data )throws Exception {

        if (socket == null || socket.isClosed()){
            throw new Exception("Невозможно отправить данные сокет не создан или закрыт");
        }


        try {

                OutputStream s = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(s);
                dos.writeUTF(data);
                dos.flush();








        }catch (IOException e){
            throw new Exception("невозможно отправить данные " + e.getMessage());

        }

}


public String getData() throws Exception {
    String result = "ABC";
    if (socket == null || socket.isClosed()){
        throw new Exception("Невозможно отправить данные сокет не создан или закрыт");
    }




    while (true){
        try {
                InputStream is = socket.getInputStream();
                DataInputStream dos = new DataInputStream(is);
                result = dos.readUTF();

                break;


                }catch (IOException e){
            e.printStackTrace();
        }
        }return result;


    }


    public HashMap<String,ArrayList> getDataMap() throws Exception {
        HashMap<String,ArrayList> result = new HashMap<>();

        if (socket == null || socket.isClosed()){
            throw new Exception("Невозможно отправить данные сокет не создан или закрыт");
        }




        while (true){
            try {
                InputStream is = socket.getInputStream();
                ObjectInputStream ois = new ObjectInputStream(is);
                result = (HashMap<String, ArrayList>) ois.readObject();

                break;


            }catch (IOException e){
                System.out.println(e.getMessage()+ "проблема с получением данных в таблице");
            }
        }return result;


    }




    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        closeConnection();
    }
}
