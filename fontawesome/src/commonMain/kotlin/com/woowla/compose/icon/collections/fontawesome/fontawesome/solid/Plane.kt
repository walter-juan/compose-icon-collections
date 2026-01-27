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

public val SolidGroup.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = Builder(name = "Plane", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(520.0f, 200.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, 25.1f, 56.0f, 56.0f)
                reflectiveCurveToRelative(-25.1f, 56.0f, -56.0f, 56.0f)
                lineToRelative(-127.3f, 0.0f)
                lineToRelative(-159.2f, 173.6f)
                curveToRelative(-6.1f, 6.6f, -14.6f, 10.4f, -23.6f, 10.4f)
                lineToRelative(-43.7f, 0.0f)
                curveToRelative(-10.9f, 0.0f, -18.6f, -10.7f, -15.2f, -21.1f)
                lineToRelative(54.3f, -162.9f)
                lineToRelative(-99.7f, 0.0f)
                lineToRelative(-52.8f, 66.0f)
                curveToRelative(-3.0f, 3.8f, -7.6f, 6.0f, -12.5f, 6.0f)
                lineToRelative(-19.8f, 0.0f)
                curveToRelative(-10.4f, 0.0f, -18.0f, -9.8f, -15.5f, -19.9f)
                lineTo(32.0f, 256.0f)
                lineTo(5.0f, 147.9f)
                curveTo(2.4f, 137.8f, 10.1f, 128.0f, 20.5f, 128.0f)
                lineToRelative(19.8f, 0.0f)
                curveToRelative(4.9f, 0.0f, 9.5f, 2.2f, 12.5f, 6.0f)
                lineToRelative(52.8f, 66.0f)
                lineToRelative(99.7f, 0.0f)
                lineToRelative(-54.3f, -162.9f)
                curveTo(147.6f, 26.7f, 155.3f, 16.0f, 166.2f, 16.0f)
                lineToRelative(43.7f, 0.0f)
                curveToRelative(9.0f, 0.0f, 17.5f, 3.8f, 23.6f, 10.4f)
                lineTo(392.7f, 200.0f)
                lineTo(520.0f, 200.0f)
                close()
            }
        }
        .build()
        return _plane!!
    }

private var _plane: ImageVector? = null
