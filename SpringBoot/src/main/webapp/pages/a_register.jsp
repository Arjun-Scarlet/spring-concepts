<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Actor Registration</title>
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
      input {
        width: 75%;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 5px;
      }
      button {
        margin-top: 20px;
        padding: 10px 20px;
        width: 30%;
        border: none;
        background-color: rgb(0, 110, 255);
        color: white;
        font-size: 16px;
        border-radius: 5px;
        cursor: pointer;
      }
      button:hover {
        background-color: rgb(0, 56, 188);
      }
    </style>
  </head>
  <body>
    <div class="container">
      <header>
        <h2>Welcome To SpringBoot Application</h2>
      </header>
      <section>
        <h3>Actor Registration Form</h3>
        <form action="saveActor" method="post">
          <table>
            <tbody>
			  <tr>
			    <td>Actor Id</td>
				<td><input type="number" name="id" /></td>
			  </tr>
              <tr>
                <td>Actor Name</td>
                <td><input type="text" name="name" /></td>
              </tr>
              <tr>
                <td>Total Movies</td>
                <td><input type="text" name="totMovies" /></td>
              </tr>
              <tr>
                <td>Best Movie</td>
                <td><input type="text" name="bestMovie" /></td>
              </tr>
              <tr>
                <td>Insta Id</td>
                <td><input type="text" name="instaId" /></td>
              </tr>
              <tr>
                <td colspan="2" style="text-align: center">
                  <button type="submit">Submit</button>
                </td>
              </tr>
            </tbody>
          </table>
        </form>
      </section>
    </div>
  </body>
</html>
