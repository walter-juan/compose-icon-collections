package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) {
            return _fileVideo!!
        }
        _fileVideo = Builder(name = "FileVideo", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 48.0f)
                lineToRelative(112.0f, 0.0f)
                lineToRelative(0.0f, 88.0f)
                curveToRelative(0.0f, 39.8f, 32.2f, 72.0f, 72.0f, 72.0f)
                lineToRelative(88.0f, 0.0f)
                lineToRelative(0.0f, 240.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(64.0f, 464.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(48.0f, 64.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(224.0f, 67.9f)
                lineToRelative(92.1f, 92.1f)
                lineToRelative(-68.1f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -68.1f)
                close()
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -261.5f)
                curveToRelative(0.0f, -17.0f, -6.7f, -33.3f, -18.7f, -45.3f)
                lineTo(242.7f, 18.7f)
                curveTo(230.7f, 6.7f, 214.5f, 0.0f, 197.5f, 0.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(80.0f, 288.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -24.0f)
                lineToRelative(35.0f, 35.0f)
                curveToRelative(3.2f, 3.2f, 7.5f, 5.0f, 12.0f, 5.0f)
                curveToRelative(9.4f, 0.0f, 17.0f, -7.6f, 17.0f, -17.0f)
                lineToRelative(0.0f, -94.1f)
                curveToRelative(0.0f, -9.4f, -7.6f, -17.0f, -17.0f, -17.0f)
                curveToRelative(-4.5f, 0.0f, -8.8f, 1.8f, -12.0f, 5.0f)
                lineToRelative(-35.0f, 35.0f)
                lineToRelative(0.0f, -24.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-96.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
