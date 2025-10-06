import { useState } from 'react';
import { Container, TextField, Typography, Box, FormControl, InputLabel, Select, MenuItem, Button, CircularProgress } from '@mui/material';
import axios from 'axios';
import ContentCopyIcon from '@mui/icons-material/ContentCopy';

const API_URL = "http://localhost:8080/api/email/generate";

function App() {
  const [originalEmail, setOriginalEmail] = useState('');
  const [tone, setTone] = useState('professional');
  const [generatedReply, setGeneratedReply] = useState('');
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState('');

  const handleSubmit = async () => {
    setLoading(true);
    setError('');

    // Basic validation
    if (!originalEmail.trim()) {
        setError("Email content cannot be empty.");
        setLoading(false);
        return;
    }

    try {
      const response = await axios.post(API_URL, {
        originalEmail: originalEmail,
        tone: tone
      });

      if (response.data && response.data.generatedReply) {
          setGeneratedReply(response.data.generatedReply.trim());
      } else {
          setGeneratedReply("Error generating reply or unexpected response format.");
      }

    } catch (error) {
      if (error.response) {
          setError(`API Error: Status ${error.response.status}. Check backend console for details.`);
      } else if (error.request) {
          setError('Network Error: Could not reach the Spring Boot API at http://localhost:8080. Is the backend running?');
      } else {
          setError('Failed to generate email reply. Please check the browser console.');
      }
      console.error("Axios Error:", error);
    } finally {
      setLoading(false);
    }
  };

  const handleCopy = () => {
      navigator.clipboard.writeText(generatedReply);
      alert('Reply copied to clipboard!');
  };


  return (
    <Container maxWidth="md" sx={{ py: 4 }}>
      <Typography variant="h3" component="h1" gutterBottom align="center" color="primary">
        Email Reply Generator
      </Typography>
      <Box sx={{ mx: 3, mb: 4, p: 3, border: '1px solid #ccc', borderRadius: 2 }}>
        <Typography variant="h5" gutterBottom> Original Email</Typography>
        <TextField
          fullWidth
          multiline
          rows={6}
          variant="outlined"
          label="Paste the email you received here..."
          value={originalEmail}
          onChange={(e) => setOriginalEmail(e.target.value)}
          sx={{ mb: 2 }}
        />
        <Typography variant="h5" gutterBottom> Select Tone</Typography>
        <FormControl fullWidth sx={{ mb: 3 }}>
          <InputLabel>Tone</InputLabel>
          <Select
            value={tone}
            label="Tone"
            onChange={(e) => setTone(e.target.value)}
          >
            <MenuItem value="professional">Professional</MenuItem>
            <MenuItem value="formal">Formal</MenuItem>
            <MenuItem value="casual">Casual</MenuItem>
            <MenuItem value="friendly">Friendly</MenuItem>
          </Select>
        </FormControl>
        <Button
          variant="contained"
          onClick={handleSubmit}
          disabled={!originalEmail.trim() || loading}
          fullWidth
          size="large"
        >
          {loading ? <CircularProgress size={24} color="inherit" /> : 'Generate Reply'}
        </Button>
      </Box>

      {error && (
        <Typography color="error" sx={{ mx: 3, mb: 2, p: 1, border: '1px solid red', borderRadius: 1 }}>
          {error}
        </Typography>
      )}

      {generatedReply && (
        <Box sx={{ mx: 3, mt: 3, p: 3, border: '1px solid #0077B6', borderRadius: 2, backgroundColor: '#f5f5f5' }}>
          <Typography variant="h5" gutterBottom>
             Generated Reply:
          </Typography>
          <TextField
            fullWidth
            multiline
            rows={8}
            variant="filled"
            value={generatedReply}
            InputProps={{ readOnly: true }}
            sx={{ mb: 2 }}
          />
          <Button
            variant="contained"
            color="secondary"
            onClick={handleCopy}
            startIcon={<ContentCopyIcon />}
          >
            Copy to Clipboard
          </Button>
        </Box>
      )}
    </Container>
  );
}

export default App;
