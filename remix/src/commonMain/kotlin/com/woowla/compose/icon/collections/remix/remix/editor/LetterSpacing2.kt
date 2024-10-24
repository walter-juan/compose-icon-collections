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

public val EditorGroup.LetterSpacing2: ImageVector
    get() {
        if (_letterSpacing2 != null) {
            return _letterSpacing2!!
        }
        _letterSpacing2 = Builder(name = "LetterSpacing2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2f, 14.0f)
                horizontalLineTo(8.354f)
                lineTo(9.554f, 11.0f)
                horizontalLineTo(14.446f)
                lineTo(15.646f, 14.0f)
                horizontalLineTo(17.8f)
                lineTo(13.0f, 2.0f)
                horizontalLineTo(11.0f)
                lineTo(6.2f, 14.0f)
                close()
                moveTo(12.0f, 4.885f)
                lineTo(13.646f, 9.0f)
                horizontalLineTo(10.354f)
                lineTo(12.0f, 4.885f)
                close()
                moveTo(3.0f, 16.0f)
                verticalLineTo(22.0f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 20.0f)
                horizontalLineTo(19.0f)
                lineTo(19.0f, 22.0f)
                lineTo(21.0f, 22.0f)
                lineTo(21.0f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                lineTo(5.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                close()
            }
        }
        .build()
        return _letterSpacing2!!
    }

private var _letterSpacing2: ImageVector? = null
