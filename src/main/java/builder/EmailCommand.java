package builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;
import lombok.experimental.NonFinal;

/**
 * Created by Batuhan on 4.6.2016.
 */

@Value
@NonFinal
@ToString
@Getter
@Setter
public class EmailCommand {
    protected String to;
    protected String from;
    protected String subject;
    protected String topic;
}
