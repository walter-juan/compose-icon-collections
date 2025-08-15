package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Loop16: ImageVector
    get() {
        if (_loop16 != null) {
            return _loop16!!
        }
        _loop16 = Builder(name = "Loop16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.896f, 4.559f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, true, 8.839f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.061f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, false, 0.0f, 6.717f)
                lineTo(13.03f, 8.98f)
                lineToRelative(-1.553f, -1.554f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 11.654f, 7.0f)
                horizontalLineToRelative(4.096f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(4.096f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.427f, 0.177f)
                lineToRelative(-1.482f, -1.482f)
                lineToRelative(-3.356f, 3.356f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, true, -8.839f, -8.838f)
                close()
            }
        }
        .build()
        return _loop16!!
    }

private var _loop16: ImageVector? = null
