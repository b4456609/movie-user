package ntou.soselab.movie.model;

import lombok.Builder;
import lombok.Data;
import lombok.SneakyThrows;

@Data
@Builder
public class User {
    private String id;
    private String name;
    private String phone;
}
