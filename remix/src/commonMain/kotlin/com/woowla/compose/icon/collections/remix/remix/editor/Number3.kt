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

public val EditorGroup.Number3: ImageVector
    get() {
        if (_number3 != null) {
            return _number3!!
        }
        _number3 = Builder(name = "Number3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                verticalLineTo(3.362f)
                lineTo(12.809f, 9.55f)
                curveTo(16.017f, 9.948f, 18.5f, 12.684f, 18.5f, 16.0f)
                curveTo(18.5f, 19.59f, 15.59f, 22.5f, 12.0f, 22.5f)
                curveTo(8.954f, 22.5f, 6.398f, 20.405f, 5.693f, 17.578f)
                lineTo(7.634f, 17.092f)
                curveTo(8.122f, 19.05f, 9.891f, 20.5f, 12.0f, 20.5f)
                curveTo(14.485f, 20.5f, 16.5f, 18.485f, 16.5f, 16.0f)
                curveTo(16.5f, 13.515f, 14.485f, 11.5f, 12.0f, 11.5f)
                curveTo(11.28f, 11.5f, 10.599f, 11.669f, 9.995f, 11.97f)
                lineTo(9.767f, 12.092f)
                lineTo(9.077f, 10.885f)
                lineTo(14.855f, 3.999f)
                lineTo(6.5f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _number3!!
    }

private var _number3: ImageVector? = null
