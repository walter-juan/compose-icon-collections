package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Openwrt: ImageVector
    get() {
        if (_openwrt != null) {
            return _openwrt!!
        }
        _openwrt = Builder(name = "Openwrt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveToRelative(-3.906f, 0.0f, -7.446f, 1.595f, -10.006f, 4.154f)
                lineToRelative(1.695f, 1.695f)
                curveToRelative(2.128f, -2.128f, 5.069f, -3.44f, 8.311f, -3.44f)
                curveToRelative(3.242f, 0.0f, 6.183f, 1.312f, 8.311f, 3.44f)
                lineToRelative(1.695f, -1.695f)
                curveToRelative(-2.56f, -2.559f, -6.1f, -4.154f, -10.006f, -4.154f)
                close()
                moveTo(12.0f, 4.32f)
                curveToRelative(-2.709f, 0.0f, -5.168f, 1.114f, -6.947f, 2.893f)
                lineToRelative(1.695f, 1.695f)
                curveToRelative(1.346f, -1.346f, 3.208f, -2.178f, 5.252f, -2.178f)
                curveToRelative(2.043f, 0.0f, 3.905f, 0.832f, 5.252f, 2.178f)
                lineToRelative(1.695f, -1.695f)
                curveToRelative(-1.778f, -1.778f, -4.238f, -2.893f, -6.947f, -2.893f)
                close()
                moveTo(4.272f, 8.076f)
                curveToRelative(-1.329f, 1.679f, -2.111f, 3.791f, -2.111f, 6.084f)
                curveToRelative(0.0f, 5.419f, 4.422f, 9.84f, 9.84f, 9.84f)
                curveToRelative(5.418f, 0.0f, 9.84f, -4.421f, 9.84f, -9.84f)
                curveToRelative(0.0f, -2.293f, -0.798f, -4.405f, -2.111f, -6.084f)
                lineToRelative(-1.713f, 1.713f)
                curveToRelative(0.897f, 1.23f, 1.43f, 2.743f, 1.43f, 4.371f)
                curveToRelative(0.0f, 4.105f, -3.34f, 7.447f, -7.445f, 7.447f)
                curveToRelative(-4.105f, 0.0f, -7.447f, -3.342f, -7.447f, -7.447f)
                curveToRelative(0.0f, -1.628f, 0.532f, -3.141f, 1.43f, -4.371f)
                lineToRelative(-1.711f, -1.713f)
                close()
                moveTo(12.0f, 8.643f)
                curveToRelative(-1.513f, 0.0f, -2.893f, 0.616f, -3.906f, 1.613f)
                lineToRelative(1.695f, 1.695f)
                curveToRelative(1.222f, -1.219f, 3.201f, -1.219f, 4.422f, 0.0f)
                lineToRelative(1.695f, -1.695f)
                curveToRelative(-1.035f, -1.036f, -2.442f, -1.618f, -3.906f, -1.613f)
                close()
                moveTo(12.0f, 12.531f)
                curveToRelative(-0.9f, 0.0f, -1.629f, 0.729f, -1.629f, 1.629f)
                curveToRelative(0.0f, 0.899f, 0.729f, 1.629f, 1.629f, 1.629f)
                curveToRelative(0.9f, 0.0f, 1.629f, -0.73f, 1.629f, -1.629f)
                curveToRelative(-0.002f, -0.899f, -0.73f, -1.628f, -1.629f, -1.629f)
                close()
            }
        }
        .build()
        return _openwrt!!
    }

private var _openwrt: ImageVector? = null
