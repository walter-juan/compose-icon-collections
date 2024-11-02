package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Italic: ImageVector
    get() {
        if (_italic != null) {
            return _italic!!
        }
        _italic = Builder(name = "Italic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.248f, 20.246f)
                horizontalLineTo(9.051f)
                moveTo(9.051f, 20.246f)
                horizontalLineTo(12.747f)
                moveTo(9.051f, 20.246f)
                lineTo(14.944f, 3.744f)
                moveTo(14.944f, 3.744f)
                horizontalLineTo(11.247f)
                moveTo(14.944f, 3.744f)
                horizontalLineTo(18.747f)
            }
        }
        .build()
        return _italic!!
    }

private var _italic: ImageVector? = null
