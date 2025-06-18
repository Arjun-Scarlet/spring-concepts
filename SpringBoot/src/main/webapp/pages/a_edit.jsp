<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Edit Actor Details</title>
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
      #b1 {
        margin-top: 10px;
        padding: 10px 20px;
        width: 30%;
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
        background-color: rgb(0, 168, 0);
        color: white;
        font-size: 16px;
        border-radius: 5px;
        cursor: pointer;
      }
      #b2:hover {
        background-color: rgb(0, 123, 0);
      }

      #b3 {
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
      #b3:hover {
        background-color: rgb(235, 181, 2);
      }

      #b4 {
        margin-top: 20px;
        margin-bottom: 20px;
        padding: 10px 20px;
        width: 30%;
        border: none;
        background-color: red;
        color: white;
        font-size: 16px;
        border-radius: 5px;
        cursor: pointer;
      }
      #b4:hover {
        background-color: rgb(181, 0, 3);
      }
    </style>
  </head>
  <body>
    <div class="container">
      <header>
        <h2>Actor details have been saved successfully!</h2>
      </header>
      <section>
        <h3>Select the operation you would like to perform</h3>
        <form action="register">
          <button id="b1" type="submit">Add Actors</button>
        </form>
        <form action="displayActor">
          <button id="b2" type="submit">Display Actors</button>
        </form>
        <form action="updateActor">
          <button id="b3" type="submit">Update Actors</button>
        </form>
        <form action="deleteActor">
          <button id="b4" type="submit">Delete Actors</button>
        </form>
      </section>
    </div>
  </body>
</html>
