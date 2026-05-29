// E_OBJECTS_PROTOTYPES.js
class EventItem {
  constructor(id, name, date, seats) {
    this.id = id;
    this.name = name;
    this.date = date;
    this.seats = seats;
  }
}

EventItem.prototype.checkAvailability = function () {
  return this.seats > 0 && new Date(this.date) > new Date();
};

const e = new EventItem(1, "Art Workshop", "2099-05-10", 5);
console.log("Available:", e.checkAvailability());

// List keys and values
console.log("Event entries:", Object.entries(e));
