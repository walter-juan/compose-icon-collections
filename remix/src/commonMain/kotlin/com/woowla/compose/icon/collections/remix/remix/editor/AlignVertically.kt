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

public val EditorGroup.AlignVertically: ImageVector
    get() {
        if (_alignVertically != null) {
            return _alignVertically!!
        }
        _alignVertically = Builder(name = "AlignVertically", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(18.0f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                lineTo(17.0f, 14.0f)
                lineTo(21.0f, 18.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(8.0f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                lineTo(7.0f, 14.0f)
                lineTo(11.0f, 18.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(18.0f, 6.0f)
                horizontalLineTo(21.0f)
                lineTo(17.0f, 10.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(8.0f, 6.0f)
                horizontalLineTo(11.0f)
                lineTo(7.0f, 10.0f)
                lineTo(3.0f, 6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _alignVertically!!
    }

private var _alignVertically: ImageVector? = null
