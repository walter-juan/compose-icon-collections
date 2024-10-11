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

public val EditorGroup.TextDirectionL: ImageVector
    get() {
        if (_textDirectionL != null) {
            return _textDirectionL!!
        }
        _textDirectionL = Builder(name = "TextDirectionL", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                curveTo(6.791f, 11.0f, 5.0f, 9.209f, 5.0f, 7.0f)
                curveTo(5.0f, 4.791f, 6.791f, 3.0f, 9.0f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(9.0f, 5.0f)
                curveTo(7.895f, 5.0f, 7.0f, 5.895f, 7.0f, 7.0f)
                curveTo(7.0f, 8.105f, 7.895f, 9.0f, 9.0f, 9.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(17.0f, 17.0f)
                verticalLineTo(14.5f)
                lineTo(21.0f, 18.0f)
                lineTo(17.0f, 21.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _textDirectionL!!
    }

private var _textDirectionL: ImageVector? = null
