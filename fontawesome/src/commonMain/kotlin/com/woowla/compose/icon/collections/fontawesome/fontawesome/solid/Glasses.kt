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

public val SolidGroup.Glasses: ImageVector
    get() {
        if (_glasses != null) {
            return _glasses!!
        }
        _glasses = Builder(name = "Glasses", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(143.3f, 96.0f)
                curveToRelative(-14.0f, 0.0f, -26.5f, 9.2f, -30.6f, 22.6f)
                lineTo(70.4f, 256.0f)
                lineTo(224.0f, 256.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(153.6f, 0.0f)
                lineToRelative(-42.3f, -137.4f)
                curveTo(459.2f, 105.2f, 446.8f, 96.0f, 432.7f, 96.0f)
                lineTo(400.0f, 96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(32.7f, 0.0f)
                curveToRelative(42.1f, 0.0f, 79.4f, 27.5f, 91.8f, 67.8f)
                lineToRelative(45.4f, 147.5f)
                curveToRelative(4.1f, 13.2f, 6.1f, 26.9f, 6.1f, 40.7f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -13.8f, 2.1f, -27.5f, 6.1f, -40.7f)
                lineTo(51.5f, 99.8f)
                curveTo(63.9f, 59.5f, 101.1f, 32.0f, 143.3f, 32.0f)
                lineTo(176.0f, 32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-32.7f, 0.0f)
                close()
                moveTo(64.0f, 320.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-128.0f, 0.0f)
                close()
                moveTo(480.0f, 416.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-128.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _glasses!!
    }

private var _glasses: ImageVector? = null
