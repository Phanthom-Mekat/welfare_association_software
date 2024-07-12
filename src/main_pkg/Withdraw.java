/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

/**
 *
 * @author Asus
 */
public class Withdraw {
    private int WithdrawNo,WithdrawalAmount;
    private String WithdrawalNote,WithdrawalDate;

    @Override
    public String toString() {
        return "Withdraw{" + "WithdrawNo=" + WithdrawNo + ", WithdrawalAmount=" + WithdrawalAmount + ", WithdrawalNote=" + WithdrawalNote + ", WithdrawalDate=" + WithdrawalDate + '}';
    }

    public int getWithdrawNo() {
        return WithdrawNo;
    }

    public void setWithdrawNo(int WithdrawNo) {
        this.WithdrawNo = WithdrawNo;
    }

    public int getWithdrawalAmount() {
        return WithdrawalAmount;
    }

    public void setWithdrawalAmount(int WithdrawalAmount) {
        this.WithdrawalAmount = WithdrawalAmount;
    }

    public String getWithdrawalNote() {
        return WithdrawalNote;
    }

    public void setWithdrawalNote(String WithdrawalNote) {
        this.WithdrawalNote = WithdrawalNote;
    }

    public String getWithdrawalDate() {
        return WithdrawalDate;
    }

    public void setWithdrawalDate(String WithdrawalDate) {
        this.WithdrawalDate = WithdrawalDate;
    }

    public Withdraw(int WithdrawNo, String WithdrawalNote, int WithdrawalAmount, String WithdrawalDate) {
        this.WithdrawNo = WithdrawNo;
        this.WithdrawalAmount = WithdrawalAmount;
        this.WithdrawalNote = WithdrawalNote;
        this.WithdrawalDate = WithdrawalDate;
    }




   
}
