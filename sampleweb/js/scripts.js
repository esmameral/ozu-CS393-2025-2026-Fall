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

function loadCourses() {
    fetch('http://localhost:8081/courses')
        .then(response => response.json())
        .then((courses) => {
            printCourses(courses);
        }
        );
}

function printCourses(courses) {
    var text = ""; 
    courses.forEach(course => {
        text += `
      <div class="col-12 col-sm-6 col-md-4 col-lg-3 col-xl-2">
        <div class="card h-100 shadow-sm">    
          <div class="card-body d-flex flex-column">
            <h5 class="card-title">${course.courseCode}</h5>
            <p class="card-text">${course.title}</p>
            <p class="card-text">Credit:${course.credit}</p>
            <p class="card-text">Quota:${course.quota}</p>
            <h5 class="card-text">${course.instructor}</h5>
            <a href="#" class="btn btn-primary mt-auto">Detail</a>
          </div>
        </div>
      </div>
    `;
    });
    var container = document.getElementById("courseList")
    container.innerHTML = text;
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





