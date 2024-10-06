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

public val FilledGroup.Assembly: ImageVector
    get() {
        if (_assembly != null) {
            return _assembly!!
        }
        _assembly = Builder(name = "Assembly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.666f, 1.429f)
                lineToRelative(6.75f, 3.98f)
                quadToRelative(0.1f, 0.06f, 0.18f, 0.133f)
                lineToRelative(0.009f, 0.008f)
                lineToRelative(0.106f, 0.075f)
                arcToRelative(3.22f, 3.22f, 0.0f, false, true, 1.284f, 2.39f)
                lineToRelative(0.005f, 0.203f)
                verticalLineToRelative(7.284f)
                curveToRelative(0.0f, 1.175f, -0.643f, 2.256f, -1.623f, 2.793f)
                lineToRelative(-6.804f, 4.302f)
                curveToRelative(-0.98f, 0.538f, -2.166f, 0.538f, -3.2f, -0.032f)
                lineToRelative(-6.695f, -4.237f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, -1.678f, -2.826f)
                verticalLineToRelative(-7.285f)
                arcToRelative(3.21f, 3.21f, 0.0f, false, true, 1.65f, -2.808f)
                lineToRelative(6.775f, -3.995f)
                arcToRelative(3.34f, 3.34f, 0.0f, false, true, 3.24f, 0.015f)
                moveToRelative(-0.64f, 5.343f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, false, -2.0f, -0.014f)
                lineToRelative(-3.023f, 1.804f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, false, -1.002f, 1.736f)
                verticalLineToRelative(3.278f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.03f, 1.75f)
                lineToRelative(2.946f, 1.89f)
                curveToRelative(0.657f, 0.367f, 1.39f, 0.367f, 1.994f, 0.033f)
                lineToRelative(3.054f, -1.955f)
                curveToRelative(0.582f, -0.322f, 0.976f, -0.992f, 0.976f, -1.719f)
                verticalLineToRelative(-3.277f)
                lineToRelative(-0.005f, -0.164f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.725f, -1.391f)
                lineToRelative(-0.092f, -0.07f)
                lineToRelative(-0.056f, -0.047f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.096f, -0.064f)
                close()
            }
        }
        .build()
        return _assembly!!
    }

private var _assembly: ImageVector? = null
