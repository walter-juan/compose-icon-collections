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

public val SolidGroup.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.7f, 5.9f)
                lineTo(128.0f, 32.0f)
                lineTo(32.0f, 32.0f)
                curveTo(14.3f, 32.0f, 0.0f, 46.3f, 0.0f, 64.0f)
                reflectiveCurveTo(14.3f, 96.0f, 32.0f, 96.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(-8.7f, -26.1f)
                curveTo(306.9f, -7.2f, 294.7f, -16.0f, 280.9f, -16.0f)
                lineTo(167.1f, -16.0f)
                curveToRelative(-13.8f, 0.0f, -26.0f, 8.8f, -30.4f, 21.9f)
                close()
                moveTo(416.0f, 144.0f)
                lineTo(32.0f, 144.0f)
                lineTo(53.1f, 467.1f)
                curveTo(54.7f, 492.4f, 75.7f, 512.0f, 101.0f, 512.0f)
                lineTo(347.0f, 512.0f)
                curveToRelative(25.3f, 0.0f, 46.3f, -19.6f, 47.9f, -44.9f)
                lineTo(416.0f, 144.0f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
