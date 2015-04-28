json.array!(@professors) do |professor|
  json.extract! professor, :id, :nome, :matricula, :email, :senha, :foto
  json.url professor_url(professor, format: :json)
end
