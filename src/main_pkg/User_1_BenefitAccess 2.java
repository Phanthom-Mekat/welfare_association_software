/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

/**
 *
 * @author nirjharsikder
 */
public class User_1_BenefitAccess {
     private String userID,name,nameofPrograms,forWhomWhat,WhatKindOfHelp;

    public User_1_BenefitAccess(String userID, String name, String nameofPrograms, String forWhomWhat, String WhatKindOfHelp) {
        this.userID = userID;
        this.name = name;
        this.nameofPrograms = nameofPrograms;
        this.forWhomWhat = forWhomWhat;
        this.WhatKindOfHelp = WhatKindOfHelp;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameofPrograms() {
        return nameofPrograms;
    }

    public void setNameofPrograms(String nameofPrograms) {
        this.nameofPrograms = nameofPrograms;
    }

    public String getForWhomWhat() {
        return forWhomWhat;
    }

    public void setForWhomWhat(String forWhomWhat) {
        this.forWhomWhat = forWhomWhat;
    }

    public String getWhatKindOfHelp() {
        return WhatKindOfHelp;
    }

    public void setWhatKindOfHelp(String WhatKindOfHelp) {
        this.WhatKindOfHelp = WhatKindOfHelp;
    }

    @Override
    public String toString() {
        return "User_1_BenefitAccess{" + "userID=" + userID + ", name=" + name + ", nameofPrograms=" + nameofPrograms + ", forWhomWhat=" + forWhomWhat + ", WhatKindOfHelp=" + WhatKindOfHelp + '}';
    }
     
    
}
