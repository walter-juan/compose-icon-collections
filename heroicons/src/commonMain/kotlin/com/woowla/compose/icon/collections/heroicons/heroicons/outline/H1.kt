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

public val OutlineGroup.H1: ImageVector
    get() {
        if (_h1 != null) {
            return _h1!!
        }
        _h1 = Builder(name = "H1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.243f, 4.493f)
                verticalLineTo(11.994f)
                moveTo(2.243f, 11.994f)
                verticalLineTo(19.495f)
                moveTo(2.243f, 11.994f)
                lineTo(12.743f, 11.995f)
                moveTo(12.743f, 4.494f)
                verticalLineTo(11.995f)
                moveTo(12.743f, 11.995f)
                verticalLineTo(19.495f)
                moveTo(17.244f, 10.868f)
                lineTo(19.494f, 9.368f)
                verticalLineTo(19.494f)
                moveTo(19.494f, 19.494f)
                horizontalLineTo(17.244f)
                moveTo(19.494f, 19.494f)
                horizontalLineTo(21.744f)
            }
        }
        .build()
        return _h1!!
    }

private var _h1: ImageVector? = null
