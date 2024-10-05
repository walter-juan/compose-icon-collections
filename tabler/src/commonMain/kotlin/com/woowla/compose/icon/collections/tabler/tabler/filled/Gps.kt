package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Gps: ImageVector
    get() {
        if (_gps != null) {
            return _gps!!
        }
        _gps = Builder(name = "Gps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                moveToRelative(-0.086f, 5.066f)
                curveToRelative(0.372f, -0.837f, -0.483f, -1.692f, -1.32f, -1.32f)
                lineToRelative(-9.0f, 4.0f)
                lineToRelative(-0.108f, 0.055f)
                curveToRelative(-0.75f, 0.44f, -0.611f, 1.609f, 0.271f, 1.83f)
                lineToRelative(3.418f, 0.853f)
                lineToRelative(0.855f, 3.419f)
                curveToRelative(0.23f, 0.922f, 1.498f, 1.032f, 1.884f, 0.163f)
                close()
            }
        }
        .build()
        return _gps!!
    }

private var _gps: ImageVector? = null
