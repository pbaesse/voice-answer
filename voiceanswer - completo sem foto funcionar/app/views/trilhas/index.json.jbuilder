json.array!(@trilhas) do |trilha|
  json.extract! trilha, :id, :nivel, :tagAssunto, :codigoTurma
  json.url trilha_url(trilha, format: :json)
end
