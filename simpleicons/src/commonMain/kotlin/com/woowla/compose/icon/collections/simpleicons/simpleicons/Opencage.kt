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

public val Simpleicons.Opencage: ImageVector
    get() {
        if (_opencage != null) {
            return _opencage!!
        }
        _opencage = Builder(name = "Opencage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.178f, 0.001f, 1.444f, 3.559f, 1.444f, 7.93f)
                lineTo(1.444f, 24.0f)
                horizontalLineToRelative(1.06f)
                lineTo(2.51f, 7.93f)
                curveToRelative(0.0f, -2.847f, 2.408f, -5.295f, 5.831f, -6.333f)
                arcToRelative(5.948f, 5.948f, 0.0f, false, false, -0.254f, 0.258f)
                arcToRelative(6.719f, 6.719f, 0.0f, false, false, -0.363f, 0.415f)
                curveToRelative(-0.17f, 0.21f, -0.201f, 0.251f, -0.439f, 0.591f)
                curveToRelative(-0.185f, 0.27f, -0.375f, 0.596f, -0.49f, 0.813f)
                curveToRelative(-0.131f, 0.244f, -0.25f, 0.493f, -0.36f, 0.746f)
                curveToRelative(-0.237f, 0.541f, -0.39f, 1.044f, -0.418f, 1.134f)
                arcToRelative(12.425f, 12.425f, 0.0f, false, false, -0.534f, 3.634f)
                lineTo(5.485f, 24.0f)
                horizontalLineToRelative(1.066f)
                lineTo(6.551f, 9.188f)
                curveToRelative(0.0f, -0.322f, 0.016f, -1.068f, 0.14f, -1.828f)
                curveToRelative(0.07f, -0.457f, 0.186f, -0.996f, 0.342f, -1.505f)
                curveToRelative(0.144f, -0.487f, 0.42f, -1.209f, 0.762f, -1.82f)
                curveToRelative(0.158f, -0.285f, 0.329f, -0.553f, 0.51f, -0.803f)
                arcToRelative(6.53f, 6.53f, 0.0f, false, true, 0.874f, -0.981f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.83f, -0.617f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.565f, -0.28f)
                curveToRelative(-0.846f, 1.92f, -1.108f, 5.46f, -1.108f, 7.834f)
                lineTo(9.466f, 24.0f)
                horizontalLineToRelative(1.065f)
                lineTo(10.531f, 9.188f)
                curveToRelative(0.0f, -4.959f, 0.94f, -7.865f, 1.463f, -8.112f)
                curveToRelative(0.39f, 0.205f, 1.283f, 2.392f, 1.429f, 6.954f)
                lineToRelative(1.048f, 0.014f)
                curveToRelative(-0.03f, -0.941f, -0.166f, -4.671f, -1.05f, -6.687f)
                curveToRelative(2.05f, 0.844f, 3.653f, 3.45f, 3.965f, 6.687f)
                horizontalLineToRelative(1.116f)
                lineToRelative(-0.012f, -0.117f)
                horizontalLineToRelative(0.002f)
                curveToRelative(-0.255f, -2.648f, -1.271f, -4.88f, -2.721f, -6.295f)
                curveToRelative(3.36f, 1.059f, 5.719f, 3.486f, 5.719f, 6.299f)
                lineToRelative(-0.007f, 0.113f)
                lineToRelative(1.073f, -0.009f)
                curveTo(22.556f, 3.68f, 17.839f, 0.017f, 12.042f, 0.0f)
                close()
                moveTo(13.5f, 20.024f)
                lineTo(13.5f, 24.0f)
                horizontalLineToRelative(1.061f)
                lineToRelative(0.005f, -3.976f)
                close()
                moveTo(17.487f, 20.024f)
                lineTo(17.492f, 24.0f)
                horizontalLineToRelative(1.06f)
                verticalLineToRelative(-3.976f)
                close()
                moveTo(21.49f, 20.024f)
                lineTo(21.49f, 24.0f)
                horizontalLineToRelative(1.066f)
                verticalLineToRelative(-3.976f)
                close()
            }
        }
        .build()
        return _opencage!!
    }

private var _opencage: ImageVector? = null
