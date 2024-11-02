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

public val Simpleicons.Deepgram: ImageVector
    get() {
        if (_deepgram != null) {
            return _deepgram!!
        }
        _deepgram = Builder(name = "Deepgram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.203f, 24.0f)
                horizontalLineTo(1.517f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, true, -0.258f, -0.62f)
                lineToRelative(6.239f, -6.275f)
                arcToRelative(0.366f, 0.366f, 0.0f, false, true, 0.259f, -0.108f)
                horizontalLineToRelative(3.52f)
                curveToRelative(2.723f, 0.0f, 5.025f, -2.127f, 5.107f, -4.845f)
                arcToRelative(5.004f, 5.004f, 0.0f, false, false, -4.999f, -5.148f)
                horizontalLineTo(7.613f)
                verticalLineToRelative(4.646f)
                curveToRelative(0.0f, 0.2f, -0.164f, 0.364f, -0.365f, 0.364f)
                horizontalLineTo(0.968f)
                arcToRelative(0.365f, 0.365f, 0.0f, false, true, -0.363f, -0.364f)
                verticalLineTo(0.364f)
                curveTo(0.605f, 0.164f, 0.768f, 0.0f, 0.969f, 0.0f)
                horizontalLineToRelative(10.416f)
                curveToRelative(6.684f, 0.0f, 12.111f, 5.485f, 12.01f, 12.187f)
                curveTo(23.293f, 18.77f, 17.794f, 24.0f, 11.202f, 24.0f)
                close()
            }
        }
        .build()
        return _deepgram!!
    }

private var _deepgram: ImageVector? = null
