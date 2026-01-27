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

public val SolidGroup.Explosion: ImageVector
    get() {
        if (_explosion != null) {
            return _explosion!!
        }
        _explosion = Builder(name = "Explosion", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, -32.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(256.0f, 128.0f)
                curveToRelative(12.4f, 0.0f, 22.7f, 9.4f, 23.9f, 21.7f)
                lineTo(293.4f, 291.6f)
                lineTo(467.6f, 11.3f)
                curveToRelative(6.7f, -10.7f, 20.5f, -14.5f, 31.7f, -8.5f)
                reflectiveCurveToRelative(15.8f, 19.5f, 10.6f, 31.0f)
                lineTo(372.8f, 338.6f)
                curveToRelative(2.2f, 2.3f, 4.3f, 4.7f, 6.3f, 7.1f)
                lineToRelative(97.2f, -54.7f)
                curveToRelative(10.5f, -5.9f, 23.6f, -3.1f, 30.9f, 6.4f)
                reflectiveCurveToRelative(6.3f, 23.0f, -2.2f, 31.5f)
                lineToRelative(-87.0f, 87.0f)
                lineToRelative(-71.4f, 0.0f)
                curveToRelative(-13.2f, -37.3f, -48.7f, -64.0f, -90.5f, -64.0f)
                reflectiveCurveToRelative(-77.4f, 26.7f, -90.5f, 64.0f)
                lineToRelative(-79.6f, 0.0f)
                lineToRelative(-75.5f, -52.3f)
                curveTo(0.6f, 357.0f, -2.8f, 344.1f, 2.4f, 333.5f)
                reflectiveCurveToRelative(17.4f, -15.9f, 28.7f, -12.4f)
                lineToRelative(97.2f, 30.4f)
                curveToRelative(3.0f, -3.9f, 6.1f, -7.6f, 9.4f, -11.3f)
                lineTo(75.4f, 236.3f)
                curveToRelative(-6.1f, -10.1f, -3.9f, -23.1f, 5.1f, -30.7f)
                reflectiveCurveToRelative(22.2f, -7.5f, 31.1f, 0.1f)
                lineTo(214.0f, 293.6f)
                curveToRelative(1.5f, -0.4f, 3.0f, -0.8f, 4.5f, -1.1f)
                lineToRelative(13.6f, -142.7f)
                curveToRelative(1.2f, -12.3f, 11.5f, -21.7f, 23.9f, -21.7f)
                close()
                moveTo(32.0f, 464.0f)
                lineToRelative(456.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(24.0f, 512.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _explosion!!
    }

private var _explosion: ImageVector? = null
