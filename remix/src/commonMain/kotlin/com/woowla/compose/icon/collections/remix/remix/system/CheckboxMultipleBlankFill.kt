package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.CheckboxMultipleBlankFill: ImageVector
    get() {
        if (_checkboxMultipleBlankFill != null) {
            return _checkboxMultipleBlankFill!!
        }
        _checkboxMultipleBlankFill = Builder(name = "CheckboxMultipleBlankFill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                verticalLineTo(3.0f)
                curveTo(7.0f, 2.448f, 7.448f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 2.0f, 22.0f, 2.448f, 22.0f, 3.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 16.552f, 21.552f, 17.0f, 21.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.993f)
                curveTo(17.0f, 21.549f, 16.551f, 22.0f, 15.993f, 22.0f)
                horizontalLineTo(3.007f)
                curveTo(2.451f, 22.0f, 2.0f, 21.551f, 2.0f, 20.993f)
                lineTo(2.003f, 8.007f)
                curveTo(2.003f, 7.451f, 2.452f, 7.0f, 3.01f, 7.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(9.0f, 7.0f)
                horizontalLineTo(15.993f)
                curveTo(16.549f, 7.0f, 17.0f, 7.449f, 17.0f, 8.007f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _checkboxMultipleBlankFill!!
    }

private var _checkboxMultipleBlankFill: ImageVector? = null
