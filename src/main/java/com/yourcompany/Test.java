package com.yourcompany;

import org.springframework.web.client.RestTemplate;

/**
 *
 * @author cosborn
 */
public class Test
{

    public static void main(String args[])
    {
        try
        {
            //http://api-sandbox.seatwave.com/v2/discovery/events?apikey=4739E4694D0E482A92C9D0B478D83934&what=music
            String name = "music";
            
            final String APIKEY = "4739E4694D0E482A92C9D0B478D83934"; 
            final String URL = "http://api-sandbox.seatwave.com/v2/discovery/events?apikey=" + APIKEY;
            String readyUrl = URL + "&what=" + name;
            RestTemplate restTemplate = new RestTemplate();
            EventsResponse eventResponse = restTemplate.getForObject(readyUrl, EventsResponse.class);

            System.err.println("seatwave>>>" + eventResponse.getEvents().getEvent().size());
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
    }
}
