package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CheckCircleFill: ImageVector
    get() {
        if (_checkCircleFill != null) {
            return _checkCircleFill!!
        }
        _checkCircleFill = Builder(name = "CheckCircleFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveToRelative(-3.97f, -3.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.08f, 0.022f)
                lineTo(7.477f, 9.417f)
                lineTo(5.384f, 7.323f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineTo(6.97f, 11.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.079f, -0.02f)
                lineToRelative(3.992f, -4.99f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.01f, -1.05f)
                close()
            }
        }
        .build()
        return _checkCircleFill!!
    }

private var _checkCircleFill: ImageVector? = null
