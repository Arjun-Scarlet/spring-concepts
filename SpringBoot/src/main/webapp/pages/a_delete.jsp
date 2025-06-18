<!DOCTYPE html>
<html>
  <head>
    <title>Delete Actor Details</title>
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
      input {
        width: 45%;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 5px;
      }
      #text {
        font-weight: bold;
      }
      button {
        margin-top: 20px;
        margin-left: 10px;
        padding: 10px 20px;
        border: none;
        background-color: red;
        color: white;
        font-size: 16px;
        border-radius: 5px;
        cursor: pointer;
      }
      button:hover {
        background-color: darkred;
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
		<h2>Delete Actor Record</h2>
		<form action="showDelete" method="post">
		    <label id="text" for="id">Enter Actor Id to Delete:</label>
		    <input type="number" id="id" name="id" required />
		    <button type="submit">Delete</button>
		</form>
		<p class="message">${message}</p>
    </div>
  </body>
</html>
