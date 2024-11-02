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

public val OutlineGroup.CommandLine: ImageVector
    get() {
        if (_commandLine != null) {
            return _commandLine!!
        }
        _commandLine = Builder(name = "CommandLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.75f, 7.5f)
                lineTo(9.75f, 9.75f)
                lineTo(6.75f, 12.0f)
                moveTo(11.25f, 12.0f)
                horizontalLineTo(14.25f)
                moveTo(5.25f, 20.25f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 20.25f, 21.0f, 19.243f, 21.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.757f, 19.993f, 3.75f, 18.75f, 3.75f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 3.75f, 3.0f, 4.757f, 3.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.243f, 4.007f, 20.25f, 5.25f, 20.25f)
                close()
            }
        }
        .build()
        return _commandLine!!
    }

private var _commandLine: ImageVector? = null
