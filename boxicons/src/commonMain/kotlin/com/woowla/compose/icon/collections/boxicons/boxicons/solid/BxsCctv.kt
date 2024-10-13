package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsCctv: ImageVector
    get() {
        if (_bxsCctv != null) {
            return _bxsCctv!!
        }
        _bxsCctv = Builder(name = "BxsCctv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.618f, 7.462f)
                lineTo(6.403f, 2.085f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, -0.77f, -0.016f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, -0.552f, 0.537f)
                lineToRelative(-3.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.525f, 1.313f)
                lineTo(9.563f, 13.9f)
                lineTo(8.323f, 17.0f)
                lineTo(4.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.323f)
                curveToRelative(0.823f, 0.0f, 1.552f, -0.494f, 1.856f, -1.258f)
                lineToRelative(1.222f, -3.054f)
                lineToRelative(3.419f, 1.465f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.311f, -0.518f)
                lineToRelative(3.0f, -6.857f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.513f, -1.316f)
                close()
                moveTo(19.93f, 16.372f)
                lineTo(18.072f, 15.63f)
                lineTo(20.07f, 10.63f)
                lineTo(21.928f, 11.371f)
                close()
            }
        }
        .build()
        return _bxsCctv!!
    }

private var _bxsCctv: ImageVector? = null
