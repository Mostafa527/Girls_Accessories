
package model;

public class User {
    private int uid ;
    private String uname;
    private String upassword;
    private String uemail;
    
    public User(){
    
    }

    public User(int uid, String uname, String upassword, String uemail) {
        this.uid = uid;
        this.uname = uname;
        this.upassword = upassword;
        this.uemail = uemail;
    }
       public User(String uid, String uname, String upassword, String uemail) {
        this.uid = Integer.parseInt(uid);
        this.uname = uname;
        this.upassword = upassword;
        this.uemail = uemail;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }
    
    
 

 
    
}
