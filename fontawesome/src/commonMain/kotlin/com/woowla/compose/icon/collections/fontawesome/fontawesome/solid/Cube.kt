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

public val SolidGroup.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.3f, -2.5f)
                curveToRelative(19.8f, -11.4f, 44.2f, -11.4f, 64.0f, 0.0f)
                lineTo(464.2f, 99.0f)
                curveToRelative(19.8f, 11.4f, 32.0f, 32.6f, 32.0f, 55.4f)
                lineToRelative(0.0f, 203.0f)
                curveToRelative(0.0f, 22.9f, -12.2f, 44.0f, -32.0f, 55.4f)
                lineTo(288.3f, 514.5f)
                curveToRelative(-19.8f, 11.4f, -44.2f, 11.4f, -64.0f, 0.0f)
                lineTo(48.5f, 413.0f)
                curveToRelative(-19.8f, -11.4f, -32.0f, -32.6f, -32.0f, -55.4f)
                lineToRelative(0.0f, -203.0f)
                curveToRelative(0.0f, -22.9f, 12.2f, -44.0f, 32.0f, -55.4f)
                lineTo(224.3f, -2.5f)
                close()
                moveTo(432.1f, 357.5f)
                lineToRelative(0.0f, -166.1f)
                lineToRelative(-143.8f, 83.0f)
                lineToRelative(0.0f, 166.1f)
                lineToRelative(143.8f, -83.0f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
