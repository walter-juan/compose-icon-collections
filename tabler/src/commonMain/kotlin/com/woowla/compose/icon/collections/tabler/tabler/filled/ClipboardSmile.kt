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

public val FilledGroup.ClipboardSmile: ImageVector
    get() {
        if (_clipboardSmile != null) {
            return _clipboardSmile!!
        }
        _clipboardSmile = Builder(name = "ClipboardSmile", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.997f, 4.17f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.003f, 2.83f)
                verticalLineToRelative(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.003f, -2.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.997f, 3.83f)
                horizontalLineToRelative(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.98f, -3.597f)
                close()
                moveTo(14.821f, 15.429f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.392f, -0.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.858f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.142f, 1.642f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 5.142f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.25f, -1.392f)
                moveToRelative(-4.811f, -3.429f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(4.0f, 0.0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-0.01f, -10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                close()
            }
        }
        .build()
        return _clipboardSmile!!
    }

private var _clipboardSmile: ImageVector? = null
