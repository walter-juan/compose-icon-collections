package com.woowla.compose.icon.collections.devicons.devicons.vuejs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VuejsGroup

public val VuejsGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF35495e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.93f)
                lineToRelative(49.85f, 0.16f)
                lineToRelative(14.3f, 24.42f)
                lineToRelative(14.3f, -24.42f)
                lineTo(128.0f, 8.94f)
                lineToRelative(-63.83f, 110.14f)
                close()
                moveTo(126.98f, 9.57f)
                lineToRelative(-24.36f, 0.02f)
                lineToRelative(-38.48f, 66.05f)
                lineTo(25.69f, 9.59f)
                lineTo(0.94f, 9.57f)
                lineToRelative(63.21f, 107.89f)
                close()
                moveTo(101.84f, 9.56f)
                lineToRelative(-22.75f, 0.17f)
                lineToRelative(-14.94f, 25.03f)
                lineTo(49.22f, 9.73f)
                lineToRelative(-22.79f, -0.17f)
                lineToRelative(37.73f, 64.48f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
