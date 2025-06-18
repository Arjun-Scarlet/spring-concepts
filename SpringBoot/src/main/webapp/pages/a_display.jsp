<%@ page import="java.util.List" %>
<%@ page import="com.example.schoolDB.entity.Actor" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Actor Records</title>
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
        width: 80%;
        margin: 20px auto;
        border-collapse: collapse;
      }

      th,
      td {
        padding: 10px;
        border: 1px solid black;
      }

      th {
        background-color: #007bff;
        color: white;
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
      <header>
        <h2>Actor Records</h2>
      </header>
      <section>
		<%
			List<Actor> list = (List<Actor>)request.getAttribute("actors");
			if(list.isEmpty()){
		%>
				<p class="message">${message}</p>
		<%
			}
			else {
		%>
        <table>
          <thead>
            <tr>
              <th>Id</th>
              <th>Actor Name</th>
              <th>Total Movies</th>
              <th>Best Movie</th>
              <th>Insta ID</th>
            </tr>
          </thead>
          <tbody>
			<%
					for(Actor i: list){
			%>
			   <tr>
			     <td><%= i.getId() %></td>
				 <td><%= i.getName() %></td>
				 <td><%= i.getTotMovies() %></td>
				 <td><%= i.getBestMovie() %></td>
				 <td><%= i.getInstaId() %></td>
			   </tr>
			<%
					}
			    }
			%>
          </tbody>
        </table>
      </section>
    </div>
  </body>
</html>
