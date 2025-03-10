/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket.barang;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import supermarket.KoneksiMySQL;

/**
 *
 * @author asus
 */
public class Goods {
    private Connection con;
    private Statement stm;
    private ResultSet RsKaryawan;//rdgoods
    public Goods(){
        try{
            KoneksiMySQL kon= new KoneksiMySQL("localhost", "root", "", "supermarket");
            con=kon.getConnection();
        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }
    }
    public String[][] getAllGoods(){
        String[][] employee;        
        try{    
            stm=con.createStatement();
            RsKaryawan=stm.executeQuery("select * from barang");
            employee=new String[countRowRs(RsKaryawan)][7];
            for(int i=0;RsKaryawan.next();i++){
                employee[i][0]=RsKaryawan.getString("id_barang");
                employee[i][1]=RsKaryawan.getString("nama_barang");
                employee[i][2]=RsKaryawan.getString("jumlah");
                employee[i][3]=RsKaryawan.getString("harga_beli");
                employee[i][4]=RsKaryawan.getString("harga_jual");
                
            }            
        } catch (SQLException e){
            System.out.println("Error : "+e);
            employee=new String[0][0];
        }
        return employee;
    }
    public int countRowRs(ResultSet rs) throws SQLException{
        rs.last();
        int count=rs.getRow();
        rs.beforeFirst();
        return count;
    } 
    public boolean addGoods(String[] newEData){
        try{
            stm=con.createStatement();
            stm.executeUpdate("INSERT INTO "
                    + "barang(id_barang, nama_barang, jumlah, harga_beli, harga_jual) "
                    + "VALUES (NULL,'"+newEData[1]+"', '"+newEData[2]+"', '"+newEData[3]+"', '"+newEData[4]+"'");
            return true;
        }catch(SQLException e){
            System.out.println("Error : "+e);
            return false;
        }
    }
    public int getLastId(String[][] eData){             
        return Integer.parseInt(eData[eData.length-1][0]);
    }
}
