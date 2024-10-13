package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxBaseball: ImageVector
    get() {
        if (_bxBaseball != null) {
            return _bxBaseball!!
        }
        _bxBaseball = Builder(name = "BxBaseball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.99f, 2.0f)
                arcToRelative(9.937f, 9.937f, 0.0f, false, false, -7.071f, 2.938f)
                curveToRelative(-3.898f, 3.898f, -3.898f, 10.243f, 0.0f, 14.143f)
                curveToRelative(1.895f, 1.895f, 4.405f, 2.938f, 7.071f, 2.938f)
                reflectiveCurveToRelative(5.177f, -1.043f, 7.071f, -2.938f)
                curveToRelative(3.899f, -3.899f, 3.899f, -10.244f, 0.0f, -14.143f)
                arcTo(9.937f, 9.937f, 0.0f, false, false, 11.99f, 2.0f)
                close()
                moveTo(17.647f, 17.667f)
                arcToRelative(7.957f, 7.957f, 0.0f, false, true, -3.816f, 2.129f)
                lineToRelative(-0.001f, -0.037f)
                arcToRelative(6.199f, 6.199f, 0.0f, false, true, 0.421f, -2.259f)
                lineToRelative(-1.863f, -0.729f)
                arcToRelative(8.188f, 8.188f, 0.0f, false, false, -0.552f, 3.239f)
                arcToRelative(7.953f, 7.953f, 0.0f, false, true, -5.503f, -2.344f)
                arcToRelative(7.965f, 7.965f, 0.0f, false, true, -2.332f, -5.503f)
                curveToRelative(0.08f, 0.002f, 0.16f, 0.005f, 0.24f, 0.005f)
                arcToRelative(8.16f, 8.16f, 0.0f, false, false, 2.988f, -0.558f)
                lineToRelative(-0.73f, -1.862f)
                arcToRelative(6.156f, 6.156f, 0.0f, false, true, -2.281f, 0.412f)
                arcToRelative(7.936f, 7.936f, 0.0f, false, true, 2.115f, -3.809f)
                arcToRelative(7.963f, 7.963f, 0.0f, false, true, 3.972f, -2.168f)
                arcToRelative(5.974f, 5.974f, 0.0f, false, true, -0.357f, 1.95f)
                lineToRelative(1.881f, 0.681f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, 0.482f, -2.701f)
                curveToRelative(0.0f, -0.033f, -0.004f, -0.065f, -0.005f, -0.098f)
                curveToRelative(2.013f, 0.079f, 3.9f, 0.896f, 5.342f, 2.336f)
                arcToRelative(7.959f, 7.959f, 0.0f, false, true, 2.324f, 5.348f)
                arcToRelative(7.908f, 7.908f, 0.0f, false, false, -2.787f, 0.473f)
                lineToRelative(0.684f, 1.88f)
                arcToRelative(5.91f, 5.91f, 0.0f, false, true, 1.935f, -0.361f)
                arcToRelative(7.953f, 7.953f, 0.0f, false, true, -2.157f, 3.976f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.112f, 14.13f)
                arcToRelative(7.599f, 7.599f, 0.0f, false, false, -0.926f, 1.121f)
                lineToRelative(1.656f, 1.12f)
                curveToRelative(0.2f, -0.296f, 0.43f, -0.574f, 0.683f, -0.826f)
                arcToRelative(6.428f, 6.428f, 0.0f, false, true, 1.178f, -0.929f)
                lineToRelative(-1.049f, -1.703f)
                arcToRelative(8.408f, 8.408f, 0.0f, false, false, -1.542f, 1.217f)
                close()
                moveTo(8.456f, 8.474f)
                arcToRelative(5.713f, 5.713f, 0.0f, false, true, -0.827f, 0.681f)
                lineToRelative(1.119f, 1.658f)
                arcToRelative(7.72f, 7.72f, 0.0f, false, false, 1.122f, -0.926f)
                arcToRelative(8.501f, 8.501f, 0.0f, false, false, 1.217f, -1.542f)
                lineTo(9.384f, 7.297f)
                arcToRelative(6.519f, 6.519f, 0.0f, false, true, -0.928f, 1.177f)
                close()
            }
        }
        .build()
        return _bxBaseball!!
    }

private var _bxBaseball: ImageVector? = null
