<%@ page import="com.example.schoolDB.entity.Actor" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Update Actor</title>
    <style>
      body {
        font-family: Arial, sans-serif;
      }
      .container {
        width: 50%;
        margin: 100px auto;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 2px 2px 12px rgba(0, 0, 0, 0.5);
        text-align: center;
      }
      table {
        width: 100%;
        margin-top: 20px;
        border-collapse: collapse;
      }
      td {
        padding: 10px;
      }
      td:first-child {
        text-align: left;
        padding-left: 40px;
        font-weight: bold;
      }
      #text {
        margin-left: -70px;
        padding-left: 40px;
        font-weight: bold;
      }
      input {
        width: 45%;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 5px;
      }
      #b1 {
        margin-top: 20px;
        margin-left: 10px;
        padding: 10px 20px;
        border: none;
        background-color: rgb(0, 110, 255);
        color: white;
        font-size: 16px;
        border-radius: 5px;
        cursor: pointer;
      }
      #b1:hover {
        background-color: rgb(0, 56, 188);
      }

      #b2 {
        margin-top: 20px;
        padding: 10px 20px;
        width: 30%;
        border: none;
        background-color: rgb(255, 238, 0);
        color: white;
        font-size: 16px;
        border-radius: 5px;
        cursor: pointer;
      }
      #b2:hover {
        background-color: rgb(235, 181, 2);
      }
	  .message {
	     margin-top: 20px;
	     font-weight: bold;
	     color: red;
	  }
    </style>
  </head>
  <body>
    <div class="container">
      <h2>Update Actor</h2>

      <!-- Form to fetch Actor details -->
	  <form action="getActorById" method="get">
	      <label id="text" for="id">Enter Actor ID to Update:</label>
	      <input type="number" name="id" required />
	      <button id="b1" type="submit">Enter</button>
	  </form>
      
      <!-- Display fetched Actor details only if available -->
      <% 
          Actor actor = (Actor)request.getAttribute("actor"); 
          if (actor != null) { 
      %>
      <form action="showUpdate" method="post">
		<h3>Make your Changes</h3>
        <table>
          <tr>
            <td>Actor Id:</td>
            <td>
              <input type="text" name="id" value="<%= actor.getId() %>" readonly/>
            </td>
          </tr>
          <tr>
            <td>Actor Name:</td>
            <td>
              <input type="text" name="name" value="<%= actor.getName() %>"/>
            </td>
          </tr>
          <tr>
            <td>Total Movies:</td>
            <td>
              <input type="number" name="totMovies" value="<%= actor.getTotMovies() %>"/>
            </td>
          </tr>
          <tr>
            <td>Best Movie:</td>
            <td>
              <input type="text" name="bestMovie" value="<%= actor.getBestMovie() %>"/>
            </td>
          </tr>
          <tr>
            <td>Insta Id:</td>
            <td>
              <input type="text" name="instaId" value="<%= actor.getInstaId() %>"/>
            </td>
          </tr>
        </table>
        <button id="b2" type="submit">Update</button>
      </form>		
      <%
          }
          String message = (String)request.getAttribute("message"); 
          if (message!= null) {
      %>
      <p class="message"><%= message %></p>
      <% 
          }
      %>
    </div>
  </body>
</html>
