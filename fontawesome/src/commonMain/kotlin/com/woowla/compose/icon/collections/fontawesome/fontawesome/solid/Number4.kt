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

public val SolidGroup.Number4: ImageVector
    get() {
        if (_number4 != null) {
            return _number4!!
        }
        _number4 = Builder(name = "Number4", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(189.0f, 77.6f)
                curveToRelative(7.5f, -16.0f, 0.7f, -35.1f, -15.3f, -42.6f)
                reflectiveCurveToRelative(-35.1f, -0.7f, -42.6f, 15.3f)
                lineTo(3.0f, 322.4f)
                curveToRelative(-4.7f, 9.9f, -3.9f, 21.5f, 1.9f, 30.8f)
                reflectiveCurveTo(21.0f, 368.0f, 32.0f, 368.0f)
                lineToRelative(224.0f, 0.0f)
                lineToRelative(0.0f, 80.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -80.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, -144.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 144.0f)
                lineTo(82.4f, 304.0f)
                lineTo(189.0f, 77.6f)
                close()
            }
        }
        .build()
        return _number4!!
    }

private var _number4: ImageVector? = null
