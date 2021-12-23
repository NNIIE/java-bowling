package bowling.state.end;

/**
 * 거터(gutter) : 핀을 하나도 쓰러트리지 못한 상태. 거터는 "-"로 표시
 */
public class Gutter implements EndState {

    @Override
    public String getPrintMark() {
        return "-";
    }
}
