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

public val SolidGroup.ListCheck: ImageVector
    get() {
        if (_listCheck != null) {
            return _listCheck!!
        }
        _listCheck = Builder(name = "ListCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(133.8f, 36.3f)
                curveToRelative(10.9f, 7.6f, 13.5f, 22.6f, 5.9f, 33.4f)
                lineToRelative(-56.0f, 80.0f)
                curveToRelative(-4.1f, 5.8f, -10.5f, 9.5f, -17.6f, 10.1f)
                reflectiveCurveTo(52.0f, 158.0f, 47.0f, 153.0f)
                lineTo(7.0f, 113.0f)
                curveTo(-2.3f, 103.6f, -2.3f, 88.4f, 7.0f, 79.0f)
                reflectiveCurveTo(31.6f, 69.7f, 41.0f, 79.0f)
                lineToRelative(19.8f, 19.8f)
                lineToRelative(39.6f, -56.6f)
                curveToRelative(7.6f, -10.9f, 22.6f, -13.5f, 33.4f, -5.9f)
                close()
                moveTo(133.8f, 196.3f)
                curveToRelative(10.9f, 7.6f, 13.5f, 22.6f, 5.9f, 33.4f)
                lineToRelative(-56.0f, 80.0f)
                curveToRelative(-4.1f, 5.8f, -10.5f, 9.5f, -17.6f, 10.1f)
                reflectiveCurveTo(52.0f, 318.0f, 47.0f, 313.0f)
                lineTo(7.0f, 273.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(19.8f, 19.8f)
                lineToRelative(39.6f, -56.6f)
                curveToRelative(7.6f, -10.9f, 22.6f, -13.5f, 33.4f, -5.9f)
                close()
                moveTo(224.0f, 96.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(224.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-224.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(224.0f, 256.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(224.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-224.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(160.0f, 416.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(288.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-288.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(64.0f, 376.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, 80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, -80.0f)
                close()
            }
        }
        .build()
        return _listCheck!!
    }

private var _listCheck: ImageVector? = null
