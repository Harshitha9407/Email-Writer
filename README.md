AI Email Reply Generator (Spring Boot + React Full-Stack)
An intelligent email reply generator that uses Google's Gemini API (gemini-2.5-flash) to create context-aware responses with customizable tones. The application is built on a modern Spring Boot backend and a React/Material UI frontend.

🌟 Features
AI-Powered Generation: Leverages the robust gemini-2.5-flash model for fast, high-quality drafting.

Customizable Tone: Users can select the desired tone (Professional, Formal, Casual, or Friendly).

Full-Stack Architecture: Clean separation of concerns with Java/Spring Boot API and a React/Vite UI.

Intuitive Interface: Built with Material-UI (MUI) for a clean, modern user experience .

Copy Functionality: Quickly copy the generated response to the clipboard.

📸 Output Preview
The application successfully integrates the frontend and backend to deliver a contextual reply:
<img width="856" height="834" alt="image" src="https://github.com/user-attachments/assets/04fa8c2b-f0ed-452b-9c20-2879488b44cd" />


🛠️ Tech Stack
Layer	Technology	Version	Role
Backend	Spring Boot	3.x	Handles routing and communication with the Gemini API.
Language	Java	21+	Core backend language.
AI Model	Gemini	2.5-flash	Generates the email text.
Frontend	React	18+	User Interface, built using Vite.
Styling/Components	Material UI (MUI)	Latest	Provides the components and design system.
HTTP Client	Axios / RestTemplate		Used for API calls (Frontend/Backend).

Export to Sheets
⚙️ Setup and Installation
Prerequisites
Java 21 or higher (LTS version recommended).

Node.js 18 or higher.

Maven 3.6+.

Gemini API Key (Obtainable from Google AI Studio).

1. Backend Setup (email-writer-backend)
Add API Key: Navigate to the backend configuration file and insert your key:

email-writer-backend/email-writer-backend/src/main/resources/application.properties
Properties

gemini.api.key=YOUR_API_KEY_HERE
Run Application: Open a terminal, navigate to the inner backend directory, and start the server:

Bash

cd email-writer-backend/email-writer-backend
mvn clean install
mvn spring-boot:run
The backend will run on http://localhost:8080.

2. Frontend Setup (email-writer-react)
Navigate to the frontend directory in a new terminal:

Bash

cd email-writer-react
Install Dependencies:

Bash

npm install
Start Development Server:

Bash

npm run dev
The frontend will run on http://localhost:5173.

💻 API Endpoints
Method	Endpoint	Description
POST	/api/email/generate	Generates the AI email reply based on originalEmail and tone.
GET	/api/email/health	Simple health check for the Spring Boot API.

Export to Sheets
🚀 Usage
Go to http://localhost:5173/.

Paste an email into the text area.

Select the desired tone.

Click "Generate Reply" to get the AI-drafted response.

Author
Harshitha Gummadi

GitHub: @Harshitha9407

License
This project is open source and available under the MIT License.
