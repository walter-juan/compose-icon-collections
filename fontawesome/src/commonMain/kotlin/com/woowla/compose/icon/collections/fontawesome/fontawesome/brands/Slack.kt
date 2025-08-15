package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Slack: ImageVector
    get() {
        if (_slack != null) {
            return _slack!!
        }
        _slack = Builder(name = "Slack", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.1f, 315.1f)
                curveToRelative(0.0f, 25.9f, -21.2f, 47.1f, -47.1f, 47.1f)
                reflectiveCurveTo(0.0f, 341.0f, 0.0f, 315.1f)
                reflectiveCurveTo(21.2f, 268.0f, 47.1f, 268.0f)
                lineToRelative(47.1f, 0.0f)
                lineToRelative(0.0f, 47.1f)
                close()
                moveTo(117.8f, 315.1f)
                curveToRelative(0.0f, -25.9f, 21.2f, -47.1f, 47.1f, -47.1f)
                reflectiveCurveTo(212.0f, 289.2f, 212.0f, 315.1f)
                lineToRelative(0.0f, 117.8f)
                curveToRelative(0.0f, 25.9f, -21.2f, 47.1f, -47.1f, 47.1f)
                reflectiveCurveToRelative(-47.1f, -21.2f, -47.1f, -47.1f)
                lineToRelative(0.0f, -117.8f)
                close()
                moveTo(164.9f, 126.1f)
                curveToRelative(-25.9f, 0.0f, -47.1f, -21.2f, -47.1f, -47.1f)
                reflectiveCurveTo(139.0f, 32.0f, 164.9f, 32.0f)
                reflectiveCurveTo(212.0f, 53.2f, 212.0f, 79.1f)
                lineToRelative(0.0f, 47.1f)
                lineToRelative(-47.1f, 0.0f)
                close()
                moveTo(164.9f, 149.8f)
                curveToRelative(25.9f, 0.0f, 47.1f, 21.2f, 47.1f, 47.1f)
                reflectiveCurveTo(190.8f, 244.0f, 164.9f, 244.0f)
                lineTo(47.1f, 244.0f)
                curveTo(21.2f, 244.0f, 0.0f, 222.8f, 0.0f, 196.9f)
                reflectiveCurveToRelative(21.2f, -47.1f, 47.1f, -47.1f)
                lineToRelative(117.8f, 0.0f)
                close()
                moveTo(353.9f, 196.9f)
                curveToRelative(0.0f, -25.9f, 21.2f, -47.1f, 47.1f, -47.1f)
                reflectiveCurveTo(448.0f, 171.0f, 448.0f, 196.9f)
                reflectiveCurveTo(426.8f, 244.0f, 400.9f, 244.0f)
                lineToRelative(-47.1f, 0.0f)
                lineToRelative(0.0f, -47.1f)
                close()
                moveTo(330.2f, 196.9f)
                curveToRelative(0.0f, 25.9f, -21.2f, 47.1f, -47.1f, 47.1f)
                reflectiveCurveTo(236.0f, 222.8f, 236.0f, 196.9f)
                lineToRelative(0.0f, -117.8f)
                curveTo(236.0f, 53.2f, 257.2f, 32.0f, 283.1f, 32.0f)
                reflectiveCurveToRelative(47.1f, 21.2f, 47.1f, 47.1f)
                lineToRelative(0.0f, 117.8f)
                close()
                moveTo(283.1f, 385.9f)
                curveToRelative(25.9f, 0.0f, 47.1f, 21.2f, 47.1f, 47.1f)
                reflectiveCurveTo(309.0f, 480.0f, 283.1f, 480.0f)
                reflectiveCurveTo(236.0f, 458.8f, 236.0f, 432.9f)
                lineToRelative(0.0f, -47.1f)
                lineToRelative(47.1f, 0.0f)
                close()
                moveTo(283.1f, 362.2f)
                curveToRelative(-25.9f, 0.0f, -47.1f, -21.2f, -47.1f, -47.1f)
                reflectiveCurveTo(257.2f, 268.0f, 283.1f, 268.0f)
                lineToRelative(117.8f, 0.0f)
                curveToRelative(25.9f, 0.0f, 47.1f, 21.2f, 47.1f, 47.1f)
                reflectiveCurveToRelative(-21.2f, 47.1f, -47.1f, 47.1f)
                lineToRelative(-117.8f, 0.0f)
                close()
            }
        }
        .build()
        return _slack!!
    }

private var _slack: ImageVector? = null
