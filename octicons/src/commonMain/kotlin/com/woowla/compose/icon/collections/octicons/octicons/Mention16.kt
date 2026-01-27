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

public val Octicons.Mention16: ImageVector
    get() {
        if (_mention16 != null) {
            return _mention16!!
        }
        _mention16 = Builder(name = "Mention16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.5f)
                arcToRelative(7.499f, 7.499f, 0.0f, false, true, 7.499f, 7.462f)
                lineToRelative(0.002f, 0.038f)
                verticalLineToRelative(1.164f)
                arcToRelative(2.612f, 2.612f, 0.0f, false, true, -4.783f, 1.454f)
                arcTo(3.763f, 3.763f, 0.0f, false, true, 8.0f, 11.776f)
                arcTo(3.776f, 3.776f, 0.0f, true, true, 11.776f, 8.0f)
                verticalLineToRelative(1.164f)
                arcToRelative(1.112f, 1.112f, 0.0f, false, false, 2.225f, 0.0f)
                lineTo(14.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -3.311f, 5.365f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.673f, 1.341f)
                arcTo(7.5f, 7.5f, 0.0f, true, true, 8.0f, 0.5f)
                close()
                moveTo(8.0f, 5.725f)
                arcToRelative(2.275f, 2.275f, 0.0f, true, false, 0.0f, 4.552f)
                arcToRelative(2.275f, 2.275f, 0.0f, false, false, 0.0f, -4.552f)
                close()
            }
        }
        .build()
        return _mention16!!
    }

private var _mention16: ImageVector? = null
