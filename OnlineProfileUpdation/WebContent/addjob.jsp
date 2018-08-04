<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <h2>Add Job Form</h2>
  <form action="/OnlineProfileUpdation/submitaddjob" method="post">
    
    <div class="form-group">
      <label for="jobname">Jobname:</label>
      <input type="text" class="form-control"  name="jobname" required/>
    </div>
 
     <div class="form-group">
      <label for="jobdescription">jobdescription:</label>
      <textarea class="form-control" rows="5" id="jobdescription" name="jobdescription" required></textarea>
    </div>
     <div class="form-group">
      <label for="projectname">Projectname:</label>
      <input type="text" class="form-control"  name="projectname" required>
    </div>
     <div class="form-group">
      <label for="skillsrequired">Skillsrequired:</label>
      <input type="text" class="form-control"  name="skillsrequired" required>
    </div>
     <div class="form-group">
      <label for="optionalskills">Optionalskills:</label>
      <input type="text" class="form-control"  name="optionalskills" required>
    </div>
     <div class="form-group">
      <label for="location">Location:</label>
      <input type="text" class="form-control"  name="location" required>
    </div>
     <div class="form-group">
      <label for="employeeband">Employeeband:</label>
    <input type="text" class="form-control"  name="employeeband" required>
    </div>
    <div class="form-group">
      <label for="numberofyearsofexperience">Numberofyearsofexperience:</label>
   <input type="text" class="form-control"  name="numberofyearsofexperience" required>
    </div>
    <div class="form-group">
      <label for="noofposition">Noofposition:</label>
    <input type="text" class="form-control"  name="noofposition" required>
    </div>
 
     <div class="form-group">
      <label for="contactemailid">Contactemailid:</label>
      <input type="email" class="form-control"  name="contactemailid" required>
    </div>
       <div class="form-group">
      <label for="contactnumber">Contactnumber:</label>
    <input type="text" class="form-control"  name="contactnumber" required>
    </div>
 
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

</body>
</html>
