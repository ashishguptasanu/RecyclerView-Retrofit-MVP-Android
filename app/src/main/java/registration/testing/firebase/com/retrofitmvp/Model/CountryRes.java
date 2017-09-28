package registration.testing.firebase.com.retrofitmvp.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CountryRes{
    private String _0;
    private int id;
    private String _1;
    private String name;
    private String phoneCode;
    private int currencyId;
    @SerializedName("countryid")
    @Expose
    private int countryid;
    @SerializedName("countryName")
    @Expose
    private String countryName;
    public String getCountryName(){return countryName;}
    public void setCountryName(String countryName){this.countryName = countryName;}
    public int getCountryid(){return countryid;}
    public void setCountryid(int countryid){this.countryid = countryid;}

    public String get0() {
        return _0;
    }

    public void set0(String _0) {
        this._0 = _0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String get1() {
        return _1;
    }

    public void set1(String _1) {
        this._1 = _1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneCode(){
        return phoneCode;
    }
    public void setPhoneCode(String phoneCode){
        this.phoneCode = phoneCode;
    }
    public int getCurrencyId(){
        return currencyId;
    }
    public void setCurrencyId(int currencyId){
        this.currencyId = currencyId;
    }
}

