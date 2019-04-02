package mx.ipn.cic.sesiongooglemaps;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Button m1;
    Button m2;
    Button m3;
    Button m4;
    Button m5;
    Button m6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //recuperar receferencias a los widgets y asignar codigo necesario
        m1=(Button) (this.findViewById(R.id.m1));
        m2=(Button) (this.findViewById(R.id.m2));
        m3=(Button) (this.findViewById(R.id.m3));

        m4=(Button) (this.findViewById(R.id.m4));
        m5=(Button) (this.findViewById(R.id.m5));
        m6=(Button) (this.findViewById(R.id.m6));

        //definir una inner class por cada objeto
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto= (String) m1.getText();
                textViewExpression.setText(texto);
            }
        });
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng marcador1 = new LatLng(17.063343, -96.726689);
        mMap.addMarker(new MarkerOptions().position(marcador1).title("Museo Tamayo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(marcador1));

        LatLng marcador2 = new LatLng(19.440656, -99.139537);
        mMap.addMarker(new MarkerOptions().position(marcador2).title("Museo del Tequila"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(marcador2));

        LatLng marcador3 = new LatLng(52.466930, -7.689300);
        mMap.addMarker(new MarkerOptions().position(marcador3).title("Abbey Road"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(marcador3));

        LatLng marcador4 = new LatLng(-33.893714, 151.053516);
        mMap.addMarker(new MarkerOptions().position(marcador4).title("P. Sherman Wallaby Street, Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(marcador4));

        LatLng marcador5 = new LatLng(33.358449, -87.575007);
        mMap.addMarker(new MarkerOptions().position(marcador5).title("Stonehedge"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(marcador5));

        LatLng marcador6 = new LatLng(37.819927, -122.478256);
        mMap.addMarker(new MarkerOptions().position(marcador6).title("Golden Gate Bridge"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(marcador6));
    }


}
