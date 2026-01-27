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

public val SolidGroup.DiagramNext: ImageVector
    get() {
        if (_diagramNext != null) {
            return _diagramNext!!
        }
        _diagramNext = Builder(name = "DiagramNext", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 224.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-6.5f, 0.0f, -12.3f, 3.9f, -14.8f, 9.9f)
                reflectiveCurveToRelative(-1.1f, 12.9f, 3.5f, 17.4f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0.0f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(4.6f, -4.6f, 5.9f, -11.5f, 3.5f, -17.4f)
                reflectiveCurveTo(294.5f, 288.0f, 288.0f, 288.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(128.0f, 0.0f)
                close()
                moveTo(64.0f, 288.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineToRelative(-34.0f, 0.0f)
                curveToRelative(5.6f, 21.7f, -0.5f, 45.1f, -16.7f, 61.3f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-25.0f, 25.0f, -65.5f, 25.0f, -90.5f, 0.0f)
                lineToRelative(-64.0f, -64.0f)
                curveTo(98.6f, 333.1f, 92.4f, 309.7f, 98.0f, 288.0f)
                lineToRelative(-34.0f, 0.0f)
                close()
            }
        }
        .build()
        return _diagramNext!!
    }

private var _diagramNext: ImageVector? = null
