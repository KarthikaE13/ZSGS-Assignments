document.addEventListener("DOMContentLoaded", () => {
    const form = document.getElementById("techFestForm");
    const fields = [
        { id: "name", regex: /^[A-Za-z\s]+$/, error: "Name should contain only letters" },
        { id: "email", regex: /^[^\s@]+@[^\s@]+\.[^\s@]+$/, error: "Enter a valid email" },
        { id: "phone", regex: /^[0-9]{10}$/, error: "Phone must be 10 digits" },
        { id: "age", regex: /^(1[6-9]|[2-5][0-9])$/, error: "Age must be between 16 and 59" },
        { id: "college", regex: /.+/, error: "College cannot be empty" },
        { id: "city", regex: /^[A-Za-z\s]+$/, error: "City should contain only letters" },
        { id: "state", regex: /^[A-Za-z\s]+$/, error: "State should contain only letters" },
        { id: "event", regex: /^(?!\s*$).+/, error: "Please select an event" },
        { id: "gender", regex: /^(?!\s*$).+/, error: "Please select gender" },
        { id: "message", regex: /.+/, error: "Message cannot be empty" }
    ];

    fields.forEach(field => {
        const input = document.getElementById(field.id);
        const error = document.getElementById(field.id + "Error");

        input.addEventListener("input", () => {
            if (!field.regex.test(input.value.trim())) {
                error.textContent = field.error;
            } else {
                error.textContent = "";
            }
        });
    });

    form.addEventListener("submit", e => {
        e.preventDefault();
        let isValid = true;

        fields.forEach(field => {
            const input = document.getElementById(field.id);
            const error = document.getElementById(field.id + "Error");

            if (!field.regex.test(input.value.trim())) {
                error.textContent = field.error;
                isValid = false;
            } else {
                error.textContent = "";
            }
        });

        if (isValid) {
            document.getElementById("submittedDetails").classList.remove("hidden");
            const detailsDiv = document.getElementById("details");
            detailsDiv.innerHTML = "";
            fields.forEach(field => {
                detailsDiv.innerHTML += `<p><strong>${field.id.toUpperCase()}:</strong> ${document.getElementById(field.id).value}</p>`;
            });
            form.reset();
        }
    });
});

