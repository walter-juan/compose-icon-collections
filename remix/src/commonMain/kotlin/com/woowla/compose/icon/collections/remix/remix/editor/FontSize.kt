package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.FontSize: ImageVector
    get() {
        if (_fontSize != null) {
            return _fontSize!!
        }
        _fontSize = Builder(name = "FontSize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.246f, 15.0f)
                horizontalLineTo(4.754f)
                lineTo(2.754f, 20.0f)
                horizontalLineTo(0.6f)
                lineTo(7.0f, 4.0f)
                horizontalLineTo(9.0f)
                lineTo(15.4f, 20.0f)
                horizontalLineTo(13.246f)
                lineTo(11.246f, 15.0f)
                close()
                moveTo(10.446f, 13.0f)
                lineTo(8.0f, 6.885f)
                lineTo(5.554f, 13.0f)
                horizontalLineTo(10.446f)
                close()
                moveTo(21.0f, 12.535f)
                verticalLineTo(12.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.465f)
                curveTo(20.412f, 19.805f, 19.729f, 20.0f, 19.0f, 20.0f)
                curveTo(16.791f, 20.0f, 15.0f, 18.209f, 15.0f, 16.0f)
                curveTo(15.0f, 13.791f, 16.791f, 12.0f, 19.0f, 12.0f)
                curveTo(19.729f, 12.0f, 20.412f, 12.195f, 21.0f, 12.535f)
                close()
                moveTo(19.0f, 18.0f)
                curveTo(20.105f, 18.0f, 21.0f, 17.105f, 21.0f, 16.0f)
                curveTo(21.0f, 14.895f, 20.105f, 14.0f, 19.0f, 14.0f)
                curveTo(17.896f, 14.0f, 17.0f, 14.895f, 17.0f, 16.0f)
                curveTo(17.0f, 17.105f, 17.896f, 18.0f, 19.0f, 18.0f)
                close()
            }
        }
        .build()
        return _fontSize!!
    }

private var _fontSize: ImageVector? = null
