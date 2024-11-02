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

public val SolidGroup.Number7: ImageVector
    get() {
        if (_number7 != null) {
            return _number7!!
        }
        _number7 = Builder(name = "Number7", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 46.3f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(11.5f, 0.0f, 22.0f, 6.1f, 27.7f, 16.1f)
                reflectiveCurveToRelative(5.7f, 22.2f, -0.1f, 32.1f)
                lineToRelative(-224.0f, 384.0f)
                curveToRelative(-8.9f, 15.3f, -28.5f, 20.4f, -43.8f, 11.5f)
                reflectiveCurveToRelative(-20.4f, -28.5f, -11.5f, -43.8f)
                lineTo(232.3f, 96.0f)
                lineTo(32.0f, 96.0f)
                curveTo(14.3f, 96.0f, 0.0f, 81.7f, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _number7!!
    }

private var _number7: ImageVector? = null
