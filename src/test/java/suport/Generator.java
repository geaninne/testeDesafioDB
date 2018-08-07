package suport;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/*Gera uma string de acordo com a data*/
public class Generator {

    public static String dataHora(){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("yyyyMMddhhmmss").format(ts);

    }
}
