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

public val SolidGroup.BxsFlorist: ImageVector
    get() {
        if (_bxsFlorist != null) {
            return _bxsFlorist!!
        }
        _bxsFlorist = Builder(name = "BxsFlorist", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.84f, 21.871f)
                lineTo(12.0f, 22.0f)
                arcToRelative(10.221f, 10.221f, 0.0f, false, false, -9.013f, -8.891f)
                lineTo(2.0f, 13.0f)
                lineToRelative(0.021f, 0.173f)
                arcToRelative(10.001f, 10.001f, 0.0f, false, false, 8.819f, 8.698f)
                close()
                moveTo(21.979f, 13.173f)
                lineTo(22.0f, 13.0f)
                lineToRelative(-0.987f, 0.109f)
                curveToRelative(-4.7f, 0.523f, -8.427f, 4.2f, -9.013f, 8.891f)
                lineToRelative(1.16f, -0.129f)
                arcToRelative(10.001f, 10.001f, 0.0f, false, false, 8.819f, -8.698f)
                close()
                moveTo(18.063f, 5.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.415f, -0.915f)
                curveToRelative(-0.062f, 0.035f, -0.111f, 0.081f, -0.168f, 0.121f)
                curveToRelative(0.005f, -0.069f, 0.02f, -0.136f, 0.02f, -0.206f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                curveToRelative(0.0f, 0.07f, 0.015f, 0.137f, 0.021f, 0.206f)
                curveToRelative(-0.057f, -0.04f, -0.107f, -0.086f, -0.168f, -0.121f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 4.33f)
                curveToRelative(0.061f, 0.035f, 0.126f, 0.056f, 0.188f, 0.085f)
                curveToRelative(-0.062f, 0.029f, -0.127f, 0.05f, -0.188f, 0.085f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 4.33f)
                curveToRelative(0.062f, -0.035f, 0.111f, -0.081f, 0.168f, -0.121f)
                curveToRelative(-0.006f, 0.069f, -0.021f, 0.136f, -0.021f, 0.206f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                curveToRelative(0.0f, -0.07f, -0.015f, -0.137f, -0.021f, -0.206f)
                curveToRelative(0.057f, 0.04f, 0.106f, 0.086f, 0.168f, 0.121f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -4.33f)
                curveToRelative(-0.061f, -0.035f, -0.126f, -0.056f, -0.188f, -0.085f)
                curveToRelative(0.063f, -0.029f, 0.127f, -0.05f, 0.188f, -0.085f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.916f, -3.415f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _bxsFlorist!!
    }

private var _bxsFlorist: ImageVector? = null
