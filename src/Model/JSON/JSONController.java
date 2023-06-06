package Model.JSON;
import Model.Classes.AthenaSaint;
import Model.Classes.BronzeSaints;
import Model.ENUM.SpecialTechniques;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class JSONController {

    public static String JSONToString(BronzeSaints<AthenaSaint> saints)
    {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        try {
            for(AthenaSaint saint : saints.getBronzesaints())
            {
                JSONObject jsonObject1 = new JSONObject();
                jsonObject1.put("Name", saint.getName());
                jsonObject1.put("Constellation", saint.getConstellation());
                jsonObject1.put("Age", saint.getConstellation());
                jsonObject1.put("Weight", saint.getWeight());
                jsonObject1.put("Birthday", saint.getBirthday());
                jsonObject1.put("Bloodtype", saint.getBloodtype());
                jsonObject1.put("Birthplace", saint.getBirthplace());
                jsonObject1.put("Training Field", saint.getTrainingField());
                JSONArray tech = new JSONArray();
                for(SpecialTechniques s : saint.getSpecialTechniques())
                {

                    tech.put(s.getDescription());
                }
                jsonObject1.put("Special Techniques", tech);
                jsonObject1.put("Health Points", saint.getHp());
                jsonObject1.put("Power", saint.getPower());

                jsonArray.put(jsonObject1);

            }
           jsonObject.put("Athena's saints",jsonArray);

        }
        catch (JSONException e)
        {
            e.getCause();
        }

     return jsonObject.toString();
    }
}
