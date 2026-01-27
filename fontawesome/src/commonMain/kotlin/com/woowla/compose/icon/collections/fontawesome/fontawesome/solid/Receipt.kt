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

public val SolidGroup.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.2f)
                curveTo(22.5f, -1.7f, 32.5f, -0.3f, 39.6f, 5.8f)
                lineTo(80.0f, 40.4f)
                lineTo(120.4f, 5.8f)
                curveToRelative(9.0f, -7.7f, 22.3f, -7.7f, 31.2f, 0.0f)
                lineTo(192.0f, 40.4f)
                lineTo(232.4f, 5.8f)
                curveToRelative(9.0f, -7.7f, 22.2f, -7.7f, 31.2f, 0.0f)
                lineTo(304.0f, 40.4f)
                lineTo(344.4f, 5.8f)
                curveToRelative(7.1f, -6.1f, 17.1f, -7.5f, 25.6f, -3.6f)
                reflectiveCurveTo(384.0f, 14.6f, 384.0f, 24.0f)
                lineToRelative(0.0f, 464.0f)
                curveToRelative(0.0f, 9.4f, -5.5f, 17.9f, -14.0f, 21.8f)
                reflectiveCurveToRelative(-18.5f, 2.5f, -25.6f, -3.6f)
                lineToRelative(-40.4f, -34.6f)
                lineToRelative(-40.4f, 34.6f)
                curveToRelative(-9.0f, 7.7f, -22.2f, 7.7f, -31.2f, 0.0f)
                lineToRelative(-40.4f, -34.6f)
                lineToRelative(-40.4f, 34.6f)
                curveToRelative(-9.0f, 7.7f, -22.3f, 7.7f, -31.2f, 0.0f)
                lineTo(80.0f, 471.6f)
                lineTo(39.6f, 506.2f)
                curveToRelative(-7.1f, 6.1f, -17.1f, 7.5f, -25.6f, 3.6f)
                reflectiveCurveTo(0.0f, 497.4f, 0.0f, 488.0f)
                lineTo(0.0f, 24.0f)
                curveTo(0.0f, 14.6f, 5.5f, 6.1f, 14.0f, 2.2f)
                close()
                moveTo(104.0f, 136.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(176.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-176.0f, 0.0f)
                close()
                moveTo(80.0f, 352.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(176.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-176.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                close()
                moveTo(104.0f, 232.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(176.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-176.0f, 0.0f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
