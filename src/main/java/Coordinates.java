import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Coordinates {

    private Integer x;
    private Integer y;


    Coordinates(final Integer x, final Integer y) {
        this.x = x;
        this.y = y;
    }

}
