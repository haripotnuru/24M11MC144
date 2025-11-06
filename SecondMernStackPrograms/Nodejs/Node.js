
 const http = require('http');
 
 const server = http.createServer((req, res) => {
 res.writeHead(200, { 'Content-Type': 'text/plain' });
 res.write('Hello! This data is sent over HTTP using the http module.');
 res.end();
 });

 server.listen(3000, () => {
 console.log('Server running at http://localhost:3000');
 })