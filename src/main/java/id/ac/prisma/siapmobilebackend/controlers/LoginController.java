package id.ac.prisma.siapmobilebackend.controlers;

import java.util.UUID;

public class LoginController {

    String accessToken = "";

    /**
     * fungsi untuk menerima data dari aplikasi mobile
     * untuk kebutuhan login. datanya adalah:
     * email dan password
     * setelah terima data tersebur, selanjutnya di validasi apakah email dan password
     * tersebut valid
     * jika valid maka buatkan  accsessToken, jika tidak kasi response gagal
     */

    public String login(String email, String password) {
        //validasi
        if (email == null) {
            // response gagal email salah
            return null;
        }
        if (email == "") {
            // response gagal email salah
            return null;
        }
        if (password == null) {
            // response gagal password salah
            return null;
        }
        if (password == "") {
            // response gagal
            return null;
        }

        //kita buatkan accesstoken
        String accessToken = UUID.randomUUID().toString();
        return accessToken;
    }
}