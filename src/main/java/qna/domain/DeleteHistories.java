package qna.domain;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

/**
 * Created by seungwoo.song on 2022-11-08
 */
public class DeleteHistories extends AbstractList<DeleteHistory> {

    private final List<DeleteHistory> values;

    public DeleteHistories(List<DeleteHistory> values) {
        this.values = values;
    }

    @Override
    public DeleteHistory get(int index) {
        return values.get(index);
    }

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public boolean add(DeleteHistory deleteHistory) {
        return values.add(deleteHistory);
    }

    // ============================================================================

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        DeleteHistories that = (DeleteHistories) o;
        return Objects.equals(values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), values);
    }

    @Override
    public String toString() {
        return "DeleteHistories{" +
                "values=" + values +
                '}';
    }
}
