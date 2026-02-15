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

public val SolidGroup.Cancer: ImageVector
    get() {
        if (_cancer != null) {
            return _cancer!!
        }
        _cancer = Builder(name = "Cancer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.0f, 152.0f)
                curveToRelative(57.4f, 0.0f, 104.0f, 46.6f, 104.0f, 104.0f)
                curveToRelative(0.0f, 141.4f, -114.6f, 256.0f, -256.0f, 256.0f)
                curveToRelative(-54.3f, 0.0f, -104.8f, -17.0f, -146.3f, -45.9f)
                curveToRelative(-14.5f, -10.1f, -18.0f, -30.1f, -7.9f, -44.6f)
                reflectiveCurveToRelative(30.1f, -18.0f, 44.6f, -7.9f)
                curveToRelative(31.1f, 21.7f, 68.9f, 34.4f, 109.7f, 34.4f)
                curveToRelative(67.9f, 0.0f, 127.5f, -35.3f, 161.7f, -88.5f)
                curveToRelative(-3.2f, 0.3f, -6.4f, 0.5f, -9.7f, 0.5f)
                curveToRelative(-57.4f, 0.0f, -104.0f, -46.6f, -104.0f, -104.0f)
                reflectiveCurveToRelative(46.6f, -104.0f, 104.0f, -104.0f)
                close()
                moveTo(256.0f, 0.0f)
                curveToRelative(54.3f, 0.0f, 104.8f, 17.0f, 146.3f, 45.9f)
                curveToRelative(14.5f, 10.1f, 18.0f, 30.1f, 7.9f, 44.6f)
                reflectiveCurveToRelative(-30.1f, 18.0f, -44.6f, 7.9f)
                curveToRelative(-31.1f, -21.7f, -68.9f, -34.4f, -109.7f, -34.4f)
                curveToRelative(-67.9f, 0.0f, -127.5f, 35.2f, -161.7f, 88.4f)
                curveToRelative(3.2f, -0.3f, 6.4f, -0.4f, 9.7f, -0.4f)
                curveToRelative(57.4f, 0.0f, 104.0f, 46.6f, 104.0f, 104.0f)
                reflectiveCurveTo(161.4f, 360.0f, 104.0f, 360.0f)
                reflectiveCurveTo(0.0f, 313.4f, 0.0f, 256.0f)
                curveTo(0.0f, 254.1f, 0.0f, 252.2f, 0.1f, 250.4f)
                curveTo(3.1f, 111.6f, 116.5f, 0.0f, 256.0f, 0.0f)
                close()
                moveTo(104.0f, 216.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                close()
                moveTo(408.0f, 216.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                close()
            }
        }
        .build()
        return _cancer!!
    }

private var _cancer: ImageVector? = null
