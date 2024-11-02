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

public val SolidGroup.Number8: ImageVector
    get() {
        if (_number8 != null) {
            return _number8!!
        }
        _number8 = Builder(name = "Number8", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.0f, 160.0f)
                curveToRelative(0.0f, -70.7f, -57.3f, -128.0f, -128.0f, -128.0f)
                lineToRelative(-32.0f, 0.0f)
                curveTo(73.3f, 32.0f, 16.0f, 89.3f, 16.0f, 160.0f)
                curveToRelative(0.0f, 34.6f, 13.7f, 66.0f, 36.0f, 89.0f)
                curveTo(20.5f, 272.3f, 0.0f, 309.8f, 0.0f, 352.0f)
                curveToRelative(0.0f, 70.7f, 57.3f, 128.0f, 128.0f, 128.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                curveToRelative(0.0f, -42.2f, -20.5f, -79.7f, -52.0f, -103.0f)
                curveToRelative(22.3f, -23.0f, 36.0f, -54.4f, 36.0f, -89.0f)
                close()
                moveTo(176.1f, 288.0f)
                lineToRelative(15.9f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(15.9f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.1f, 0.0f, 0.1f, 0.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.1f, 0.0f, 0.1f, 0.0f)
                close()
                moveTo(176.1f, 224.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                curveToRelative(0.0f, 35.3f, -28.6f, 64.0f, -64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _number8!!
    }

private var _number8: ImageVector? = null
