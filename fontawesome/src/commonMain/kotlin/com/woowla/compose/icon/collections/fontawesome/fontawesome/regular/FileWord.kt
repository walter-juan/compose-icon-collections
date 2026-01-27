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

public val RegularGroup.FileWord: ImageVector
    get() {
        if (_fileWord != null) {
            return _fileWord!!
        }
        _fileWord = Builder(name = "FileWord", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(135.3f, 274.2f)
                curveToRelative(-3.2f, -12.9f, -16.2f, -20.7f, -29.1f, -17.5f)
                reflectiveCurveTo(85.5f, 273.0f, 88.7f, 285.8f)
                lineToRelative(32.0f, 128.0f)
                curveToRelative(2.5f, 10.2f, 11.4f, 17.5f, 21.9f, 18.1f)
                reflectiveCurveToRelative(20.1f, -5.7f, 23.8f, -15.5f)
                lineToRelative(25.5f, -68.1f)
                lineToRelative(25.5f, 68.1f)
                curveToRelative(3.7f, 9.8f, 13.3f, 16.1f, 23.8f, 15.5f)
                reflectiveCurveToRelative(19.4f, -7.9f, 21.9f, -18.1f)
                lineToRelative(32.0f, -128.0f)
                curveToRelative(3.2f, -12.9f, -4.6f, -25.9f, -17.5f, -29.1f)
                reflectiveCurveToRelative(-25.9f, 4.6f, -29.1f, 17.5f)
                lineToRelative(-13.3f, 53.2f)
                lineToRelative(-20.9f, -55.8f)
                curveTo(211.0f, 262.2f, 202.0f, 256.0f, 192.0f, 256.0f)
                reflectiveCurveToRelative(-19.0f, 6.2f, -22.5f, 15.6f)
                lineToRelative(-20.9f, 55.8f)
                lineToRelative(-13.3f, -53.2f)
                close()
            }
        }
        .build()
        return _fileWord!!
    }

private var _fileWord: ImageVector? = null
