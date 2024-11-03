package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(name = "Palette", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                moveToRelative(4.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                moveTo(5.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveToRelative(0.5f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                curveToRelative(0.0f, 3.15f, -1.866f, 2.585f, -3.567f, 2.07f)
                curveTo(11.42f, 9.763f, 10.465f, 9.473f, 10.0f, 10.0f)
                curveToRelative(-0.603f, 0.683f, -0.475f, 1.819f, -0.351f, 2.92f)
                curveTo(9.826f, 14.495f, 9.996f, 16.0f, 8.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                moveToRelative(-8.0f, 7.0f)
                curveToRelative(0.611f, 0.0f, 0.654f, -0.171f, 0.655f, -0.176f)
                curveToRelative(0.078f, -0.146f, 0.124f, -0.464f, 0.07f, -1.119f)
                curveToRelative(-0.014f, -0.168f, -0.037f, -0.37f, -0.061f, -0.591f)
                curveToRelative(-0.052f, -0.464f, -0.112f, -1.005f, -0.118f, -1.462f)
                curveToRelative(-0.01f, -0.707f, 0.083f, -1.61f, 0.704f, -2.314f)
                curveToRelative(0.369f, -0.417f, 0.845f, -0.578f, 1.272f, -0.618f)
                curveToRelative(0.404f, -0.038f, 0.812f, 0.026f, 1.16f, 0.104f)
                curveToRelative(0.343f, 0.077f, 0.702f, 0.186f, 1.025f, 0.284f)
                lineToRelative(0.028f, 0.008f)
                curveToRelative(0.346f, 0.105f, 0.658f, 0.199f, 0.953f, 0.266f)
                curveToRelative(0.653f, 0.148f, 0.904f, 0.083f, 0.991f, 0.024f)
                curveTo(14.717f, 9.38f, 15.0f, 9.161f, 15.0f, 8.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -7.0f, 7.0f)
            }
        }
        .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
