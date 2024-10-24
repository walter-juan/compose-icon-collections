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

public val EditorGroup.CustomSize: ImageVector
    get() {
        if (_customSize != null) {
            return _customSize!!
        }
        _customSize = Builder(name = "CustomSize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(0.5f)
                lineTo(18.5f, 4.0f)
                lineTo(15.0f, 7.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.5f)
                lineTo(4.5f, 4.0f)
                lineTo(8.0f, 0.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(3.0f, 17.0f)
                verticalLineTo(6.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                curveTo(5.0f, 18.105f, 5.895f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                curveTo(4.791f, 21.0f, 3.0f, 19.209f, 3.0f, 17.0f)
                close()
                moveTo(21.0f, 16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(23.5f)
                lineTo(20.0f, 5.5f)
                lineTo(16.5f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.5f)
                lineTo(20.0f, 19.5f)
                lineTo(23.5f, 16.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _customSize!!
    }

private var _customSize: ImageVector? = null
