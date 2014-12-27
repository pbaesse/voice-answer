json.array!(@trilhas) do |trilha|
  json.extract! trilha, :id, :nivel, :assunto
  json.url trilha_url(trilha, format: :json)
end
