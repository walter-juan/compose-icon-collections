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

public val SolidGroup.Number0: ImageVector
    get() {
        if (_number0 != null) {
            return _number0!!
        }
        _number0 = Builder(name = "Number0", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 192.0f)
                curveTo(0.0f, 103.6f, 71.6f, 32.0f, 160.0f, 32.0f)
                reflectiveCurveToRelative(160.0f, 71.6f, 160.0f, 160.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 88.4f, -71.6f, 160.0f, -160.0f, 160.0f)
                reflectiveCurveTo(0.0f, 408.4f, 0.0f, 320.0f)
                lineTo(0.0f, 192.0f)
                close()
                moveTo(160.0f, 96.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -43.0f, 96.0f, -96.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                close()
            }
        }
        .build()
        return _number0!!
    }

private var _number0: ImageVector? = null
