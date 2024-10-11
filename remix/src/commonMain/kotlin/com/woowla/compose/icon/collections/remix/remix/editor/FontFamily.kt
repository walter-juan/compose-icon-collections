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

public val EditorGroup.FontFamily: ImageVector
    get() {
        if (_fontFamily != null) {
            return _fontFamily!!
        }
        _fontFamily = Builder(name = "FontFamily", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.554f, 22.0f)
                horizontalLineTo(3.4f)
                lineTo(11.0f, 3.0f)
                horizontalLineTo(13.0f)
                lineTo(20.6f, 22.0f)
                horizontalLineTo(18.446f)
                lineTo(16.046f, 16.0f)
                horizontalLineTo(7.954f)
                lineTo(5.554f, 22.0f)
                close()
                moveTo(8.754f, 14.0f)
                horizontalLineTo(15.246f)
                lineTo(12.0f, 5.885f)
                lineTo(8.754f, 14.0f)
                close()
            }
        }
        .build()
        return _fontFamily!!
    }

private var _fontFamily: ImageVector? = null
