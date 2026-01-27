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

public val RegularGroup.LaughBeam: ImageVector
    get() {
        if (_laughBeam != null) {
            return _laughBeam!!
        }
        _laughBeam = Builder(name = "LaughBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, -416.0f, 0.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 416.0f, 0.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
                close()
                moveTo(118.3f, 314.2f)
                curveToRelative(-4.2f, -13.7f, 7.1f, -26.2f, 21.4f, -26.2f)
                lineToRelative(232.6f, 0.0f)
                curveToRelative(14.3f, 0.0f, 25.6f, 12.5f, 21.4f, 26.2f)
                curveToRelative(-18.0f, 58.9f, -72.9f, 101.8f, -137.7f, 101.8f)
                reflectiveCurveTo(136.3f, 373.1f, 118.3f, 314.2f)
                close()
                moveTo(176.0f, 180.0f)
                curveToRelative(-15.5f, 0.0f, -28.0f, 12.5f, -28.0f, 28.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                lineToRelative(0.0f, -8.0f)
                curveToRelative(0.0f, -37.6f, 30.4f, -68.0f, 68.0f, -68.0f)
                reflectiveCurveToRelative(68.0f, 30.4f, 68.0f, 68.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                lineToRelative(0.0f, -8.0f)
                curveToRelative(0.0f, -15.5f, -12.5f, -28.0f, -28.0f, -28.0f)
                close()
                moveTo(308.0f, 208.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                lineToRelative(0.0f, -8.0f)
                curveToRelative(0.0f, -37.6f, 30.4f, -68.0f, 68.0f, -68.0f)
                reflectiveCurveToRelative(68.0f, 30.4f, 68.0f, 68.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                lineToRelative(0.0f, -8.0f)
                curveToRelative(0.0f, -15.5f, -12.5f, -28.0f, -28.0f, -28.0f)
                reflectiveCurveToRelative(-28.0f, 12.5f, -28.0f, 28.0f)
                close()
            }
        }
        .build()
        return _laughBeam!!
    }

private var _laughBeam: ImageVector? = null
