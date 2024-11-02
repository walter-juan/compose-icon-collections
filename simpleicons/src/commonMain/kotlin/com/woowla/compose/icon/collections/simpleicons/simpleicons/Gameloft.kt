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

public val Simpleicons.Gameloft: ImageVector
    get() {
        if (_gameloft != null) {
            return _gameloft!!
        }
        _gameloft = Builder(name = "Gameloft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.841f, 18.938f)
                curveToRelative(0.494f, 0.86f, 1.247f, 1.262f, 2.192f, 1.368f)
                curveToRelative(3.394f, 0.387f, 13.519f, 0.176f, 13.534f, 0.176f)
                curveToRelative(2.402f, 0.0f, 4.33f, -1.1f, 4.852f, -3.372f)
                curveToRelative(0.133f, -0.579f, 0.238f, -2.54f, 0.117f, -4.619f)
                curveToRelative(-0.126f, -2.16f, -1.11f, -3.587f, -4.048f, -3.787f)
                curveToRelative(-3.901f, -0.264f, -9.42f, -0.14f, -11.651f, 0.09f)
                curveToRelative(-1.193f, 0.124f, -1.887f, 0.939f, -1.872f, 2.05f)
                curveToRelative(0.036f, 2.647f, 0.065f, 3.054f, 0.093f, 3.197f)
                curveToRelative(1.185f, 0.17f, 1.17f, 0.18f, 1.206f, 0.116f)
                curveToRelative(0.21f, -0.385f, 0.596f, -0.642f, 1.032f, -0.688f)
                curveToRelative(0.503f, -0.066f, 0.124f, -0.046f, 10.598f, -0.205f)
                curveToRelative(0.41f, 0.0f, 0.653f, 0.185f, 0.729f, 0.588f)
                curveToRelative(0.086f, 0.522f, 0.102f, 1.054f, 0.047f, 1.58f)
                curveToRelative(-0.034f, 0.45f, -0.404f, 1.166f, -1.08f, 1.175f)
                curveToRelative(-0.015f, 0.0f, -7.503f, 0.035f, -11.076f, -0.13f)
                curveToRelative(-1.08f, -0.05f, -2.263f, -1.114f, -2.263f, -3.094f)
                curveToRelative(0.0f, -0.841f, 0.0f, -3.548f, 0.07f, -4.39f)
                arcTo(2.235f, 2.235f, 0.0f, false, true, 5.174f, 6.96f)
                curveToRelative(1.333f, -0.242f, 13.753f, -0.095f, 14.542f, 0.085f)
                curveToRelative(2.241f, 0.513f, 2.43f, 3.198f, 2.437f, 3.255f)
                curveToRelative(0.21f, 1.543f, 0.23f, 3.283f, 0.211f, 4.855f)
                curveToRelative(-0.046f, 3.548f, -1.371f, 4.327f, -1.814f, 4.84f)
                curveToRelative(-0.133f, 0.154f, 0.039f, 0.225f, 0.3f, 0.415f)
                curveToRelative(1.115f, -0.209f, 2.708f, -1.427f, 3.02f, -4.011f)
                curveToRelative(0.12f, -0.999f, 0.213f, -3.283f, 0.02f, -7.382f)
                curveToRelative(-0.125f, -2.661f, -1.243f, -4.954f, -4.952f, -5.376f)
                curveToRelative(-3.217f, -0.366f, -10.3f, -0.074f, -13.482f, 0.0f)
                curveTo(-0.097f, 3.767f, 0.008f, 6.937f, 0.006f, 8.229f)
                curveToRelative(-0.021f, 8.174f, -0.014f, 9.233f, 0.836f, 10.709f)
                close()
            }
        }
        .build()
        return _gameloft!!
    }

private var _gameloft: ImageVector? = null
