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

public val OutlineGroup.Truck: ImageVector
    get() {
        if (_truck != null) {
            return _truck!!
        }
        _truck = Builder(name = "Truck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.25f, 18.75f)
                curveTo(8.25f, 19.578f, 7.578f, 20.25f, 6.75f, 20.25f)
                curveTo(5.922f, 20.25f, 5.25f, 19.578f, 5.25f, 18.75f)
                moveTo(8.25f, 18.75f)
                curveTo(8.25f, 17.922f, 7.578f, 17.25f, 6.75f, 17.25f)
                curveTo(5.922f, 17.25f, 5.25f, 17.922f, 5.25f, 18.75f)
                moveTo(8.25f, 18.75f)
                horizontalLineTo(14.25f)
                moveTo(5.25f, 18.75f)
                horizontalLineTo(3.375f)
                curveTo(2.754f, 18.75f, 2.25f, 18.246f, 2.25f, 17.625f)
                verticalLineTo(14.25f)
                moveTo(19.5f, 18.75f)
                curveTo(19.5f, 19.578f, 18.828f, 20.25f, 18.0f, 20.25f)
                curveTo(17.172f, 20.25f, 16.5f, 19.578f, 16.5f, 18.75f)
                moveTo(19.5f, 18.75f)
                curveTo(19.5f, 17.922f, 18.828f, 17.25f, 18.0f, 17.25f)
                curveTo(17.172f, 17.25f, 16.5f, 17.922f, 16.5f, 18.75f)
                moveTo(19.5f, 18.75f)
                lineTo(20.625f, 18.75f)
                curveTo(21.246f, 18.75f, 21.754f, 18.246f, 21.715f, 17.626f)
                curveTo(21.505f, 14.218f, 20.347f, 11.067f, 18.502f, 8.433f)
                curveTo(18.139f, 7.916f, 17.553f, 7.608f, 16.923f, 7.573f)
                horizontalLineTo(14.25f)
                moveTo(16.5f, 18.75f)
                horizontalLineTo(14.25f)
                moveTo(14.25f, 7.573f)
                verticalLineTo(6.615f)
                curveTo(14.25f, 6.047f, 13.828f, 5.567f, 13.263f, 5.509f)
                curveTo(11.615f, 5.338f, 9.943f, 5.25f, 8.25f, 5.25f)
                curveTo(6.557f, 5.25f, 4.885f, 5.338f, 3.237f, 5.509f)
                curveTo(2.673f, 5.567f, 2.25f, 6.047f, 2.25f, 6.615f)
                verticalLineTo(14.25f)
                moveTo(14.25f, 7.573f)
                verticalLineTo(14.25f)
                moveTo(14.25f, 18.75f)
                verticalLineTo(14.25f)
                moveTo(14.25f, 14.25f)
                horizontalLineTo(2.25f)
            }
        }
        .build()
        return _truck!!
    }

private var _truck: ImageVector? = null
