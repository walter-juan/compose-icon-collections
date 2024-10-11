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

public val EditorGroup.Number6: ImageVector
    get() {
        if (_number6 != null) {
            return _number6!!
        }
        _number6 = Builder(name = "Number6", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.886f, 2.0f)
                lineTo(10.448f, 9.686f)
                curveTo(10.945f, 9.565f, 11.465f, 9.5f, 12.0f, 9.5f)
                curveTo(15.59f, 9.5f, 18.5f, 12.41f, 18.5f, 16.0f)
                curveTo(18.5f, 19.59f, 15.59f, 22.5f, 12.0f, 22.5f)
                curveTo(8.41f, 22.5f, 5.5f, 19.59f, 5.5f, 16.0f)
                curveTo(5.5f, 14.795f, 5.828f, 13.667f, 6.399f, 12.699f)
                lineTo(12.576f, 2.0f)
                horizontalLineTo(14.886f)
                close()
                moveTo(12.0f, 11.5f)
                curveTo(9.515f, 11.5f, 7.5f, 13.515f, 7.5f, 16.0f)
                curveTo(7.5f, 18.485f, 9.515f, 20.5f, 12.0f, 20.5f)
                curveTo(14.485f, 20.5f, 16.5f, 18.485f, 16.5f, 16.0f)
                curveTo(16.5f, 13.515f, 14.485f, 11.5f, 12.0f, 11.5f)
                close()
            }
        }
        .build()
        return _number6!!
    }

private var _number6: ImageVector? = null
