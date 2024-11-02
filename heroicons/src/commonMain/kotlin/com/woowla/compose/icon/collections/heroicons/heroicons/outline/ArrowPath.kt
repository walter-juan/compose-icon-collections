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

public val OutlineGroup.ArrowPath: ImageVector
    get() {
        if (_arrowPath != null) {
            return _arrowPath!!
        }
        _arrowPath = Builder(name = "ArrowPath", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.023f, 9.348f)
                horizontalLineTo(21.015f)
                verticalLineTo(9.347f)
                moveTo(2.984f, 19.644f)
                verticalLineTo(14.652f)
                moveTo(2.984f, 14.652f)
                lineTo(7.977f, 14.652f)
                moveTo(2.984f, 14.652f)
                lineTo(6.165f, 17.835f)
                curveTo(7.156f, 18.827f, 8.413f, 19.58f, 9.864f, 19.969f)
                curveTo(14.265f, 21.148f, 18.789f, 18.536f, 19.969f, 14.135f)
                moveTo(4.031f, 9.865f)
                curveTo(5.21f, 5.464f, 9.734f, 2.852f, 14.135f, 4.031f)
                curveTo(15.587f, 4.42f, 16.844f, 5.173f, 17.834f, 6.166f)
                lineTo(21.015f, 9.347f)
                moveTo(21.015f, 4.356f)
                verticalLineTo(9.347f)
            }
        }
        .build()
        return _arrowPath!!
    }

private var _arrowPath: ImageVector? = null
