package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.TrainWifiFill: ImageVector
    get() {
        if (_trainWifiFill != null) {
            return _trainWifiFill!!
        }
        _trainWifiFill = Builder(name = "TrainWifiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.498f, 3.0f)
                curveTo(12.177f, 3.77f, 12.0f, 4.614f, 12.0f, 5.5f)
                curveTo(12.0f, 6.016f, 12.06f, 6.518f, 12.174f, 7.0f)
                lineTo(5.0f, 7.0f)
                verticalLineTo(11.0f)
                lineTo(15.035f, 11.0f)
                curveTo(16.038f, 11.634f, 17.226f, 12.0f, 18.5f, 12.0f)
                curveTo(19.386f, 12.0f, 20.231f, 11.823f, 21.001f, 11.502f)
                lineTo(21.0f, 18.0f)
                curveTo(21.0f, 19.105f, 20.105f, 20.0f, 19.0f, 20.0f)
                horizontalLineTo(17.2f)
                lineTo(19.0f, 21.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.5f)
                lineTo(6.8f, 20.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 20.0f, 3.0f, 19.105f, 3.0f, 18.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 4.791f, 4.791f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(12.498f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 14.895f, 10.0f, 16.0f)
                curveTo(10.0f, 17.105f, 10.895f, 18.0f, 12.0f, 18.0f)
                curveTo(13.105f, 18.0f, 14.0f, 17.105f, 14.0f, 16.0f)
                curveTo(14.0f, 14.895f, 13.105f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(18.5f, 1.0f)
                curveTo(20.985f, 1.0f, 23.0f, 3.015f, 23.0f, 5.5f)
                curveTo(23.0f, 7.985f, 20.985f, 10.0f, 18.5f, 10.0f)
                curveTo(16.015f, 10.0f, 14.0f, 7.985f, 14.0f, 5.5f)
                curveTo(14.0f, 3.015f, 16.015f, 1.0f, 18.5f, 1.0f)
                close()
                moveTo(18.5f, 6.167f)
                curveTo(18.009f, 6.167f, 17.559f, 6.344f, 17.211f, 6.637f)
                lineTo(17.086f, 6.752f)
                lineTo(18.5f, 8.167f)
                lineTo(19.913f, 6.752f)
                curveTo(19.551f, 6.39f, 19.052f, 6.167f, 18.5f, 6.167f)
                close()
                moveTo(18.5f, 3.5f)
                curveTo(17.297f, 3.5f, 16.2f, 3.955f, 15.372f, 4.703f)
                lineTo(15.199f, 4.868f)
                lineTo(16.143f, 5.81f)
                curveTo(16.746f, 5.206f, 17.579f, 4.833f, 18.5f, 4.833f)
                curveTo(19.344f, 4.833f, 20.114f, 5.147f, 20.701f, 5.664f)
                lineTo(20.857f, 5.81f)
                lineTo(21.8f, 4.867f)
                curveTo(20.955f, 4.022f, 19.788f, 3.5f, 18.5f, 3.5f)
                close()
            }
        }
        .build()
        return _trainWifiFill!!
    }

private var _trainWifiFill: ImageVector? = null
