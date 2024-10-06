package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.HexagonLetterW: ImageVector
    get() {
        if (_hexagonLetterW != null) {
            return _hexagonLetterW!!
        }
        _hexagonLetterW = Builder(name = "HexagonLetterW", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.666f, 1.429f)
                lineToRelative(6.75f, 3.98f)
                lineToRelative(0.096f, 0.063f)
                lineToRelative(0.093f, 0.078f)
                lineToRelative(0.106f, 0.074f)
                arcToRelative(3.22f, 3.22f, 0.0f, false, true, 1.284f, 2.39f)
                lineToRelative(0.005f, 0.204f)
                verticalLineToRelative(7.284f)
                curveToRelative(0.0f, 1.175f, -0.643f, 2.256f, -1.623f, 2.793f)
                lineToRelative(-6.804f, 4.302f)
                curveToRelative(-0.98f, 0.538f, -2.166f, 0.538f, -3.2f, -0.032f)
                lineToRelative(-6.695f, -4.237f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, -1.678f, -2.826f)
                verticalLineToRelative(-7.285f)
                curveToRelative(0.0f, -1.106f, 0.57f, -2.128f, 1.476f, -2.705f)
                lineToRelative(6.95f, -4.098f)
                curveToRelative(1.0f, -0.552f, 2.214f, -0.552f, 3.24f, 0.015f)
                moveToRelative(0.342f, 6.447f)
                lineToRelative(-0.52f, 4.153f)
                lineToRelative(-0.56f, -1.4f)
                curveToRelative(-0.319f, -0.799f, -1.41f, -0.837f, -1.803f, -0.114f)
                lineToRelative(-0.053f, 0.114f)
                lineToRelative(-0.561f, 1.4f)
                lineToRelative(-0.519f, -4.153f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -0.876f)
                lineToRelative(-0.116f, 0.008f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.868f, 1.116f)
                lineToRelative(1.0f, 8.0f)
                curveToRelative(0.128f, 1.025f, 1.537f, 1.207f, 1.92f, 0.247f)
                lineToRelative(1.072f, -2.678f)
                lineToRelative(1.072f, 2.678f)
                curveToRelative(0.383f, 0.96f, 1.792f, 0.778f, 1.92f, -0.247f)
                lineToRelative(1.0f, -8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.984f, -0.248f)
            }
        }
        .build()
        return _hexagonLetterW!!
    }

private var _hexagonLetterW: ImageVector? = null
