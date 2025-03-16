package LabTest1;

abstract class Room {
    private int cost_per_room;
    private String room_type;
    private int total_room;
    private int available_room;

    public Room(int cpr, String rt, int tr) {
        cost_per_room = cpr;
        room_type = rt;
        total_room = tr;
        available_room = tr;
    }

    public int getCostPerRoom() {
        return cost_per_room;
    }

    public String getroomType() {
        return room_type;
    }

    public int gettotalRoom() {
        return total_room;
    }

    public int getavailableRoom() {
        return available_room;
    }

    public void setavailableRoom(boolean flag) {
        if (flag) available_room++;
        else available_room--;
    }

}
