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

public val EditorGroup.Number2: ImageVector
    get() {
        if (_number2 != null) {
            return _number2!!
        }
        _number2 = Builder(name = "Number2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.5f)
                curveTo(16.0f, 5.291f, 14.209f, 3.5f, 12.0f, 3.5f)
                curveTo(9.791f, 3.5f, 8.0f, 5.291f, 8.0f, 7.5f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 4.186f, 8.687f, 1.5f, 12.0f, 1.5f)
                curveTo(15.314f, 1.5f, 18.0f, 4.186f, 18.0f, 7.5f)
                curveTo(18.0f, 8.931f, 17.499f, 10.245f, 16.663f, 11.276f)
                lineTo(9.344f, 19.999f)
                lineTo(18.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0f, 20.873f)
                lineTo(15.064f, 10.071f)
                curveTo(15.649f, 9.376f, 16.0f, 8.479f, 16.0f, 7.5f)
                close()
            }
        }
        .build()
        return _number2!!
    }

private var _number2: ImageVector? = null
