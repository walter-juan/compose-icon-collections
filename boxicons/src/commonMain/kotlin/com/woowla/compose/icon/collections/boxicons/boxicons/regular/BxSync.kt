package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxSync: ImageVector
    get() {
        if (_bxSync != null) {
            return _bxSync!!
        }
        _bxSync = Builder(name = "BxSync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 7.101f)
                lineToRelative(0.01f, 0.001f)
                arcToRelative(4.978f, 4.978f, 0.0f, false, true, 2.526f, 1.362f)
                arcToRelative(5.005f, 5.005f, 0.0f, false, true, 1.363f, 2.528f)
                arcToRelative(5.061f, 5.061f, 0.0f, false, true, -0.001f, 2.016f)
                arcToRelative(4.976f, 4.976f, 0.0f, false, true, -1.363f, 2.527f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(7.014f, 7.014f, 0.0f, false, false, 1.908f, -3.54f)
                arcToRelative(6.98f, 6.98f, 0.0f, false, false, 0.0f, -2.819f)
                arcToRelative(6.957f, 6.957f, 0.0f, false, false, -1.907f, -3.539f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, -2.223f, -1.5f)
                arcToRelative(6.921f, 6.921f, 0.0f, false, false, -1.315f, -0.408f)
                curveToRelative(-0.137f, -0.028f, -0.275f, -0.043f, -0.412f, -0.063f)
                lineTo(13.0f, 2.0f)
                lineTo(9.0f, 6.0f)
                lineToRelative(4.0f, 4.0f)
                lineTo(13.0f, 7.101f)
                close()
                moveTo(5.55f, 14.724f)
                curveToRelative(0.174f, 0.412f, 0.392f, 0.812f, 0.646f, 1.19f)
                curveToRelative(0.249f, 0.37f, 0.537f, 0.718f, 0.854f, 1.034f)
                arcToRelative(7.036f, 7.036f, 0.0f, false, false, 2.224f, 1.501f)
                curveToRelative(0.425f, 0.18f, 0.868f, 0.317f, 1.315f, 0.408f)
                curveToRelative(0.167f, 0.034f, 0.338f, 0.056f, 0.508f, 0.078f)
                verticalLineToRelative(2.944f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-4.0f, -4.0f)
                verticalLineToRelative(3.03f)
                curveToRelative(-0.035f, -0.006f, -0.072f, -0.003f, -0.107f, -0.011f)
                arcToRelative(4.978f, 4.978f, 0.0f, false, true, -2.526f, -1.362f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, true, 0.001f, -7.071f)
                lineTo(7.051f, 7.05f)
                arcToRelative(7.01f, 7.01f, 0.0f, false, false, -1.5f, 2.224f)
                arcTo(6.974f, 6.974f, 0.0f, false, false, 5.0f, 12.0f)
                arcToRelative(6.997f, 6.997f, 0.0f, false, false, 0.55f, 2.724f)
                close()
            }
        }
        .build()
        return _bxSync!!
    }

private var _bxSync: ImageVector? = null
