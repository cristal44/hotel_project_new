import axios from 'axios';

export default class HotelService {
    url = "http://localhost:8080/api/rooms";

    getAllRooms() {
        return axios.get(this.url);
    }

    getRoomById(id) {
        return axios.get(this.url+ '/' + id);
    }

    saveRoom(room) {
        return axios.post(this.url, room);
    }

}