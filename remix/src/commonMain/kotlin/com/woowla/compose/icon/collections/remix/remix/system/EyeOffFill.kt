package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.EyeOffFill: ImageVector
    get() {
        if (_eyeOffFill != null) {
            return _eyeOffFill!!
        }
        _eyeOffFill = Builder(name = "EyeOffFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.52f, 5.935f)
                lineTo(1.394f, 2.808f)
                lineTo(2.808f, 1.394f)
                lineTo(22.607f, 21.192f)
                lineTo(21.193f, 22.607f)
                lineTo(17.883f, 19.297f)
                curveTo(16.181f, 20.375f, 14.164f, 21.0f, 12.0f, 21.0f)
                curveTo(6.608f, 21.0f, 2.122f, 17.12f, 1.182f, 12.0f)
                curveTo(1.618f, 9.623f, 2.819f, 7.513f, 4.52f, 5.935f)
                close()
                moveTo(14.758f, 16.172f)
                lineTo(13.294f, 14.708f)
                curveTo(12.902f, 14.895f, 12.463f, 15.0f, 12.0f, 15.0f)
                curveTo(10.343f, 15.0f, 9.0f, 13.657f, 9.0f, 12.0f)
                curveTo(9.0f, 11.537f, 9.105f, 11.098f, 9.293f, 10.707f)
                lineTo(7.829f, 9.243f)
                curveTo(7.305f, 10.033f, 7.0f, 10.981f, 7.0f, 12.0f)
                curveTo(7.0f, 14.762f, 9.239f, 17.0f, 12.0f, 17.0f)
                curveTo(13.019f, 17.0f, 13.967f, 16.695f, 14.758f, 16.172f)
                close()
                moveTo(7.974f, 3.76f)
                curveTo(9.221f, 3.27f, 10.579f, 3.0f, 12.0f, 3.0f)
                curveTo(17.392f, 3.0f, 21.878f, 6.88f, 22.819f, 12.0f)
                curveTo(22.507f, 13.7f, 21.804f, 15.263f, 20.807f, 16.593f)
                lineTo(16.947f, 12.733f)
                curveTo(16.982f, 12.494f, 17.0f, 12.249f, 17.0f, 12.0f)
                curveTo(17.0f, 9.239f, 14.762f, 7.0f, 12.0f, 7.0f)
                curveTo(11.751f, 7.0f, 11.507f, 7.018f, 11.268f, 7.053f)
                lineTo(7.974f, 3.76f)
                close()
            }
        }
        .build()
        return _eyeOffFill!!
    }

private var _eyeOffFill: ImageVector? = null
