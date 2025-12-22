function loadInstructors() {

    fetch('http://localhost:8081/instructors')
        .then(response => response.json())
        .then((instructors) => {
            console.log(instructors);
            var selectText = "<select id='instructor' name='instructor'>";
           instructors.forEach(element => {
            selectText += `<option value='${element.id}'> ${element.name}</option>`;
           });
                
             
            selectText += "</select>";
            document.getElementById("instructorDiv").innerHTML = selectText
        }
        );


   


}

function createCourse() {
    var code = document.getElementById("code").value;
    var name = document.getElementById("name").value;
    var credit = document.getElementById("credit").value;
    var instructorId = document.getElementById("instructor").value;

    var course = {
        "code": code,
        "name": name,
        "credit": credit,
        "instructorId": instructorId
    }

    console.log(course);
    var options = {
        method: 'POST',
        body: JSON.stringify(course),
        headers: new Headers({
            'Content-Type': 'application/json'
        })
    }


    fetch('http://localhost:8081/courses', options)
        .then(() => alert("course saved successfully"));
    return true;
}





