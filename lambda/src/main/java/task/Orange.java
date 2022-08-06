package task;

import lombok.*;

@Getter
@Setter
@ToString
//@AllArgsConstructor
@Builder
public class Orange {

    private int weight;
    private Color color;

}

//Builder generates an @AllArgsConstructor unless There's another @XConstructor