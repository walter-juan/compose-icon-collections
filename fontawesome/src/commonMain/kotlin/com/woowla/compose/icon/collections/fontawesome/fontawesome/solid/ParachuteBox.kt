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

public val SolidGroup.ParachuteBox: ImageVector
    get() {
        if (_parachuteBox != null) {
            return _parachuteBox!!
        }
        _parachuteBox = Builder(name = "ParachuteBox", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 224.0f)
                curveTo(128.0f, 152.2f, 144.3f, 88.4f, 169.5f, 43.4f)
                curveTo(195.1f, -2.4f, 226.6f, -24.0f, 256.0f, -24.0f)
                reflectiveCurveToRelative(60.9f, 21.6f, 86.5f, 67.4f)
                curveTo(367.7f, 88.4f, 384.0f, 152.2f, 384.0f, 224.0f)
                lineToRelative(-104.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(8.0f, 0.0f)
                curveToRelative(9.3f, 0.0f, 18.1f, 2.0f, 26.0f, 5.5f)
                lineToRelative(118.4f, -101.5f)
                lineToRelative(-0.5f, 0.0f)
                curveToRelative(0.0f, -78.4f, -17.7f, -150.6f, -47.6f, -204.0f)
                curveToRelative(-6.1f, -11.0f, -12.9f, -21.3f, -20.3f, -30.9f)
                curveToRelative(86.5f, 35.9f, 147.8f, 115.1f, 147.8f, 218.9f)
                curveToRelative(0.0f, 7.0f, -3.1f, 13.7f, -8.4f, 18.2f)
                lineTo(347.4f, 360.1f)
                curveToRelative(3.0f, 7.4f, 4.6f, 15.4f, 4.6f, 23.9f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -8.4f, 1.6f, -16.5f, 4.6f, -23.9f)
                lineTo(8.4f, 226.2f)
                curveTo(3.1f, 221.7f, 0.0f, 215.0f, 0.0f, 208.0f)
                curveTo(0.0f, 104.2f, 61.3f, 24.9f, 147.8f, -10.9f)
                curveTo(140.5f, -1.4f, 133.7f, 9.0f, 127.6f, 20.0f)
                curveTo(97.7f, 73.4f, 80.0f, 145.6f, 80.0f, 224.0f)
                lineToRelative(-0.5f, 0.0f)
                lineToRelative(118.4f, 101.5f)
                curveToRelative(8.0f, -3.5f, 16.8f, -5.5f, 26.0f, -5.5f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(-104.0f, 0.0f)
                close()
            }
        }
        .build()
        return _parachuteBox!!
    }

private var _parachuteBox: ImageVector? = null
