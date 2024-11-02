package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Akiflow: ImageVector
    get() {
        if (_akiflow != null) {
            return _akiflow!!
        }
        _akiflow = Builder(name = "Akiflow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.425f, 5.2f)
                lineTo(5.457f, 18.0f)
                horizontalLineToRelative(5.795f)
                lineToRelative(0.948f, -2.99f)
                lineToRelative(0.947f, 2.99f)
                horizontalLineToRelative(5.795f)
                lineTo(14.974f, 5.2f)
                close()
                moveTo(10.261f, 6.0f)
                horizontalLineToRelative(4.124f)
                lineToRelative(3.472f, 11.2f)
                horizontalLineToRelative(-4.124f)
                lineToRelative(-1.152f, -3.632f)
                close()
                moveTo(9.718f, 6.957f)
                lineTo(11.781f, 13.685f)
                lineTo(10.668f, 17.2f)
                lineTo(6.543f, 17.2f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 0.8f)
                curveTo(18.186f, 0.8f, 23.2f, 5.813f, 23.2f, 12.0f)
                curveToRelative(0.0f, 6.186f, -5.014f, 11.2f, -11.2f, 11.2f)
                curveTo(5.814f, 23.2f, 0.8f, 18.186f, 0.8f, 12.0f)
                curveTo(0.8f, 5.814f, 5.814f, 0.8f, 12.0f, 0.8f)
                close()
            }
        }
        .build()
        return _akiflow!!
    }

private var _akiflow: ImageVector? = null
