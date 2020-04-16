package co.chatsdk.core.base;

import java.util.ArrayList;
import java.util.List;

import co.chatsdk.core.interfaces.CoreEntity;

public abstract class AbstractEntity implements CoreEntity {
    @Override
    public boolean equalsEntity(CoreEntity entity) {
        return equalsEntityID(entity.getEntityID());
    }

    @Override
    public boolean equalsEntityID(String entityID) {
        return getEntityID().equals(entityID);
    }

    public static List<String> toEntityIDs(List<? extends CoreEntity> entities) {
        List<String> ids = new ArrayList<>();
        for (CoreEntity c: entities) {
            ids.add(c.getEntityID());
        }
        return ids;
    }

}
