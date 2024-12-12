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

public val Simpleicons.Aftership: ImageVector
    get() {
        if (_aftership != null) {
            return _aftership!!
        }
        _aftership = Builder(name = "Aftership", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.549f, 9.604f)
                arcToRelative(10.462f, 10.462f, 0.0f, false, false, -3.388f, -6.838f)
                arcTo(10.632f, 10.632f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(10.64f, 10.64f, 0.0f, false, false, -7.16f, 2.764f)
                arcToRelative(10.465f, 10.465f, 0.0f, false, false, -3.428f, 7.74f)
                curveToRelative(0.0f, 2.371f, 0.81f, 4.672f, 2.298f, 6.529f)
                arcToRelative(10.617f, 10.617f, 0.0f, false, false, 5.895f, 3.698f)
                lineTo(12.0f, 24.0f)
                lineToRelative(2.395f, -3.27f)
                arcToRelative(10.593f, 10.593f, 0.0f, false, false, 5.895f, -3.697f)
                arcToRelative(10.442f, 10.442f, 0.0f, false, false, 2.26f, -7.43f)
                close()
                moveTo(11.243f, 15.884f)
                arcToRelative(0.26f, 0.26f, 0.0f, false, true, -0.034f, 0.125f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, true, -0.347f, 0.092f)
                lineToRelative(-3.906f, -2.237f)
                arcToRelative(1.005f, 1.005f, 0.0f, false, true, -0.505f, -0.865f)
                lineTo(6.451f, 8.624f)
                arcToRelative(0.26f, 0.26f, 0.0f, false, true, 0.033f, -0.126f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, true, 0.347f, -0.092f)
                lineToRelative(3.907f, 2.237f)
                curveToRelative(0.152f, 0.089f, 0.281f, 0.214f, 0.368f, 0.366f)
                curveToRelative(0.09f, 0.151f, 0.135f, 0.324f, 0.135f, 0.5f)
                verticalLineToRelative(4.372f)
                close()
                moveTo(12.0f, 9.48f)
                curveToRelative(-0.176f, 0.0f, -0.35f, -0.047f, -0.503f, -0.133f)
                lineTo(7.5f, 7.057f)
                arcToRelative(0.241f, 0.241f, 0.0f, false, true, -0.09f, -0.092f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, true, 0.09f, -0.342f)
                lineToRelative(3.997f, -2.289f)
                arcToRelative(1.025f, 1.025f, 0.0f, false, true, 1.007f, 0.0f)
                lineToRelative(3.996f, 2.29f)
                arcToRelative(0.24f, 0.24f, 0.0f, false, true, 0.09f, 0.092f)
                arcToRelative(0.247f, 0.247f, 0.0f, false, true, 0.0f, 0.25f)
                arcToRelative(0.271f, 0.271f, 0.0f, false, true, -0.09f, 0.092f)
                lineToRelative(-3.997f, 2.289f)
                arcTo(1.005f, 1.005f, 0.0f, false, true, 12.0f, 9.48f)
                close()
                moveTo(17.546f, 13.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, true, -0.503f, 0.866f)
                lineToRelative(-3.908f, 2.237f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, true, -0.38f, -0.218f)
                lineTo(12.755f, 11.51f)
                curveToRelative(0.0f, -0.175f, 0.047f, -0.348f, 0.135f, -0.501f)
                curveToRelative(0.089f, -0.152f, 0.216f, -0.28f, 0.368f, -0.366f)
                lineToRelative(3.907f, -2.238f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, true, 0.38f, 0.219f)
                close()
            }
        }
        .build()
        return _aftership!!
    }

private var _aftership: ImageVector? = null
