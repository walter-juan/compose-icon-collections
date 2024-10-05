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

public val FilledGroup.HexagonLetterX: ImageVector
    get() {
        if (_hexagonLetterX != null) {
            return _hexagonLetterX!!
        }
        _hexagonLetterX = Builder(name = "HexagonLetterX", defaultWidth = 24.0.dp, defaultHeight =
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
                moveToRelative(0.781f, 5.677f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.341f, 0.447f)
                lineToRelative(-1.106f, 2.21f)
                lineToRelative(-1.106f, -2.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.234f, -0.494f)
                lineToRelative(-0.107f, 0.047f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.447f, 1.341f)
                lineToRelative(1.774f, 3.553f)
                lineToRelative(-1.775f, 3.553f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.345f, 1.283f)
                lineToRelative(0.102f, 0.058f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.341f, -0.447f)
                lineToRelative(1.107f, -2.21f)
                lineToRelative(1.106f, 2.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.234f, 0.494f)
                lineToRelative(0.107f, -0.047f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.447f, -1.341f)
                lineToRelative(-1.776f, -3.553f)
                lineToRelative(1.776f, -3.553f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.345f, -1.283f)
                close()
            }
        }
        .build()
        return _hexagonLetterX!!
    }

private var _hexagonLetterX: ImageVector? = null
