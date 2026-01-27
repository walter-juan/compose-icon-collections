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

public val SolidGroup.VideoSlash: ImageVector
    get() {
        if (_videoSlash != null) {
            return _videoSlash!!
        }
        _videoSlash = Builder(name = "VideoSlash", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(-2.3f, -0.3f, 7.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-153.0f, -153.0f)
                lineToRelative(0.0f, -222.2f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(129.8f, 64.0f)
                lineTo(41.0f, -24.9f)
                close()
                moveTo(32.0f, 128.0f)
                lineToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(7.8f, 0.0f, 15.3f, -1.4f, 22.2f, -4.0f)
                lineTo(36.0f, 105.8f)
                curveToRelative(-2.6f, 6.9f, -4.0f, 14.4f, -4.0f, 22.2f)
                close()
                moveTo(464.0f, 336.0f)
                lineToRelative(73.5f, 58.8f)
                curveToRelative(4.2f, 3.4f, 9.4f, 5.2f, 14.8f, 5.2f)
                curveToRelative(13.1f, 0.0f, 23.7f, -10.6f, 23.7f, -23.7f)
                lineToRelative(0.0f, -240.6f)
                curveToRelative(0.0f, -13.1f, -10.6f, -23.7f, -23.7f, -23.7f)
                curveToRelative(-5.4f, 0.0f, -10.6f, 1.8f, -14.8f, 5.2f)
                lineTo(464.0f, 176.0f)
                lineTo(464.0f, 336.0f)
                close()
            }
        }
        .build()
        return _videoSlash!!
    }

private var _videoSlash: ImageVector? = null
