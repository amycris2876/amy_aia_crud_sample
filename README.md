# amy_aia_crud_sample
Sample CRUD Springboot Code for AIA
Steps to Run the code:
1. You can clone this project using any IDE using this git repo https://github.com/amycris2876/amy_aia_crud_sample
2. If the project is already clone then you need to create sa database in MySQL based on the application.properties DB details
3. If successfully set-up your database then you can run the Springboot:
    a. Look for RestSampleApplication.java in com.rest.sample then right-click> Run As> Spring Boot App
    b. If you see this "Started RestSampleApplication...."" in the console then the Rest Application is sucessfully started.
4. Use Postman to test the Application
    a. To List All Products : 
        * Use GET method
        * Use URL http://localhost:8080/products
        * In the Lower part set that result type is JSON
        * Clink Send butoon
    b. To List a particular Product By ID:
        * Use GET method
        * Use URL http://localhost:8080/productById/{ID#}
        * In the Lower part set that result type is JSON
        * Clink Send butoon
    c. To Add Product:
        * Use POST method
        * Use URL http://localhost:8080/addProduct
        * Set Body to raw
        * Input data like this :
         {
            "name": "Acer",
            "description": "Acer i5",
            "productType": "computer"
        }
        * In the Lower part set that result type is JSON
        * Clink Send butoon
     d. To Add Multple Product:
        * Use POST method
        * Use URL http://localhost:8080/addProducts
        * Set Body to raw
        * Input data like this :
         [
          {
            "name": "Lenovo",
            "description": "Lenovo i5",
          "productType": "computer"
          },
          {
          "name": "Dell",
          "description": "Dell i5",
          "productType": "computer"
          }
        ]
        * In the Lower part set that result type is JSON
        * Clink Send butoon
