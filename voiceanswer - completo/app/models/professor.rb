class Professor < ActiveRecord::Base
	mount_uploader :foto, PictureUploader
end
