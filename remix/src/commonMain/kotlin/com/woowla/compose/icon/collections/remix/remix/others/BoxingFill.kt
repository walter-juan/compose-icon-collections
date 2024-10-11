package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.BoxingFill: ImageVector
    get() {
        if (_boxingFill != null) {
            return _boxingFill!!
        }
        _boxingFill = Builder(name = "BoxingFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.501f, 11.0f)
                lineTo(9.645f, 11.007f)
                curveTo(10.359f, 11.075f, 10.926f, 11.642f, 10.994f, 12.356f)
                lineTo(11.001f, 12.5f)
                lineTo(10.994f, 12.644f)
                curveTo(10.926f, 13.358f, 10.359f, 13.925f, 9.645f, 13.993f)
                lineTo(9.501f, 14.0f)
                horizontalLineTo(6.001f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.501f)
                curveTo(11.201f, 16.0f, 12.618f, 14.788f, 12.935f, 13.181f)
                lineTo(12.965f, 13.001f)
                lineTo(19.001f, 13.0f)
                curveTo(19.712f, 13.0f, 20.389f, 12.851f, 21.001f, 12.584f)
                lineTo(21.001f, 17.0f)
                curveTo(21.001f, 18.306f, 20.167f, 19.417f, 19.002f, 19.829f)
                lineTo(19.001f, 21.0f)
                curveTo(19.001f, 21.552f, 18.553f, 22.0f, 18.001f, 22.0f)
                horizontalLineTo(6.001f)
                curveTo(5.449f, 22.0f, 5.001f, 21.552f, 5.001f, 21.0f)
                lineTo(5.001f, 19.829f)
                curveTo(3.836f, 19.417f, 3.001f, 18.306f, 3.001f, 17.0f)
                verticalLineTo(13.0f)
                curveTo(3.001f, 11.895f, 3.896f, 11.0f, 5.001f, 11.0f)
                horizontalLineTo(9.501f)
                close()
                moveTo(22.001f, 7.5f)
                verticalLineTo(8.0f)
                lineTo(21.996f, 8.176f)
                curveTo(21.908f, 9.693f, 20.694f, 10.907f, 19.177f, 10.995f)
                lineTo(19.001f, 11.0f)
                horizontalLineTo(12.664f)
                curveTo(12.13f, 9.877f, 11.016f, 9.083f, 9.709f, 9.006f)
                lineTo(9.501f, 9.0f)
                horizontalLineTo(5.001f)
                curveTo(4.272f, 9.0f, 3.589f, 9.195f, 3.0f, 9.536f)
                lineTo(3.001f, 6.0f)
                curveTo(3.001f, 3.791f, 4.792f, 2.0f, 7.001f, 2.0f)
                horizontalLineTo(16.501f)
                curveTo(19.539f, 2.0f, 22.001f, 4.462f, 22.001f, 7.5f)
                close()
            }
        }
        .build()
        return _boxingFill!!
    }

private var _boxingFill: ImageVector? = null
