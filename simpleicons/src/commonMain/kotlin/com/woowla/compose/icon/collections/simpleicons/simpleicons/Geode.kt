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

public val Simpleicons.Geode: ImageVector
    get() {
        if (_geode != null) {
            return _geode!!
        }
        _geode = Builder(name = "Geode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.302f, 0.0f, -0.604f, 0.096f, -0.857f, 0.289f)
                lineTo(0.596f, 8.344f)
                curveToRelative(-0.47f, 0.359f, -0.667f, 0.973f, -0.492f, 1.539f)
                lineToRelative(4.057f, 13.121f)
                curveToRelative(0.183f, 0.592f, 0.73f, 0.996f, 1.35f, 0.996f)
                horizontalLineToRelative(12.98f)
                curveToRelative(0.619f, 0.0f, 1.167f, -0.404f, 1.35f, -0.996f)
                lineToRelative(4.057f, -13.121f)
                curveToRelative(0.175f, -0.566f, -0.022f, -1.18f, -0.492f, -1.539f)
                lineToRelative(-0.973f, -0.742f)
                lineToRelative(-1.119f, 3.518f)
                lineToRelative(-3.07f, 9.99f)
                curveToRelative(-0.12f, 0.39f, -0.48f, 0.656f, -0.889f, 0.656f)
                horizontalLineTo(6.578f)
                curveToRelative(-0.408f, 0.0f, -0.769f, -0.266f, -0.889f, -0.656f)
                lineToRelative(-3.361f, -10.934f)
                curveToRelative(-0.114f, -0.371f, 0.014f, -0.775f, 0.322f, -1.012f)
                lineToRelative(8.748f, -6.717f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, true, 0.109f, -0.072f)
                lineTo(13.553f, 0.82f)
                lineToRelative(-0.695f, -0.531f)
                curveTo(12.604f, 0.096f, 12.302f, 0.0f, 12.0f, 0.0f)
                moveToRelative(0.068f, 4.758f)
                curveToRelative(-0.163f, 0.0f, -0.325f, 0.052f, -0.461f, 0.156f)
                lineToRelative(-6.523f, 5.004f)
                curveToRelative(-0.251f, 0.193f, -0.357f, 0.521f, -0.264f, 0.824f)
                lineToRelative(0.434f, 1.408f)
                lineToRelative(2.197f, -1.619f)
                lineToRelative(4.314f, -3.377f)
                curveToRelative(0.137f, -0.107f, 0.332f, -0.107f, 0.469f, 0.0f)
                lineToRelative(4.705f, 3.682f)
                curveToRelative(0.123f, 0.096f, 0.174f, 0.257f, 0.129f, 0.406f)
                lineToRelative(-1.809f, 5.992f)
                curveToRelative(-0.048f, 0.16f, -0.196f, 0.27f, -0.363f, 0.27f)
                horizontalLineTo(9.104f)
                arcToRelative(0.377f, 0.377f, 0.0f, false, true, -0.076f, -0.008f)
                horizontalLineTo(6.9f)
                lineToRelative(0.428f, 1.393f)
                curveToRelative(0.098f, 0.318f, 0.392f, 0.535f, 0.725f, 0.535f)
                horizontalLineToRelative(8.033f)
                curveToRelative(0.333f, 0.0f, 0.625f, -0.217f, 0.723f, -0.535f)
                lineToRelative(2.51f, -8.146f)
                curveToRelative(0.093f, -0.303f, -0.012f, -0.631f, -0.264f, -0.824f)
                lineToRelative(-6.525f, -5.004f)
                curveToRelative(-0.136f, -0.104f, -0.298f, -0.156f, -0.461f, -0.156f)
                close()
            }
        }
        .build()
        return _geode!!
    }

private var _geode: ImageVector? = null
