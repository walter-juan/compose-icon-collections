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

public val Simpleicons.Redsys: ImageVector
    get() {
        if (_redsys != null) {
            return _redsys!!
        }
        _redsys = Builder(name = "Redsys", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.626f, 24.0f)
                curveToRelative(-3.989f, -0.108f, -7.476f, -2.03f, -9.89f, -5.873f)
                arcTo(10.9f, 10.9f, 0.0f, false, true, 0.17f, 13.959f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, true, 0.239f, -4.996f)
                curveToRelative(0.44f, -1.711f, 1.275f, -3.197f, 2.339f, -4.58f)
                curveToRelative(0.075f, -0.099f, 0.169f, -0.263f, 0.314f, -0.174f)
                curveToRelative(0.098f, 0.061f, 0.023f, 0.207f, -0.019f, 0.324f)
                curveToRelative(-0.473f, 1.36f, -0.46f, 2.756f, 0.225f, 3.984f)
                curveToRelative(0.783f, 1.411f, 1.964f, 2.438f, 3.67f, 2.705f)
                curveToRelative(1.636f, 0.258f, 3.07f, -0.211f, 4.21f, -1.317f)
                curveToRelative(1.378f, -1.34f, 1.95f, -2.99f, 1.415f, -4.946f)
                curveToRelative(-0.285f, -1.036f, -0.768f, -1.922f, -1.612f, -2.578f)
                curveToRelative(-1.092f, -0.848f, -2.33f, -1.26f, -3.722f, -1.12f)
                curveToRelative(-0.098f, 0.01f, -0.225f, 0.08f, -0.267f, -0.056f)
                reflectiveCurveToRelative(0.103f, -0.14f, 0.187f, -0.178f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 12.071f, 0.0f)
                curveToRelative(1.74f, 0.01f, 3.427f, 0.384f, 5.006f, 1.125f)
                curveToRelative(2.152f, 1.008f, 3.91f, 2.498f, 5.133f, 4.552f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, true, 1.688f, 4.93f)
                curveToRelative(0.154f, 1.313f, 0.08f, 2.584f, -0.188f, 3.863f)
                curveToRelative(-0.333f, 1.575f, -0.942f, 3.028f, -1.875f, 4.34f)
                curveToRelative(-0.853f, 1.2f, -1.851f, 2.241f, -3.103f, 3.052f)
                curveToRelative(-0.998f, 0.647f, -2.025f, 1.177f, -3.16f, 1.538f)
                curveToRelative(-1.115f, 0.356f, -2.245f, 0.544f, -3.946f, 0.595f)
                close()
            }
        }
        .build()
        return _redsys!!
    }

private var _redsys: ImageVector? = null
