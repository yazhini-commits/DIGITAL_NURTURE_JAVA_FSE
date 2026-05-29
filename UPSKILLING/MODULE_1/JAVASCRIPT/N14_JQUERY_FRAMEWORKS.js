// N_JQUERY_FRAMEWORKS.js
// Requires jQuery included in the HTML to work: <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

// Example jQuery click handler and animations
$(function () {
  $("#registerBtn").click(function () {
    console.log("Register button (jQuery) clicked");
  });

  $(".event-card").fadeIn(300);

  // benefit note
  console.log(
    "Framework benefit: frameworks like React provide state-driven UI, components, and easier scaling.",
  );
});
