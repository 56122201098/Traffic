package viriya.traffic;

/**
 * Created by Pc on 21/9/2559.
 */
public class MyData {
    public  int[] icon(){
        int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03,R.drawable.traffic_04,R.drawable.traffic_05,
                R.drawable.traffic_06,R.drawable.traffic_07,R.drawable.traffic_08,
                R.drawable.traffic_09,R.drawable.traffic_10,R.drawable.traffic_11,
                R.drawable.traffic_12,R.drawable.traffic_13,R.drawable.traffic_14,
                R.drawable.traffic_15,R.drawable.traffic_16,R.drawable.traffic_17,
                R.drawable.traffic_18,R.drawable.traffic_19,R.drawable.traffic_20};
                return  intIcon;
    }   //icon
    public String[] title(){
        String[] strTitle = new String[20];
        strTitle[0] = "ห้ามเลี้ยวซ้าย";
        strTitle[1] = "ห้ามเลี้ยวขวา";
        strTitle[2] = "ให้ตรงไป";
        strTitle[3] = "เลี้ยวขวา";
        strTitle[4] = "เลี้ยวซ้าย";
        strTitle[5] = "ทางออก";
        strTitle[6] = "ทางเข้า";
        strTitle[7] = "ทางออก";
        strTitle[8] = "ห้ามเลี้ย";
        strTitle[9] = "หยุดรถ";
        strTitle[10] = "จำกัดความส๔ง 2.5 เมตร";
        strTitle[11] = "แยกซ้ายขวา";
        strTitle[12] = "ห้ามกลับรถ";
        strTitle[13] = "ห้ามจอด";
        strTitle[14] = "รถสวน";
        strTitle[15] = "ห้ามแซง";
        strTitle[16] = "ห้ามเข้า";
        strTitle[17] = "โปรดหยุดรถ";
        strTitle[18] = "จำกัดความเร็ว 50 km/hr";
        strTitle[19] = "จำกัดความสูง 8 เมตร";
        return strTitle;
    }//title
}
