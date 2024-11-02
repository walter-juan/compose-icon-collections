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

public val OutlineGroup.ComputerDesktop: ImageVector
    get() {
        if (_computerDesktop != null) {
            return _computerDesktop!!
        }
        _computerDesktop = Builder(name = "ComputerDesktop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 17.25f)
                verticalLineTo(18.257f)
                curveTo(9.0f, 19.053f, 8.684f, 19.816f, 8.121f, 20.379f)
                lineTo(7.5f, 21.0f)
                horizontalLineTo(16.5f)
                lineTo(15.879f, 20.379f)
                curveTo(15.316f, 19.816f, 15.0f, 19.053f, 15.0f, 18.257f)
                verticalLineTo(17.25f)
                moveTo(21.0f, 5.25f)
                verticalLineTo(15.0f)
                curveTo(21.0f, 16.243f, 19.993f, 17.25f, 18.75f, 17.25f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 17.25f, 3.0f, 16.243f, 3.0f, 15.0f)
                verticalLineTo(5.25f)
                moveTo(21.0f, 5.25f)
                curveTo(21.0f, 4.007f, 19.993f, 3.0f, 18.75f, 3.0f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 3.0f, 3.0f, 4.007f, 3.0f, 5.25f)
                moveTo(21.0f, 5.25f)
                verticalLineTo(12.0f)
                curveTo(21.0f, 13.243f, 19.993f, 14.25f, 18.75f, 14.25f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 14.25f, 3.0f, 13.243f, 3.0f, 12.0f)
                verticalLineTo(5.25f)
            }
        }
        .build()
        return _computerDesktop!!
    }

private var _computerDesktop: ImageVector? = null
