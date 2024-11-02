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

public val OutlineGroup.ArrowTopRightOnSquare: ImageVector
    get() {
        if (_arrowTopRightOnSquare != null) {
            return _arrowTopRightOnSquare!!
        }
        _arrowTopRightOnSquare = Builder(name = "ArrowTopRightOnSquare", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 6.0f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 6.0f, 3.0f, 7.007f, 3.0f, 8.25f)
                verticalLineTo(18.75f)
                curveTo(3.0f, 19.993f, 4.007f, 21.0f, 5.25f, 21.0f)
                horizontalLineTo(15.75f)
                curveTo(16.993f, 21.0f, 18.0f, 19.993f, 18.0f, 18.75f)
                verticalLineTo(10.5f)
                moveTo(7.5f, 16.5f)
                lineTo(21.0f, 3.0f)
                moveTo(21.0f, 3.0f)
                lineTo(15.75f, 3.0f)
                moveTo(21.0f, 3.0f)
                verticalLineTo(8.25f)
            }
        }
        .build()
        return _arrowTopRightOnSquare!!
    }

private var _arrowTopRightOnSquare: ImageVector? = null
