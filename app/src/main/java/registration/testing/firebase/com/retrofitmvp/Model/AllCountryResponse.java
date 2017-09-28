package registration.testing.firebase.com.retrofitmvp.Model;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Ashish on 06-02-2017.
 */

public interface AllCountryResponse {
    @GET("/api/getData1.php?secure_id=nAN9qJlcBAR%2Fzs0R%2BZHJmII0W7GFPuRzY%2BfyrT65Fyw%3D&requireData=nationality&requireData=all&gofor=country")
    Call<Country> getCountry();
}
