# AI Email Reply Generator

The AI Email Reply Generator is a modern full-stack application that leverages Google's powerful Gemini 2.5-flash model to create intelligent, context-aware email responses. Built with enterprise-grade technologies including Spring Boot and React, this application demonstrates seamless integration between backend AI services and a responsive frontend interface.

## ✨ Features

- **🤖 AI-Powered Generation**: Utilizes Google's Gemini 2.5-flash model for fast, high-quality email drafting
- **🎨 Customizable Tone**: Choose from multiple tone options:
  - Professional
  - Formal
  - Casual
  - Friendly
- **🏗️ Modern Architecture**: Clean separation of concerns with RESTful API design
- **💎 Intuitive UI**: Material-UI components provide a sleek, responsive user experience
- **📋 One-Click Copy**: Built-in clipboard functionality for seamless workflow
- **⚡ Fast Performance**: Optimized for quick response generation and smooth interactions

## 🛠️ Tech Stack

### Backend
| Technology | Version | Purpose |
|-----------|---------|---------|
| Spring Boot | 3.x | RESTful API framework |
| Java | 21+ | Core backend language |
| Maven | 3.6+ | Dependency management |
| Google Gemini API | 2.5-flash | AI text generation |

### Frontend
| Technology | Version | Purpose |
|-----------|---------|---------|
| React | 18+ | UI framework |
| Vite | Latest | Build tool & dev server |
| Material-UI (MUI) | Latest | Component library |
| Axios | Latest | HTTP client |

## ⚙️ Installation

### Prerequisites

Ensure you have the following installed:

- ☕ **Java 21+** (LTS version recommended)
- 📦 **Node.js 18+** and npm
- 🔨 **Maven 3.6+**
- 🔑 **Google Gemini API Key** (Get it from [Google AI Studio](https://makersuite.google.com/app/apikey))

### Backend Setup

1. **Navigate to the backend directory:**
   ```bash
   cd email-writer-backend/email-writer-backend
   ```

2. **Configure API Key:**
   
   Open `src/main/resources/application.properties` and add your Gemini API key:
   ```properties
   gemini.api.key=YOUR_API_KEY_HERE
   ```

3. **Build and run the application:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

   The backend server will start at `http://localhost:8080`

### Frontend Setup

1. **Navigate to the frontend directory:**
   ```bash
   cd email-writer-react
   ```

2. **Install dependencies:**
   ```bash
   npm install
   ```

3. **Start the development server:**
   ```bash
   npm run dev
   ```

   The frontend application will be available at `http://localhost:5173`

## 🚀 Usage

1. Open your browser and navigate to `http://localhost:5173`
2. Paste the original email content into the text area
3. Select your desired tone from the dropdown menu
4. Click **"Generate Reply"** to create an AI-generated response
5. Review the generated email
6. Use the **"Copy to Clipboard"** button to copy the response

## 📡 API Documentation

### Endpoints

#### Generate Email Reply
```http
POST /api/email/generate
```

**Request Body:**
```json
{
  "originalEmail": "string",
  "tone": "string"
}
```

**Response:**
```json
{
  "reply": "string"
}
```

**Tone Options:** `Professional`, `Formal`, `Casual`, `Friendly`

#### Health Check
```http
GET /api/email/health
```

**Response:**
```json
{
  "status": "OK"
}
```

## 📁 Project Structure

```
ai-email-reply-generator/
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
```

## 🔒 Environment Variables

### Backend (`application.properties`)
```properties
gemini.api.key=YOUR_API_KEY_HERE
server.port=8080
```

## 🤝 Contributing

Contributions, issues, and feature requests are welcome! Feel free to check the issues page.

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Harshitha Gummadi**

- GitHub: [@Harshitha9407](https://github.com/Harshitha9407)
- LinkedIn: [[Harshitha Gummadi](https://linkedin.com/in/your-profilhttps://www.linkedin.com/in/harshitha-gummadi/)
