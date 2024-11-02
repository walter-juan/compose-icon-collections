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

public val OutlineGroup.Newspaper: ImageVector
    get() {
        if (_newspaper != null) {
            return _newspaper!!
        }
        _newspaper = Builder(name = "Newspaper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.5f)
                horizontalLineTo(13.5f)
                moveTo(12.0f, 10.5f)
                horizontalLineTo(13.5f)
                moveTo(6.0f, 13.5f)
                horizontalLineTo(13.5f)
                moveTo(6.0f, 16.5f)
                horizontalLineTo(13.5f)
                moveTo(16.5f, 7.5f)
                horizontalLineTo(19.875f)
                curveTo(20.496f, 7.5f, 21.0f, 8.004f, 21.0f, 8.625f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.243f, 19.993f, 20.25f, 18.75f, 20.25f)
                moveTo(16.5f, 7.5f)
                verticalLineTo(18.0f)
                curveTo(16.5f, 19.243f, 17.507f, 20.25f, 18.75f, 20.25f)
                moveTo(16.5f, 7.5f)
                verticalLineTo(4.875f)
                curveTo(16.5f, 4.254f, 15.996f, 3.75f, 15.375f, 3.75f)
                horizontalLineTo(4.125f)
                curveTo(3.504f, 3.75f, 3.0f, 4.254f, 3.0f, 4.875f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.243f, 4.007f, 20.25f, 5.25f, 20.25f)
                horizontalLineTo(18.75f)
                moveTo(6.0f, 7.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
