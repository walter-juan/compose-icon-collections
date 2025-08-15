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

public val SolidGroup.GrinAlt: ImageVector
    get() {
        if (_grinAlt != null) {
            return _grinAlt!!
        }
        _grinAlt = Builder(name = "GrinAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(386.7f, 308.9f)
                curveToRelative(11.9f, -3.7f, 23.9f, 6.3f, 19.6f, 18.1f)
                curveToRelative(-22.4f, 61.3f, -81.3f, 105.1f, -150.3f, 105.1f)
                reflectiveCurveTo(128.1f, 388.2f, 105.7f, 326.9f)
                curveToRelative(-4.3f, -11.8f, 7.7f, -21.8f, 19.6f, -18.1f)
                curveToRelative(39.2f, 12.2f, 83.7f, 19.1f, 130.7f, 19.1f)
                reflectiveCurveToRelative(91.5f, -6.9f, 130.7f, -19.1f)
                close()
                moveTo(208.0f, 192.0f)
                curveToRelative(0.0f, 35.3f, -14.3f, 64.0f, -32.0f, 64.0f)
                reflectiveCurveToRelative(-32.0f, -28.7f, -32.0f, -64.0f)
                reflectiveCurveToRelative(14.3f, -64.0f, 32.0f, -64.0f)
                reflectiveCurveToRelative(32.0f, 28.7f, 32.0f, 64.0f)
                close()
                moveTo(336.0f, 256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -28.7f, -32.0f, -64.0f)
                reflectiveCurveToRelative(14.3f, -64.0f, 32.0f, -64.0f)
                reflectiveCurveToRelative(32.0f, 28.7f, 32.0f, 64.0f)
                reflectiveCurveToRelative(-14.3f, 64.0f, -32.0f, 64.0f)
                close()
            }
        }
        .build()
        return _grinAlt!!
    }

private var _grinAlt: ImageVector? = null
