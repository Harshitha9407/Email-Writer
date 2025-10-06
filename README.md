# IntelliMail – AI Email Reply Generator

**IntelliMail** is a modern full-stack application that leverages **Google’s Gemini 2.5-flash** model to generate intelligent, context-aware email replies with customizable tones.  
Built using **Spring Boot** and **React (Vite + Material UI)**, IntelliMail demonstrates seamless integration between backend AI services and a responsive, modern frontend interface.

---

## ✨ Features

- **🤖 AI-Powered Generation** – Creates smart, high-quality replies using Google Gemini 2.5-flash  
- **🎨 Customizable Tone** – Choose from multiple tone options:
  - Professional  
  - Formal  
  - Casual  
  - Friendly  
- **🏗️ Modern Architecture** – Clean RESTful API separation between backend and frontend  
- **💎 Intuitive UI** – Built with Material UI for a sleek and responsive experience  
- **📋 One-Click Copy** – Instantly copy generated replies to your clipboard  
- **⚡ Fast Performance** – Optimized for smooth interactions and quick response generation  

---

## 🛠️ Tech Stack

### 🔹 Backend
| Technology | Version | Purpose |
|-------------|----------|----------|
| **Spring Boot** | 3.x | RESTful API framework |
| **Java** | 21+ | Core backend language |
| **Maven** | 3.6+ | Build & dependency management |
| **Google Gemini API** | 2.5-flash | AI text generation |

### 🔹 Frontend
| Technology | Version | Purpose |
|-------------|----------|----------|
| **React** | 18+ | UI framework |
| **Vite** | Latest | Fast build tool & dev server |
| **Material UI (MUI)** | Latest | Component library & styling |
| **Axios** | Latest | HTTP client for API communication |

---

## ⚙️ Installation & Setup

### 🧩 Prerequisites
Make sure you have:
- ☕ **Java 21+** (LTS recommended)  
- 📦 **Node.js 18+** and npm  
- 🔨 **Maven 3.6+**  
- 🔑 **Google Gemini API Key** (get it from [Google AI Studio](https://makersuite.google.com/app/apikey))  

---

### 🖥️ Backend Setup

1. Navigate to the backend directory:
   ```bash
   cd email-writer-backend/email-writer-backend
Add your Gemini API key in:

css
Copy code
src/main/resources/application.properties
properties
Copy code
gemini.api.key=YOUR_API_KEY_HERE
Build and run:

bash
Copy code
mvn clean install
mvn spring-boot:run
✅ Backend runs at http://localhost:8080

💻 Frontend Setup
Navigate to the frontend directory:

bash
Copy code
cd email-writer-react
Install dependencies:

bash
Copy code
npm install
Start the development server:

bash
Copy code
npm run dev
✅ Frontend runs at http://localhost:5173

🚀 Usage
Open http://localhost:5173 in your browser

Paste your original email content into the text area

Select a tone (Professional / Formal / Casual / Friendly)

Click “Generate Reply” to create an AI-generated response

Review and click “Copy to Clipboard” to copy your reply

📡 API Documentation
🔸 Generate Email Reply
http
Copy code
POST /api/email/generate
Request Body

json
Copy code
{
  "originalEmail": "string",
  "tone": "string"
}
Response

json
Copy code
{
  "reply": "string"
}
Tone Options: Professional | Formal | Casual | Friendly

🔸 Health Check
http
Copy code
GET /api/email/health
Response

json
Copy code
{
  "status": "OK"
}
📁 Project Structure
css
Copy code
IntelliMail/
├── email-writer-backend/
│   └── email-writer-backend/
│       ├── src/
│       │   ├── main/
│       │   │   ├── java/
│       │   │   └── resources/
│       │   │       └── application.properties
│       │   └── test/
│       └── pom.xml
└── email-writer-react/
    ├── src/
    │   ├── components/
    │   ├── App.jsx
    │   └── main.jsx
    ├── package.json
    └── vite.config.js
🔒 Environment Variables
Backend (application.properties)
properties
Copy code
gemini.api.key=YOUR_API_KEY_HERE
server.port=8080
🤝 Contributing
Contributions, issues, and feature requests are welcome!
Feel free to open an issue or pull request to enhance IntelliMail.

📝 License
This project is licensed under the MIT License — see the LICENSE file for details.

👩‍💻 Author
Harshitha Gummadi
📍 Full-Stack Developer | AI Enthusiast

🔗 GitHub: @Harshitha9407

💼 LinkedIn: Harshitha Gummadi
