<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<link rel="stylesheet" href="<spring:theme code='styleSheet'/>" type="text/css"/>
<p> <a href="/SpringsMVC/AdmissionFrom.html?siteTheme=green">Green</a>
    <a href="/SpringsMVC/AdmissionFrom.html?siteTheme=red">Red</a>
</p>

<h1>${msg}</h1>
<h3>Student Admission Form For Engineering Courses </h3>
<form:errors path="student1.*"/>
<form action="submitAdmissionForm.html" method="post">

    <table>
        <tr>
            <td>Student's Name</td>
            <td><input type="text" name="studentName"/></td>
        </tr>
        <tr>
            <td> Student's Hobby :</td>
            <td><input type="text" name="studentHobby"/></td>
        </tr>
        <tr>
            <td>Student's Mobile :</td>
            <td><input type="text" name="studentMobile"/></td>
        </tr>
        <tr>
            <td>Student's DOB :</td>
            <td><input type="text" name="studentDOB"/></td>
        </tr>
        <tr>
            <td>Student's Skills :</td>
            <td><select name="studentSkills" multiple>
                <option VALUE="Java Core">Java Core</option>
                <option VALUE="Spring Core">Spring Core</option>
                <option VALUE="Spring MVC ">Spring MVC</option>
            </select></td>
        </tr>

    </table>
    <table>
        <tr>
            <td>Student Address :</td>
        </tr>
        <tr>
            <td> Country :<input type="text" name="studentAddress.country"/></td>
            <td> City :<input type="text" name="studentAddress.city"/></td>
            <td> Street :<input type="text" name="studentAddress.street"/></td>
            <td> Pin code :<input type="text" name="studentAddress.pincode"/></td>


        </tr>


    </table>


    <input type="submit" value="Submit"/>

</form>

</body>
</html>