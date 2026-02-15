package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.PictureInPicture: ImageVector
    get() {
        if (_pictureInPicture != null) {
            return _pictureInPicture!!
        }
        _pictureInPicture = Builder(name = "PictureInPicture", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 112.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -112.0f)
                lineToRelative(-384.0f, 0.0f)
                lineToRelative(0.0f, 320.0f)
                lineToRelative(144.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-144.0f, 0.0f)
                lineToRelative(-6.5f, -0.3f)
                curveToRelative(-30.1f, -3.1f, -54.1f, -27.0f, -57.1f, -57.1f)
                lineTo(0.0f, 416.0f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 62.9f, 25.2f, 35.6f, 57.5f, 32.3f)
                lineTo(64.0f, 32.0f)
                lineTo(448.0f, 32.0f)
                close()
                moveTo(464.0f, 256.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-160.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                lineToRelative(160.0f, 0.0f)
                close()
            }
        }
        .build()
        return _pictureInPicture!!
    }

private var _pictureInPicture: ImageVector? = null
