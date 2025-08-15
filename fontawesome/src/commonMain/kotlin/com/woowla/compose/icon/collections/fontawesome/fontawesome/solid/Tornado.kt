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

public val SolidGroup.Tornado: ImageVector
    get() {
        if (_tornado != null) {
            return _tornado!!
        }
        _tornado = Builder(name = "Tornado", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                lineTo(0.0f, 45.6f)
                curveTo(0.0f, 62.7f, 1.7f, 79.6f, 5.0f, 96.0f)
                lineToRelative(352.8f, 0.0f)
                curveToRelative(3.2f, -6.9f, 7.5f, -13.3f, 13.0f, -18.8f)
                lineToRelative(38.6f, -38.6f)
                curveToRelative(4.2f, -4.2f, 6.6f, -10.0f, 6.6f, -16.0f)
                curveToRelative(0.0f, -12.5f, -10.1f, -22.6f, -22.6f, -22.6f)
                lineTo(32.0f, 0.0f)
                curveTo(14.3f, 0.0f, 0.0f, 14.3f, 0.0f, 32.0f)
                close()
                moveTo(355.7f, 144.0f)
                lineToRelative(-336.0f, 0.0f)
                curveToRelative(12.4f, 29.7f, 30.2f, 56.8f, 52.7f, 80.0f)
                lineToRelative(339.6f, 0.0f)
                lineToRelative(-47.2f, -62.9f)
                curveToRelative(-3.9f, -5.2f, -7.0f, -11.0f, -9.2f, -17.1f)
                close()
                moveTo(242.6f, 334.7f)
                curveToRelative(8.2f, 4.8f, 15.8f, 10.7f, 22.5f, 17.3f)
                lineTo(445.0f, 352.0f)
                curveToRelative(2.0f, -9.8f, 3.0f, -19.9f, 3.0f, -30.1f)
                curveToRelative(0.0f, -17.1f, -2.9f, -34.0f, -8.6f, -49.9f)
                lineTo(136.0f, 272.0f)
                lineTo(242.6f, 334.7f)
                close()
                moveTo(294.3f, 400.0f)
                curveToRelative(5.3f, 17.0f, 6.5f, 35.2f, 3.6f, 53.0f)
                lineToRelative(-5.9f, 35.7f)
                curveToRelative(-2.0f, 12.2f, 7.4f, 23.4f, 19.8f, 23.4f)
                curveToRelative(5.3f, 0.0f, 10.4f, -2.1f, 14.2f, -5.9f)
                lineToRelative(78.2f, -78.2f)
                curveToRelative(8.5f, -8.5f, 15.8f, -17.8f, 21.9f, -27.9f)
                lineToRelative(-131.8f, 0.0f)
                close()
            }
        }
        .build()
        return _tornado!!
    }

private var _tornado: ImageVector? = null
