package com.woowla.compose.icon.collections.remix.remix.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FinanceGroup

public val FinanceGroup.TrophyLine: ImageVector
    get() {
        if (_trophyLine != null) {
            return _trophyLine!!
        }
        _trophyLine = Builder(name = "TrophyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.005f, 16.941f)
                verticalLineTo(19.003f)
                horizontalLineTo(18.005f)
                verticalLineTo(21.003f)
                horizontalLineTo(6.005f)
                verticalLineTo(19.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(16.941f)
                curveTo(7.059f, 16.449f, 4.005f, 13.082f, 4.005f, 9.003f)
                verticalLineTo(3.003f)
                horizontalLineTo(20.005f)
                verticalLineTo(9.003f)
                curveTo(20.005f, 13.082f, 16.951f, 16.449f, 13.005f, 16.941f)
                close()
                moveTo(6.005f, 5.003f)
                verticalLineTo(9.003f)
                curveTo(6.005f, 12.316f, 8.691f, 15.003f, 12.005f, 15.003f)
                curveTo(15.319f, 15.003f, 18.005f, 12.316f, 18.005f, 9.003f)
                verticalLineTo(5.003f)
                horizontalLineTo(6.005f)
                close()
                moveTo(1.005f, 5.003f)
                horizontalLineTo(3.005f)
                verticalLineTo(9.003f)
                horizontalLineTo(1.005f)
                verticalLineTo(5.003f)
                close()
                moveTo(21.005f, 5.003f)
                horizontalLineTo(23.005f)
                verticalLineTo(9.003f)
                horizontalLineTo(21.005f)
                verticalLineTo(5.003f)
                close()
            }
        }
        .build()
        return _trophyLine!!
    }

private var _trophyLine: ImageVector? = null
