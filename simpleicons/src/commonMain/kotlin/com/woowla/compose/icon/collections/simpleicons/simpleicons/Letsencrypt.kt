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

public val Simpleicons.Letsencrypt: ImageVector
    get() {
        if (_letsencrypt != null) {
            return _letsencrypt!!
        }
        _letsencrypt = Builder(name = "Letsencrypt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.991f, 0.0f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, false, -0.872f, 0.817f)
                verticalLineToRelative(3.021f)
                arcTo(0.883f, 0.883f, 0.0f, false, false, 12.0f, 4.721f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, false, 0.88f, -0.88f)
                lineTo(12.88f, 0.817f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, false, -0.889f, -0.817f)
                close()
                moveTo(19.696f, 3.109f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, false, -0.521f, 0.174f)
                lineToRelative(-2.374f, 1.948f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, false, 0.559f, 1.562f)
                arcToRelative(0.879f, 0.879f, 0.0f, false, false, 0.559f, -0.2f)
                lineToRelative(2.371f, -1.951f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, false, -0.594f, -1.534f)
                close()
                moveTo(4.32f, 3.122f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, false, -0.611f, 1.521f)
                lineToRelative(2.37f, 1.951f)
                arcToRelative(0.876f, 0.876f, 0.0f, false, false, 0.561f, 0.2f)
                verticalLineToRelative(-0.002f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, false, 0.56f, -1.56f)
                lineTo(4.828f, 3.283f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, false, -0.508f, -0.161f)
                close()
                moveTo(11.98f, 6.35f)
                arcToRelative(5.046f, 5.046f, 0.0f, false, false, -5.026f, 5.045f)
                verticalLineToRelative(1.488f)
                lineTo(5.787f, 12.883f)
                arcToRelative(0.967f, 0.967f, 0.0f, false, false, -0.965f, 0.964f)
                verticalLineToRelative(9.189f)
                arcToRelative(0.967f, 0.967f, 0.0f, false, false, 0.965f, 0.964f)
                lineTo(18.213f, 24.0f)
                arcToRelative(0.967f, 0.967f, 0.0f, false, false, 0.964f, -0.964f)
                verticalLineToRelative(-9.191f)
                arcToRelative(0.967f, 0.967f, 0.0f, false, false, -0.964f, -0.962f)
                horizontalLineToRelative(-1.168f)
                verticalLineToRelative(-1.488f)
                arcToRelative(5.046f, 5.046f, 0.0f, false, false, -5.065f, -5.045f)
                close()
                moveTo(11.992f, 9.243f)
                arcToRelative(2.152f, 2.152f, 0.0f, false, true, 2.159f, 2.152f)
                verticalLineToRelative(1.488f)
                lineTo(9.847f, 12.883f)
                verticalLineToRelative(-1.488f)
                arcToRelative(2.152f, 2.152f, 0.0f, false, true, 2.145f, -2.152f)
                close()
                moveTo(19.374f, 9.746f)
                arcToRelative(0.883f, 0.883f, 0.0f, true, false, 0.071f, 1.763f)
                horizontalLineToRelative(3.027f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, false, 0.0f, -1.761f)
                lineTo(19.444f, 9.749f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, false, -0.071f, -0.002f)
                close()
                moveTo(1.529f, 9.749f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, false, 0.0f, 1.761f)
                horizontalLineToRelative(2.998f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, false, 0.0f, -1.761f)
                close()
                moveTo(11.989f, 16.523f)
                arcToRelative(1.279f, 1.279f, 0.0f, false, true, 0.641f, 2.393f)
                verticalLineToRelative(1.245f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, true, -1.26f, 0.0f)
                verticalLineToRelative(-1.245f)
                arcToRelative(1.279f, 1.279f, 0.0f, false, true, 0.618f, -2.393f)
                close()
            }
        }
        .build()
        return _letsencrypt!!
    }

private var _letsencrypt: ImageVector? = null
