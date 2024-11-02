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

public val FilledGroup.ArrowDownLeftBox: ImageVector
    get() {
        if (_arrowDownLeftBox != null) {
            return _arrowDownLeftBox!!
        }
        _arrowDownLeftBox = Builder(name = "ArrowDownLeftBox", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(180.36f, 480.0f)
                lineTo(48.0f, 480.0f)
                curveTo(43.76f, 480.0f, 39.69f, 478.31f, 36.69f, 475.31f)
                curveTo(33.69f, 472.31f, 32.0f, 468.24f, 32.0f, 464.0f)
                verticalLineTo(331.64f)
                curveTo(32.0f, 322.8f, 39.16f, 315.64f, 48.0f, 315.64f)
                curveTo(56.84f, 315.64f, 64.0f, 322.8f, 64.0f, 331.64f)
                verticalLineTo(425.37f)
                lineTo(115.13f, 374.24f)
                curveTo(117.75f, 378.96f, 121.03f, 383.33f, 124.91f, 387.22f)
                curveTo(128.75f, 391.05f, 133.07f, 394.3f, 137.72f, 396.91f)
                lineTo(86.63f, 448.0f)
                lineTo(180.36f, 448.0f)
                curveTo(189.2f, 448.0f, 196.36f, 455.16f, 196.36f, 464.0f)
                curveTo(196.36f, 472.84f, 189.2f, 480.0f, 180.36f, 480.0f)
                close()
                moveTo(137.72f, 396.91f)
                curveTo(146.38f, 401.75f, 156.21f, 404.36f, 166.31f, 404.36f)
                lineTo(421.45f, 404.36f)
                curveTo(436.98f, 404.36f, 451.87f, 398.2f, 462.85f, 387.22f)
                curveTo(473.83f, 376.24f, 480.0f, 361.35f, 480.0f, 345.82f)
                lineTo(480.0f, 90.55f)
                curveTo(480.0f, 75.02f, 473.83f, 60.13f, 462.85f, 49.15f)
                curveTo(451.87f, 38.17f, 436.98f, 32.0f, 421.45f, 32.0f)
                lineTo(166.18f, 32.0f)
                curveTo(150.65f, 32.0f, 135.76f, 38.17f, 124.78f, 49.15f)
                curveTo(113.81f, 60.13f, 107.64f, 75.02f, 107.64f, 90.55f)
                lineTo(107.64f, 345.82f)
                curveTo(107.64f, 346.63f, 107.7f, 347.42f, 107.81f, 348.2f)
                curveTo(108.18f, 357.39f, 110.72f, 366.31f, 115.13f, 374.24f)
                lineTo(284.69f, 204.69f)
                curveTo(290.93f, 198.44f, 301.07f, 198.44f, 307.31f, 204.69f)
                curveTo(313.56f, 210.93f, 313.56f, 221.07f, 307.31f, 227.31f)
                lineTo(137.72f, 396.91f)
                close()
            }
        }
        .build()
        return _arrowDownLeftBox!!
    }

private var _arrowDownLeftBox: ImageVector? = null
