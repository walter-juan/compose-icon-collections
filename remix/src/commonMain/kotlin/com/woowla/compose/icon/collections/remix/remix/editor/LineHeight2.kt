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

public val EditorGroup.LineHeight2: ImageVector
    get() {
        if (_lineHeight2 != null) {
            return _lineHeight2!!
        }
        _lineHeight2 = Builder(name = "LineHeight2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                lineTo(2.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                lineTo(4.0f, 19.0f)
                lineTo(2.0f, 19.0f)
                lineTo(2.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                lineTo(8.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(10.2f, 18.0f)
                horizontalLineTo(12.354f)
                lineTo(13.554f, 15.0f)
                horizontalLineTo(18.446f)
                lineTo(19.646f, 18.0f)
                horizontalLineTo(21.8f)
                lineTo(17.0f, 6.0f)
                horizontalLineTo(15.0f)
                lineTo(10.2f, 18.0f)
                close()
                moveTo(16.0f, 8.885f)
                lineTo(17.646f, 13.0f)
                horizontalLineTo(14.354f)
                lineTo(16.0f, 8.885f)
                close()
            }
        }
        .build()
        return _lineHeight2!!
    }

private var _lineHeight2: ImageVector? = null
