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

public val Simpleicons.Fueler: ImageVector
    get() {
        if (_fueler != null) {
            return _fueler!!
        }
        _fueler = Builder(name = "Fueler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(1.204f, 0.0f, 2.086f, 1.932f, 3.172f, 2.283f)
                curveToRelative(1.126f, 0.364f, 2.978f, -0.67f, 3.915f, 0.009f)
                curveToRelative(0.946f, 0.685f, 0.527f, 2.762f, 1.216f, 3.704f)
                curveToRelative(0.682f, 0.933f, 2.8f, 1.175f, 3.165f, 2.295f)
                curveToRelative(0.353f, 1.081f, -1.207f, 2.51f, -1.207f, 3.709f)
                curveToRelative(0.0f, 1.198f, 1.56f, 2.628f, 1.207f, 3.709f)
                curveToRelative(-0.365f, 1.12f, -2.483f, 1.362f, -3.165f, 2.295f)
                curveToRelative(-0.69f, 0.942f, -0.27f, 3.02f, -1.217f, 3.704f)
                curveToRelative(-0.937f, 0.68f, -2.789f, -0.355f, -3.914f, 0.01f)
                curveTo(14.086f, 22.067f, 13.204f, 24.0f, 12.0f, 24.0f)
                curveToRelative(-1.204f, 0.0f, -2.086f, -1.932f, -3.172f, -2.283f)
                curveToRelative(-1.126f, -0.364f, -2.978f, 0.67f, -3.915f, -0.009f)
                curveToRelative(-0.946f, -0.685f, -0.527f, -2.762f, -1.216f, -3.704f)
                curveToRelative(-0.682f, -0.933f, -2.8f, -1.175f, -3.165f, -2.295f)
                curveToRelative(-0.353f, -1.081f, 1.207f, -2.51f, 1.207f, -3.709f)
                curveToRelative(0.0f, -1.198f, -1.56f, -2.628f, -1.207f, -3.709f)
                curveToRelative(0.365f, -1.12f, 2.483f, -1.362f, 3.166f, -2.295f)
                curveToRelative(0.688f, -0.942f, 0.27f, -3.02f, 1.216f, -3.704f)
                curveToRelative(0.937f, -0.68f, 2.789f, 0.355f, 3.914f, -0.01f)
                curveTo(9.914f, 1.933f, 10.796f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.801f, 6.34f)
                lineTo(8.554f, 12.509f)
                curveToRelative(-0.158f, 0.3f, 0.065f, 0.653f, 0.388f, 0.654f)
                horizontalLineToRelative(1.707f)
                curveToRelative(0.234f, 0.0f, 0.44f, 0.193f, 0.44f, 0.445f)
                verticalLineToRelative(3.706f)
                curveToRelative(0.0f, 0.459f, 0.603f, 0.618f, 0.825f, 0.218f)
                lineToRelative(3.39f, -6.11f)
                curveToRelative(0.16f, -0.289f, -0.043f, -0.662f, -0.384f, -0.663f)
                lineToRelative(-1.85f, -0.002f)
                curveToRelative(-0.243f, 0.0f, -0.44f, -0.2f, -0.44f, -0.445f)
                lineTo(12.63f, 6.549f)
                curveToRelative(0.0f, -0.464f, -0.613f, -0.619f, -0.829f, -0.21f)
                close()
            }
        }
        .build()
        return _fueler!!
    }

private var _fueler: ImageVector? = null
