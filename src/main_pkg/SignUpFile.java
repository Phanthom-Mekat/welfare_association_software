
package main_pkg;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SignUpFile {
    public static boolean SignUpFileWrite(User UserInfo,String nameFile){
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        Boolean result=false;
        try{
            f= new File(nameFile+"LoginInfo.bin");
            if(f.exists()){
                 
                 fos = new FileOutputStream(f,true);
                 oos = new AppendableObjectOutputStream(fos);
            }
            else{
                 
                 fos = new FileOutputStream(f);
                 oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(UserInfo);
            result = true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(oos!=null) oos.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return result;
    }
    
    public static boolean SignUpFileRead(String nameFile,String Username,String Password){
        File f= null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Boolean result=false;
        try{
            fis = new FileInputStream(nameFile+"LoginInfo.bin");
            ois = new ObjectInputStream(fis);
            while(true){
                try{
                    User UserInfo = (User) ois.readObject();
                    if(UserInfo.getUserName().equals(Username) && UserInfo.getPassword().equals(Password)){
                        result=true;
                        break;
                    }
               
                       
                   }
                catch(EOFException ef){
                    break;
                   }
                
               }            
            }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(ois!=null) ois.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return result;
     }
        
    //reaf filefor sending user fullname------------------
    public static String FileRead_forUserName(String nameFile,String Username,String Password){
        File f= null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        String result= null;
        try{
            fis = new FileInputStream(nameFile+"LoginInfo.bin");
            ois = new ObjectInputStream(fis);
            while(true){
                try{
                    User UserInfo = (User) ois.readObject();
                    if(UserInfo.getUserName().equals(Username) && UserInfo.getPassword().equals(Password)){
                        result=UserInfo.getFullName();
                        break;
                    }
               
                       
                   }
                catch(EOFException ef){
                    break;
                   }
                
               }            
            }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(ois!=null) ois.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return result;
     }
    
}
