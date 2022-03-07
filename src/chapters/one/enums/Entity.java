package chapters.one.enums;

import java.util.Objects;

public class Entity {

    private Long id;
    private String name;

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Entity entity = (Entity) o;
        return Objects.equals(id, entity.id) && Objects.equals(name, entity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
