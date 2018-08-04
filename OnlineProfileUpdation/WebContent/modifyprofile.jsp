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
  <h2>Modify Employee Form</h2>
  <form action="/OnlineProfileUpdation/submitmodifyemployee" method="get">
    <div class="form-group">
      <label for="profileid">PrfoileId(Combination of first two letters of lastname and yearofbirth)</label>
      <input type="text" class="form-control"  name="profileid"/>
    </div>
    <div class="form-group">
      <label for="firstname">Firstname</label>
      <input type="text" class="form-control"  name="firstname"/>
    </div>
    <div class="form-group">
      <label for="lastname">LastName:</label>
      <input type="text" class="form-control"  name="lastname">
    </div>
     <div class="form-group">
      <label for="skillset">SkillSet:</label>
      <input type="text" class="form-control"  name="skillset">
    </div>
     <div class="form-group">
      <label for="location">Location:</label>
      <input type="text" class="form-control"  name="location">
    </div>
     <div class="form-group">
      <label for="dob">DateofBirth:</label>
      <input type="text" class="form-control"  name="dob">
    </div>
     <div class="form-group">
      <label for="qulaification">Qualification:</label>
      <input type="text" class="form-control"  name="qualification">
    </div>
     <div class="form-group">
      <label for="numberofyearsofexperience">numberofyearsofexperience:</label>
      <input type="text" class="form-control"  name="numberofyearsofexperience">
    </div>
    <label>Gender:</label>
     <div class="radio">
  
  <label><input type="radio" name="gender">Male</label>
</div>
<div class="radio">
  <label></label><input type="radio" name="gender">Female</label>
</div>
     <div class="form-group">
      <label for="phonenumber">Phonenumber:</label>
     </label><input type="phonenumber" class="form-control"  name="phonenumber">
    </div>
     <div class="form-group">
      <label for="emailid">Emailid:</label>
      <input type="emailid" class="form-control"  name="emailid">
    </div>
 
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

</body>
</html>
