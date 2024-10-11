package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.AttachmentLine: ImageVector
    get() {
        if (_attachmentLine != null) {
            return _attachmentLine!!
        }
        _attachmentLine = Builder(name = "AttachmentLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.5f)
                verticalLineTo(8.0f)
                curveTo(14.0f, 5.791f, 12.209f, 4.0f, 10.0f, 4.0f)
                curveTo(7.791f, 4.0f, 6.0f, 5.791f, 6.0f, 8.0f)
                verticalLineTo(13.5f)
                curveTo(6.0f, 17.09f, 8.91f, 20.0f, 12.5f, 20.0f)
                curveTo(16.09f, 20.0f, 19.0f, 17.09f, 19.0f, 13.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.5f)
                curveTo(21.0f, 18.194f, 17.194f, 22.0f, 12.5f, 22.0f)
                curveTo(7.806f, 22.0f, 4.0f, 18.194f, 4.0f, 13.5f)
                verticalLineTo(8.0f)
                curveTo(4.0f, 4.686f, 6.686f, 2.0f, 10.0f, 2.0f)
                curveTo(13.314f, 2.0f, 16.0f, 4.686f, 16.0f, 8.0f)
                verticalLineTo(13.5f)
                curveTo(16.0f, 15.433f, 14.433f, 17.0f, 12.5f, 17.0f)
                curveTo(10.567f, 17.0f, 9.0f, 15.433f, 9.0f, 13.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.5f)
                curveTo(11.0f, 14.328f, 11.672f, 15.0f, 12.5f, 15.0f)
                curveTo(13.328f, 15.0f, 14.0f, 14.328f, 14.0f, 13.5f)
                close()
            }
        }
        .build()
        return _attachmentLine!!
    }

private var _attachmentLine: ImageVector? = null
