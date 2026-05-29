// L_AJAX_FETCH.js
// Simulate POSTing registration data to a mock API

function postRegistration(data) {
  console.log("Sending registration...", data);
  // simulate delay
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      // use jsonplaceholder to simulate success
      fetch("https://jsonplaceholder.typicode.com/posts", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(data),
      })
        .then((r) => r.json())
        .then((resp) => resolve(resp))
        .catch((err) => reject(err));
    }, 1000);
  });
}

// Example usage
postRegistration({ name: "Sam", email: "sam@example.com", eventId: 2 })
  .then((res) => console.log("Server replied:", res))
  .catch((err) => console.error("Post failed:", err));
