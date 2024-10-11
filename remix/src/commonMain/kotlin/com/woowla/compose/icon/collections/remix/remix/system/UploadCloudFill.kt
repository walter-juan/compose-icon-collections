package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.UploadCloudFill: ImageVector
    get() {
        if (_uploadCloudFill != null) {
            return _uploadCloudFill!!
        }
        _uploadCloudFill = Builder(name = "UploadCloudFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 20.981f)
                curveTo(3.644f, 20.726f, 1.0f, 17.922f, 1.0f, 14.5f)
                curveTo(1.0f, 12.172f, 2.224f, 10.129f, 4.064f, 8.981f)
                curveTo(4.565f, 5.044f, 7.927f, 2.0f, 12.0f, 2.0f)
                curveTo(16.073f, 2.0f, 19.435f, 5.044f, 19.936f, 8.981f)
                curveTo(21.776f, 10.129f, 23.0f, 12.172f, 23.0f, 14.5f)
                curveTo(23.0f, 17.922f, 20.356f, 20.726f, 17.0f, 20.981f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.981f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 8.0f)
                lineTo(8.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _uploadCloudFill!!
    }

private var _uploadCloudFill: ImageVector? = null
