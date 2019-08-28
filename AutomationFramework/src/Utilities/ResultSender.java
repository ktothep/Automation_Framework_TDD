package Utilities;

import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.influxdb.dto.Point;
import org.influxdb.dto.Query;
import org.influxdb.dto.QueryResult;

public class ResultSender {

	private static final InfluxDB INFLXUDB = InfluxDBFactory.connect("http://localhost:8086", "root", "root");
    private static final String DATABASE = "selenium";

    static{
        INFLXUDB.setDatabase(DATABASE);
    }

    public static void send(final Point point){
        INFLXUDB.write(point);
    }

public static void querydb()
{
	
	Query q1=new Query("Select * from testmethod", "selenium");
	System.out.println(INFLXUDB.query(q1));
}
		
	}


