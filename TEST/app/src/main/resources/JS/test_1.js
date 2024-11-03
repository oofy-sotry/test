let count = 0;
const square = document.getElementById("square");
const counter = document.getElementById("counter");

square.addEventListener("click", function() {
    count += 1;
    counter.textContent = count;
});
