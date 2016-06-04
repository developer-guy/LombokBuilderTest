package builder;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;

/**
 * Created by Batuhan on 4.6.2016.
 */


@Value
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EmailCommandBuilder extends EmailCommand {

    @Builder(toBuilder = true)
    private EmailCommandBuilder(String to,String from,String subject,String topic){
        super(to,from,subject,topic);
    }

    public String send(){
        return to+"'dan gelen mesaj :"+ subject;
    }
}
