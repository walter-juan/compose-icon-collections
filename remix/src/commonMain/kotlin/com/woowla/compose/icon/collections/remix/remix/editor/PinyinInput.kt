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

public val EditorGroup.PinyinInput: ImageVector
    get() {
        if (_pinyinInput != null) {
            return _pinyinInput!!
        }
        _pinyinInput = Builder(name = "PinyinInput", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.934f, 3.036f)
                lineTo(19.666f, 4.036f)
                lineTo(18.531f, 6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                lineTo(13.916f, 14.0f)
                curveTo(13.591f, 16.862f, 12.352f, 19.394f, 10.547f, 21.193f)
                lineTo(8.984f, 19.923f)
                curveTo(10.503f, 18.485f, 11.58f, 16.401f, 11.901f, 14.001f)
                lineTo(10.0f, 14.0f)
                verticalLineTo(12.0f)
                lineTo(12.0f, 11.999f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.467f)
                lineTo(11.334f, 4.036f)
                lineTo(13.066f, 3.036f)
                lineTo(14.777f, 6.0f)
                horizontalLineTo(16.221f)
                lineTo(17.934f, 3.036f)
                close()
                moveTo(5.0f, 13.803f)
                lineTo(3.0f, 14.339f)
                verticalLineTo(12.268f)
                lineTo(5.0f, 11.732f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.197f)
                lineTo(9.0f, 10.661f)
                verticalLineTo(12.731f)
                lineTo(7.0f, 13.267f)
                verticalLineTo(18.5f)
                curveTo(7.0f, 19.881f, 5.881f, 21.0f, 4.5f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.5f)
                curveTo(4.745f, 19.0f, 4.95f, 18.823f, 4.992f, 18.59f)
                lineTo(5.0f, 18.5f)
                verticalLineTo(13.803f)
                close()
                moveTo(17.0f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _pinyinInput!!
    }

private var _pinyinInput: ImageVector? = null
