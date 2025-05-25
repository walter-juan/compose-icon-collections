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

public val Simpleicons.Freetube: ImageVector
    get() {
        if (_freetube != null) {
            return _freetube!!
        }
        _freetube = Builder(name = "Freetube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.707f, 0.0f)
                curveToRelative(0.9f, 0.0f, 1.629f, 0.729f, 1.629f, 1.629f)
                lineTo(6.336f, 24.0f)
                lineTo(4.099f, 24.0f)
                arcToRelative(4.099f, 4.099f, 0.0f, false, true, -2.899f, -1.201f)
                arcTo(4.099f, 4.099f, 0.0f, false, true, 0.0f, 19.901f)
                lineTo(0.0f, 1.629f)
                curveTo(0.0f, 0.729f, 0.729f, 0.0f, 1.629f, 0.0f)
                close()
                moveTo(24.0f, 0.0f)
                verticalLineToRelative(1.941f)
                arcToRelative(4.395f, 4.395f, 0.0f, false, true, -4.395f, 4.395f)
                lineTo(9.005f, 6.336f)
                curveToRelative(-0.891f, 0.0f, -1.613f, -0.722f, -1.613f, -1.613f)
                lineTo(7.392f, 1.613f)
                curveTo(7.392f, 0.722f, 8.114f, 0.0f, 9.005f, 0.0f)
                close()
                moveTo(17.218f, 11.734f)
                arcToRelative(0.618f, 0.618f, 0.0f, false, true, 0.0f, 1.108f)
                lineToRelative(-8.902f, 4.412f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, true, -0.924f, -0.573f)
                lineTo(7.392f, 7.895f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, true, 0.924f, -0.573f)
                close()
            }
        }
        .build()
        return _freetube!!
    }

private var _freetube: ImageVector? = null
