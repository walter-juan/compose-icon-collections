package com.woowla.compose.icon.collections.ionicons.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.FilledGroup

public val FilledGroup.ArrowUpLeftBox: ImageVector
    get() {
        if (_arrowUpLeftBox != null) {
            return _arrowUpLeftBox!!
        }
        _arrowUpLeftBox = Builder(name = "ArrowUpLeftBox", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(32.0f, 180.36f)
                lineTo(32.0f, 48.0f)
                curveTo(32.0f, 43.76f, 33.69f, 39.69f, 36.69f, 36.69f)
                curveTo(39.69f, 33.69f, 43.76f, 32.0f, 48.0f, 32.0f)
                horizontalLineTo(180.36f)
                curveTo(189.2f, 32.0f, 196.36f, 39.16f, 196.36f, 48.0f)
                curveTo(196.36f, 56.84f, 189.2f, 64.0f, 180.36f, 64.0f)
                horizontalLineTo(86.63f)
                lineTo(137.76f, 115.13f)
                curveTo(133.04f, 117.75f, 128.67f, 121.03f, 124.78f, 124.91f)
                curveTo(120.95f, 128.75f, 117.7f, 133.07f, 115.09f, 137.72f)
                lineTo(64.0f, 86.63f)
                lineTo(64.0f, 180.36f)
                curveTo(64.0f, 189.2f, 56.84f, 196.36f, 48.0f, 196.36f)
                curveTo(39.16f, 196.36f, 32.0f, 189.2f, 32.0f, 180.36f)
                close()
                moveTo(115.09f, 137.72f)
                curveTo(110.25f, 146.38f, 107.64f, 156.21f, 107.64f, 166.31f)
                lineTo(107.64f, 421.45f)
                curveTo(107.64f, 436.98f, 113.81f, 451.87f, 124.78f, 462.85f)
                curveTo(135.76f, 473.83f, 150.65f, 480.0f, 166.18f, 480.0f)
                horizontalLineTo(421.45f)
                curveTo(436.98f, 480.0f, 451.87f, 473.83f, 462.85f, 462.85f)
                curveTo(473.83f, 451.87f, 480.0f, 436.98f, 480.0f, 421.45f)
                verticalLineTo(166.18f)
                curveTo(480.0f, 150.65f, 473.83f, 135.76f, 462.85f, 124.78f)
                curveTo(451.87f, 113.81f, 436.98f, 107.64f, 421.45f, 107.64f)
                horizontalLineTo(166.18f)
                curveTo(165.37f, 107.64f, 164.58f, 107.7f, 163.8f, 107.81f)
                curveTo(154.61f, 108.18f, 145.69f, 110.72f, 137.76f, 115.13f)
                lineTo(307.31f, 284.69f)
                curveTo(313.56f, 290.93f, 313.56f, 301.07f, 307.31f, 307.31f)
                curveTo(301.07f, 313.56f, 290.93f, 313.56f, 284.69f, 307.31f)
                lineTo(115.09f, 137.72f)
                close()
            }
        }
        .build()
        return _arrowUpLeftBox!!
    }

private var _arrowUpLeftBox: ImageVector? = null
